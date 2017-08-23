/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.manager;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;
import com.safiro.jmucore.ws.Exception_Exception;
import com.safiro.jmucore.ws.Login;
import com.safiro.jmucore.ws.WebServiceJMu_Service;



/**
 *
 * @author carlos
 */
@Named(value = "bmLogin")
@RequestScoped
public class bmLogin implements Serializable{

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/JMuCore-WS/WebServiceJMu.wsdl")
    private WebServiceJMu_Service service;

    

    private String user;
    private String pass;
    @Inject
    private SessionController session;
    public bmLogin() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public String validLogin() throws Exception_Exception{
        Login log=new Login();
        log=loginUser(user, pass);
        if(log != null){
            session.addSession(log);
            return "account/account?faces-redirect=true";
        }else{
            FacesContext context=FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Incorrecto!","Usuario y/o Contraseña incorrecto"));
            return null;
        }
    
    }
    public String validTest(){
        return "index";
    }
    public String removeLogin(){
        session.removeSession();
        return "/index";  
    }

    private Login loginUser(java.lang.String user, java.lang.String pwd) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.loginUser(user, pwd);
    }

   
    
}

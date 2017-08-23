/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.manager;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;
import com.safiro.jmucore.ws.Login;

/**
 *
 * @author carlos
 */
@Named(value = "sessionController")
@Dependent
public class SessionController implements Serializable{
    private static  final String AUTH_SESSION="x1A3d45";
    
    public void addSession(Login login){
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(AUTH_SESSION, login);
    }
    public Boolean isSession(){
        Login loggin=(Login)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(AUTH_SESSION);
        if(loggin==null){
            return false;
        }else{
            return true;
        }
    }
    public void removeSession(){
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(AUTH_SESSION);
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
    public Login getSession(){
        if(this.isSession()){
            return (Login)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(AUTH_SESSION);
        }else{
            return null;
        }
    }
    
}

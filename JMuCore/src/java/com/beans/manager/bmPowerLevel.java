/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.manager;

import com.builder.FactoryXml;
import com.entity.PowerLvl;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.xml.ws.WebServiceRef;
import com.safiro.jmucore.ws.CharacterbyID;
import com.safiro.jmucore.ws.WebServiceJMu_Service;
/**
 *
 * @author carlos
 */
@Named(value = "bmPowerLevel")
@ViewScoped
public class bmPowerLevel implements Serializable{

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/JMuCore-WS/WebServiceJMu.wsdl")
    private WebServiceJMu_Service service;

    
    
    @Inject
    private SessionController session;
    
    List<CharacterbyID> characters;
    private CharacterbyID pj;
    @PostConstruct
    public void init(){
        characters=getCharacterAccount(session.getSession());
    }
    
    public List<CharacterbyID> getCharacters() {
        int resetneed=((PowerLvl)FactoryXml.loadXml(new PowerLvl())).getReqReset();
        return characters.stream().filter(x -> x.getReset()>=resetneed).collect(Collectors.toList());
    }

    public void setCharacters(List<CharacterbyID> characters) {
        this.characters = characters;
    }
    
    public CharacterbyID getPj() {
        return pj;
    }

    public void setPj(CharacterbyID pj) {
        this.pj = pj;
    }
    public void setLevelChar(){
        
        if(pj.getLevel()<=400){
            pj.setLevel(16000);
            setLevelChar_1(pj);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Felicitaciones", "Ahora es lvl 16k"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("invalido", "Este personaje ya posee un nivel superior"));
        }
    }
   

    

    private java.util.List<com.safiro.jmucore.ws.CharacterbyID> getCharacterAccount(com.safiro.jmucore.ws.Login login) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.getCharacterAccount(login);
    }

    private Boolean setLevelChar_1(com.safiro.jmucore.ws.CharacterbyID character) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.setLevelChar(character);
    }
    
}

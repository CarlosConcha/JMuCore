/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.manager;

import com.entity.ResetOPT;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;
import com.safiro.jmucore.ws.CharacterbyID;
import com.safiro.jmucore.ws.WebServiceJMu_Service;



/**
 *
 * @author carlos
 */
@Named (value = "bmResetChar")
@ViewScoped
public class bmResetChar implements Serializable{

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/JMuCore-WS/WebServiceJMu.wsdl")
    private WebServiceJMu_Service service;
    @Inject
    SessionController session;
    
    @Inject
    bmReqReset reqreset;
    
    

    private List<CharacterbyID> charList;
    private CharacterbyID characterSelect;
    
    @PostConstruct
    public void Init(){
        charList=getCharacterAccount(session.getSession());
    }

    public List<CharacterbyID> getCharList() {
        return charList;
    }

    public void setCharList(List<CharacterbyID> charList) {
        this.charList = charList;
    }

    public CharacterbyID getCharacterSelect() {
        return characterSelect;
    }

    public void setCharacterSelect(CharacterbyID characterSelect) {
        this.characterSelect = characterSelect;
    }

    public void resetChar(){
        
        
        Boolean isValidChar=charList.stream().anyMatch(x -> x.getName().equals(characterSelect.getName()));
        if(isValidChar){
            ResetOPT rstop=reqreset.getReqrst();
            if(characterSelect.getLevel()>=rstop.getLevelNeed() && characterSelect.getMoney()>=rstop.getMoneyNeed()){
               //do something 
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Reset", "Personaje reseteado satisfactoriamente"));
            }else{
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Advertencia", "El Personaje no cumple los requisitos"));
            }
            
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"no", "no"));
        }
    }

    private java.util.List<com.safiro.jmucore.ws.CharacterbyID> getCharacterAccount(com.safiro.jmucore.ws.Login login) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.getCharacterAccount(login);
    }
    
    
   
    
    
    
}

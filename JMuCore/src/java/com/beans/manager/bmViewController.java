/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.manager;

import java.io.Serializable;
import java.util.Map;
import javax.inject.Named;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author carlos
 */
@Named(value = "bmViewController")
@ViewScoped
public class bmViewController implements Serializable{

    @Inject
    SessionController session;
    public bmViewController() {
    }
    public Boolean isComReset(){
        Map<String,String> urlGet=FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String param=urlGet.get("component");
        if(param.equals("reset")) {
            return true;
        }
        return false;
    }
    public Boolean isComGift() {
        Map<String, String> urlGet = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String param = urlGet.get("component");
       
        return (param.equals("gift"));
    }
}

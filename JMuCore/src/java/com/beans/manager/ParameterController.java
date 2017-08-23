/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.manager;

import java.io.Serializable;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;

/**
 *
 * @author carlos
 */
@Named(value = "parameterController")
@Dependent
public class ParameterController implements Serializable{
    
    public Map<String,String> getParam(){
        return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
    }
}

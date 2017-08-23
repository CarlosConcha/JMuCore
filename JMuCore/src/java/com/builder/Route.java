/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.builder;

import java.io.File;
import javax.faces.context.FacesContext;

/**
 *
 * @author carlos
 */
public class Route {
    
    private static final String currDir= FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
    //private static final String currDir= new File("").getAbsolutePath()+"\\web\\";
    protected static String FOLDER_RESOURCES = currDir + "resources";
    protected static String FOLDER_XML = FOLDER_RESOURCES + "/consume/";

    public Route() {
    }
    
}

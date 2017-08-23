/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import com.builder.FactoryXml;
import com.builder.Route;

import com.entity.*;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.primefaces.expression.impl.ThisExpressionResolver;

/**
 *
 * @author carlos
 */
public class test extends Route{
    public static void main(String[] args) {
        try{
        //util.createLogo("4444444444333344431141344341113443111434431411344433334444444444");
        //cron crron=new cron();
       // util.createXml(new RankG());
      // FactoryXml.createXml(new ListRankPK());
           
            PowerLvl power=new PowerLvl();
            power.setDelReset(true);
            power.setAddLvl(16000);
            power.setReqMasterLvl(0);
            power.setReqReset(200);
        FactoryXml.createXml(power);
       // RankG.class.getClass().getResource("/").getPath();
       // URL input=ClassLoader.getSystemResource("Entidades/Rank_CS.class");
       

        }catch(Exception err){
            
        err.printStackTrace();
        }
    }

    

    private static Boolean isFBLike(com.safiro.jmucore.ws.FbLike like) {
        com.safiro.jmucore.ws.WebServiceJMu_Service service = new com.safiro.jmucore.ws.WebServiceJMu_Service();
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.isFBLike(like);
    }
    
    
}

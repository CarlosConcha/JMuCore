/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import com.builder.FactoryInstance;
import com.entity.Estadis;
import com.entity.News;
import com.entity.Notice;
import com.entity.RankG;
import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import com.safiro.jmucore.ws.RankGuild;

/**
 *
 * @author carlos
 */
public class util {
    public static Estadis loadXml() throws JAXBException, MalformedURLException {
       
        //File file=new File("C:\\Users\\carlos\\Documents\\NetBeansProjects\\JMuCore\\src\\java\\com\\consume\\statistics.xml");
        URL url=new URL("http://localhost:8080/JMuCore/consume/statistics.xml");
       // File file=new File(patch+"/statistics.xml");
        JAXBContext jax=JAXBContext.newInstance(Estadis.class);
        Unmarshaller jaxUn=jax.createUnmarshaller();
        Estadis est=(Estadis) jaxUn.unmarshal(url);
        return est;
    }
    
    public static News loadXmlNews() throws JAXBException, MalformedURLException {
       
        //File file=new File("C:\\Users\\carlos\\Documents\\NetBeansProjects\\JMuCore\\src\\java\\com\\consume\\statistics.xml");
        URL url=new URL("http://localhost:8080/JMuCore/consume/news.xml");
       // File file=new File(patch+"/statistics.xml");
        JAXBContext jax=JAXBContext.newInstance(News.class);
        Unmarshaller jaxUn=jax.createUnmarshaller();
        News news=(News) jaxUn.unmarshal(url);
        return news;
    }
    public static void createXmlNews(News news){
        try{
        File file=new File("C:\\Users\\carlos\\Documents\\NetBeansProjects\\JMuCore\\src\\java\\com\\consume\\news1test.xml");
        JAXBContext jaxb=JAXBContext.newInstance(News.class);
        Marshaller jaxUn=jaxb.createMarshaller();
        
        jaxUn.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxUn.marshal(news, file);
        jaxUn.marshal(news, System.out);
        }catch(Exception err){}
    }
    public static void createXml(Object obj){
        try{
        File file=new File("C:\\Users\\carlos\\Documents\\NetBeansProjects\\JMuCore\\src\\java\\com\\consume\\rankG.xml");
        JAXBContext jaxb=FactoryInstance.getInstance(obj);
        Marshaller jaxUn=jaxb.createMarshaller();
        ((RankG)obj).setLstRankG(getRankGuild());
        
        jaxUn.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxUn.marshal(obj, file);
        jaxUn.marshal(obj, System.out);
        }catch(Exception err){
            System.out.println("error" + err.getMessage());
            err.printStackTrace();
        }
    }

    protected static java.util.List<com.safiro.jmucore.ws.RankGuild> getRankGuild() {
        com.safiro.jmucore.ws.WebServiceJMu_Service service = new com.safiro.jmucore.ws.WebServiceJMu_Service();
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.getRankGuild();
    }
   
    
    
}

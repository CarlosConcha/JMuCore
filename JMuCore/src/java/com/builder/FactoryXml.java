/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.builder;

import com.consume.Data;
import com.entity.ListRankChar;
import com.entity.ListRankPK;
import com.entity.RankG;
import com.entity.Rank_CS;
import com.entity.ResetOPT;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.faces.context.FacesContext;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


/**
 *
 * @author carlos
 */
public class FactoryXml extends Data {

    public static void createXml(Object obj) {
        try {
            
            File file = new File(Route.FOLDER_XML+obj.getClass().getSimpleName());
            JAXBContext jaxb = FactoryInstance.getInstance(obj);
            
            Marshaller jaxUn = jaxb.createMarshaller();
            if(obj instanceof RankG){
            ((RankG) obj).setLstRankG(getRankGuild());
            }
            if(obj instanceof ListRankChar){
            ((ListRankChar) obj).setLstchar(getRankCharacters());
            }
            if(obj instanceof ListRankPK){
            ((ListRankPK) obj).setLstPK(getRankPK());
            }
            if(obj instanceof Rank_CS){
            ((Rank_CS) obj).setcS(getRankCS());
            }
            
            jaxUn.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxUn.marshal(obj, file);
            jaxUn.marshal(obj, System.out);
        } catch (JAXBException err) {
            System.err.println("error" + err.getMessage());
            err.printStackTrace();
        } catch (NullPointerException err){
            System.err.println("La ruta del archivo es incorrecta");
            err.printStackTrace();
        }
    }
     public static Object loadXml(Object obj) {
       Object object=null;
         try{
        File file=new File(Route.FOLDER_XML+obj.getClass().getSimpleName());
        JAXBContext jax=FactoryInstance.getInstance(obj);
        Unmarshaller jaxUn=jax.createUnmarshaller();
        object=jaxUn.unmarshal(file);
         }catch (JAXBException err){
         err.printStackTrace();}
        return object;
    }
      public static Object loadXml(Object obj,String name) {
       Object object=null;
         try{
        File file=new File(Route.FOLDER_XML+name);
        JAXBContext jax=FactoryInstance.getInstance(obj);
        Unmarshaller jaxUn=jax.createUnmarshaller();
        object=jaxUn.unmarshal(file);
         }catch (JAXBException err){
         err.printStackTrace();}
        return object;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.builder;

import com.entity.Estadis;
import com.entity.ListRankChar;
import com.entity.ListRankPK;
import com.entity.Menu;
import com.entity.News;
import com.entity.PowerLvl;
import com.entity.RankG;
import com.entity.Rank_CS;
import com.entity.ResetOPT;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


/**
 *
 * @author carlos
 */
public class FactoryInstance {
    public static JAXBContext getInstance(Object obj){
        try{
        if(obj instanceof RankG){
            return JAXBContext.newInstance(RankG.class);
        }
        if(obj instanceof ListRankChar){
            return JAXBContext.newInstance(ListRankChar.class);
        }
        if(obj instanceof ListRankPK){
            return JAXBContext.newInstance(ListRankPK.class);
        }
        if(obj instanceof Rank_CS){
            return JAXBContext.newInstance(Rank_CS.class);
        }
        if(obj instanceof Estadis){
            return JAXBContext.newInstance(Estadis.class);
        }
         if(obj instanceof News){
            return JAXBContext.newInstance(News.class);
        }
         if(obj instanceof Menu){
            return JAXBContext.newInstance(Menu.class);
        }
        if(obj instanceof ResetOPT){
            return JAXBContext.newInstance(ResetOPT.class);
        }
        if(obj instanceof PowerLvl){
            return JAXBContext.newInstance(PowerLvl.class);
        }
        }catch(JAXBException err){
            err.printStackTrace();
        }
        return null;
    }
}

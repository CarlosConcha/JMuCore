/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import com.safiro.jmucore.ws.RankGuild;


/**
 *
 * @author carlos
 */

@XmlRootElement (name="rankg")
public class RankG {
    List<RankGuild> lstRankG=new ArrayList<RankGuild>();

    public RankG() {
    }
    @XmlElementWrapper(name = "lstRankG")
    @XmlElement(name="rankGuild")
    public List<RankGuild> getLstRankG() {
        return lstRankG;
    }

    public void setLstRankG(List<RankGuild> lstRankG) {
        this.lstRankG = lstRankG;
    }
    
}

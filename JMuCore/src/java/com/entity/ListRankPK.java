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
import com.safiro.jmucore.ws.RankPK;

/**
 *
 * @author carlos
 */
@XmlRootElement (name="rankPK")
public class ListRankPK {
    List<RankPK> lstPK=new ArrayList<RankPK>();

    public ListRankPK() {
    }
    @XmlElementWrapper(name = "Rank")
    @XmlElement(name="pj")
    public List<RankPK> getLstPK() {
        return lstPK;
    }

    public void setLstPK(List<RankPK> lstPK) {
        this.lstPK = lstPK;
    }
    
    
}

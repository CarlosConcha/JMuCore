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
import com.safiro.jmucore.ws.RankChar;

/**
 *
 * @author carlos
 */
@XmlRootElement (name="RankCharacter")
public class ListRankChar {
    List<RankChar> lstchar=new ArrayList<RankChar>();

    public ListRankChar() {
    }
    
    @XmlElementWrapper(name = "ListRank")
    @XmlElement(name="pj")
    public List<RankChar> getLstchar() {
        return lstchar;
    }

    public void setLstchar(List<RankChar> lstchar) {
        this.lstchar = lstchar;
    }
    
    
}

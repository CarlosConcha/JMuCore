/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import com.safiro.jmucore.ws.RankCS;

/**
 *
 * @author carlos
 */
@XmlRootElement (name = "rank")
public class Rank_CS {
    private RankCS cS;

    public Rank_CS() {
    }
 
    @XmlElement(name = "rankCS")
    public RankCS getcS() {
        return cS;
    }

    public void setcS(RankCS cS) {
        this.cS = cS;
    }
}

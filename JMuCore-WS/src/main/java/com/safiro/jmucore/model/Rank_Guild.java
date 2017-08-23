/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlos
 */
@XmlRootElement (name="rankGuild")
public class Rank_Guild {
    private String nameMaster;
    private String nameGuild;
    private int score;

    public Rank_Guild() {
    }

    public Rank_Guild(String nameMaster, String nameGuild, int score) {
        this.nameMaster = nameMaster;
        this.nameGuild = nameGuild;
        this.score = score;
    }
    @XmlElement(name = "nameMaster")
    public String getNameMaster() {
        return nameMaster;
    }

    public void setNameMaster(String nameMaster) {
        this.nameMaster = nameMaster;
    }
    @XmlElement(name = "nameGuild")
    public String getNameGuild() {
        return nameGuild;
    }

    public void setNameGuild(String nameGuild) {
        this.nameGuild = nameGuild;
    }
    @XmlElement(name = "score")
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}

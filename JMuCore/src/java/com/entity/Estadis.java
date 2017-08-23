/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author carlos
 */
@XmlRootElement (name = "statistics")
@XmlType(propOrder = {"exp","drop","online"})
public class Estadis {
    private String exp;
    private String drop;
    private String online;

    public Estadis() {
    }
    @XmlElement
    public String getExp() {
        return exp;
    }
    
    public void setExp(String exp) {
        this.exp = exp;
    }
    @XmlElement
    public String getDrop() {
        return drop;
    }
    
    public void setDrop(String drop) {
        this.drop = drop;
    }
    @XmlElement
    public String getOnline() {
        return online;
    }
    
    public void setOnline(String online) {
        this.online = online;
    }
    
}

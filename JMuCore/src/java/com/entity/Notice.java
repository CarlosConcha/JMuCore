/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author carlos
 */
@XmlRootElement (name = "notice")
@XmlType(propOrder = {"idNotice","type","title","body","date"})
public class Notice {
    private String idNotice;
    private String type;
    private String title;
    private String body;
    private String date;

    public Notice() {
    }
    @XmlAttribute(name="id")
    public String getIdNotice() {
        return idNotice;
    }

    public void setIdNotice(String idNotice) {
        this.idNotice = idNotice;
    }
    
    public String getTitle() {
        return title;
    }
    @XmlAttribute(name="type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}

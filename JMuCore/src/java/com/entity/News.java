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

/**
 *
 * @author carlos
 */
@XmlRootElement (name="news")
public class News {
    private List<Notice> notices=new ArrayList<Notice>();

    public News() {
    }
    @XmlElementWrapper(name = "notices")
    @XmlElement(name="notice")
    public List<Notice> getNotices() {
        return notices;
    }

    public void setNotices(List<Notice> notices) {
        this.notices = notices;
    }
    
}

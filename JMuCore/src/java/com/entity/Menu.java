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
@XmlRootElement (name = "Menu")
public class Menu {
    private List<Items> items=new ArrayList<Items>();

    public Menu() {
    }
    @XmlElementWrapper (name = "subMenu")
    @XmlElement (name = "items")
    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.manager;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author carlos
 */
@Named(value = "bmPageControll")
@ViewScoped
public class bmPageControll implements Serializable{

    private String Page;
    
    @PostConstruct
    public void init(){
        setPage("com_powerlevel");
    }

    public String getPage() {
        return Page;
    }

    public void setPage(String Page) {
        this.Page = Page;
    }
    
}

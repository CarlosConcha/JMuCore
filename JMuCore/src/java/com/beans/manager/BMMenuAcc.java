/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.manager;

import com.builder.FactoryXml;
import com.entity.Items;
import com.entity.Menu;
import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;
import java.util.stream.Collectors;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultSubMenu;
/**
 *
 * @author carlos
 */
@ManagedBean
@Named(value = "bMMenuAcc")
@ViewScoped
public class BMMenuAcc implements Serializable{
    
    private MenuModel model;
    
    @PostConstruct
    public void init(){
        model=new DefaultMenuModel();
        Menu menu=(Menu)FactoryXml.loadXml(new Menu(), "Menu_ACC.xml");
        List<Items> items=menu.getItems().stream().filter(x -> x.getUse()==true).collect(Collectors.toList());
        DefaultSubMenu submenu=new DefaultSubMenu(getWord("charopt"));
       
        for (Items temp : items) {
            if (temp.getValue().equals("powerlevel")) {
                DefaultMenuItem item = new DefaultMenuItem();
                item.setValue(getWord("powerlvl"));
                item.setCommand("#{bmPageControll.setPage('"+temp.getOutcome()+"')}");
                item.setAjax(false);
                submenu.addElement(item);
            }
            if (temp.getValue().equals("reset")) {
                DefaultMenuItem item = new DefaultMenuItem();
                item.setValue(getWord("reset"));
                item.setCommand("#{bmPageControll.setPage('"+temp.getOutcome()+"')}");
                item.setAjax(false);
                submenu.addElement(item);
            }
            if (temp.getValue().equals("addgift")) {
                DefaultMenuItem item = new DefaultMenuItem();
                item.setValue(getWord("gift"));
                item.setCommand("#{bmPageControll.setPage('"+temp.getOutcome()+"')}");
                item.setAjax(false);
                submenu.addElement(item);
            }
        }

        
        model.addElement(submenu);
    }
    
    public MenuModel getModel() {
        return model;
    }
    
    public void setModel(MenuModel model) {
        this.model = model;
    }
    private String getWord(String key){
        ResourceBundle rb=FacesContext.getCurrentInstance().getApplication().getResourceBundle(FacesContext.getCurrentInstance(), "word");
        return rb.getString(key);
    } 
}

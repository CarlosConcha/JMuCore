/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.manager;

import com.builder.FactoryXml;
import com.entity.ResetOPT;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author carlos
 */
@Named(value = "bmReqReset")
@ViewScoped
public class bmReqReset implements Serializable{

    private ResetOPT reqrst;
    
    @PostConstruct
    public void init(){
        reqrst=(ResetOPT)FactoryXml.loadXml(new ResetOPT());
    }

    public ResetOPT getReqrst() {
        return reqrst;
    }

    public void setReqrst(ResetOPT reqrst) {
        this.reqrst = reqrst;
    }
    
}

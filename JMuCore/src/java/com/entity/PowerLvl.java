/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlos
 */
@XmlRootElement
public class PowerLvl {
    private Boolean DelReset;
    private int ReqReset;
    private int AddLvl;
    private int ReqMasterLvl;

    public PowerLvl() {
    }
    @XmlAttribute
    public Boolean getDelReset() {
        return DelReset;
    }

    public void setDelReset(Boolean DelReset) {
        this.DelReset = DelReset;
    }

    public int getReqReset() {
        return ReqReset;
    }

    public void setReqReset(int ReqReset) {
        this.ReqReset = ReqReset;
    }

    public int getAddLvl() {
        return AddLvl;
    }

    public void setAddLvl(int AddLvl) {
        this.AddLvl = AddLvl;
    }

    public int getReqMasterLvl() {
        return ReqMasterLvl;
    }

    public void setReqMasterLvl(int ReqMasterLvl) {
        this.ReqMasterLvl = ReqMasterLvl;
    }
    
}

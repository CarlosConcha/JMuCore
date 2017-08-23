/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author carlos
 */
@XmlRootElement (name = "OptReset")
@XmlType (propOrder = {"maxReset","levelNeed","enableMoney","moneyNeed"})
public class ResetOPT {
    private int MaxReset;
    private int LevelNeed;
    private Boolean EnableMoney;
    private int MoneyNeed;

    public ResetOPT() {
    }

    @XmlElement 
    public int getMaxReset() {
        return MaxReset;
    }

    public void setMaxReset(int MaxReset) {
        this.MaxReset = MaxReset;
    }
    @XmlElement
    public int getLevelNeed() {
        return LevelNeed;
    }

    public void setLevelNeed(int LevelNeed) {
        this.LevelNeed = LevelNeed;
    }
    @XmlAttribute (name = "isMoney")
    public Boolean getEnableMoney() {
        return EnableMoney;
    }

    public void setEnableMoney(Boolean EnableMoney) {
        this.EnableMoney = EnableMoney;
    }
    
    @XmlElement
    public int getMoneyNeed() {
        return MoneyNeed;
    }

    public void setMoneyNeed(int MoneyNeed) {
        this.MoneyNeed = MoneyNeed;
    }
    
    
}

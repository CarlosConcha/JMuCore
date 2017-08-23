/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.model;
//import util.State;
/**
 *
 * @author carlos
 */
public class statistics {
    private int exp;
    private int totalUser;
    private int totalAcc;
    private int drop;
    private int totalGuild;
    private int charOnline;
   // private State online;

    public statistics() {
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public int getTotalAcc() {
        return totalAcc;
    }

    public void setTotalAcc(int totalAcc) {
        this.totalAcc = totalAcc;
    }

    public int getDrop() {
        return drop;
    }

    public void setDrop(int drop) {
        this.drop = drop;
    }

    public int getTotalGuild() {
        return totalGuild;
    }

    public void setTotalGuild(int totalGuild) {
        this.totalGuild = totalGuild;
    }

    public int getCharOnline() {
        return charOnline;
    }

    public void setCharOnline(int charOnline) {
        this.charOnline = charOnline;
    }
    

//    public State getOnline() {
//        return online;
//    }
//
//    public void setOnline(State online) {
//        this.online = online;
//    }

    @Override
    public String toString() {
        return "statistics{" + "exp=" + exp + ", totalUser=" + totalUser + ", totalAcc=" + totalAcc + ", drop=" + drop + ", totalGuild=" + totalGuild + ", charOnline=" + charOnline + '}';
    }

    
}

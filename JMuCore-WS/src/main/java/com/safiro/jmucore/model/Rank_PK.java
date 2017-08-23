/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.model;

/**
 *
 * @author carlos
 */
public class Rank_PK {
    private String name;
    private int killcount;

    public Rank_PK() {
    }

    public Rank_PK(String name, int killcount) {
        this.name = name;
        this.killcount = killcount;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKillcount() {
        return killcount;
    }

    public void setKillcount(int killcount) {
        this.killcount = killcount;
    }
    
}

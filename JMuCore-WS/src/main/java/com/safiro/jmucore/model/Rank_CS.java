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
public class Rank_CS {
    private String owner;
    private String simbol;
    public Rank_CS() {
    }

    public Rank_CS(String owner, String simbol) {
        this.owner = owner;
        this.simbol = simbol;
    }

    

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }
    
}

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
public class Rank_Char {
    private String name;
    private int resets;

    public Rank_Char() {
    }

    public Rank_Char(String name, int resets) {
        this.name = name;
        this.resets = resets;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResets() {
        return resets;
    }

    public void setResets(int resets) {
        this.resets = resets;
    }
    
}

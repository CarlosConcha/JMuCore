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
public class Login {
    private String user;
    private String pass;
    private int id;
    private String mail;
    private String outDays;
    private String country;
    private int gender;
    private String lastIp;
    private String FBLike;
    public Login() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getOutDays() {
        return outDays;
    }

    public void setOutDays(String outDays) {
        this.outDays = outDays;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFBLike() {
        return FBLike;
    }

    public void setFBLike(String FBLike) {
        this.FBLike = FBLike;
    }
   
    
}

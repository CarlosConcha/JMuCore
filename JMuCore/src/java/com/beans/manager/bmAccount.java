/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans.manager;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.inject.Inject;
import com.safiro.jmucore.ws.Login;

/**
 *
 * @author carlos
 */
@Named(value = "bmAccount")
@RequestScoped
public class bmAccount {

    @Inject
    private SessionController session;
    public bmAccount() {
    }
    public Login getUser(){
        if(session.isSession()){
            return session.getSession();
        }
        return null;
    }
}

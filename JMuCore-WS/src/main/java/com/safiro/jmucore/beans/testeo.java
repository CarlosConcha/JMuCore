/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.beans;


import com.safiro.jmucore.dao.imp.ICharacter;
import com.safiro.jmucore.dao.imp.ILogin;
import com.safiro.jmucore.model.statistics;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.safiro.jmucore.dao.imp.IStatistics;
import com.safiro.jmucore.model.CharacterbyID;
import com.safiro.jmucore.model.Login;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class testeo {
    public static void main(String[] args) throws SQLException, IOException{
        ApplicationContext context=new ClassPathXmlApplicationContext("com/safiro/jmucore/xml/beans.xml");
        ILogin daowea=(ILogin)context.getBean("DAOLogin");
        Login login=new Login();
        login.setUser("bazofiamen");
        login.setPass("54287210");
        Login logg=daowea.login(login);
        System.out.println(logg);
         
//        Scanner scann = new Scanner(System.in);
//        long t = scann.nextLong();
//        long temp=4;
//        for(long cycle=3;t>cycle;cycle*=2){
//            t-=cycle;
//            temp= (cycle*2 + 1);
//        }
//        System.out.println(temp-t);
        
        
    }
}

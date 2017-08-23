/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.service;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author carlos
 */
public class DSConn {
    //@Autowired
    //protected DataSource dataSource;
    @Autowired
    protected JdbcTemplate template;

}

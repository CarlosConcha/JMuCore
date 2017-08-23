/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao.rowmapper;

import com.safiro.jmucore.model.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author carlos
 */
public class LoginRowMapper implements RowMapper{

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
        Login login = new Login();
        login.setUser(rs.getString("memb___id"));
        login.setPass("");
        login.setCountry(rs.getString("country"));
        login.setGender(rs.getInt("gender"));
        login.setId(rs.getInt("memb_guid"));
        login.setLastIp(rs.getString("acc_ip"));
        login.setMail(rs.getString("mail_addr"));
        login.setOutDays(rs.getString("out__days"));
        login.setFBLike(rs.getString("fb_like"));
        return login;
    }
    
}

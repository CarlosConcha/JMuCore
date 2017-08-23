/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao;

import com.safiro.jmucore.dao.imp.ILogin;
import com.safiro.jmucore.dao.rowmapper.LoginRowMapper;
import com.safiro.jmucore.model.Login;
import com.safiro.jmucore.service.DSConn;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

/**
 *
 * @author carlos
 */
@Component("DAOLogin")
public class jdbcLoginDAO extends DSConn implements ILogin{

    @Override
    public Login login(Login logg) {
        String sql = "select memb_guid,memb___id,mail_addr,out__days,country,gender,acc_ip,fb_like "
                + "from MuOnline.dbo.MEMB_INFO "
                + "where CONVERT(NVARCHAR(32),memb__pwd,2) = CONVERT(NVARCHAR(32),[MuOnline].[dbo].[fn_md5](?,?),2)";
        Login login = null;
        try {
            Object[] param={logg.getPass(),logg.getUser()};
            login=(Login)template.queryForObject(sql, new LoginRowMapper(),param);
            if (login == null) {
                return null;
            }
           
        } catch (DataAccessException err) {
            System.out.println(err.getMessage());
            err.printStackTrace();
        }
        return login;
    }
    
}

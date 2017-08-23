/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao.rowmapper;

import com.safiro.jmucore.model.statistics;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author carlos
 */
public class statisticsRowMapper implements RowMapper{

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
                statistics std=new statistics();
                std.setTotalAcc(rs.getInt(1));
                std.setTotalUser(rs.getInt(2));
                std.setTotalGuild(rs.getInt(3));
                std.setCharOnline(rs.getInt(4));
                return std;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao;

import com.safiro.jmucore.model.statistics;
import com.safiro.jmucore.service.DSConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Component;
import com.safiro.jmucore.dao.imp.IStatistics;
import com.safiro.jmucore.dao.rowmapper.statisticsRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author carlos
 */
@Component("DAOStatistics")
public class jdbcStatisticsDAO extends DSConn implements IStatistics{
    
//    @Override
//    public statistics select() {
//        String sql = "select COUNT(distinct memb.memb___id),COUNT(pj.Name),\n"
//                + "(select COUNT(G_Name) from MuOnline.dbo.Guild),\n"
//                + "(select COUNT(memb___id) from MuOnline.dbo.MEMB_STAT where ConnectStat=1) \n"
//                + "from MuOnline.dbo.MEMB_INFO memb\n"
//                + "left join MuOnline.dbo.Character pj\n"
//                + "on memb.memb___id=pj.AccountID\n"
//                + "COLLATE modern_spanish_ci_as";
//        Connection conn = null;
//        statistics std =null;
//        try {
//            conn = dataSource.getConnection();
//            conn.setAutoCommit(false);
//            PreparedStatement stm = conn.prepareStatement(sql);
//            ResultSet rs = stm.executeQuery();
//            if (rs.next()) {
//                std=new statistics();
//                std.setTotalAcc(rs.getInt(1));
//                std.setTotalUser(rs.getInt(2));
//                std.setTotalGuild(rs.getInt(3));
//                std.setCharOnline(rs.getInt(4));
//            }
//            rs.close();
//            stm.close();
//            return std;
//        } catch (SQLException err) {
//            err.printStackTrace();
//        } finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                }
//            }
//        }
//        return std;
//    }
    @Override
    public statistics select(){
        String sql = "select COUNT(distinct memb.memb___id),COUNT(pj.Name),\n"
                + "(select COUNT(G_Name) from MuOnline.dbo.Guild),\n"
                + "(select COUNT(memb___id) from MuOnline.dbo.MEMB_STAT where ConnectStat=1) \n"
                + "from MuOnline.dbo.MEMB_INFO memb\n"
                + "left join MuOnline.dbo.Character pj\n"
                + "on memb.memb___id=pj.AccountID\n"
                + "COLLATE modern_spanish_ci_as";
        //template=new JdbcTemplate(dataSource);
        statistics est=(statistics)template.queryForObject(sql, new statisticsRowMapper());
        return est;
    }
   
    
}

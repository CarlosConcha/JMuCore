/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao;

import com.safiro.jmucore.dao.imp.IRankCS;
import com.safiro.jmucore.dao.rowmapper.RankCSRowMapper;
import com.safiro.jmucore.model.Rank_CS;
import com.safiro.jmucore.service.DSConn;
import org.springframework.stereotype.Component;

/**
 *
 * @author carlos
 */
@Component("DAORankCS")
public class jdbcRankCSDAO extends DSConn implements IRankCS{

    @Override
    public Rank_CS getRankChar() {
        String sql = "select mucs.OWNER_GUILD,convert(varbinary,gi.G_Mark) \n"
                + "from MuOnline.dbo.MuCastle_DATA mucs\n"
                + "inner join MuOnline.dbo.Guild gi\n"
                + "on mucs.OWNER_GUILD=gi.G_Name";
      
        Rank_CS rank = null;

        try {
            rank=(Rank_CS)template.queryForObject(sql, new RankCSRowMapper());
            if (rank==null) {
                return null;
            }

        } catch (Exception err) {
            System.err.println("Error al consultar el ranking CS err:" + err.getMessage());
            err.printStackTrace();
        }

        return rank;
    }
    
}

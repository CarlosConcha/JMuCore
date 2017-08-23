/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao;

import com.safiro.jmucore.service.DSConn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import com.safiro.jmucore.dao.imp.IRankGuild;
import com.safiro.jmucore.model.Rank_Guild;
import org.springframework.stereotype.Component;

/**
 *
 * @author carlos
 */
@Component("DAORankGuild")
public class jdbcRankGuildDAO extends DSConn implements IRankGuild{

    @Override
    public List<Rank_Guild> getRankGuild() {
        String sql = "select TOP 3 G_Name,G_Master,G_Score from MuOnline.dbo.Guild order by G_Score desc";
        List<Rank_Guild> rank = new ArrayList<Rank_Guild>();
        Boolean isValid = true;
        try {
            List<Map<String, Object>> queryresult = template.queryForList(sql);
            for (Map maptemp : queryresult) {
                Rank_Guild rankguild=new Rank_Guild();
                rankguild.setNameGuild(maptemp.get("G_Name").toString());
                rankguild.setNameMaster(maptemp.get("G_Master").toString());
                rankguild.setScore(Integer.parseInt(String.valueOf(maptemp.get("G_Score"))));
                rank.add(rankguild);
            }
            isValid = (rank.size() == 3);
        } catch (NumberFormatException | DataAccessException err) {
            System.err.println("Error al consultar el ranking err:" + err.getMessage());
            err.printStackTrace();
        }
        if (!isValid) {
            return null;
        }
        return rank;
    }
    
}

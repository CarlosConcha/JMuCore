/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao;

import com.safiro.jmucore.dao.imp.IRankPK;
import com.safiro.jmucore.model.Rank_PK;
import com.safiro.jmucore.service.DSConn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

/**
 *
 * @author carlos
 */
@Component("DAORankPK")
public class jdbcRankPKDAO extends DSConn implements IRankPK{

    @Override
    public List<Rank_PK> getRankPK() {
        String sql = "select TOP 3 Name,PkCount from MuOnline.dbo.Character order by PkCount desc";
        List<Rank_PK> rank = new ArrayList<Rank_PK>();
        Boolean isValid = true;
        try {
            List<Map<String, Object>> queryresult = template.queryForList(sql);
            for (Map maptemp : queryresult) {
                Rank_PK rankpk = new Rank_PK();
                rankpk.setName(maptemp.get("Name").toString());
                rankpk.setKillcount(Integer.parseInt(String.valueOf(maptemp.get("PkCount"))));
                rank.add(rankpk);
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

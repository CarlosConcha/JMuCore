/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao;

import com.safiro.jmucore.model.Rank_Char;
import com.safiro.jmucore.service.DSConn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import com.safiro.jmucore.dao.imp.IRankChar;
import org.springframework.stereotype.Component;

/**
 *
 * @author carlos
 */
@Component("DAORankChar")
public class jdbcRankCharDAO extends DSConn implements IRankChar{

    @Override
    public List<Rank_Char> getRankChar() {
        String sql = "select TOP 3 Name,resets from MuOnline.dbo.Character order by resets desc";
        List<Rank_Char> rank = new ArrayList<Rank_Char>();
        Boolean isValid = true;
        try {
            List<Map<String,Object>> queryresult=template.queryForList(sql);
            for(Map maptemp:queryresult){
                Rank_Char rankchar=new Rank_Char();
                rankchar.setName(maptemp.get("Name").toString());
                rankchar.setResets(Integer.parseInt(String.valueOf(maptemp.get("resets"))));
                rank.add(rankchar);
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

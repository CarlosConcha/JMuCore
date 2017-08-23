/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao.rowmapper;

import com.safiro.jmucore.model.Rank_CS;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author carlos
 */
public class RankCSRowMapper implements RowMapper{

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
            Rank_CS rank=new Rank_CS();
            rank.setOwner(rs.getString(1));
            rank.setSimbol(rs.getString(2));
            return rank;
    }
    
}

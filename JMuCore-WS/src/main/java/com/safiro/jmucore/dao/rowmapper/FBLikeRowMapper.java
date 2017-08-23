/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao.rowmapper;

import com.safiro.jmucore.model.FBLike;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author carlos
 */
public class FBLikeRowMapper implements RowMapper{

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
        FBLike fb = new FBLike();
        fb.setFbLike(rs.getString("fb_like"));
        return fb;
    }
    
}

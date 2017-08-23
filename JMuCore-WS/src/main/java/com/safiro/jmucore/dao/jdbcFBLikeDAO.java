/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao;

import com.safiro.jmucore.dao.imp.IFBLike;
import com.safiro.jmucore.dao.rowmapper.FBLikeRowMapper;
import com.safiro.jmucore.model.FBLike;
import com.safiro.jmucore.service.DSConn;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

/**
 *
 * @author carlos
 */
@Component("DAOFBLike")
public class jdbcFBLikeDAO extends DSConn implements IFBLike{

    @Override
    public Boolean isSocialLike(FBLike like) {
        String sql = "select fb_like from muonline.dbo.memb_info where memb___id=?";
        Boolean result = false;
        FBLike fb=null;
        try {
            
            Object[] param={like.getAccount()};
            fb=(FBLike)template.queryForObject(sql, new FBLikeRowMapper(),param);
            if (fb != null) {
                result = !(fb.getFbLike().equals("no") || fb.getFbLike().isEmpty());
            }
           
        } catch (DataAccessException err) {
            System.out.println(err.getMessage());
        }
        return result;
    }

    @Override
    public Boolean setSocialLike(FBLike like) {
        String sql = "update MuOnline.dbo.memb_info set fb_like= ? where memb___id=?";
        int result = 0;
        try {
            Object[] param={like.getFbLike(),like.getAccount()};
            result = template.update(sql,param);
        } catch (DataAccessException err) {
            err.printStackTrace();
        }
        return result > 0;
    }
    
}

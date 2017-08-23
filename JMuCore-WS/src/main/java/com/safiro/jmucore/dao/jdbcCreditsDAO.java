/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao;

import com.safiro.jmucore.dao.imp.ICredits;
import com.safiro.jmucore.model.Credits;
import com.safiro.jmucore.service.DSConn;
import org.springframework.stereotype.Component;

/**
 *
 * @author carlos
 */
@Component("DAOCredits")
public class jdbcCreditsDAO extends DSConn implements ICredits{

    @Override
    public Boolean addCredits(Credits credit) {
        String sql = "update [MuOnline].[dbo].[DmN_Shop_Credits] set credits= credits + ? where memb___id= ?";
        int result = 0;
        try {
            Object[] param={credit.getCredit(),credit.getUser()};
            result = template.update(sql,param);
        } catch (Exception err) {
            err.printStackTrace();
        }
        return result > 0;
    }
    
}

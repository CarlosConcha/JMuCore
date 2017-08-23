/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao;

import com.safiro.jmucore.dao.imp.ICharacter;
import com.safiro.jmucore.model.CharacterbyID;
import com.safiro.jmucore.model.Login;
import com.safiro.jmucore.service.DSConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.stereotype.Component;

/**
 *
 * @author carlos
 */
@Component("DAOCharacter")
public class jdbcCharacterDAO extends DSConn implements ICharacter{
    
    
    @Override
    public List<CharacterbyID> selectCharacter(Login login) {
        String sql = "SELECT"
                + "  [AccountID]"
                + " ,[Name]"
                + " ,[cLevel]"
                + " ,[LevelUpPoint]"
                + " ,[Strength]"
                + " ,[Dexterity]"
                + " ,[Vitality]"
                + " ,[Energy]"
                + " ,[Money]"
                + " ,[MapNumber]"
                + " ,[PkLevel]"
                + " ,[Leadership]"
                + " ,[Resets]"
                + "  FROM [MuOnline].[dbo].[Character] where AccountID=?";
        
        
        List<CharacterbyID> characterID = new ArrayList<CharacterbyID>();
        Boolean isValid = true;
        
        try {
            Object[] obj={login.getUser()};
            List<Map<String,Object>> queryresult=template.queryForList(sql, obj);
            
            for(Map maptemp:queryresult) {
                CharacterbyID character = new CharacterbyID();
                character.setAccountId(maptemp.get("AccountID").toString());
                character.setName(maptemp.get("Name").toString());
                character.setLevel(Integer.parseInt(String.valueOf(maptemp.get("cLevel"))));
                character.setPoints(Integer.parseInt(String.valueOf(maptemp.get("LevelUpPoint"))));
                character.setStrength(Integer.parseInt(String.valueOf(maptemp.get("Strength"))));
                character.setDexterity(Integer.parseInt(String.valueOf(maptemp.get("Dexterity"))));
                character.setVitality(Integer.parseInt(String.valueOf(maptemp.get("Vitality"))));
                character.setEnergy(Integer.parseInt(String.valueOf(maptemp.get("Energy"))));
                character.setMoney(Integer.parseInt(String.valueOf(maptemp.get("Money"))));
                character.setMapN(Integer.parseInt(String.valueOf(maptemp.get("MapNumber"))));
                character.setPKlvl(Integer.parseInt(String.valueOf(maptemp.get("PkLevel"))));
                character.setLeadership(Integer.parseInt(String.valueOf(maptemp.get("Leadership"))));
                character.setReset(Integer.parseInt(String.valueOf(maptemp.get("Resets"))));
                characterID.add(character);
            }

        } catch (Exception err) {
            System.err.println("Error al consultar el characterId err:" + err.getMessage());
            err.printStackTrace();
        }
        if (!isValid) {
            return null;
        }

        return characterID;
    }


    @Override
    public Boolean updateLevel(CharacterbyID character) {
        String sql="update MuOnline.dbo.Character set cLevel= ? where AccountID= ? and Name= ?";
        int result=0;
        try{
        Object[] param={character.getLevel(),character.getAccountId(),character.getName()};
        result=template.update(sql, param);
        }catch(Exception err){
        err.printStackTrace();
        }
        return result>0;
    }
    
}


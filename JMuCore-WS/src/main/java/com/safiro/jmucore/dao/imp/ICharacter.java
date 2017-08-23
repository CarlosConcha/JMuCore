/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao.imp;

import com.safiro.jmucore.model.CharacterbyID;
import com.safiro.jmucore.model.Login;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface ICharacter {
    public List<CharacterbyID> selectCharacter(Login login);
    public Boolean updateLevel(CharacterbyID character);
}

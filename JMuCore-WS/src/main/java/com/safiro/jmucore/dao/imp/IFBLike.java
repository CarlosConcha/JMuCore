/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.dao.imp;

import com.safiro.jmucore.model.FBLike;

/**
 *
 * @author carlos
 */
public interface IFBLike {
    public Boolean isSocialLike(FBLike like);
    public Boolean setSocialLike(FBLike like);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.builder;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author carlos
 */
public class FactoryIcon {
     private static Color color(char codigo){
        switch(codigo){
        case '0': return Color.WHITE;
        case '1': return Color.BLACK;
        case '2': return Color.GRAY;
        case '3': return Color.WHITE;
        case '4': return Color.RED;
        case '5': return Color.ORANGE;
        case '6': return Color.YELLOW;
        case '7': return Color.decode("#8cff01");
        case '8': return Color.GREEN;
        case '9': return Color.decode("#01ff8d");
        case 'a': return Color.decode("#00ffff");
        case 'b': return Color.decode("#008AFF");
        case 'c': return Color.BLUE;
        case 'd': return Color.decode("#8c00ff");
        case 'e': return Color.PINK;
        case 'f': return Color.decode("#ff008c");
        default: return Color.WHITE;
        }    
    }
    public static void createLogo(String hex){
        char[] codigo=hex.toCharArray();
        BufferedImage logoTmp=new BufferedImage(8, 8, BufferedImage.TYPE_INT_RGB);
        BufferedImage logo=new BufferedImage(80, 80, BufferedImage.TYPE_INT_RGB);
        int acum=0;
        for(int x=0;x<8;x++){
            for(int y=0;y<8;y++){
                logoTmp.setRGB(x, y, color(codigo[acum]).getRGB());
                acum++;
            }
        }
        AffineTransform at=new AffineTransform();
        at.scale(10.0, 10.0);
        AffineTransformOp atOP=new AffineTransformOp(at, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        logo=atOP.filter(logoTmp, logo);
        try{
        ImageIO.write(logo, "PNG", new File("web/resources/logos/logoCS.png"));
        }catch(IOException err){
            System.err.println("Error al generar logo CS - " + err.getMessage());
            err.printStackTrace();
        }
    }
}

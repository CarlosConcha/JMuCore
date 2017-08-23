/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consume;

import com.safiro.jmucore.ws.Exception_Exception;
import com.safiro.jmucore.ws.RankCS;
import com.safiro.jmucore.ws.Statistics;

/**
 *
 * @author carlos
 */
public class Data {


    protected static java.util.List<com.safiro.jmucore.ws.RankGuild> getRankGuild() {
        com.safiro.jmucore.ws.WebServiceJMu_Service service = new com.safiro.jmucore.ws.WebServiceJMu_Service();
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.getRankGuild();
    }

    protected static Statistics estadisticas() throws Exception_Exception {
        com.safiro.jmucore.ws.WebServiceJMu_Service service = new com.safiro.jmucore.ws.WebServiceJMu_Service();
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.estadisticas();
    }

    protected static RankCS getRankCS() {
        com.safiro.jmucore.ws.WebServiceJMu_Service service = new com.safiro.jmucore.ws.WebServiceJMu_Service();
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.getRankCS();
    }

    protected static java.util.List<com.safiro.jmucore.ws.RankPK> getRankPK() {
        com.safiro.jmucore.ws.WebServiceJMu_Service service = new com.safiro.jmucore.ws.WebServiceJMu_Service();
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.getRankPK();
    }

    protected static java.util.List<com.safiro.jmucore.ws.RankChar> getRankCharacters() {
        com.safiro.jmucore.ws.WebServiceJMu_Service service = new com.safiro.jmucore.ws.WebServiceJMu_Service();
        com.safiro.jmucore.ws.WebServiceJMu port = service.getWebServiceJMuPort();
        return port.getRankCharacters();
    }
    
}

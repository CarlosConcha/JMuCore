/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safiro.jmucore.ws;

import com.safiro.jmucore.dao.imp.ICharacter;
import com.safiro.jmucore.dao.imp.ICredits;
import com.safiro.jmucore.dao.imp.IFBLike;
import com.safiro.jmucore.dao.imp.ILogin;
import com.safiro.jmucore.dao.imp.IRankCS;
import com.safiro.jmucore.dao.imp.IRankChar;
import com.safiro.jmucore.dao.imp.IRankGuild;
import com.safiro.jmucore.dao.imp.IRankPK;
import com.safiro.jmucore.dao.imp.IStatistics;
import com.safiro.jmucore.model.CharacterbyID;
import com.safiro.jmucore.model.Credits;
import com.safiro.jmucore.model.FBLike;
import com.safiro.jmucore.model.Login;
import com.safiro.jmucore.model.Rank_CS;
import com.safiro.jmucore.model.Rank_Char;
import com.safiro.jmucore.model.Rank_Guild;
import com.safiro.jmucore.model.Rank_PK;
import com.safiro.jmucore.model.statistics;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author carlos
 */
@WebService(serviceName = "WebServiceJMu")
public class WebServiceJMu {

    /**
     * This is a sample web service operation
     */
    ApplicationContext context = new ClassPathXmlApplicationContext("com/safiro/jmucore/xml/beans.xml");
    @WebMethod(operationName = "loginUser")
    public Login loginUser(@WebParam(name = "user") String user,@WebParam(name = "pwd") String pwd)
    {
        Login logUser=new Login();
        logUser.setUser(user);
        logUser.setPass(pwd);
        ILogin logg=(ILogin)context.getBean("DAOLogin");
        Login login=logg.login(logUser);
        return login;
        
    }
     @WebMethod(operationName = "estadisticas")
    public statistics getStatistics() throws  Exception
    {
        IStatistics statis=(IStatistics)context.getBean("DAOStatistics");
        statistics statistic=statis.select();
        return statistic;
    }
    @WebMethod(operationName = "getRankCharacters")
    public List<Rank_Char> getRankCharacters()
    {
        IRankChar rankchar=(IRankChar)context.getBean("DAORankChar");
        List<Rank_Char> rankchars=rankchar.getRankChar();
        return rankchars;
    }
     @WebMethod(operationName = "getRankPK")
    public List<Rank_PK> getRankPK()
    {
       IRankPK rankpk=(IRankPK)context.getBean("DAORankPK");
        List<Rank_PK> rankpks=rankpk.getRankPK();
        return rankpks;
    }
      @WebMethod(operationName = "getRankGuild")
    public List<Rank_Guild> getRankGuild()
    {
        IRankGuild rankguild=(IRankGuild)context.getBean("DAORankGuild");
        List<Rank_Guild> rankguilds=rankguild.getRankGuild();
        return rankguilds;
    }
      @WebMethod(operationName = "getRankCS")
    public Rank_CS getRankCS()
    {
        IRankCS rankcs=(IRankCS)context.getBean("DAORankCS");
        Rank_CS rankcss=rankcs.getRankChar();
        return rankcss;
    }
    @WebMethod(operationName = "getCharacterAccount")
    public List<CharacterbyID> getCharacterAccount(@WebParam(name="login") Login login){
        ICharacter character=(ICharacter)context.getBean("DAOCharacter");
        List<CharacterbyID> characters=character.selectCharacter(login);
        return characters;
    }
    @WebMethod(operationName = "isFBLike")
    public Boolean isFBLike(@WebParam(name="like") FBLike like){
        IFBLike ifblike=(IFBLike)context.getBean("DAOFBLike");
        Boolean result=ifblike.isSocialLike(like);
        return result;
    }
    @WebMethod(operationName = "setFBLike")
    public Boolean setFBLike(@WebParam(name="like") FBLike like){
        IFBLike ifblike=(IFBLike)context.getBean("DAOFBLike");
        Boolean result=ifblike.setSocialLike(like);
        return result;
    }
    @WebMethod(operationName = "setLevelChar")
    public Boolean setLevelChar(@WebParam(name="character") CharacterbyID character){
         ICharacter charac=(ICharacter)context.getBean("DAOCharacter");
         Boolean result=charac.updateLevel(character);
         return result;
    }
    @WebMethod(operationName = "addCredit")
    public Boolean addCredit(@WebParam(name="credits") Credits cred){
        ICredits credits=(ICredits)context.getBean("DAOCredits");
        Boolean result=credits.addCredits(cred);
        return result;
    }
}

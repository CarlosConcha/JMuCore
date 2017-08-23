
package com.safiro.jmucore.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceJMu", targetNamespace = "http://ws.jmucore.safiro.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceJMu {


    /**
     * 
     * @return
     *     returns java.util.List<com.safiro.jmucore.ws.RankChar>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRankCharacters", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.GetRankCharacters")
    @ResponseWrapper(localName = "getRankCharactersResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.GetRankCharactersResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/getRankCharactersRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/getRankCharactersResponse")
    public List<RankChar> getRankCharacters();

    /**
     * 
     * @param login
     * @return
     *     returns java.util.List<com.safiro.jmucore.ws.CharacterbyID>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCharacterAccount", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.GetCharacterAccount")
    @ResponseWrapper(localName = "getCharacterAccountResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.GetCharacterAccountResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/getCharacterAccountRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/getCharacterAccountResponse")
    public List<CharacterbyID> getCharacterAccount(
        @WebParam(name = "login", targetNamespace = "")
        Login login);

    /**
     * 
     * @param pwd
     * @param user
     * @return
     *     returns com.safiro.jmucore.ws.Login
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginUser", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.LoginUser")
    @ResponseWrapper(localName = "loginUserResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.LoginUserResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/loginUserRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/loginUserResponse")
    public Login loginUser(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd);

    /**
     * 
     * @return
     *     returns java.util.List<com.safiro.jmucore.ws.RankPK>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRankPK", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.GetRankPK")
    @ResponseWrapper(localName = "getRankPKResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.GetRankPKResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/getRankPKRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/getRankPKResponse")
    public List<RankPK> getRankPK();

    /**
     * 
     * @return
     *     returns java.util.List<com.safiro.jmucore.ws.RankGuild>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRankGuild", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.GetRankGuild")
    @ResponseWrapper(localName = "getRankGuildResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.GetRankGuildResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/getRankGuildRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/getRankGuildResponse")
    public List<RankGuild> getRankGuild();

    /**
     * 
     * @return
     *     returns com.safiro.jmucore.ws.RankCS
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRankCS", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.GetRankCS")
    @ResponseWrapper(localName = "getRankCSResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.GetRankCSResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/getRankCSRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/getRankCSResponse")
    public RankCS getRankCS();

    /**
     * 
     * @param like
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isFBLike", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.IsFBLike")
    @ResponseWrapper(localName = "isFBLikeResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.IsFBLikeResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/isFBLikeRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/isFBLikeResponse")
    public Boolean isFBLike(
        @WebParam(name = "like", targetNamespace = "")
        FbLike like);

    /**
     * 
     * @param like
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setFBLike", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.SetFBLike")
    @ResponseWrapper(localName = "setFBLikeResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.SetFBLikeResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/setFBLikeRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/setFBLikeResponse")
    public Boolean setFBLike(
        @WebParam(name = "like", targetNamespace = "")
        FbLike like);

    /**
     * 
     * @param character
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setLevelChar", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.SetLevelChar")
    @ResponseWrapper(localName = "setLevelCharResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.SetLevelCharResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/setLevelCharRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/setLevelCharResponse")
    public Boolean setLevelChar(
        @WebParam(name = "character", targetNamespace = "")
        CharacterbyID character);

    /**
     * 
     * @param credits
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCredit", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.AddCredit")
    @ResponseWrapper(localName = "addCreditResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.AddCreditResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/addCreditRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/addCreditResponse")
    public Boolean addCredit(
        @WebParam(name = "credits", targetNamespace = "")
        Credits credits);

    /**
     * 
     * @return
     *     returns com.safiro.jmucore.ws.Statistics
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "estadisticas", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.Estadisticas")
    @ResponseWrapper(localName = "estadisticasResponse", targetNamespace = "http://ws.jmucore.safiro.com/", className = "com.safiro.jmucore.ws.EstadisticasResponse")
    @Action(input = "http://ws.jmucore.safiro.com/WebServiceJMu/estadisticasRequest", output = "http://ws.jmucore.safiro.com/WebServiceJMu/estadisticasResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ws.jmucore.safiro.com/WebServiceJMu/estadisticas/Fault/Exception")
    })
    public Statistics estadisticas()
        throws Exception_Exception
    ;

}
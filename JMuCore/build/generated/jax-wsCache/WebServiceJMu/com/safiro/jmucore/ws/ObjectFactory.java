
package com.safiro.jmucore.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.safiro.jmucore.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://ws.jmucore.safiro.com/", "Exception");
    private final static QName _AddCredit_QNAME = new QName("http://ws.jmucore.safiro.com/", "addCredit");
    private final static QName _AddCreditResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "addCreditResponse");
    private final static QName _Estadisticas_QNAME = new QName("http://ws.jmucore.safiro.com/", "estadisticas");
    private final static QName _EstadisticasResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "estadisticasResponse");
    private final static QName _GetCharacterAccount_QNAME = new QName("http://ws.jmucore.safiro.com/", "getCharacterAccount");
    private final static QName _GetCharacterAccountResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "getCharacterAccountResponse");
    private final static QName _GetRankCS_QNAME = new QName("http://ws.jmucore.safiro.com/", "getRankCS");
    private final static QName _GetRankCSResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "getRankCSResponse");
    private final static QName _GetRankCharacters_QNAME = new QName("http://ws.jmucore.safiro.com/", "getRankCharacters");
    private final static QName _GetRankCharactersResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "getRankCharactersResponse");
    private final static QName _GetRankGuild_QNAME = new QName("http://ws.jmucore.safiro.com/", "getRankGuild");
    private final static QName _GetRankGuildResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "getRankGuildResponse");
    private final static QName _GetRankPK_QNAME = new QName("http://ws.jmucore.safiro.com/", "getRankPK");
    private final static QName _GetRankPKResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "getRankPKResponse");
    private final static QName _IsFBLike_QNAME = new QName("http://ws.jmucore.safiro.com/", "isFBLike");
    private final static QName _IsFBLikeResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "isFBLikeResponse");
    private final static QName _LoginUser_QNAME = new QName("http://ws.jmucore.safiro.com/", "loginUser");
    private final static QName _LoginUserResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "loginUserResponse");
    private final static QName _RankGuild_QNAME = new QName("http://ws.jmucore.safiro.com/", "rankGuild");
    private final static QName _SetFBLike_QNAME = new QName("http://ws.jmucore.safiro.com/", "setFBLike");
    private final static QName _SetFBLikeResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "setFBLikeResponse");
    private final static QName _SetLevelChar_QNAME = new QName("http://ws.jmucore.safiro.com/", "setLevelChar");
    private final static QName _SetLevelCharResponse_QNAME = new QName("http://ws.jmucore.safiro.com/", "setLevelCharResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.safiro.jmucore.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AddCredit }
     * 
     */
    public AddCredit createAddCredit() {
        return new AddCredit();
    }

    /**
     * Create an instance of {@link AddCreditResponse }
     * 
     */
    public AddCreditResponse createAddCreditResponse() {
        return new AddCreditResponse();
    }

    /**
     * Create an instance of {@link Estadisticas }
     * 
     */
    public Estadisticas createEstadisticas() {
        return new Estadisticas();
    }

    /**
     * Create an instance of {@link EstadisticasResponse }
     * 
     */
    public EstadisticasResponse createEstadisticasResponse() {
        return new EstadisticasResponse();
    }

    /**
     * Create an instance of {@link GetCharacterAccount }
     * 
     */
    public GetCharacterAccount createGetCharacterAccount() {
        return new GetCharacterAccount();
    }

    /**
     * Create an instance of {@link GetCharacterAccountResponse }
     * 
     */
    public GetCharacterAccountResponse createGetCharacterAccountResponse() {
        return new GetCharacterAccountResponse();
    }

    /**
     * Create an instance of {@link GetRankCS }
     * 
     */
    public GetRankCS createGetRankCS() {
        return new GetRankCS();
    }

    /**
     * Create an instance of {@link GetRankCSResponse }
     * 
     */
    public GetRankCSResponse createGetRankCSResponse() {
        return new GetRankCSResponse();
    }

    /**
     * Create an instance of {@link GetRankCharacters }
     * 
     */
    public GetRankCharacters createGetRankCharacters() {
        return new GetRankCharacters();
    }

    /**
     * Create an instance of {@link GetRankCharactersResponse }
     * 
     */
    public GetRankCharactersResponse createGetRankCharactersResponse() {
        return new GetRankCharactersResponse();
    }

    /**
     * Create an instance of {@link GetRankGuild }
     * 
     */
    public GetRankGuild createGetRankGuild() {
        return new GetRankGuild();
    }

    /**
     * Create an instance of {@link GetRankGuildResponse }
     * 
     */
    public GetRankGuildResponse createGetRankGuildResponse() {
        return new GetRankGuildResponse();
    }

    /**
     * Create an instance of {@link GetRankPK }
     * 
     */
    public GetRankPK createGetRankPK() {
        return new GetRankPK();
    }

    /**
     * Create an instance of {@link GetRankPKResponse }
     * 
     */
    public GetRankPKResponse createGetRankPKResponse() {
        return new GetRankPKResponse();
    }

    /**
     * Create an instance of {@link IsFBLike }
     * 
     */
    public IsFBLike createIsFBLike() {
        return new IsFBLike();
    }

    /**
     * Create an instance of {@link IsFBLikeResponse }
     * 
     */
    public IsFBLikeResponse createIsFBLikeResponse() {
        return new IsFBLikeResponse();
    }

    /**
     * Create an instance of {@link LoginUser }
     * 
     */
    public LoginUser createLoginUser() {
        return new LoginUser();
    }

    /**
     * Create an instance of {@link LoginUserResponse }
     * 
     */
    public LoginUserResponse createLoginUserResponse() {
        return new LoginUserResponse();
    }

    /**
     * Create an instance of {@link RankGuild }
     * 
     */
    public RankGuild createRankGuild() {
        return new RankGuild();
    }

    /**
     * Create an instance of {@link SetFBLike }
     * 
     */
    public SetFBLike createSetFBLike() {
        return new SetFBLike();
    }

    /**
     * Create an instance of {@link SetFBLikeResponse }
     * 
     */
    public SetFBLikeResponse createSetFBLikeResponse() {
        return new SetFBLikeResponse();
    }

    /**
     * Create an instance of {@link SetLevelChar }
     * 
     */
    public SetLevelChar createSetLevelChar() {
        return new SetLevelChar();
    }

    /**
     * Create an instance of {@link SetLevelCharResponse }
     * 
     */
    public SetLevelCharResponse createSetLevelCharResponse() {
        return new SetLevelCharResponse();
    }

    /**
     * Create an instance of {@link FbLike }
     * 
     */
    public FbLike createFbLike() {
        return new FbLike();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link CharacterbyID }
     * 
     */
    public CharacterbyID createCharacterbyID() {
        return new CharacterbyID();
    }

    /**
     * Create an instance of {@link RankCS }
     * 
     */
    public RankCS createRankCS() {
        return new RankCS();
    }

    /**
     * Create an instance of {@link RankPK }
     * 
     */
    public RankPK createRankPK() {
        return new RankPK();
    }

    /**
     * Create an instance of {@link Credits }
     * 
     */
    public Credits createCredits() {
        return new Credits();
    }

    /**
     * Create an instance of {@link RankChar }
     * 
     */
    public RankChar createRankChar() {
        return new RankChar();
    }

    /**
     * Create an instance of {@link Statistics }
     * 
     */
    public Statistics createStatistics() {
        return new Statistics();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCredit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "addCredit")
    public JAXBElement<AddCredit> createAddCredit(AddCredit value) {
        return new JAXBElement<AddCredit>(_AddCredit_QNAME, AddCredit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCreditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "addCreditResponse")
    public JAXBElement<AddCreditResponse> createAddCreditResponse(AddCreditResponse value) {
        return new JAXBElement<AddCreditResponse>(_AddCreditResponse_QNAME, AddCreditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estadisticas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "estadisticas")
    public JAXBElement<Estadisticas> createEstadisticas(Estadisticas value) {
        return new JAXBElement<Estadisticas>(_Estadisticas_QNAME, Estadisticas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadisticasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "estadisticasResponse")
    public JAXBElement<EstadisticasResponse> createEstadisticasResponse(EstadisticasResponse value) {
        return new JAXBElement<EstadisticasResponse>(_EstadisticasResponse_QNAME, EstadisticasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCharacterAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "getCharacterAccount")
    public JAXBElement<GetCharacterAccount> createGetCharacterAccount(GetCharacterAccount value) {
        return new JAXBElement<GetCharacterAccount>(_GetCharacterAccount_QNAME, GetCharacterAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCharacterAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "getCharacterAccountResponse")
    public JAXBElement<GetCharacterAccountResponse> createGetCharacterAccountResponse(GetCharacterAccountResponse value) {
        return new JAXBElement<GetCharacterAccountResponse>(_GetCharacterAccountResponse_QNAME, GetCharacterAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRankCS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "getRankCS")
    public JAXBElement<GetRankCS> createGetRankCS(GetRankCS value) {
        return new JAXBElement<GetRankCS>(_GetRankCS_QNAME, GetRankCS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRankCSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "getRankCSResponse")
    public JAXBElement<GetRankCSResponse> createGetRankCSResponse(GetRankCSResponse value) {
        return new JAXBElement<GetRankCSResponse>(_GetRankCSResponse_QNAME, GetRankCSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRankCharacters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "getRankCharacters")
    public JAXBElement<GetRankCharacters> createGetRankCharacters(GetRankCharacters value) {
        return new JAXBElement<GetRankCharacters>(_GetRankCharacters_QNAME, GetRankCharacters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRankCharactersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "getRankCharactersResponse")
    public JAXBElement<GetRankCharactersResponse> createGetRankCharactersResponse(GetRankCharactersResponse value) {
        return new JAXBElement<GetRankCharactersResponse>(_GetRankCharactersResponse_QNAME, GetRankCharactersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRankGuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "getRankGuild")
    public JAXBElement<GetRankGuild> createGetRankGuild(GetRankGuild value) {
        return new JAXBElement<GetRankGuild>(_GetRankGuild_QNAME, GetRankGuild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRankGuildResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "getRankGuildResponse")
    public JAXBElement<GetRankGuildResponse> createGetRankGuildResponse(GetRankGuildResponse value) {
        return new JAXBElement<GetRankGuildResponse>(_GetRankGuildResponse_QNAME, GetRankGuildResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRankPK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "getRankPK")
    public JAXBElement<GetRankPK> createGetRankPK(GetRankPK value) {
        return new JAXBElement<GetRankPK>(_GetRankPK_QNAME, GetRankPK.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRankPKResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "getRankPKResponse")
    public JAXBElement<GetRankPKResponse> createGetRankPKResponse(GetRankPKResponse value) {
        return new JAXBElement<GetRankPKResponse>(_GetRankPKResponse_QNAME, GetRankPKResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsFBLike }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "isFBLike")
    public JAXBElement<IsFBLike> createIsFBLike(IsFBLike value) {
        return new JAXBElement<IsFBLike>(_IsFBLike_QNAME, IsFBLike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsFBLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "isFBLikeResponse")
    public JAXBElement<IsFBLikeResponse> createIsFBLikeResponse(IsFBLikeResponse value) {
        return new JAXBElement<IsFBLikeResponse>(_IsFBLikeResponse_QNAME, IsFBLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "loginUser")
    public JAXBElement<LoginUser> createLoginUser(LoginUser value) {
        return new JAXBElement<LoginUser>(_LoginUser_QNAME, LoginUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "loginUserResponse")
    public JAXBElement<LoginUserResponse> createLoginUserResponse(LoginUserResponse value) {
        return new JAXBElement<LoginUserResponse>(_LoginUserResponse_QNAME, LoginUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RankGuild }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "rankGuild")
    public JAXBElement<RankGuild> createRankGuild(RankGuild value) {
        return new JAXBElement<RankGuild>(_RankGuild_QNAME, RankGuild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFBLike }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "setFBLike")
    public JAXBElement<SetFBLike> createSetFBLike(SetFBLike value) {
        return new JAXBElement<SetFBLike>(_SetFBLike_QNAME, SetFBLike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFBLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "setFBLikeResponse")
    public JAXBElement<SetFBLikeResponse> createSetFBLikeResponse(SetFBLikeResponse value) {
        return new JAXBElement<SetFBLikeResponse>(_SetFBLikeResponse_QNAME, SetFBLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLevelChar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "setLevelChar")
    public JAXBElement<SetLevelChar> createSetLevelChar(SetLevelChar value) {
        return new JAXBElement<SetLevelChar>(_SetLevelChar_QNAME, SetLevelChar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLevelCharResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jmucore.safiro.com/", name = "setLevelCharResponse")
    public JAXBElement<SetLevelCharResponse> createSetLevelCharResponse(SetLevelCharResponse value) {
        return new JAXBElement<SetLevelCharResponse>(_SetLevelCharResponse_QNAME, SetLevelCharResponse.class, null, value);
    }

}

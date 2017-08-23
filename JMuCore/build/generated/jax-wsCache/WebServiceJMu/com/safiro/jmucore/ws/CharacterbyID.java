
package com.safiro.jmucore.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para characterbyID complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="characterbyID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dexterity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="energy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="leadership" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mapN" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PKlvl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="points" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="reset" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vitality" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "characterbyID", propOrder = {
    "accountId",
    "dexterity",
    "energy",
    "leadership",
    "level",
    "mapN",
    "money",
    "name",
    "pKlvl",
    "points",
    "reset",
    "strength",
    "vitality"
})
public class CharacterbyID {

    protected String accountId;
    protected int dexterity;
    protected int energy;
    protected int leadership;
    protected int level;
    protected int mapN;
    protected int money;
    protected String name;
    @XmlElement(name = "PKlvl")
    protected int pKlvl;
    protected int points;
    protected int reset;
    protected int strength;
    protected int vitality;

    /**
     * Obtiene el valor de la propiedad accountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Define el valor de la propiedad accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Obtiene el valor de la propiedad dexterity.
     * 
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Define el valor de la propiedad dexterity.
     * 
     */
    public void setDexterity(int value) {
        this.dexterity = value;
    }

    /**
     * Obtiene el valor de la propiedad energy.
     * 
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Define el valor de la propiedad energy.
     * 
     */
    public void setEnergy(int value) {
        this.energy = value;
    }

    /**
     * Obtiene el valor de la propiedad leadership.
     * 
     */
    public int getLeadership() {
        return leadership;
    }

    /**
     * Define el valor de la propiedad leadership.
     * 
     */
    public void setLeadership(int value) {
        this.leadership = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad mapN.
     * 
     */
    public int getMapN() {
        return mapN;
    }

    /**
     * Define el valor de la propiedad mapN.
     * 
     */
    public void setMapN(int value) {
        this.mapN = value;
    }

    /**
     * Obtiene el valor de la propiedad money.
     * 
     */
    public int getMoney() {
        return money;
    }

    /**
     * Define el valor de la propiedad money.
     * 
     */
    public void setMoney(int value) {
        this.money = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad pKlvl.
     * 
     */
    public int getPKlvl() {
        return pKlvl;
    }

    /**
     * Define el valor de la propiedad pKlvl.
     * 
     */
    public void setPKlvl(int value) {
        this.pKlvl = value;
    }

    /**
     * Obtiene el valor de la propiedad points.
     * 
     */
    public int getPoints() {
        return points;
    }

    /**
     * Define el valor de la propiedad points.
     * 
     */
    public void setPoints(int value) {
        this.points = value;
    }

    /**
     * Obtiene el valor de la propiedad reset.
     * 
     */
    public int getReset() {
        return reset;
    }

    /**
     * Define el valor de la propiedad reset.
     * 
     */
    public void setReset(int value) {
        this.reset = value;
    }

    /**
     * Obtiene el valor de la propiedad strength.
     * 
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Define el valor de la propiedad strength.
     * 
     */
    public void setStrength(int value) {
        this.strength = value;
    }

    /**
     * Obtiene el valor de la propiedad vitality.
     * 
     */
    public int getVitality() {
        return vitality;
    }

    /**
     * Define el valor de la propiedad vitality.
     * 
     */
    public void setVitality(int value) {
        this.vitality = value;
    }

}

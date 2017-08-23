
package com.safiro.jmucore.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para statistics complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="statistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="charOnline" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="drop" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="exp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalAcc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalGuild" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalUser" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statistics", propOrder = {
    "charOnline",
    "drop",
    "exp",
    "totalAcc",
    "totalGuild",
    "totalUser"
})
public class Statistics {

    protected int charOnline;
    protected int drop;
    protected int exp;
    protected int totalAcc;
    protected int totalGuild;
    protected int totalUser;

    /**
     * Obtiene el valor de la propiedad charOnline.
     * 
     */
    public int getCharOnline() {
        return charOnline;
    }

    /**
     * Define el valor de la propiedad charOnline.
     * 
     */
    public void setCharOnline(int value) {
        this.charOnline = value;
    }

    /**
     * Obtiene el valor de la propiedad drop.
     * 
     */
    public int getDrop() {
        return drop;
    }

    /**
     * Define el valor de la propiedad drop.
     * 
     */
    public void setDrop(int value) {
        this.drop = value;
    }

    /**
     * Obtiene el valor de la propiedad exp.
     * 
     */
    public int getExp() {
        return exp;
    }

    /**
     * Define el valor de la propiedad exp.
     * 
     */
    public void setExp(int value) {
        this.exp = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAcc.
     * 
     */
    public int getTotalAcc() {
        return totalAcc;
    }

    /**
     * Define el valor de la propiedad totalAcc.
     * 
     */
    public void setTotalAcc(int value) {
        this.totalAcc = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGuild.
     * 
     */
    public int getTotalGuild() {
        return totalGuild;
    }

    /**
     * Define el valor de la propiedad totalGuild.
     * 
     */
    public void setTotalGuild(int value) {
        this.totalGuild = value;
    }

    /**
     * Obtiene el valor de la propiedad totalUser.
     * 
     */
    public int getTotalUser() {
        return totalUser;
    }

    /**
     * Define el valor de la propiedad totalUser.
     * 
     */
    public void setTotalUser(int value) {
        this.totalUser = value;
    }

}

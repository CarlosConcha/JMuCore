
package com.safiro.jmucore.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rankGuild complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rankGuild"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameGuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameMaster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rankGuild", propOrder = {
    "nameGuild",
    "nameMaster",
    "score"
})
public class RankGuild {

    protected String nameGuild;
    protected String nameMaster;
    protected int score;

    /**
     * Obtiene el valor de la propiedad nameGuild.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameGuild() {
        return nameGuild;
    }

    /**
     * Define el valor de la propiedad nameGuild.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameGuild(String value) {
        this.nameGuild = value;
    }

    /**
     * Obtiene el valor de la propiedad nameMaster.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameMaster() {
        return nameMaster;
    }

    /**
     * Define el valor de la propiedad nameMaster.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameMaster(String value) {
        this.nameMaster = value;
    }

    /**
     * Obtiene el valor de la propiedad score.
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * Define el valor de la propiedad score.
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

}

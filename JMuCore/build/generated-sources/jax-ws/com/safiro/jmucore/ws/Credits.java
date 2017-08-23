
package com.safiro.jmucore.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para credits complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="credits"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="credit2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credits", propOrder = {
    "credit",
    "credit2",
    "user"
})
public class Credits {

    protected int credit;
    protected int credit2;
    protected String user;

    /**
     * Obtiene el valor de la propiedad credit.
     * 
     */
    public int getCredit() {
        return credit;
    }

    /**
     * Define el valor de la propiedad credit.
     * 
     */
    public void setCredit(int value) {
        this.credit = value;
    }

    /**
     * Obtiene el valor de la propiedad credit2.
     * 
     */
    public int getCredit2() {
        return credit2;
    }

    /**
     * Define el valor de la propiedad credit2.
     * 
     */
    public void setCredit2(int value) {
        this.credit2 = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}


package com.safiro.jmucore.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para isFBLike complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="isFBLike"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="like" type="{http://ws.jmucore.safiro.com/}fbLike" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isFBLike", propOrder = {
    "like"
})
public class IsFBLike {

    protected FbLike like;

    /**
     * Obtiene el valor de la propiedad like.
     * 
     * @return
     *     possible object is
     *     {@link FbLike }
     *     
     */
    public FbLike getLike() {
        return like;
    }

    /**
     * Define el valor de la propiedad like.
     * 
     * @param value
     *     allowed object is
     *     {@link FbLike }
     *     
     */
    public void setLike(FbLike value) {
        this.like = value;
    }

}

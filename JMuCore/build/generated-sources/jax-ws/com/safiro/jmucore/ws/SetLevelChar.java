
package com.safiro.jmucore.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para setLevelChar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="setLevelChar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="character" type="{http://ws.jmucore.safiro.com/}characterbyID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setLevelChar", propOrder = {
    "character"
})
public class SetLevelChar {

    protected CharacterbyID character;

    /**
     * Obtiene el valor de la propiedad character.
     * 
     * @return
     *     possible object is
     *     {@link CharacterbyID }
     *     
     */
    public CharacterbyID getCharacter() {
        return character;
    }

    /**
     * Define el valor de la propiedad character.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterbyID }
     *     
     */
    public void setCharacter(CharacterbyID value) {
        this.character = value;
    }

}

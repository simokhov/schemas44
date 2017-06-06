//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:23:43 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Гиперссылки на открытую часть и личный кабинет
 * 
 * <p>Java class for hrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="open" type="{http://zakupki.gov.ru/oos/types/1}urlType" minOccurs="0"/>
 *         &lt;element name="private" type="{http://zakupki.gov.ru/oos/types/1}urlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hrefType", propOrder = {
    "open",
    "_private"
})
public class HrefType {

    protected String open;
    @XmlElement(name = "private")
    protected String _private;

    /**
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpen(String value) {
        this.open = value;
    }

    /**
     * Gets the value of the private property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivate() {
        return _private;
    }

    /**
     * Sets the value of the private property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivate(String value) {
        this._private = value;
    }

}

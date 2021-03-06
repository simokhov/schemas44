//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Общий тип для завки, в случае указания в протоколе рассмотрения единственной заявки
 * 
 * <p>Java class for singleAppType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="singleAppType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}singlePartType">
 *       &lt;sequence>
 *         &lt;element name="offerPrice" type="{http://zakupki.gov.ru/oos/base/1}moneyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singleAppType", propOrder = {
    "offerPrice"
})
public class SingleAppType
    extends SinglePartType
{

    @XmlElement(required = true)
    protected String offerPrice;

    /**
     * Gets the value of the offerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferPrice() {
        return offerPrice;
    }

    /**
     * Sets the value of the offerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferPrice(String value) {
        this.offerPrice = value;
    }

}

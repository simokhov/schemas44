//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Документ-основание
 * 
 * <p>Java class for foundationDocInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foundationDocInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foundationDocNumber" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType" minOccurs="0"/>
 *         &lt;element name="foundationDocNumberExternal" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foundationDocInfoType", propOrder = {
    "foundationDocNumber",
    "foundationDocNumberExternal"
})
public class FoundationDocInfoType {

    protected String foundationDocNumber;
    protected String foundationDocNumberExternal;

    /**
     * Gets the value of the foundationDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundationDocNumber() {
        return foundationDocNumber;
    }

    /**
     * Sets the value of the foundationDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundationDocNumber(String value) {
        this.foundationDocNumber = value;
    }

    /**
     * Gets the value of the foundationDocNumberExternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundationDocNumberExternal() {
        return foundationDocNumberExternal;
    }

    /**
     * Sets the value of the foundationDocNumberExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundationDocNumberExternal(String value) {
        this.foundationDocNumberExternal = value;
    }

}
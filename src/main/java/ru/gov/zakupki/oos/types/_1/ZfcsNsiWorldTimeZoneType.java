//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Cправочник: Часовые зоны мира для ЕРУЗ
 * 
 * <p>Java class for zfcs_nsiWorldTimeZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiWorldTimeZoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}timeZoneNameType"/>
 *         &lt;element name="differenceTime" type="{http://zakupki.gov.ru/oos/base/1}timeZoneDifferenceType"/>
 *         &lt;element name="isActual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiWorldTimeZoneType", propOrder = {
    "name",
    "differenceTime",
    "isActual"
})
public class ZfcsNsiWorldTimeZoneType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String differenceTime;
    protected boolean isActual;

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the differenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifferenceTime() {
        return differenceTime;
    }

    /**
     * Sets the value of the differenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifferenceTime(String value) {
        this.differenceTime = value;
    }

    /**
     * Gets the value of the isActual property.
     * 
     */
    public boolean isIsActual() {
        return isActual;
    }

    /**
     * Sets the value of the isActual property.
     * 
     */
    public void setIsActual(boolean value) {
        this.isActual = value;
    }

}

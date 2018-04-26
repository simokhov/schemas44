//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:48:41 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Классификация по КВР в планах закупок и в планах графиках с 01.01.2017
 * 
 * <p>Java class for zfcs_purchasePlanKVRRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanKVRRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="KVR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KVRRef"/>
 *         &lt;element name="undefined" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchasePlanKVRRefType", propOrder = {
    "kvr",
    "undefined"
})
public class ZfcsPurchasePlanKVRRefType {

    @XmlElement(name = "KVR")
    protected ZfcsKVRRef kvr;
    @XmlElement(defaultValue = "000")
    protected String undefined;

    /**
     * Gets the value of the kvr property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsKVRRef }
     *     
     */
    public ZfcsKVRRef getKVR() {
        return kvr;
    }

    /**
     * Sets the value of the kvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsKVRRef }
     *     
     */
    public void setKVR(ZfcsKVRRef value) {
        this.kvr = value;
    }

    /**
     * Gets the value of the undefined property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndefined() {
        return undefined;
    }

    /**
     * Sets the value of the undefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndefined(String value) {
        this.undefined = value;
    }

}

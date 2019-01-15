//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Классификация по ОКПД2 в планах закупок и в планах графиках с 01.01.2017
 * 
 * <p>Java class for zfcs_purchasePlanOKPD2RefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanOKPD2RefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="OKPD2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPD2Ref"/>
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
@XmlType(name = "zfcs_purchasePlanOKPD2RefType", propOrder = {
    "okpd2",
    "undefined"
})
public class ZfcsPurchasePlanOKPD2RefType {

    @XmlElement(name = "OKPD2")
    protected ZfcsOKPD2Ref okpd2;
    @XmlElement(defaultValue = "0000")
    protected String undefined;

    /**
     * Gets the value of the okpd2 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKPD2Ref }
     *     
     */
    public ZfcsOKPD2Ref getOKPD2() {
        return okpd2;
    }

    /**
     * Sets the value of the okpd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKPD2Ref }
     *     
     */
    public void setOKPD2(ZfcsOKPD2Ref value) {
        this.okpd2 = value;
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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.base._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Ссылка на ОКПД2
 * 
 * <p>Java class for OKPD2Ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OKPD2Ref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OKPDCode" type="{http://zakupki.gov.ru/oos/base/1}okpdCodeType"/>
 *         &lt;element name="OKPDName" type="{http://zakupki.gov.ru/oos/base/1}okpdNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OKPD2Ref", propOrder = {
    "okpdCode",
    "okpdName"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.common._1.PurchaseObjectsType.PurchaseObject.OKPD2 .class
})
public class OKPD2Ref {

    @XmlElement(name = "OKPDCode", required = true)
    protected String okpdCode;
    @XmlElement(name = "OKPDName")
    protected String okpdName;

    /**
     * Gets the value of the okpdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKPDCode() {
        return okpdCode;
    }

    /**
     * Sets the value of the okpdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKPDCode(String value) {
        this.okpdCode = value;
    }

    /**
     * Gets the value of the okpdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKPDName() {
        return okpdName;
    }

    /**
     * Sets the value of the okpdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKPDName(String value) {
        this.okpdName = value;
    }

}

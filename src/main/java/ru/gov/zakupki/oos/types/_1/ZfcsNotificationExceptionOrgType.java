//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:46:03 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Организация, осуществившая исключение сведений
 * 
 * <p>Java class for zfcs_notificationExceptionOrgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_notificationExceptionOrgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_spzNumType"/>
 *         &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_consRegistryNumType" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
 *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_notificationExceptionOrgType", propOrder = {
    "regNum",
    "consRegistryNum",
    "fullName",
    "inn",
    "kpp"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsNotificationExceptionType.PlacementOrgInfo.class
})
public class ZfcsNotificationExceptionOrgType {

    @XmlElement(required = true)
    protected String regNum;
    protected String consRegistryNum;
    protected String fullName;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "KPP")
    protected String kpp;

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the consRegistryNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsRegistryNum() {
        return consRegistryNum;
    }

    /**
     * Sets the value of the consRegistryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsRegistryNum(String value) {
        this.consRegistryNum = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:01:24 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Данные организации из СПЗ для плана закупок в структурированной форме
 * 
 * <p>Java class for zfcs_purchasePlanOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanOrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_spzNumType"/>
 *         &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_consRegistryNumType" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="factAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="phone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="email" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchasePlanOrganizationType", propOrder = {
    "regNum",
    "consRegistryNum",
    "fullName",
    "factAddress",
    "phone",
    "email"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsPurchasePlanType.CommonInfo.Owner.class,
    ru.gov.zakupki.oos.types._1.ZfcsPurchasePlanType.CustomerInfo.Customer.class
})
public class ZfcsPurchasePlanOrganizationType {

    @XmlElement(required = true)
    protected String regNum;
    protected String consRegistryNum;
    protected String fullName;
    protected String factAddress;
    protected String phone;
    protected String email;

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
     * Gets the value of the factAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactAddress() {
        return factAddress;
    }

    /**
     * Sets the value of the factAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactAddress(String value) {
        this.factAddress = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}

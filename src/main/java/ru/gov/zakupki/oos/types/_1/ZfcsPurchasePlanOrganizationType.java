//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Данные организации для плана закупок
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
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/base/1}spzNumType"/>
 *         &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/oos/base/1}consRegistryNumType" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innType" minOccurs="0"/>
 *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/base/1}kppType" minOccurs="0"/>
 *         &lt;element name="OKPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKPORef" minOccurs="0"/>
 *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
 *         &lt;element name="factAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="phone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
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
 *         &lt;element name="controlAuthorityInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
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
    "inn",
    "kpp",
    "okpo",
    "oktmo",
    "factAddress",
    "phone",
    "email",
    "controlAuthorityInfo"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsTenderPlan2017CommonInfoType.CustomerInfo.class,
    ru.gov.zakupki.oos.types._1.ZfcsTenderPlan2017CommonInfoType.OwnerInfo.class,
    ru.gov.zakupki.oos.types._1.ZfcsPurchasePlanCommonInfoType.CustomerInfo.class,
    ru.gov.zakupki.oos.types._1.ZfcsPurchasePlanCommonInfoType.OwnerInfo.class
})
public class ZfcsPurchasePlanOrganizationType {

    @XmlElement(required = true)
    protected String regNum;
    protected String consRegistryNum;
    protected String fullName;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "KPP")
    protected String kpp;
    @XmlElement(name = "OKPO")
    protected ZfcsOKPORef okpo;
    @XmlElement(name = "OKTMO")
    protected ZfcsOKTMORef oktmo;
    protected String factAddress;
    protected String phone;
    protected String email;
    protected ZfcsOrganizationRef controlAuthorityInfo;

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

    /**
     * Gets the value of the okpo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKPORef }
     *     
     */
    public ZfcsOKPORef getOKPO() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKPORef }
     *     
     */
    public void setOKPO(ZfcsOKPORef value) {
        this.okpo = value;
    }

    /**
     * Gets the value of the oktmo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKTMORef }
     *     
     */
    public ZfcsOKTMORef getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKTMORef }
     *     
     */
    public void setOKTMO(ZfcsOKTMORef value) {
        this.oktmo = value;
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

    /**
     * Gets the value of the controlAuthorityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getControlAuthorityInfo() {
        return controlAuthorityInfo;
    }

    /**
     * Sets the value of the controlAuthorityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setControlAuthorityInfo(ZfcsOrganizationRef value) {
        this.controlAuthorityInfo = value;
    }

}

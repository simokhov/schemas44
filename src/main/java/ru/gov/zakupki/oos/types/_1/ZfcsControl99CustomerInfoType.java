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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Сведения о заказчике в ПЗ/ПГ для контроля по 99 статье
 * 
 * <p>Java class for zfcs_control99CustomerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99CustomerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/base/1}spzNumType"/>
 *         &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/oos/base/1}consRegistryNumType" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="INN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/oos/base/1}innType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/base/1}kppType" minOccurs="0"/>
 *         &lt;element name="OKFS" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKFSRef" minOccurs="0"/>
 *         &lt;element name="orgBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_budgetFundsContract2015" minOccurs="0"/>
 *         &lt;element name="factAddress" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
 *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_control99CustomerInfoType", propOrder = {
    "regNum",
    "consRegistryNum",
    "fullName",
    "inn",
    "kpp",
    "okfs",
    "orgBudget",
    "factAddress",
    "okopf",
    "oktmo"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsControl99ProtocolExtractType.PurchaseResponsibleInfo.class,
    ru.gov.zakupki.oos.types._1.ZfcsControl99ConfirmType.CustomerInfo.class,
    ru.gov.zakupki.oos.types._1.ZfcsControl99TenderPlan2017ExtractType.CustomerInfo.class,
    ru.gov.zakupki.oos.types._1.ZfcsControl99NotificationExtractType.PurchaseResponsibleInfo.class,
    ru.gov.zakupki.oos.types._1.ZfcsControl99NoticeProtocolCommonInfoType.CustomerInfo.class,
    ru.gov.zakupki.oos.types._1.ZfcsControl99NoticeComplianceForRMISType.CustomerInfo.class,
    ru.gov.zakupki.oos.types._1.ZfcsControl99PurchasePlanExtractType.CustomerInfo.class
})
public class ZfcsControl99CustomerInfoType {

    @XmlElement(required = true)
    protected String regNum;
    protected String consRegistryNum;
    protected String fullName;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "KPP")
    protected String kpp;
    @XmlElement(name = "OKFS")
    protected ZfcsOKFSRef okfs;
    protected ZfcsBudgetFundsContract2015 orgBudget;
    protected String factAddress;
    @XmlElement(name = "OKOPF")
    protected ZfcsOkopfRef okopf;
    @XmlElement(name = "OKTMO")
    protected ZfcsOKTMORef oktmo;

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
     * Gets the value of the okfs property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOKFSRef }
     *     
     */
    public ZfcsOKFSRef getOKFS() {
        return okfs;
    }

    /**
     * Sets the value of the okfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOKFSRef }
     *     
     */
    public void setOKFS(ZfcsOKFSRef value) {
        this.okfs = value;
    }

    /**
     * Gets the value of the orgBudget property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBudgetFundsContract2015 }
     *     
     */
    public ZfcsBudgetFundsContract2015 getOrgBudget() {
        return orgBudget;
    }

    /**
     * Sets the value of the orgBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBudgetFundsContract2015 }
     *     
     */
    public void setOrgBudget(ZfcsBudgetFundsContract2015 value) {
        this.orgBudget = value;
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
     * Gets the value of the okopf property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOkopfRef }
     *     
     */
    public ZfcsOkopfRef getOKOPF() {
        return okopf;
    }

    /**
     * Sets the value of the okopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOkopfRef }
     *     
     */
    public void setOKOPF(ZfcsOkopfRef value) {
        this.okopf = value;
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

}

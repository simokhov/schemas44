//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.BudgetFundsContractRef;
import ru.gov.zakupki.oos.base._1.OKFSRef;
import ru.gov.zakupki.oos.base._1.OKOPFRef;
import ru.gov.zakupki.oos.base._1.OKTMORef;


/**
 * Тип: Сведения о заказчике в ПЗ/ПГ для контроля по 99 статье
 * 
 * <p>Java class for control99CustomerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="control99CustomerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/base/1}spzNumType"/>
 *         &lt;element name="consRegistryNum" type="{http://zakupki.gov.ru/oos/base/1}consRegistryNumType" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innType" minOccurs="0"/>
 *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/base/1}kppType" minOccurs="0"/>
 *         &lt;element name="OKFS" type="{http://zakupki.gov.ru/oos/base/1}OKFSRef" minOccurs="0"/>
 *         &lt;element name="orgBudget" type="{http://zakupki.gov.ru/oos/base/1}budgetFundsContractRef" minOccurs="0"/>
 *         &lt;element name="factAddress" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *         &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/base/1}OKOPFRef" minOccurs="0"/>
 *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/base/1}OKTMORef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "control99CustomerInfoType", propOrder = {
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
    ru.gov.zakupki.oos.cptypes._1.Control99ContractProjectExtractType.CustomerInfo.class
})
public class Control99CustomerInfoType {

    @XmlElement(required = true)
    protected String regNum;
    protected String consRegistryNum;
    protected String fullName;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "KPP")
    protected String kpp;
    @XmlElement(name = "OKFS")
    protected OKFSRef okfs;
    protected BudgetFundsContractRef orgBudget;
    protected String factAddress;
    @XmlElement(name = "OKOPF")
    protected OKOPFRef okopf;
    @XmlElement(name = "OKTMO")
    protected OKTMORef oktmo;

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
     *     {@link OKFSRef }
     *     
     */
    public OKFSRef getOKFS() {
        return okfs;
    }

    /**
     * Sets the value of the okfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKFSRef }
     *     
     */
    public void setOKFS(OKFSRef value) {
        this.okfs = value;
    }

    /**
     * Gets the value of the orgBudget property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetFundsContractRef }
     *     
     */
    public BudgetFundsContractRef getOrgBudget() {
        return orgBudget;
    }

    /**
     * Sets the value of the orgBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetFundsContractRef }
     *     
     */
    public void setOrgBudget(BudgetFundsContractRef value) {
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
     *     {@link OKOPFRef }
     *     
     */
    public OKOPFRef getOKOPF() {
        return okopf;
    }

    /**
     * Sets the value of the okopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKOPFRef }
     *     
     */
    public void setOKOPF(OKOPFRef value) {
        this.okopf = value;
    }

    /**
     * Gets the value of the oktmo property.
     * 
     * @return
     *     possible object is
     *     {@link OKTMORef }
     *     
     */
    public OKTMORef getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORef }
     *     
     */
    public void setOKTMO(OKTMORef value) {
        this.oktmo = value;
    }

}

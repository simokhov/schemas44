//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:36 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Реквизиты для оплаты
 * 
 * <p>Java class for guaranteeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guaranteeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedure">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="settlementAccount" type="{http://zakupki.gov.ru/oos/types/1}settlementAccountType" minOccurs="0"/>
 *         &lt;element name="personalAccount" type="{http://zakupki.gov.ru/oos/types/1}personalAccountType" minOccurs="0"/>
 *         &lt;element name="bik" type="{http://zakupki.gov.ru/oos/types/1}bikType" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}currencyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guaranteeType", propOrder = {
    "procedure",
    "settlementAccount",
    "personalAccount",
    "bik",
    "amount",
    "currency"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.NotificationOKType.CompetitiveDocumentProvisioning.Guarantee.class
})
public class GuaranteeType {

    @XmlElement(required = true)
    protected String procedure;
    protected String settlementAccount;
    protected String personalAccount;
    protected String bik;
    protected double amount;
    @XmlElement(required = true)
    protected CurrencyType currency;

    /**
     * Gets the value of the procedure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedure() {
        return procedure;
    }

    /**
     * Sets the value of the procedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedure(String value) {
        this.procedure = value;
    }

    /**
     * Gets the value of the settlementAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAccount() {
        return settlementAccount;
    }

    /**
     * Sets the value of the settlementAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAccount(String value) {
        this.settlementAccount = value;
    }

    /**
     * Gets the value of the personalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAccount() {
        return personalAccount;
    }

    /**
     * Sets the value of the personalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAccount(String value) {
        this.personalAccount = value;
    }

    /**
     * Gets the value of the bik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBik() {
        return bik;
    }

    /**
     * Sets the value of the bik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBik(String value) {
        this.bik = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

}

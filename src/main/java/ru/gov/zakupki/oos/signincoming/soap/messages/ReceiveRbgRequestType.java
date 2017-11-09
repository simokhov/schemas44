//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 09:11:06 AM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.BankGuaranteeRefusal;
import ru.gov.zakupki.oos.signincoming._1.BankGuaranteeRefusalInvalid;
import ru.gov.zakupki.oos.signincoming._1.BankGuaranteeReturn;
import ru.gov.zakupki.oos.signincoming._1.BankGuaranteeReturnInvalid;
import ru.gov.zakupki.oos.signincoming._1.BankGuaranteeTermination;
import ru.gov.zakupki.oos.signincoming._1.BankGuaranteeTerminationInvalid;


/**
 * <p>Java class for receiveRbgRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRbgRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="bankGuaranteeTerminationInvalid" type="{http://zakupki.gov.ru/oos/signIncoming/1}bankGuaranteeTerminationInvalid"/>
 *         &lt;element name="bankGuaranteeTermination" type="{http://zakupki.gov.ru/oos/signIncoming/1}bankGuaranteeTermination"/>
 *         &lt;element name="bankGuaranteeReturnInvalid" type="{http://zakupki.gov.ru/oos/signIncoming/1}bankGuaranteeReturnInvalid"/>
 *         &lt;element name="bankGuaranteeReturn" type="{http://zakupki.gov.ru/oos/signIncoming/1}bankGuaranteeReturn"/>
 *         &lt;element name="bankGuaranteeRefusalInvalid" type="{http://zakupki.gov.ru/oos/signIncoming/1}bankGuaranteeRefusalInvalid"/>
 *         &lt;element name="bankGuaranteeRefusal" type="{http://zakupki.gov.ru/oos/signIncoming/1}bankGuaranteeRefusal"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRbgRequestType", propOrder = {
    "bankGuaranteeTerminationInvalid",
    "bankGuaranteeTermination",
    "bankGuaranteeReturnInvalid",
    "bankGuaranteeReturn",
    "bankGuaranteeRefusalInvalid",
    "bankGuaranteeRefusal"
})
public class ReceiveRbgRequestType {

    protected BankGuaranteeTerminationInvalid bankGuaranteeTerminationInvalid;
    protected BankGuaranteeTermination bankGuaranteeTermination;
    protected BankGuaranteeReturnInvalid bankGuaranteeReturnInvalid;
    protected BankGuaranteeReturn bankGuaranteeReturn;
    protected BankGuaranteeRefusalInvalid bankGuaranteeRefusalInvalid;
    protected BankGuaranteeRefusal bankGuaranteeRefusal;

    /**
     * Gets the value of the bankGuaranteeTerminationInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link BankGuaranteeTerminationInvalid }
     *     
     */
    public BankGuaranteeTerminationInvalid getBankGuaranteeTerminationInvalid() {
        return bankGuaranteeTerminationInvalid;
    }

    /**
     * Sets the value of the bankGuaranteeTerminationInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankGuaranteeTerminationInvalid }
     *     
     */
    public void setBankGuaranteeTerminationInvalid(BankGuaranteeTerminationInvalid value) {
        this.bankGuaranteeTerminationInvalid = value;
    }

    /**
     * Gets the value of the bankGuaranteeTermination property.
     * 
     * @return
     *     possible object is
     *     {@link BankGuaranteeTermination }
     *     
     */
    public BankGuaranteeTermination getBankGuaranteeTermination() {
        return bankGuaranteeTermination;
    }

    /**
     * Sets the value of the bankGuaranteeTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankGuaranteeTermination }
     *     
     */
    public void setBankGuaranteeTermination(BankGuaranteeTermination value) {
        this.bankGuaranteeTermination = value;
    }

    /**
     * Gets the value of the bankGuaranteeReturnInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link BankGuaranteeReturnInvalid }
     *     
     */
    public BankGuaranteeReturnInvalid getBankGuaranteeReturnInvalid() {
        return bankGuaranteeReturnInvalid;
    }

    /**
     * Sets the value of the bankGuaranteeReturnInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankGuaranteeReturnInvalid }
     *     
     */
    public void setBankGuaranteeReturnInvalid(BankGuaranteeReturnInvalid value) {
        this.bankGuaranteeReturnInvalid = value;
    }

    /**
     * Gets the value of the bankGuaranteeReturn property.
     * 
     * @return
     *     possible object is
     *     {@link BankGuaranteeReturn }
     *     
     */
    public BankGuaranteeReturn getBankGuaranteeReturn() {
        return bankGuaranteeReturn;
    }

    /**
     * Sets the value of the bankGuaranteeReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankGuaranteeReturn }
     *     
     */
    public void setBankGuaranteeReturn(BankGuaranteeReturn value) {
        this.bankGuaranteeReturn = value;
    }

    /**
     * Gets the value of the bankGuaranteeRefusalInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link BankGuaranteeRefusalInvalid }
     *     
     */
    public BankGuaranteeRefusalInvalid getBankGuaranteeRefusalInvalid() {
        return bankGuaranteeRefusalInvalid;
    }

    /**
     * Sets the value of the bankGuaranteeRefusalInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankGuaranteeRefusalInvalid }
     *     
     */
    public void setBankGuaranteeRefusalInvalid(BankGuaranteeRefusalInvalid value) {
        this.bankGuaranteeRefusalInvalid = value;
    }

    /**
     * Gets the value of the bankGuaranteeRefusal property.
     * 
     * @return
     *     possible object is
     *     {@link BankGuaranteeRefusal }
     *     
     */
    public BankGuaranteeRefusal getBankGuaranteeRefusal() {
        return bankGuaranteeRefusal;
    }

    /**
     * Sets the value of the bankGuaranteeRefusal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankGuaranteeRefusal }
     *     
     */
    public void setBankGuaranteeRefusal(BankGuaranteeRefusal value) {
        this.bankGuaranteeRefusal = value;
    }

}

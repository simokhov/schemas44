//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Платежные реквизиты
 * 
 * <p>Java class for paymentPropertysType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentPropertysType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bik" type="{http://zakupki.gov.ru/oos/base/1}bikType"/>
 *         &lt;element name="settlementAccount" type="{http://zakupki.gov.ru/oos/base/1}settlementAccountType"/>
 *         &lt;element name="personalAccount" type="{http://zakupki.gov.ru/oos/base/1}personalAccountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentPropertysType", propOrder = {
    "bik",
    "settlementAccount",
    "personalAccount"
})
public class PaymentPropertysType {

    @XmlElement(required = true)
    protected String bik;
    @XmlElement(required = true)
    protected String settlementAccount;
    protected String personalAccount;

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

}

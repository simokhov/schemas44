//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Информация о платеже для обеспечения заявки (исполнения договора) или за предоставление документации
 * 
 * <p>Java class for paymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *         &lt;element name="account" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bik" type="{http://zakupki.gov.ru/oos/base/1}bikType"/>
 *                   &lt;element name="settlementAccount" type="{http://zakupki.gov.ru/oos/base/1}settlementAccountType"/>
 *                   &lt;element name="personalAccount" type="{http://zakupki.gov.ru/oos/base/1}personalAccountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "paymentInfoType", propOrder = {
    "amount",
    "account"
})
public class PaymentInfoType {

    @XmlElement(required = true)
    protected String amount;
    protected PaymentInfoType.Account account;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoType.Account }
     *     
     */
    public PaymentInfoType.Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoType.Account }
     *     
     */
    public void setAccount(PaymentInfoType.Account value) {
        this.account = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
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
    @XmlType(name = "", propOrder = {
        "bik",
        "settlementAccount",
        "personalAccount"
    })
    public static class Account {

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

}

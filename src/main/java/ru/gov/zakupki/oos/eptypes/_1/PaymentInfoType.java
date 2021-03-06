//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.PaymentPropertysType;


/**
 * Тип: Информация о платеже для обеспечения заявки (исполнения контракта) или за предоставление документации
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
 *         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/base/1}moneyType"/>
 *         &lt;element name="account" type="{http://zakupki.gov.ru/oos/common/1}paymentPropertysType"/>
 *         &lt;element name="procedureInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="part" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "account",
    "procedureInfo",
    "part"
})
public class PaymentInfoType {

    @XmlElement(required = true)
    protected String amount;
    @XmlElement(required = true)
    protected PaymentPropertysType account;
    @XmlElement(required = true)
    protected String procedureInfo;
    protected Double part;

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
     *     {@link PaymentPropertysType }
     *     
     */
    public PaymentPropertysType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPropertysType }
     *     
     */
    public void setAccount(PaymentPropertysType value) {
        this.account = value;
    }

    /**
     * Gets the value of the procedureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedureInfo() {
        return procedureInfo;
    }

    /**
     * Sets the value of the procedureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedureInfo(String value) {
        this.procedureInfo = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPart(Double value) {
        this.part = value;
    }

}

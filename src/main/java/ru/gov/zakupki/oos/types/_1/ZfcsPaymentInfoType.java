//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:44:23 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о платеже для обеспечения заявки (исполнения контракта) или за предоставление документации
 * 
 * <p>Java class for zfcs_paymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_paymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *         &lt;element name="part" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxExclusive value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="procedureInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="settlementAccount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_settlementAccountType"/>
 *         &lt;element name="personalAccount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_personalAccountType" minOccurs="0"/>
 *         &lt;element name="bik" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bikType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_paymentInfoType", propOrder = {
    "amount",
    "part",
    "procedureInfo",
    "settlementAccount",
    "personalAccount",
    "bik"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsReleasePurchaseDocumentationType.PayInfo.class
})
public class ZfcsPaymentInfoType {

    @XmlElement(required = true)
    protected String amount;
    protected Double part;
    @XmlElement(required = true)
    protected String procedureInfo;
    @XmlElement(required = true)
    protected String settlementAccount;
    protected String personalAccount;
    @XmlElement(required = true)
    protected String bik;

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

}

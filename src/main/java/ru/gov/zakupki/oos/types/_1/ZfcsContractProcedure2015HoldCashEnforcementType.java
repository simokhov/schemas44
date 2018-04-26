//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:46:03 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Сведения об удержании денежных средств, перечисленных в качестве обеспечения исполнения контракта (исполнения обязательств по гарантии качества товаров, работ, услуг)
 * 
 * <p>Java class for zfcs_contractProcedure2015HoldCashEnforcementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractProcedure2015HoldCashEnforcementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="improperSupplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *         &lt;element name="holdAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *         &lt;element name="holdDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *         &lt;element name="holdAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contractProcedure2015HoldCashEnforcementType", propOrder = {
    "improperSupplierInfo",
    "currency",
    "holdAmount",
    "holdDate",
    "currencyRate",
    "holdAmountRUR"
})
public class ZfcsContractProcedure2015HoldCashEnforcementType {

    protected String improperSupplierInfo;
    protected ZfcsCurrencyRef currency;
    @XmlElement(required = true)
    protected String holdAmount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar holdDate;
    protected ZfcsCurrencyRateContract2015 currencyRate;
    protected String holdAmountRUR;

    /**
     * Gets the value of the improperSupplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImproperSupplierInfo() {
        return improperSupplierInfo;
    }

    /**
     * Sets the value of the improperSupplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImproperSupplierInfo(String value) {
        this.improperSupplierInfo = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCurrencyRef }
     *     
     */
    public ZfcsCurrencyRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCurrencyRef }
     *     
     */
    public void setCurrency(ZfcsCurrencyRef value) {
        this.currency = value;
    }

    /**
     * Gets the value of the holdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldAmount() {
        return holdAmount;
    }

    /**
     * Sets the value of the holdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldAmount(String value) {
        this.holdAmount = value;
    }

    /**
     * Gets the value of the holdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoldDate() {
        return holdDate;
    }

    /**
     * Sets the value of the holdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoldDate(XMLGregorianCalendar value) {
        this.holdDate = value;
    }

    /**
     * Gets the value of the currencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCurrencyRateContract2015 }
     *     
     */
    public ZfcsCurrencyRateContract2015 getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Sets the value of the currencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCurrencyRateContract2015 }
     *     
     */
    public void setCurrencyRate(ZfcsCurrencyRateContract2015 value) {
        this.currencyRate = value;
    }

    /**
     * Gets the value of the holdAmountRUR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldAmountRUR() {
        return holdAmountRUR;
    }

    /**
     * Sets the value of the holdAmountRUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldAmountRUR(String value) {
        this.holdAmountRUR = value;
    }

}
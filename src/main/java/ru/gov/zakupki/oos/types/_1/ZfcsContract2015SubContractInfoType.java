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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Информация о субподрядном договоре в сведениях о контракте
 * 
 * <p>Java class for zfcs_contract2015SubContractInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contract2015SubContractInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subContractDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="subContractNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="subContractSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="contractPriceSpecify" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract2015ContractPriceSpecifyType" minOccurs="0"/>
 *         &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subContractPriceInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                   &lt;element name="priceRUR" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
 *                   &lt;element name="VATSum" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
 *                   &lt;element name="VATSumRUR" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
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
@XmlType(name = "zfcs_contract2015SubContractInfoType", propOrder = {
    "subContractDate",
    "subContractNumber",
    "subContractSubject",
    "contractPriceSpecify",
    "quantityUndefined",
    "subContractPriceInfo"
})
public class ZfcsContract2015SubContractInfoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar subContractDate;
    protected String subContractNumber;
    @XmlElement(required = true)
    protected String subContractSubject;
    @XmlSchemaType(name = "string")
    protected ZfcsContract2015ContractPriceSpecifyType contractPriceSpecify;
    protected Boolean quantityUndefined;
    @XmlElement(required = true)
    protected ZfcsContract2015SubContractInfoType.SubContractPriceInfo subContractPriceInfo;

    /**
     * Gets the value of the subContractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubContractDate() {
        return subContractDate;
    }

    /**
     * Sets the value of the subContractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubContractDate(XMLGregorianCalendar value) {
        this.subContractDate = value;
    }

    /**
     * Gets the value of the subContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubContractNumber() {
        return subContractNumber;
    }

    /**
     * Sets the value of the subContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubContractNumber(String value) {
        this.subContractNumber = value;
    }

    /**
     * Gets the value of the subContractSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubContractSubject() {
        return subContractSubject;
    }

    /**
     * Sets the value of the subContractSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubContractSubject(String value) {
        this.subContractSubject = value;
    }

    /**
     * Gets the value of the contractPriceSpecify property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015ContractPriceSpecifyType }
     *     
     */
    public ZfcsContract2015ContractPriceSpecifyType getContractPriceSpecify() {
        return contractPriceSpecify;
    }

    /**
     * Sets the value of the contractPriceSpecify property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015ContractPriceSpecifyType }
     *     
     */
    public void setContractPriceSpecify(ZfcsContract2015ContractPriceSpecifyType value) {
        this.contractPriceSpecify = value;
    }

    /**
     * Gets the value of the quantityUndefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityUndefined() {
        return quantityUndefined;
    }

    /**
     * Sets the value of the quantityUndefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityUndefined(Boolean value) {
        this.quantityUndefined = value;
    }

    /**
     * Gets the value of the subContractPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContract2015SubContractInfoType.SubContractPriceInfo }
     *     
     */
    public ZfcsContract2015SubContractInfoType.SubContractPriceInfo getSubContractPriceInfo() {
        return subContractPriceInfo;
    }

    /**
     * Sets the value of the subContractPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContract2015SubContractInfoType.SubContractPriceInfo }
     *     
     */
    public void setSubContractPriceInfo(ZfcsContract2015SubContractInfoType.SubContractPriceInfo value) {
        this.subContractPriceInfo = value;
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
     *         &lt;element name="price" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *         &lt;element name="priceRUR" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType" minOccurs="0"/>
     *         &lt;element name="VATSum" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
     *         &lt;element name="VATSumRUR" type="{http://zakupki.gov.ru/oos/base/1}moneyMaxLengthToPoint18Type" minOccurs="0"/>
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
        "price",
        "currency",
        "currencyRate",
        "priceRUR",
        "vatSum",
        "vatSumRUR"
    })
    public static class SubContractPriceInfo {

        @XmlElement(required = true)
        protected String price;
        @XmlElement(required = true)
        protected ZfcsCurrencyRef currency;
        protected ZfcsCurrencyRateContract2015 currencyRate;
        protected String priceRUR;
        @XmlElement(name = "VATSum")
        protected String vatSum;
        @XmlElement(name = "VATSumRUR")
        protected String vatSumRUR;

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrice(String value) {
            this.price = value;
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
         * Gets the value of the priceRUR property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceRUR() {
            return priceRUR;
        }

        /**
         * Sets the value of the priceRUR property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceRUR(String value) {
            this.priceRUR = value;
        }

        /**
         * Gets the value of the vatSum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVATSum() {
            return vatSum;
        }

        /**
         * Sets the value of the vatSum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVATSum(String value) {
            this.vatSum = value;
        }

        /**
         * Gets the value of the vatSumRUR property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVATSumRUR() {
            return vatSumRUR;
        }

        /**
         * Sets the value of the vatSumRUR property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVATSumRUR(String value) {
            this.vatSumRUR = value;
        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:50:10 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Информация о банковской гарантии для других документов, относящихся к банковской гарантии
 * 
 * <p>Java class for zfcs_bankGuaranteeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bankGuaranteeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="purchaseRequestEnsure">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                       &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
 *                     &lt;/choice>
 *                     &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                     &lt;element name="mLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="contractExecutionEnsure">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType" minOccurs="0"/>
 *                     &lt;element name="purchase" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;choice>
 *                                 &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                                 &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
 *                               &lt;/choice>
 *                               &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="mLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     &lt;element name="singleSupplier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="majorRepairEnsure">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="EFNumber">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;minLength value="1"/>
 *                           &lt;maxLength value="50"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType"/>
 *         &lt;element name="purchaseCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="guaranteeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="guaranteeGrantDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="guaranteePublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="guaranteeNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeNumberType" minOccurs="0"/>
 *         &lt;element name="creditOrgNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeCreditOrgNumberType" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="guaranteeAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyFullRef"/>
 *         &lt;element name="entryForceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="procedure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="guaranteeAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType" minOccurs="0"/>
 *         &lt;element name="currencyRate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "zfcs_bankGuaranteeInfoType", propOrder = {
    "purchaseRequestEnsure",
    "contractExecutionEnsure",
    "majorRepairEnsure",
    "customer",
    "purchaseCodes",
    "guaranteeDate",
    "guaranteeGrantDate",
    "guaranteePublishDate",
    "guaranteeNumber",
    "creditOrgNumber",
    "expireDate",
    "guaranteeAmount",
    "currency",
    "entryForceDate",
    "procedure",
    "guaranteeAmountRUR",
    "currencyRate"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsBankGuaranteeOtherBankNoticeType.Guaranties.Guarantee.class
})
public class ZfcsBankGuaranteeInfoType {

    protected ZfcsBankGuaranteeInfoType.PurchaseRequestEnsure purchaseRequestEnsure;
    protected ZfcsBankGuaranteeInfoType.ContractExecutionEnsure contractExecutionEnsure;
    protected ZfcsBankGuaranteeInfoType.MajorRepairEnsure majorRepairEnsure;
    @XmlElement(required = true)
    protected ZfcsBankGuaranteeOrganizationType customer;
    protected ZfcsBankGuaranteeInfoType.PurchaseCodes purchaseCodes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guaranteeDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guaranteeGrantDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guaranteePublishDate;
    protected String guaranteeNumber;
    protected String creditOrgNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireDate;
    @XmlElement(required = true)
    protected String guaranteeAmount;
    @XmlElement(required = true)
    protected ZfcsCurrencyFullRef currency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryForceDate;
    protected String procedure;
    protected String guaranteeAmountRUR;
    protected BigDecimal currencyRate;

    /**
     * Gets the value of the purchaseRequestEnsure property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeInfoType.PurchaseRequestEnsure }
     *     
     */
    public ZfcsBankGuaranteeInfoType.PurchaseRequestEnsure getPurchaseRequestEnsure() {
        return purchaseRequestEnsure;
    }

    /**
     * Sets the value of the purchaseRequestEnsure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeInfoType.PurchaseRequestEnsure }
     *     
     */
    public void setPurchaseRequestEnsure(ZfcsBankGuaranteeInfoType.PurchaseRequestEnsure value) {
        this.purchaseRequestEnsure = value;
    }

    /**
     * Gets the value of the contractExecutionEnsure property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeInfoType.ContractExecutionEnsure }
     *     
     */
    public ZfcsBankGuaranteeInfoType.ContractExecutionEnsure getContractExecutionEnsure() {
        return contractExecutionEnsure;
    }

    /**
     * Sets the value of the contractExecutionEnsure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeInfoType.ContractExecutionEnsure }
     *     
     */
    public void setContractExecutionEnsure(ZfcsBankGuaranteeInfoType.ContractExecutionEnsure value) {
        this.contractExecutionEnsure = value;
    }

    /**
     * Gets the value of the majorRepairEnsure property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeInfoType.MajorRepairEnsure }
     *     
     */
    public ZfcsBankGuaranteeInfoType.MajorRepairEnsure getMajorRepairEnsure() {
        return majorRepairEnsure;
    }

    /**
     * Sets the value of the majorRepairEnsure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeInfoType.MajorRepairEnsure }
     *     
     */
    public void setMajorRepairEnsure(ZfcsBankGuaranteeInfoType.MajorRepairEnsure value) {
        this.majorRepairEnsure = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public ZfcsBankGuaranteeOrganizationType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public void setCustomer(ZfcsBankGuaranteeOrganizationType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the purchaseCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeInfoType.PurchaseCodes }
     *     
     */
    public ZfcsBankGuaranteeInfoType.PurchaseCodes getPurchaseCodes() {
        return purchaseCodes;
    }

    /**
     * Sets the value of the purchaseCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeInfoType.PurchaseCodes }
     *     
     */
    public void setPurchaseCodes(ZfcsBankGuaranteeInfoType.PurchaseCodes value) {
        this.purchaseCodes = value;
    }

    /**
     * Gets the value of the guaranteeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuaranteeDate() {
        return guaranteeDate;
    }

    /**
     * Sets the value of the guaranteeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuaranteeDate(XMLGregorianCalendar value) {
        this.guaranteeDate = value;
    }

    /**
     * Gets the value of the guaranteeGrantDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuaranteeGrantDate() {
        return guaranteeGrantDate;
    }

    /**
     * Sets the value of the guaranteeGrantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuaranteeGrantDate(XMLGregorianCalendar value) {
        this.guaranteeGrantDate = value;
    }

    /**
     * Gets the value of the guaranteePublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuaranteePublishDate() {
        return guaranteePublishDate;
    }

    /**
     * Sets the value of the guaranteePublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuaranteePublishDate(XMLGregorianCalendar value) {
        this.guaranteePublishDate = value;
    }

    /**
     * Gets the value of the guaranteeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeNumber() {
        return guaranteeNumber;
    }

    /**
     * Sets the value of the guaranteeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeNumber(String value) {
        this.guaranteeNumber = value;
    }

    /**
     * Gets the value of the creditOrgNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditOrgNumber() {
        return creditOrgNumber;
    }

    /**
     * Sets the value of the creditOrgNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditOrgNumber(String value) {
        this.creditOrgNumber = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the guaranteeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /**
     * Sets the value of the guaranteeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeAmount(String value) {
        this.guaranteeAmount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCurrencyFullRef }
     *     
     */
    public ZfcsCurrencyFullRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCurrencyFullRef }
     *     
     */
    public void setCurrency(ZfcsCurrencyFullRef value) {
        this.currency = value;
    }

    /**
     * Gets the value of the entryForceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryForceDate() {
        return entryForceDate;
    }

    /**
     * Sets the value of the entryForceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryForceDate(XMLGregorianCalendar value) {
        this.entryForceDate = value;
    }

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
     * Gets the value of the guaranteeAmountRUR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeAmountRUR() {
        return guaranteeAmountRUR;
    }

    /**
     * Sets the value of the guaranteeAmountRUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeAmountRUR(String value) {
        this.guaranteeAmountRUR = value;
    }

    /**
     * Gets the value of the currencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Sets the value of the currencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRate(BigDecimal value) {
        this.currencyRate = value;
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
     *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType" minOccurs="0"/>
     *         &lt;element name="purchase" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *                     &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
     *                   &lt;/choice>
     *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="singleSupplier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "regNum",
        "purchase",
        "mLots",
        "singleSupplier"
    })
    public static class ContractExecutionEnsure {

        protected String regNum;
        protected ZfcsBankGuaranteeInfoType.ContractExecutionEnsure.Purchase purchase;
        protected Boolean mLots;
        protected Boolean singleSupplier;

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
         * Gets the value of the purchase property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeInfoType.ContractExecutionEnsure.Purchase }
         *     
         */
        public ZfcsBankGuaranteeInfoType.ContractExecutionEnsure.Purchase getPurchase() {
            return purchase;
        }

        /**
         * Sets the value of the purchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeInfoType.ContractExecutionEnsure.Purchase }
         *     
         */
        public void setPurchase(ZfcsBankGuaranteeInfoType.ContractExecutionEnsure.Purchase value) {
            this.purchase = value;
        }

        /**
         * Gets the value of the mLots property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMLots() {
            return mLots;
        }

        /**
         * Sets the value of the mLots property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMLots(Boolean value) {
            this.mLots = value;
        }

        /**
         * Gets the value of the singleSupplier property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSingleSupplier() {
            return singleSupplier;
        }

        /**
         * Sets the value of the singleSupplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSingleSupplier(Boolean value) {
            this.singleSupplier = value;
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
         *         &lt;choice>
         *           &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
         *           &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
         *         &lt;/choice>
         *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "purchaseNumber",
            "notificationNumber",
            "lotNumber"
        })
        public static class Purchase {

            protected String purchaseNumber;
            protected String notificationNumber;
            protected int lotNumber;

            /**
             * Gets the value of the purchaseNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurchaseNumber() {
                return purchaseNumber;
            }

            /**
             * Sets the value of the purchaseNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurchaseNumber(String value) {
                this.purchaseNumber = value;
            }

            /**
             * Gets the value of the notificationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotificationNumber() {
                return notificationNumber;
            }

            /**
             * Sets the value of the notificationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotificationNumber(String value) {
                this.notificationNumber = value;
            }

            /**
             * Gets the value of the lotNumber property.
             * 
             */
            public int getLotNumber() {
                return lotNumber;
            }

            /**
             * Sets the value of the lotNumber property.
             * 
             */
            public void setLotNumber(int value) {
                this.lotNumber = value;
            }

        }

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
     *         &lt;element name="EFNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
    @XmlType(name = "", propOrder = {
        "efNumber"
    })
    public static class MajorRepairEnsure {

        @XmlElement(name = "EFNumber", required = true)
        protected String efNumber;

        /**
         * Gets the value of the efNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEFNumber() {
            return efNumber;
        }

        /**
         * Sets the value of the efNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEFNumber(String value) {
            this.efNumber = value;
        }

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
     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" maxOccurs="unbounded"/>
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
        "purchaseCode"
    })
    public static class PurchaseCodes {

        @XmlElement(required = true)
        protected List<String> purchaseCode;

        /**
         * Gets the value of the purchaseCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purchaseCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPurchaseCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPurchaseCode() {
            if (purchaseCode == null) {
                purchaseCode = new ArrayList<String>();
            }
            return this.purchaseCode;
        }

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
     *         &lt;choice>
     *           &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *           &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}notificationNumberType"/>
     *         &lt;/choice>
     *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="mLots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "purchaseNumber",
        "notificationNumber",
        "lotNumber",
        "mLots"
    })
    public static class PurchaseRequestEnsure {

        protected String purchaseNumber;
        protected String notificationNumber;
        protected int lotNumber;
        protected Boolean mLots;

        /**
         * Gets the value of the purchaseNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseNumber() {
            return purchaseNumber;
        }

        /**
         * Sets the value of the purchaseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseNumber(String value) {
            this.purchaseNumber = value;
        }

        /**
         * Gets the value of the notificationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotificationNumber() {
            return notificationNumber;
        }

        /**
         * Sets the value of the notificationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotificationNumber(String value) {
            this.notificationNumber = value;
        }

        /**
         * Gets the value of the lotNumber property.
         * 
         */
        public int getLotNumber() {
            return lotNumber;
        }

        /**
         * Sets the value of the lotNumber property.
         * 
         */
        public void setLotNumber(int value) {
            this.lotNumber = value;
        }

        /**
         * Gets the value of the mLots property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMLots() {
            return mLots;
        }

        /**
         * Sets the value of the mLots property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMLots(Boolean value) {
            this.mLots = value;
        }

    }

}

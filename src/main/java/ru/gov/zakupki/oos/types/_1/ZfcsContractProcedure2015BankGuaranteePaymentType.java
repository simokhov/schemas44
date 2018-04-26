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
 * Тип: Информация об уплате по банковской гарантии в информации об исполненни (исполнении обязательств по предоставленной гарантии качества, расторжении) контракта
 * 
 * <p>Java class for zfcs_contractProcedure2015BankGuaranteePaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractProcedure2015BankGuaranteePaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *         &lt;element name="improperExecInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="requirements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="requirementsDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="paymentAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                   &lt;element name="paymentAmountDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="refundAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="penaltiesAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="lossNotCoveredAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="warrantyAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                             &lt;element name="otherAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                   &lt;element name="paymentAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="paid" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="documentNum">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
 *                   &lt;element name="bankPaid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                   &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
 *                   &lt;element name="bankPaidRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bankCancelDetails" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="improperGuaranteePaymentInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="restructure" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="restructureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="restructureAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
 *                   &lt;element name="repaymentSchedule" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
@XmlType(name = "zfcs_contractProcedure2015BankGuaranteePaymentType", propOrder = {
    "regNumber",
    "docNumber",
    "improperExecInfo",
    "requirements",
    "paid",
    "bankCancelDetails",
    "improperGuaranteePaymentInfo",
    "restructure"
})
public class ZfcsContractProcedure2015BankGuaranteePaymentType {

    protected String regNumber;
    protected String docNumber;
    @XmlElement(required = true)
    protected String improperExecInfo;
    protected ZfcsContractProcedure2015BankGuaranteePaymentType.Requirements requirements;
    protected ZfcsContractProcedure2015BankGuaranteePaymentType.Paid paid;
    protected String bankCancelDetails;
    protected String improperGuaranteePaymentInfo;
    protected ZfcsContractProcedure2015BankGuaranteePaymentType.Restructure restructure;

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the improperExecInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImproperExecInfo() {
        return improperExecInfo;
    }

    /**
     * Sets the value of the improperExecInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImproperExecInfo(String value) {
        this.improperExecInfo = value;
    }

    /**
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015BankGuaranteePaymentType.Requirements }
     *     
     */
    public ZfcsContractProcedure2015BankGuaranteePaymentType.Requirements getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015BankGuaranteePaymentType.Requirements }
     *     
     */
    public void setRequirements(ZfcsContractProcedure2015BankGuaranteePaymentType.Requirements value) {
        this.requirements = value;
    }

    /**
     * Gets the value of the paid property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015BankGuaranteePaymentType.Paid }
     *     
     */
    public ZfcsContractProcedure2015BankGuaranteePaymentType.Paid getPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015BankGuaranteePaymentType.Paid }
     *     
     */
    public void setPaid(ZfcsContractProcedure2015BankGuaranteePaymentType.Paid value) {
        this.paid = value;
    }

    /**
     * Gets the value of the bankCancelDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCancelDetails() {
        return bankCancelDetails;
    }

    /**
     * Sets the value of the bankCancelDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCancelDetails(String value) {
        this.bankCancelDetails = value;
    }

    /**
     * Gets the value of the improperGuaranteePaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImproperGuaranteePaymentInfo() {
        return improperGuaranteePaymentInfo;
    }

    /**
     * Sets the value of the improperGuaranteePaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImproperGuaranteePaymentInfo(String value) {
        this.improperGuaranteePaymentInfo = value;
    }

    /**
     * Gets the value of the restructure property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContractProcedure2015BankGuaranteePaymentType.Restructure }
     *     
     */
    public ZfcsContractProcedure2015BankGuaranteePaymentType.Restructure getRestructure() {
        return restructure;
    }

    /**
     * Sets the value of the restructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContractProcedure2015BankGuaranteePaymentType.Restructure }
     *     
     */
    public void setRestructure(ZfcsContractProcedure2015BankGuaranteePaymentType.Restructure value) {
        this.restructure = value;
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
     *         &lt;element name="name" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="documentNum">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
     *         &lt;element name="bankPaid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *         &lt;element name="bankPaidRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
        "name",
        "documentDate",
        "documentNum",
        "currency",
        "bankPaid",
        "currencyRate",
        "bankPaidRUR"
    })
    public static class Paid {

        protected String name;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar documentDate;
        @XmlElement(required = true)
        protected String documentNum;
        protected ZfcsCurrencyRef currency;
        @XmlElement(required = true)
        protected String bankPaid;
        protected ZfcsCurrencyRateContract2015 currencyRate;
        protected String bankPaidRUR;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the documentDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDocumentDate() {
            return documentDate;
        }

        /**
         * Sets the value of the documentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDocumentDate(XMLGregorianCalendar value) {
            this.documentDate = value;
        }

        /**
         * Gets the value of the documentNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentNum() {
            return documentNum;
        }

        /**
         * Sets the value of the documentNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentNum(String value) {
            this.documentNum = value;
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
         * Gets the value of the bankPaid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankPaid() {
            return bankPaid;
        }

        /**
         * Sets the value of the bankPaid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankPaid(String value) {
            this.bankPaid = value;
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
         * Gets the value of the bankPaidRUR property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankPaidRUR() {
            return bankPaidRUR;
        }

        /**
         * Sets the value of the bankPaidRUR property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankPaidRUR(String value) {
            this.bankPaidRUR = value;
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
     *         &lt;element name="requirementsDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="paymentAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *         &lt;element name="paymentAmountDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="refundAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="penaltiesAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="lossNotCoveredAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="warrantyAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                   &lt;element name="otherAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef" minOccurs="0"/>
     *         &lt;element name="currencyRate" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRateContract2015" minOccurs="0"/>
     *         &lt;element name="paymentAmountRUR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
        "requirementsDate",
        "paymentAmount",
        "paymentAmountDetail",
        "currency",
        "currencyRate",
        "paymentAmountRUR"
    })
    public static class Requirements {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar requirementsDate;
        protected String paymentAmount;
        protected ZfcsContractProcedure2015BankGuaranteePaymentType.Requirements.PaymentAmountDetail paymentAmountDetail;
        protected ZfcsCurrencyRef currency;
        protected ZfcsCurrencyRateContract2015 currencyRate;
        protected String paymentAmountRUR;

        /**
         * Gets the value of the requirementsDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRequirementsDate() {
            return requirementsDate;
        }

        /**
         * Sets the value of the requirementsDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRequirementsDate(XMLGregorianCalendar value) {
            this.requirementsDate = value;
        }

        /**
         * Gets the value of the paymentAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentAmount() {
            return paymentAmount;
        }

        /**
         * Sets the value of the paymentAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentAmount(String value) {
            this.paymentAmount = value;
        }

        /**
         * Gets the value of the paymentAmountDetail property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsContractProcedure2015BankGuaranteePaymentType.Requirements.PaymentAmountDetail }
         *     
         */
        public ZfcsContractProcedure2015BankGuaranteePaymentType.Requirements.PaymentAmountDetail getPaymentAmountDetail() {
            return paymentAmountDetail;
        }

        /**
         * Sets the value of the paymentAmountDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsContractProcedure2015BankGuaranteePaymentType.Requirements.PaymentAmountDetail }
         *     
         */
        public void setPaymentAmountDetail(ZfcsContractProcedure2015BankGuaranteePaymentType.Requirements.PaymentAmountDetail value) {
            this.paymentAmountDetail = value;
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
         * Gets the value of the paymentAmountRUR property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentAmountRUR() {
            return paymentAmountRUR;
        }

        /**
         * Sets the value of the paymentAmountRUR property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentAmountRUR(String value) {
            this.paymentAmountRUR = value;
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
         *         &lt;element name="refundAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="penaltiesAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="lossNotCoveredAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="warrantyAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
         *         &lt;element name="otherAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
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
            "refundAmount",
            "penaltiesAmount",
            "lossNotCoveredAmount",
            "warrantyAmount",
            "otherAmount"
        })
        public static class PaymentAmountDetail {

            protected String refundAmount;
            protected String penaltiesAmount;
            protected String lossNotCoveredAmount;
            protected String warrantyAmount;
            protected String otherAmount;

            /**
             * Gets the value of the refundAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRefundAmount() {
                return refundAmount;
            }

            /**
             * Sets the value of the refundAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRefundAmount(String value) {
                this.refundAmount = value;
            }

            /**
             * Gets the value of the penaltiesAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPenaltiesAmount() {
                return penaltiesAmount;
            }

            /**
             * Sets the value of the penaltiesAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPenaltiesAmount(String value) {
                this.penaltiesAmount = value;
            }

            /**
             * Gets the value of the lossNotCoveredAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLossNotCoveredAmount() {
                return lossNotCoveredAmount;
            }

            /**
             * Sets the value of the lossNotCoveredAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLossNotCoveredAmount(String value) {
                this.lossNotCoveredAmount = value;
            }

            /**
             * Gets the value of the warrantyAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWarrantyAmount() {
                return warrantyAmount;
            }

            /**
             * Sets the value of the warrantyAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWarrantyAmount(String value) {
                this.warrantyAmount = value;
            }

            /**
             * Gets the value of the otherAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherAmount() {
                return otherAmount;
            }

            /**
             * Sets the value of the otherAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherAmount(String value) {
                this.otherAmount = value;
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
     *         &lt;element name="restructureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="restructureAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType"/>
     *         &lt;element name="repaymentSchedule" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
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
        "restructureDate",
        "restructureAmount",
        "repaymentSchedule"
    })
    public static class Restructure {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar restructureDate;
        @XmlElement(required = true)
        protected String restructureAmount;
        @XmlElement(required = true)
        protected String repaymentSchedule;

        /**
         * Gets the value of the restructureDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRestructureDate() {
            return restructureDate;
        }

        /**
         * Sets the value of the restructureDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRestructureDate(XMLGregorianCalendar value) {
            this.restructureDate = value;
        }

        /**
         * Gets the value of the restructureAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestructureAmount() {
            return restructureAmount;
        }

        /**
         * Sets the value of the restructureAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestructureAmount(String value) {
            this.restructureAmount = value;
        }

        /**
         * Gets the value of the repaymentSchedule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRepaymentSchedule() {
            return repaymentSchedule;
        }

        /**
         * Sets the value of the repaymentSchedule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRepaymentSchedule(String value) {
            this.repaymentSchedule = value;
        }

    }

}
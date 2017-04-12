//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:49:49 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о выданной банковской гарантии
 * 
 * <p>Java class for zfcs_bankGuaranteeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bankGuaranteeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRegNumberType" minOccurs="0"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="bank" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="supplier" type="{http://zakupki.gov.ru/oos/types/1}zfcs_participantType"/>
 *         &lt;element name="guarantee">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="purchaseRequestEnsure">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                               &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="contractExecutionEnsure">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType" minOccurs="0"/>
 *                               &lt;element name="purchase" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                                         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="purchaseCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="250"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="guaranteeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="guaranteeNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeNumberType"/>
 *                   &lt;element name="guaranteeAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
 *                   &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="agreementDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="modification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGaranteeModificationType"/>
 *                   &lt;element name="info">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="modificationDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_bankGuaranteeType", propOrder = {
    "id",
    "externalId",
    "regNumber",
    "docNumber",
    "versionNumber",
    "docPublishDate",
    "bank",
    "supplier",
    "guarantee",
    "href",
    "printForm",
    "agreementDocuments",
    "modification"
})
public class ZfcsBankGuaranteeType {

    protected Long id;
    protected String externalId;
    protected String regNumber;
    protected String docNumber;
    protected Integer versionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(required = true)
    protected ZfcsOrganizationRef bank;
    @XmlElement(required = true)
    protected ZfcsParticipantType supplier;
    @XmlElement(required = true)
    protected ZfcsBankGuaranteeType.Guarantee guarantee;
    protected String href;
    protected ZfcsPrintFormType printForm;
    protected ZfcsAttachmentListType agreementDocuments;
    protected ZfcsBankGuaranteeType.Modification modification;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

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
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionNumber(Integer value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the docPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocPublishDate() {
        return docPublishDate;
    }

    /**
     * Sets the value of the docPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocPublishDate(XMLGregorianCalendar value) {
        this.docPublishDate = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setBank(ZfcsOrganizationRef value) {
        this.bank = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsParticipantType }
     *     
     */
    public ZfcsParticipantType getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsParticipantType }
     *     
     */
    public void setSupplier(ZfcsParticipantType value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeType.Guarantee }
     *     
     */
    public ZfcsBankGuaranteeType.Guarantee getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeType.Guarantee }
     *     
     */
    public void setGuarantee(ZfcsBankGuaranteeType.Guarantee value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public ZfcsPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsPrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the agreementDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public ZfcsAttachmentListType getAgreementDocuments() {
        return agreementDocuments;
    }

    /**
     * Sets the value of the agreementDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public void setAgreementDocuments(ZfcsAttachmentListType value) {
        this.agreementDocuments = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeType.Modification }
     *     
     */
    public ZfcsBankGuaranteeType.Modification getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeType.Modification }
     *     
     */
    public void setModification(ZfcsBankGuaranteeType.Modification value) {
        this.modification = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
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
     *           &lt;element name="purchaseRequestEnsure">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *                     &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
     *                               &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *                               &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="purchaseCode" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="250"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="guaranteeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="guaranteeNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeNumberType"/>
     *         &lt;element name="guaranteeAmount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_currencyRef"/>
     *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
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
        "purchaseRequestEnsure",
        "contractExecutionEnsure",
        "customer",
        "purchaseCode",
        "guaranteeDate",
        "guaranteeNumber",
        "guaranteeAmount",
        "currency",
        "expireDate",
        "info"
    })
    public static class Guarantee {

        protected ZfcsBankGuaranteeType.Guarantee.PurchaseRequestEnsure purchaseRequestEnsure;
        protected ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure contractExecutionEnsure;
        @XmlElement(required = true)
        protected ZfcsOrganizationRef customer;
        protected String purchaseCode;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar guaranteeDate;
        @XmlElement(required = true)
        protected String guaranteeNumber;
        @XmlElement(required = true)
        protected String guaranteeAmount;
        @XmlElement(required = true)
        protected ZfcsCurrencyRef currency;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar expireDate;
        protected String info;

        /**
         * Gets the value of the purchaseRequestEnsure property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeType.Guarantee.PurchaseRequestEnsure }
         *     
         */
        public ZfcsBankGuaranteeType.Guarantee.PurchaseRequestEnsure getPurchaseRequestEnsure() {
            return purchaseRequestEnsure;
        }

        /**
         * Sets the value of the purchaseRequestEnsure property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeType.Guarantee.PurchaseRequestEnsure }
         *     
         */
        public void setPurchaseRequestEnsure(ZfcsBankGuaranteeType.Guarantee.PurchaseRequestEnsure value) {
            this.purchaseRequestEnsure = value;
        }

        /**
         * Gets the value of the contractExecutionEnsure property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure }
         *     
         */
        public ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure getContractExecutionEnsure() {
            return contractExecutionEnsure;
        }

        /**
         * Sets the value of the contractExecutionEnsure property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure }
         *     
         */
        public void setContractExecutionEnsure(ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure value) {
            this.contractExecutionEnsure = value;
        }

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getCustomer() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setCustomer(ZfcsOrganizationRef value) {
            this.customer = value;
        }

        /**
         * Gets the value of the purchaseCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseCode() {
            return purchaseCode;
        }

        /**
         * Sets the value of the purchaseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseCode(String value) {
            this.purchaseCode = value;
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
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
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
         *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
         *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        @XmlType(name = "", propOrder = {
            "regNum",
            "purchase"
        })
        public static class ContractExecutionEnsure {

            protected String regNum;
            protected ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure.Purchase purchase;

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
             *     {@link ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure.Purchase }
             *     
             */
            public ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure.Purchase getPurchase() {
                return purchase;
            }

            /**
             * Sets the value of the purchase property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure.Purchase }
             *     
             */
            public void setPurchase(ZfcsBankGuaranteeType.Guarantee.ContractExecutionEnsure.Purchase value) {
                this.purchase = value;
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
             *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
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
                "lotNumber"
            })
            public static class Purchase {

                @XmlElement(required = true)
                protected String purchaseNumber;
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
         *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
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
            "lotNumber"
        })
        public static class PurchaseRequestEnsure {

            @XmlElement(required = true)
            protected String purchaseNumber;
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
     *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGaranteeModificationType"/>
     *         &lt;element name="info">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="modificationDocuments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
        "reason",
        "info",
        "modificationDocuments"
    })
    public static class Modification {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsBankGaranteeModificationType reason;
        @XmlElement(required = true)
        protected String info;
        protected ZfcsAttachmentListType modificationDocuments;

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGaranteeModificationType }
         *     
         */
        public ZfcsBankGaranteeModificationType getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGaranteeModificationType }
         *     
         */
        public void setReason(ZfcsBankGaranteeModificationType value) {
            this.reason = value;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

        /**
         * Gets the value of the modificationDocuments property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsAttachmentListType }
         *     
         */
        public ZfcsAttachmentListType getModificationDocuments() {
            return modificationDocuments;
        }

        /**
         * Sets the value of the modificationDocuments property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsAttachmentListType }
         *     
         */
        public void setModificationDocuments(ZfcsAttachmentListType value) {
            this.modificationDocuments = value;
        }

    }

}

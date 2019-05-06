//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
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
 * Информация о возвращении банковской гарантии или об освобождении от обязательств по банковской гарантии;
 * внесение изменений
 * 
 * <p>Java class for zfcs_bankGuaranteeReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bankGuaranteeReturnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/base/1}bankGuaranteeRegNumberType"/>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="bank" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType"/>
 *         &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeParticipantType" minOccurs="0"/>
 *         &lt;element name="guarantee" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeInfoType" minOccurs="0"/>
 *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType" minOccurs="0"/>
 *         &lt;element name="guaranteeReturns" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeReturnInfoType"/>
 *         &lt;element name="placer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRefusalPlacerOrgType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/base/1}hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="modificationInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_bankGuaranteeReturnType", propOrder = {
    "id",
    "externalId",
    "regNumber",
    "docNumber",
    "versionNumber",
    "docPublishDate",
    "bank",
    "supplierInfo",
    "guarantee",
    "regNum",
    "guaranteeReturns",
    "placer",
    "href",
    "printForm",
    "extPrintForm",
    "attachments",
    "modificationInfo"
})
public class ZfcsBankGuaranteeReturnType {

    protected Long id;
    protected String externalId;
    @XmlElement(required = true)
    protected String regNumber;
    protected String docNumber;
    protected Integer versionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(required = true)
    protected ZfcsBankGuaranteeOrganizationType bank;
    protected ZfcsBankGuaranteeParticipantType supplierInfo;
    protected ZfcsBankGuaranteeInfoType guarantee;
    protected String regNum;
    @XmlElement(required = true)
    protected ZfcsBankGuaranteeReturnInfoType guaranteeReturns;
    protected ZfcsBankGuaranteeReturnType.Placer placer;
    protected String href;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;
    protected ZfcsAttachmentListType attachments;
    protected String modificationInfo;
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
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public ZfcsBankGuaranteeOrganizationType getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public void setBank(ZfcsBankGuaranteeOrganizationType value) {
        this.bank = value;
    }

    /**
     * Gets the value of the supplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeParticipantType }
     *     
     */
    public ZfcsBankGuaranteeParticipantType getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * Sets the value of the supplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeParticipantType }
     *     
     */
    public void setSupplierInfo(ZfcsBankGuaranteeParticipantType value) {
        this.supplierInfo = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeInfoType }
     *     
     */
    public ZfcsBankGuaranteeInfoType getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeInfoType }
     *     
     */
    public void setGuarantee(ZfcsBankGuaranteeInfoType value) {
        this.guarantee = value;
    }

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
     * Gets the value of the guaranteeReturns property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeReturnInfoType }
     *     
     */
    public ZfcsBankGuaranteeReturnInfoType getGuaranteeReturns() {
        return guaranteeReturns;
    }

    /**
     * Sets the value of the guaranteeReturns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeReturnInfoType }
     *     
     */
    public void setGuaranteeReturns(ZfcsBankGuaranteeReturnInfoType value) {
        this.guaranteeReturns = value;
    }

    /**
     * Gets the value of the placer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeReturnType.Placer }
     *     
     */
    public ZfcsBankGuaranteeReturnType.Placer getPlacer() {
        return placer;
    }

    /**
     * Sets the value of the placer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeReturnType.Placer }
     *     
     */
    public void setPlacer(ZfcsBankGuaranteeReturnType.Placer value) {
        this.placer = value;
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
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsExtPrintFormType value) {
        this.extPrintForm = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public ZfcsAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the modificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationInfo() {
        return modificationInfo;
    }

    /**
     * Sets the value of the modificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationInfo(String value) {
        this.modificationInfo = value;
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
     *         &lt;element name="responsibleOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeRefusalPlacerOrgType"/>
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
        "responsibleOrg",
        "responsibleRole"
    })
    public static class Placer {

        @XmlElement(required = true)
        protected ZfcsOrganizationRef responsibleOrg;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsBankGuaranteeRefusalPlacerOrgType responsibleRole;

        /**
         * Gets the value of the responsibleOrg property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getResponsibleOrg() {
            return responsibleOrg;
        }

        /**
         * Sets the value of the responsibleOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setResponsibleOrg(ZfcsOrganizationRef value) {
            this.responsibleOrg = value;
        }

        /**
         * Gets the value of the responsibleRole property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsBankGuaranteeRefusalPlacerOrgType }
         *     
         */
        public ZfcsBankGuaranteeRefusalPlacerOrgType getResponsibleRole() {
            return responsibleRole;
        }

        /**
         * Sets the value of the responsibleRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsBankGuaranteeRefusalPlacerOrgType }
         *     
         */
        public void setResponsibleRole(ZfcsBankGuaranteeRefusalPlacerOrgType value) {
            this.responsibleRole = value;
        }

    }

}

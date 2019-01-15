//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Уведомления о получении доступа к реестровым записям других банков (для печатной формы)
 * 
 * <p>Java class for zfcs_bankGuaranteeOtherBankNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_bankGuaranteeOtherBankNoticeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bankGuarantor" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType"/>
 *         &lt;element name="bankFormed" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeOrganizationType"/>
 *         &lt;element name="guaranties">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="guarantee" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeInfoType">
 *                           &lt;sequence>
 *                             &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeParticipantType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/base/1}hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
@XmlType(name = "zfcs_bankGuaranteeOtherBankNoticeType", propOrder = {
    "docNumber",
    "docPublishDate",
    "bankGuarantor",
    "bankFormed",
    "guaranties",
    "reason",
    "href",
    "printForm",
    "attachments"
})
public class ZfcsBankGuaranteeOtherBankNoticeType {

    protected String docNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(required = true)
    protected ZfcsBankGuaranteeOrganizationType bankGuarantor;
    @XmlElement(required = true)
    protected ZfcsBankGuaranteeOrganizationType bankFormed;
    @XmlElement(required = true)
    protected ZfcsBankGuaranteeOtherBankNoticeType.Guaranties guaranties;
    @XmlElement(required = true)
    protected String reason;
    protected String href;
    protected ZfcsPrintFormType printForm;
    protected ZfcsAttachmentListType attachments;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

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
     * Gets the value of the bankGuarantor property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public ZfcsBankGuaranteeOrganizationType getBankGuarantor() {
        return bankGuarantor;
    }

    /**
     * Sets the value of the bankGuarantor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public void setBankGuarantor(ZfcsBankGuaranteeOrganizationType value) {
        this.bankGuarantor = value;
    }

    /**
     * Gets the value of the bankFormed property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public ZfcsBankGuaranteeOrganizationType getBankFormed() {
        return bankFormed;
    }

    /**
     * Sets the value of the bankFormed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeOrganizationType }
     *     
     */
    public void setBankFormed(ZfcsBankGuaranteeOrganizationType value) {
        this.bankFormed = value;
    }

    /**
     * Gets the value of the guaranties property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsBankGuaranteeOtherBankNoticeType.Guaranties }
     *     
     */
    public ZfcsBankGuaranteeOtherBankNoticeType.Guaranties getGuaranties() {
        return guaranties;
    }

    /**
     * Sets the value of the guaranties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsBankGuaranteeOtherBankNoticeType.Guaranties }
     *     
     */
    public void setGuaranties(ZfcsBankGuaranteeOtherBankNoticeType.Guaranties value) {
        this.guaranties = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
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
     *         &lt;element name="guarantee" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeInfoType">
     *                 &lt;sequence>
     *                   &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeParticipantType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "guarantee"
    })
    public static class Guaranties {

        @XmlElement(required = true)
        protected List<ZfcsBankGuaranteeOtherBankNoticeType.Guaranties.Guarantee> guarantee;

        /**
         * Gets the value of the guarantee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guarantee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuarantee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsBankGuaranteeOtherBankNoticeType.Guaranties.Guarantee }
         * 
         * 
         */
        public List<ZfcsBankGuaranteeOtherBankNoticeType.Guaranties.Guarantee> getGuarantee() {
            if (guarantee == null) {
                guarantee = new ArrayList<ZfcsBankGuaranteeOtherBankNoticeType.Guaranties.Guarantee>();
            }
            return this.guarantee;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeInfoType">
         *       &lt;sequence>
         *         &lt;element name="supplierInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeParticipantType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "supplierInfo"
        })
        public static class Guarantee
            extends ZfcsBankGuaranteeInfoType
        {

            protected ZfcsBankGuaranteeParticipantType supplierInfo;

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

        }

    }

}

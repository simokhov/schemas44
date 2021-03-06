//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
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
 * Информация по групповой жалобе
 * 
 * <p>Java class for zfcs_complaintGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_complaintGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
 *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *                   &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
 *                   &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
 *                   &lt;element name="planDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="decisionPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="registrationKO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
 *                   &lt;element name="considerationKO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="regType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaint.regType"/>
 *                   &lt;element name="notice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_noticeDetailsType" minOccurs="0"/>
 *                   &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPhoneType" minOccurs="0"/>
 *                   &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintModificationType" minOccurs="0"/>
 *                   &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCommonInfoPrintFormType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="indicted" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType"/>
 *                   &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;element name="EPSpecial_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="text" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="complaintGroupItems" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemComplaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
 *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
 *                   &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="notice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_noticeDetailsType" minOccurs="0"/>
 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType" minOccurs="0"/>
 *                   &lt;element name="applicant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantType" minOccurs="0"/>
 *                   &lt;element name="applicantNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantNewType" minOccurs="0"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
 *                     &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
 *                   &lt;/choice>
 *                   &lt;element name="returnInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintReturnInfoType" minOccurs="0"/>
 *                   &lt;element name="cancelInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCancelPrintFormType" minOccurs="0"/>
 *                   &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
 *         &lt;element name="returnInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintReturnInfoType" minOccurs="0"/>
 *         &lt;element name="cancelInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCancelPrintFormType" minOccurs="0"/>
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
@XmlType(name = "zfcs_complaintGroupType", propOrder = {
    "commonInfo",
    "indicted",
    "text",
    "complaintGroupItems",
    "printForm",
    "extPrintForm",
    "attachments",
    "returnInfo",
    "cancelInfo"
})
public class ZfcsComplaintGroupType {

    @XmlElement(required = true)
    protected ZfcsComplaintGroupType.CommonInfo commonInfo;
    @XmlElement(required = true)
    protected List<ZfcsComplaintGroupType.Indicted> indicted;
    protected String text;
    @XmlElement(required = true)
    protected List<ZfcsComplaintGroupType.ComplaintGroupItems> complaintGroupItems;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(required = true)
    protected ZfcsControlRegistersAttachmentListType attachments;
    protected ZfcsComplaintReturnInfoType returnInfo;
    protected ZfcsComplaintCancelPrintFormType cancelInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintGroupType.CommonInfo }
     *     
     */
    public ZfcsComplaintGroupType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintGroupType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsComplaintGroupType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the indicted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsComplaintGroupType.Indicted }
     * 
     * 
     */
    public List<ZfcsComplaintGroupType.Indicted> getIndicted() {
        if (indicted == null) {
            indicted = new ArrayList<ZfcsComplaintGroupType.Indicted>();
        }
        return this.indicted;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the complaintGroupItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complaintGroupItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplaintGroupItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsComplaintGroupType.ComplaintGroupItems }
     * 
     * 
     */
    public List<ZfcsComplaintGroupType.ComplaintGroupItems> getComplaintGroupItems() {
        if (complaintGroupItems == null) {
            complaintGroupItems = new ArrayList<ZfcsComplaintGroupType.ComplaintGroupItems>();
        }
        return this.complaintGroupItems;
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
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public ZfcsControlRegistersAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControlRegistersAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsControlRegistersAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the returnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintReturnInfoType }
     *     
     */
    public ZfcsComplaintReturnInfoType getReturnInfo() {
        return returnInfo;
    }

    /**
     * Sets the value of the returnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintReturnInfoType }
     *     
     */
    public void setReturnInfo(ZfcsComplaintReturnInfoType value) {
        this.returnInfo = value;
    }

    /**
     * Gets the value of the cancelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintCancelPrintFormType }
     *     
     */
    public ZfcsComplaintCancelPrintFormType getCancelInfo() {
        return cancelInfo;
    }

    /**
     * Sets the value of the cancelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintCancelPrintFormType }
     *     
     */
    public void setCancelInfo(ZfcsComplaintCancelPrintFormType value) {
        this.cancelInfo = value;
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
     *         &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
     *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
     *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
     *         &lt;element name="planDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="decisionPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="registrationKO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
     *         &lt;element name="considerationKO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="regType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaint.regType"/>
     *         &lt;element name="notice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_noticeDetailsType" minOccurs="0"/>
     *         &lt;element name="contactPhone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPhoneType" minOccurs="0"/>
     *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintModificationType" minOccurs="0"/>
     *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCommonInfoPrintFormType" minOccurs="0"/>
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
        "complaintNumber",
        "regNumber",
        "docNumber",
        "versionNumber",
        "planDecisionDate",
        "decisionPlace",
        "registrationKO",
        "considerationKO",
        "regType",
        "notice",
        "contactPhone",
        "modification",
        "printFormInfo"
    })
    public static class CommonInfo {

        protected String complaintNumber;
        protected String regNumber;
        protected String docNumber;
        protected Integer versionNumber;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar planDecisionDate;
        protected String decisionPlace;
        protected ZfcsOrganizationRef registrationKO;
        @XmlElement(required = true)
        protected ZfcsOrganizationRef considerationKO;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsComplaintRegType regType;
        protected ZfcsNoticeDetailsType notice;
        protected String contactPhone;
        protected ZfcsComplaintModificationType modification;
        protected ZfcsComplaintCommonInfoPrintFormType printFormInfo;

        /**
         * Gets the value of the complaintNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComplaintNumber() {
            return complaintNumber;
        }

        /**
         * Sets the value of the complaintNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComplaintNumber(String value) {
            this.complaintNumber = value;
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
         * Gets the value of the planDecisionDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPlanDecisionDate() {
            return planDecisionDate;
        }

        /**
         * Sets the value of the planDecisionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPlanDecisionDate(XMLGregorianCalendar value) {
            this.planDecisionDate = value;
        }

        /**
         * Gets the value of the decisionPlace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDecisionPlace() {
            return decisionPlace;
        }

        /**
         * Sets the value of the decisionPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDecisionPlace(String value) {
            this.decisionPlace = value;
        }

        /**
         * Gets the value of the registrationKO property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getRegistrationKO() {
            return registrationKO;
        }

        /**
         * Sets the value of the registrationKO property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setRegistrationKO(ZfcsOrganizationRef value) {
            this.registrationKO = value;
        }

        /**
         * Gets the value of the considerationKO property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getConsiderationKO() {
            return considerationKO;
        }

        /**
         * Sets the value of the considerationKO property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setConsiderationKO(ZfcsOrganizationRef value) {
            this.considerationKO = value;
        }

        /**
         * Gets the value of the regType property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintRegType }
         *     
         */
        public ZfcsComplaintRegType getRegType() {
            return regType;
        }

        /**
         * Sets the value of the regType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintRegType }
         *     
         */
        public void setRegType(ZfcsComplaintRegType value) {
            this.regType = value;
        }

        /**
         * Gets the value of the notice property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNoticeDetailsType }
         *     
         */
        public ZfcsNoticeDetailsType getNotice() {
            return notice;
        }

        /**
         * Sets the value of the notice property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNoticeDetailsType }
         *     
         */
        public void setNotice(ZfcsNoticeDetailsType value) {
            this.notice = value;
        }

        /**
         * Gets the value of the contactPhone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactPhone() {
            return contactPhone;
        }

        /**
         * Sets the value of the contactPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactPhone(String value) {
            this.contactPhone = value;
        }

        /**
         * Gets the value of the modification property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintModificationType }
         *     
         */
        public ZfcsComplaintModificationType getModification() {
            return modification;
        }

        /**
         * Sets the value of the modification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintModificationType }
         *     
         */
        public void setModification(ZfcsComplaintModificationType value) {
            this.modification = value;
        }

        /**
         * Gets the value of the printFormInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintCommonInfoPrintFormType }
         *     
         */
        public ZfcsComplaintCommonInfoPrintFormType getPrintFormInfo() {
            return printFormInfo;
        }

        /**
         * Sets the value of the printFormInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintCommonInfoPrintFormType }
         *     
         */
        public void setPrintFormInfo(ZfcsComplaintCommonInfoPrintFormType value) {
            this.printFormInfo = value;
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
     *         &lt;element name="itemComplaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType" minOccurs="0"/>
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersDocNumberType" minOccurs="0"/>
     *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="notice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_noticeDetailsType" minOccurs="0"/>
     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/base/1}ikzCodeType" minOccurs="0"/>
     *         &lt;element name="applicant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantType" minOccurs="0"/>
     *         &lt;element name="applicantNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantNewType" minOccurs="0"/>
     *         &lt;choice minOccurs="0">
     *           &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
     *           &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
     *         &lt;/choice>
     *         &lt;element name="returnInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintReturnInfoType" minOccurs="0"/>
     *         &lt;element name="cancelInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCancelPrintFormType" minOccurs="0"/>
     *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType"/>
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
        "itemComplaintNumber",
        "regNumber",
        "regDate",
        "notice",
        "purchaseCode",
        "applicant",
        "applicantNew",
        "order",
        "purchase",
        "returnInfo",
        "cancelInfo",
        "attachments"
    })
    public static class ComplaintGroupItems {

        protected String itemComplaintNumber;
        protected String regNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar regDate;
        protected ZfcsNoticeDetailsType notice;
        protected String purchaseCode;
        protected ZfcsApplicantType applicant;
        protected ZfcsApplicantNewType applicantNew;
        protected ZfcsComplaintOrderType order;
        protected ZfcsComplaintPurchaseType purchase;
        protected ZfcsComplaintReturnInfoType returnInfo;
        protected ZfcsComplaintCancelPrintFormType cancelInfo;
        @XmlElement(required = true)
        protected ZfcsControlRegistersAttachmentListType attachments;

        /**
         * Gets the value of the itemComplaintNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemComplaintNumber() {
            return itemComplaintNumber;
        }

        /**
         * Sets the value of the itemComplaintNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemComplaintNumber(String value) {
            this.itemComplaintNumber = value;
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
         * Gets the value of the regDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegDate() {
            return regDate;
        }

        /**
         * Sets the value of the regDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegDate(XMLGregorianCalendar value) {
            this.regDate = value;
        }

        /**
         * Gets the value of the notice property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNoticeDetailsType }
         *     
         */
        public ZfcsNoticeDetailsType getNotice() {
            return notice;
        }

        /**
         * Sets the value of the notice property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNoticeDetailsType }
         *     
         */
        public void setNotice(ZfcsNoticeDetailsType value) {
            this.notice = value;
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
         * Gets the value of the applicant property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsApplicantType }
         *     
         */
        public ZfcsApplicantType getApplicant() {
            return applicant;
        }

        /**
         * Sets the value of the applicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsApplicantType }
         *     
         */
        public void setApplicant(ZfcsApplicantType value) {
            this.applicant = value;
        }

        /**
         * Gets the value of the applicantNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsApplicantNewType }
         *     
         */
        public ZfcsApplicantNewType getApplicantNew() {
            return applicantNew;
        }

        /**
         * Sets the value of the applicantNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsApplicantNewType }
         *     
         */
        public void setApplicantNew(ZfcsApplicantNewType value) {
            this.applicantNew = value;
        }

        /**
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintOrderType }
         *     
         */
        public ZfcsComplaintOrderType getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintOrderType }
         *     
         */
        public void setOrder(ZfcsComplaintOrderType value) {
            this.order = value;
        }

        /**
         * Gets the value of the purchase property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintPurchaseType }
         *     
         */
        public ZfcsComplaintPurchaseType getPurchase() {
            return purchase;
        }

        /**
         * Sets the value of the purchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintPurchaseType }
         *     
         */
        public void setPurchase(ZfcsComplaintPurchaseType value) {
            this.purchase = value;
        }

        /**
         * Gets the value of the returnInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintReturnInfoType }
         *     
         */
        public ZfcsComplaintReturnInfoType getReturnInfo() {
            return returnInfo;
        }

        /**
         * Sets the value of the returnInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintReturnInfoType }
         *     
         */
        public void setReturnInfo(ZfcsComplaintReturnInfoType value) {
            this.returnInfo = value;
        }

        /**
         * Gets the value of the cancelInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintCancelPrintFormType }
         *     
         */
        public ZfcsComplaintCancelPrintFormType getCancelInfo() {
            return cancelInfo;
        }

        /**
         * Sets the value of the cancelInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintCancelPrintFormType }
         *     
         */
        public void setCancelInfo(ZfcsComplaintCancelPrintFormType value) {
            this.cancelInfo = value;
        }

        /**
         * Gets the value of the attachments property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsControlRegistersAttachmentListType }
         *     
         */
        public ZfcsControlRegistersAttachmentListType getAttachments() {
            return attachments;
        }

        /**
         * Sets the value of the attachments property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsControlRegistersAttachmentListType }
         *     
         */
        public void setAttachments(ZfcsControlRegistersAttachmentListType value) {
            this.attachments = value;
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
     *       &lt;choice>
     *         &lt;element name="EP_failure" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType"/>
     *         &lt;element name="EP_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;element name="EPSpecial_failureNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "epFailure",
        "epFailureNew",
        "epSpecialFailureNew"
    })
    public static class Indicted {

        @XmlElement(name = "EP_failure")
        protected ZfcsOrganizationInfoType epFailure;
        @XmlElement(name = "EP_failureNew")
        protected ZfcsOrganizationControlRegistersRef epFailureNew;
        @XmlElement(name = "EPSpecial_failureNew")
        protected ZfcsOrganizationControlRegistersRef epSpecialFailureNew;

        /**
         * Gets the value of the epFailure property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationInfoType }
         *     
         */
        public ZfcsOrganizationInfoType getEPFailure() {
            return epFailure;
        }

        /**
         * Sets the value of the epFailure property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationInfoType }
         *     
         */
        public void setEPFailure(ZfcsOrganizationInfoType value) {
            this.epFailure = value;
        }

        /**
         * Gets the value of the epFailureNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getEPFailureNew() {
            return epFailureNew;
        }

        /**
         * Sets the value of the epFailureNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setEPFailureNew(ZfcsOrganizationControlRegistersRef value) {
            this.epFailureNew = value;
        }

        /**
         * Gets the value of the epSpecialFailureNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getEPSpecialFailureNew() {
            return epSpecialFailureNew;
        }

        /**
         * Sets the value of the epSpecialFailureNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setEPSpecialFailureNew(ZfcsOrganizationControlRegistersRef value) {
            this.epSpecialFailureNew = value;
        }

    }

}

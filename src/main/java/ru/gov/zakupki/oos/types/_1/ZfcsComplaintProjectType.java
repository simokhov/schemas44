//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:00:11 PM MSK 
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
 * Проект информации по жалобе
 * 
 * <p>Java class for zfcs_complaintProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_complaintProjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType"/>
 *                   &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="planDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="decisionPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="registrationKO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
 *                   &lt;element name="considerationKO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="regType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaint.regType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="indicted" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintProjectSubjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantType"/>
 *         &lt;element name="object" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintObjectType"/>
 *         &lt;element name="text" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
 *         &lt;element name="returnInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintReturnInfoType" minOccurs="0"/>
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
@XmlType(name = "zfcs_complaintProjectType", propOrder = {
    "id",
    "externalId",
    "commonInfo",
    "indicted",
    "applicant",
    "object",
    "text",
    "printForm",
    "extPrintForm",
    "attachments",
    "returnInfo"
})
public class ZfcsComplaintProjectType {

    protected Long id;
    protected String externalId;
    @XmlElement(required = true)
    protected ZfcsComplaintProjectType.CommonInfo commonInfo;
    protected List<ZfcsComplaintProjectSubjectType> indicted;
    @XmlElement(required = true)
    protected ZfcsApplicantType applicant;
    @XmlElement(required = true)
    protected ZfcsComplaintObjectType object;
    @XmlElement(required = true)
    protected String text;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlElement(required = true)
    protected ZfcsAttachmentListType attachments;
    protected ZfcsComplaintReturnInfoType returnInfo;
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
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintProjectType.CommonInfo }
     *     
     */
    public ZfcsComplaintProjectType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintProjectType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsComplaintProjectType.CommonInfo value) {
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
     * {@link ZfcsComplaintProjectSubjectType }
     * 
     * 
     */
    public List<ZfcsComplaintProjectSubjectType> getIndicted() {
        if (indicted == null) {
            indicted = new ArrayList<ZfcsComplaintProjectSubjectType>();
        }
        return this.indicted;
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
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintObjectType }
     *     
     */
    public ZfcsComplaintObjectType getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintObjectType }
     *     
     */
    public void setObject(ZfcsComplaintObjectType value) {
        this.object = value;
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
     *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="complaintNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintNumberType"/>
     *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="planDecisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="decisionPlace" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="registrationKO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
     *         &lt;element name="considerationKO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="regType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaint.regType"/>
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
        "regDate",
        "complaintNumber",
        "versionNumber",
        "planDecisionDate",
        "decisionPlace",
        "registrationKO",
        "considerationKO",
        "regType"
    })
    public static class CommonInfo {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar regDate;
        @XmlElement(required = true)
        protected String complaintNumber;
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

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:49:49 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация по жалобе
 * 
 * <p>Java class for zfcs_complaintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_complaintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintCommonInfoType"/>
 *         &lt;element name="indicted" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintSubjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicant" type="{http://zakupki.gov.ru/oos/types/1}zfcs_applicantType"/>
 *         &lt;element name="object" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintObjectType" minOccurs="0"/>
 *         &lt;element name="text">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
 *         &lt;element name="returnInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="base">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
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
@XmlType(name = "zfcs_complaintType", propOrder = {
    "commonInfo",
    "indicted",
    "applicant",
    "object",
    "text",
    "printForm",
    "attachments",
    "returnInfo"
})
public class ZfcsComplaintType {

    @XmlElement(required = true)
    protected ZfcsComplaintCommonInfoType commonInfo;
    protected List<ZfcsComplaintSubjectType> indicted;
    @XmlElement(required = true)
    protected ZfcsApplicantType applicant;
    protected ZfcsComplaintObjectType object;
    @XmlElement(required = true)
    protected String text;
    protected ZfcsPrintFormType printForm;
    @XmlElement(required = true)
    protected ZfcsAttachmentListType attachments;
    protected ZfcsComplaintType.ReturnInfo returnInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintCommonInfoType }
     *     
     */
    public ZfcsComplaintCommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintCommonInfoType }
     *     
     */
    public void setCommonInfo(ZfcsComplaintCommonInfoType value) {
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
     * {@link ZfcsComplaintSubjectType }
     * 
     * 
     */
    public List<ZfcsComplaintSubjectType> getIndicted() {
        if (indicted == null) {
            indicted = new ArrayList<ZfcsComplaintSubjectType>();
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
     *     {@link ZfcsComplaintType.ReturnInfo }
     *     
     */
    public ZfcsComplaintType.ReturnInfo getReturnInfo() {
        return returnInfo;
    }

    /**
     * Sets the value of the returnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintType.ReturnInfo }
     *     
     */
    public void setReturnInfo(ZfcsComplaintType.ReturnInfo value) {
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
     *         &lt;element name="base">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
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
        "base",
        "attachments"
    })
    public static class ReturnInfo {

        @XmlElement(required = true)
        protected String base;
        @XmlElement(required = true)
        protected ZfcsAttachmentListType attachments;

        /**
         * Gets the value of the base property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBase() {
            return base;
        }

        /**
         * Sets the value of the base property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBase(String value) {
            this.base = value;
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

    }

}

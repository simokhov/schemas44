//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
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
 * Информация об отмене результата контроля
 * 
 * <p>Java class for zfcs_checkResultCancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkResultCancelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultCancelCommonInfoType"/>
 *         &lt;element name="cancelType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultCancel.cancelType"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="base">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="unplannedCheckComplaint" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultUnplannedCheckComplaintType"/>
 *                     &lt;element name="unplannedCheck" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultUnplannedCheckType"/>
 *                     &lt;element name="plannedCheck" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPlannedCheckType"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="complaint" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultComplaintType"/>
 *         &lt;/choice>
 *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="documentName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersAttachmentListType" minOccurs="0"/>
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
@XmlType(name = "zfcs_checkResultCancelType", propOrder = {
    "commonInfo",
    "cancelType",
    "base",
    "complaint",
    "info",
    "documentName",
    "documentDate",
    "printForm",
    "extPrintForm",
    "attachments"
})
public class ZfcsCheckResultCancelType {

    @XmlElement(required = true)
    protected ZfcsCheckResultCancelCommonInfoType commonInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsCheckResultCancelCancelType cancelType;
    protected ZfcsCheckResultCancelType.Base base;
    protected ZfcsCheckResultComplaintType complaint;
    protected String info;
    protected String documentName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;
    protected ZfcsControlRegistersAttachmentListType attachments;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultCancelCommonInfoType }
     *     
     */
    public ZfcsCheckResultCancelCommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultCancelCommonInfoType }
     *     
     */
    public void setCommonInfo(ZfcsCheckResultCancelCommonInfoType value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the cancelType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultCancelCancelType }
     *     
     */
    public ZfcsCheckResultCancelCancelType getCancelType() {
        return cancelType;
    }

    /**
     * Sets the value of the cancelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultCancelCancelType }
     *     
     */
    public void setCancelType(ZfcsCheckResultCancelCancelType value) {
        this.cancelType = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultCancelType.Base }
     *     
     */
    public ZfcsCheckResultCancelType.Base getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultCancelType.Base }
     *     
     */
    public void setBase(ZfcsCheckResultCancelType.Base value) {
        this.base = value;
    }

    /**
     * Gets the value of the complaint property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultComplaintType }
     *     
     */
    public ZfcsCheckResultComplaintType getComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultComplaintType }
     *     
     */
    public void setComplaint(ZfcsCheckResultComplaintType value) {
        this.complaint = value;
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
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
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
     *       &lt;choice>
     *         &lt;element name="unplannedCheckComplaint" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultUnplannedCheckComplaintType"/>
     *         &lt;element name="unplannedCheck" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultUnplannedCheckType"/>
     *         &lt;element name="plannedCheck" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPlannedCheckType"/>
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
        "unplannedCheckComplaint",
        "unplannedCheck",
        "plannedCheck"
    })
    public static class Base {

        protected ZfcsCheckResultUnplannedCheckComplaintType unplannedCheckComplaint;
        protected ZfcsCheckResultUnplannedCheckType unplannedCheck;
        protected ZfcsCheckResultPlannedCheckType plannedCheck;

        /**
         * Gets the value of the unplannedCheckComplaint property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultUnplannedCheckComplaintType }
         *     
         */
        public ZfcsCheckResultUnplannedCheckComplaintType getUnplannedCheckComplaint() {
            return unplannedCheckComplaint;
        }

        /**
         * Sets the value of the unplannedCheckComplaint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultUnplannedCheckComplaintType }
         *     
         */
        public void setUnplannedCheckComplaint(ZfcsCheckResultUnplannedCheckComplaintType value) {
            this.unplannedCheckComplaint = value;
        }

        /**
         * Gets the value of the unplannedCheck property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultUnplannedCheckType }
         *     
         */
        public ZfcsCheckResultUnplannedCheckType getUnplannedCheck() {
            return unplannedCheck;
        }

        /**
         * Sets the value of the unplannedCheck property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultUnplannedCheckType }
         *     
         */
        public void setUnplannedCheck(ZfcsCheckResultUnplannedCheckType value) {
            this.unplannedCheck = value;
        }

        /**
         * Gets the value of the plannedCheck property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsCheckResultPlannedCheckType }
         *     
         */
        public ZfcsCheckResultPlannedCheckType getPlannedCheck() {
            return plannedCheck;
        }

        /**
         * Sets the value of the plannedCheck property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsCheckResultPlannedCheckType }
         *     
         */
        public void setPlannedCheck(ZfcsCheckResultPlannedCheckType value) {
            this.plannedCheck = value;
        }

    }

}

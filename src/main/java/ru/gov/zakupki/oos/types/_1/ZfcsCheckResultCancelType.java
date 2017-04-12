//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:55:40 AM MSK 
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
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
 *                   &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cancelType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultCancel.cancelType"/>
 *         &lt;element name="info" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="documentName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
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
@XmlType(name = "zfcs_checkResultCancelType", propOrder = {
    "commonInfo",
    "cancelType",
    "info",
    "documentName",
    "documentDate",
    "printForm",
    "attachments"
})
public class ZfcsCheckResultCancelType {

    @XmlElement(required = true)
    protected ZfcsCheckResultCancelType.CommonInfo commonInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsCheckResultCancelCancelType cancelType;
    protected String info;
    protected String documentName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    protected ZfcsPrintFormType printForm;
    protected ZfcsAttachmentListType attachments;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultCancelType.CommonInfo }
     *     
     */
    public ZfcsCheckResultCancelType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultCancelType.CommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsCheckResultCancelType.CommonInfo value) {
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
     *         &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
     *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="owner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
        "checkResultNumber",
        "createDate",
        "publishDate",
        "owner"
    })
    public static class CommonInfo {

        @XmlElement(required = true)
        protected String checkResultNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar publishDate;
        @XmlElement(required = true)
        protected ZfcsOrganizationRef owner;

        /**
         * Gets the value of the checkResultNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckResultNumber() {
            return checkResultNumber;
        }

        /**
         * Sets the value of the checkResultNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckResultNumber(String value) {
            this.checkResultNumber = value;
        }

        /**
         * Gets the value of the createDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateDate() {
            return createDate;
        }

        /**
         * Sets the value of the createDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateDate(XMLGregorianCalendar value) {
            this.createDate = value;
        }

        /**
         * Gets the value of the publishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPublishDate() {
            return publishDate;
        }

        /**
         * Sets the value of the publishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPublishDate(XMLGregorianCalendar value) {
            this.publishDate = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOwner(ZfcsOrganizationRef value) {
            this.owner = value;
        }

    }

}

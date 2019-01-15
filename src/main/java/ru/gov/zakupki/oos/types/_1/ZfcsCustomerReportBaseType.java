//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.base._1.SignatureType;


/**
 * Общая информация отчета заказчика и недействительности
 * 
 * <p>Java class for zfcs_customerReportBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_revisionNumType" minOccurs="0"/>
 *         &lt;element name="publishOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoWithOgrnType"/>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/base/1}hrefType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attachment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;sequence>
 *                               &lt;element name="publishedContentId" type="{http://zakupki.gov.ru/oos/base/1}guidType" minOccurs="0"/>
 *                               &lt;element name="fileName">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;maxLength value="1024"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="fileSize" minOccurs="0">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;maxLength value="40"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="docDescription" minOccurs="0">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;maxLength value="1024"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                               &lt;choice>
 *                                 &lt;element name="url">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;maxLength value="1024"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="contentId" type="{http://zakupki.gov.ru/oos/base/1}guidType"/>
 *                                 &lt;element name="content">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                                       &lt;minLength value="1"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                               &lt;/choice>
 *                               &lt;element name="cryptoSigns" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="signature" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;simpleContent>
 *                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                                                 &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/base/1}signatureType" />
 *                                               &lt;/extension>
 *                                             &lt;/simpleContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;element name="notPublishedOnEIS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "zfcs_customerReportBaseType", propOrder = {
    "id",
    "externalId",
    "docDate",
    "docPublishDate",
    "versionNumber",
    "publishOrg",
    "href",
    "printForm",
    "extPrintForm",
    "attachments"
})
@XmlSeeAlso({
    ZfcsCustomerReportInvalidType.class,
    ZfcsCustomerReportType.class
})
public class ZfcsCustomerReportBaseType {

    protected Long id;
    protected String externalId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    protected String versionNumber;
    @XmlElement(required = true)
    protected ZfcsOrganizationInfoWithOgrnType publishOrg;
    protected String href;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType extPrintForm;
    protected ZfcsCustomerReportBaseType.Attachments attachments;
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
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
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
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the publishOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoWithOgrnType }
     *     
     */
    public ZfcsOrganizationInfoWithOgrnType getPublishOrg() {
        return publishOrg;
    }

    /**
     * Sets the value of the publishOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoWithOgrnType }
     *     
     */
    public void setPublishOrg(ZfcsOrganizationInfoWithOgrnType value) {
        this.publishOrg = value;
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
     *     {@link ZfcsCustomerReportBaseType.Attachments }
     *     
     */
    public ZfcsCustomerReportBaseType.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBaseType.Attachments }
     *     
     */
    public void setAttachments(ZfcsCustomerReportBaseType.Attachments value) {
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
     *         &lt;element name="attachment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;sequence>
     *                     &lt;element name="publishedContentId" type="{http://zakupki.gov.ru/oos/base/1}guidType" minOccurs="0"/>
     *                     &lt;element name="fileName">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="1024"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="fileSize" minOccurs="0">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="40"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="docDescription" minOccurs="0">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="1024"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                     &lt;choice>
     *                       &lt;element name="url">
     *                         &lt;simpleType>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                             &lt;maxLength value="1024"/>
     *                           &lt;/restriction>
     *                         &lt;/simpleType>
     *                       &lt;/element>
     *                       &lt;element name="contentId" type="{http://zakupki.gov.ru/oos/base/1}guidType"/>
     *                       &lt;element name="content">
     *                         &lt;simpleType>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
     *                             &lt;minLength value="1"/>
     *                           &lt;/restriction>
     *                         &lt;/simpleType>
     *                       &lt;/element>
     *                     &lt;/choice>
     *                     &lt;element name="cryptoSigns" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="signature" maxOccurs="unbounded">
     *                                 &lt;complexType>
     *                                   &lt;simpleContent>
     *                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *                                       &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/base/1}signatureType" />
     *                                     &lt;/extension>
     *                                   &lt;/simpleContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                   &lt;element name="notPublishedOnEIS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/choice>
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
        "attachment"
    })
    public static class Attachments {

        @XmlElement(required = true)
        protected List<ZfcsCustomerReportBaseType.Attachments.Attachment> attachment;

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsCustomerReportBaseType.Attachments.Attachment }
         * 
         * 
         */
        public List<ZfcsCustomerReportBaseType.Attachments.Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<ZfcsCustomerReportBaseType.Attachments.Attachment>();
            }
            return this.attachment;
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
         *         &lt;sequence>
         *           &lt;element name="publishedContentId" type="{http://zakupki.gov.ru/oos/base/1}guidType" minOccurs="0"/>
         *           &lt;element name="fileName">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                 &lt;maxLength value="1024"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="fileSize" minOccurs="0">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                 &lt;maxLength value="40"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="docDescription" minOccurs="0">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                 &lt;maxLength value="1024"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *           &lt;choice>
         *             &lt;element name="url">
         *               &lt;simpleType>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                   &lt;maxLength value="1024"/>
         *                 &lt;/restriction>
         *               &lt;/simpleType>
         *             &lt;/element>
         *             &lt;element name="contentId" type="{http://zakupki.gov.ru/oos/base/1}guidType"/>
         *             &lt;element name="content">
         *               &lt;simpleType>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
         *                   &lt;minLength value="1"/>
         *                 &lt;/restriction>
         *               &lt;/simpleType>
         *             &lt;/element>
         *           &lt;/choice>
         *           &lt;element name="cryptoSigns" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="signature" maxOccurs="unbounded">
         *                       &lt;complexType>
         *                         &lt;simpleContent>
         *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
         *                             &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/base/1}signatureType" />
         *                           &lt;/extension>
         *                         &lt;/simpleContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/sequence>
         *         &lt;element name="notPublishedOnEIS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "publishedContentId",
            "fileName",
            "fileSize",
            "docDescription",
            "docDate",
            "url",
            "contentId",
            "content",
            "cryptoSigns",
            "notPublishedOnEIS"
        })
        public static class Attachment {

            protected String publishedContentId;
            protected String fileName;
            protected String fileSize;
            protected String docDescription;
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar docDate;
            protected String url;
            protected String contentId;
            protected byte[] content;
            protected ZfcsCustomerReportBaseType.Attachments.Attachment.CryptoSigns cryptoSigns;
            protected Boolean notPublishedOnEIS;

            /**
             * Gets the value of the publishedContentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPublishedContentId() {
                return publishedContentId;
            }

            /**
             * Sets the value of the publishedContentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPublishedContentId(String value) {
                this.publishedContentId = value;
            }

            /**
             * Gets the value of the fileName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFileName() {
                return fileName;
            }

            /**
             * Sets the value of the fileName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFileName(String value) {
                this.fileName = value;
            }

            /**
             * Gets the value of the fileSize property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFileSize() {
                return fileSize;
            }

            /**
             * Sets the value of the fileSize property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFileSize(String value) {
                this.fileSize = value;
            }

            /**
             * Gets the value of the docDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocDescription() {
                return docDescription;
            }

            /**
             * Sets the value of the docDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocDescription(String value) {
                this.docDescription = value;
            }

            /**
             * Gets the value of the docDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDocDate() {
                return docDate;
            }

            /**
             * Sets the value of the docDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDocDate(XMLGregorianCalendar value) {
                this.docDate = value;
            }

            /**
             * Gets the value of the url property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * Sets the value of the url property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

            /**
             * Gets the value of the contentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContentId() {
                return contentId;
            }

            /**
             * Sets the value of the contentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContentId(String value) {
                this.contentId = value;
            }

            /**
             * Gets the value of the content property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getContent() {
                return content;
            }

            /**
             * Sets the value of the content property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setContent(byte[] value) {
                this.content = value;
            }

            /**
             * Gets the value of the cryptoSigns property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsCustomerReportBaseType.Attachments.Attachment.CryptoSigns }
             *     
             */
            public ZfcsCustomerReportBaseType.Attachments.Attachment.CryptoSigns getCryptoSigns() {
                return cryptoSigns;
            }

            /**
             * Sets the value of the cryptoSigns property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsCustomerReportBaseType.Attachments.Attachment.CryptoSigns }
             *     
             */
            public void setCryptoSigns(ZfcsCustomerReportBaseType.Attachments.Attachment.CryptoSigns value) {
                this.cryptoSigns = value;
            }

            /**
             * Gets the value of the notPublishedOnEIS property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNotPublishedOnEIS() {
                return notPublishedOnEIS;
            }

            /**
             * Sets the value of the notPublishedOnEIS property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNotPublishedOnEIS(Boolean value) {
                this.notPublishedOnEIS = value;
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
             *         &lt;element name="signature" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
             *                 &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/base/1}signatureType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "signature"
            })
            public static class CryptoSigns {

                @XmlElement(required = true)
                protected List<ZfcsCustomerReportBaseType.Attachments.Attachment.CryptoSigns.Signature> signature;

                /**
                 * Gets the value of the signature property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the signature property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSignature().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ZfcsCustomerReportBaseType.Attachments.Attachment.CryptoSigns.Signature }
                 * 
                 * 
                 */
                public List<ZfcsCustomerReportBaseType.Attachments.Attachment.CryptoSigns.Signature> getSignature() {
                    if (signature == null) {
                        signature = new ArrayList<ZfcsCustomerReportBaseType.Attachments.Attachment.CryptoSigns.Signature>();
                    }
                    return this.signature;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
                 *       &lt;attribute name="type" type="{http://zakupki.gov.ru/oos/base/1}signatureType" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Signature {

                    @XmlValue
                    protected byte[] value;
                    @XmlAttribute(name = "type")
                    protected SignatureType type;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     byte[]
                     */
                    public byte[] getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     byte[]
                     */
                    public void setValue(byte[] value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SignatureType }
                     *     
                     */
                    public SignatureType getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SignatureType }
                     *     
                     */
                    public void setType(SignatureType value) {
                        this.type = value;
                    }

                }

            }

        }

    }

}

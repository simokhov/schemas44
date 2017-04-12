//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:58:14 AM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.types._1.ZfcsAttachmentListType;


/**
 * Информация о проведении обязательного общественного обсуждения закупок для обеспечения нужд субъектов РФ и муниципальных нужд
 * 
 * <p>Java class for zfcs_publicDiscussionRegionMunicipalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionRegionMunicipalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="registryNum" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_registryNumType"/>
 *         &lt;element name="revisionNumber" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_revisionNumType"/>
 *         &lt;element name="publishOrg" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_organizationInfoType"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_organizationInfoType"/>
 *         &lt;element name="level" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_publicDiscussionLevelEnum"/>
 *         &lt;element name="document">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="publicDiscussion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
 *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="objectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="url" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="stages">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="stage" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                                       &lt;element name="period">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                                 &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="modificationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_publicDiscussionRegionMunicipalType", propOrder = {
    "publishDate",
    "registryNum",
    "revisionNumber",
    "publishOrg",
    "customer",
    "level",
    "document",
    "publicDiscussion",
    "attachments",
    "modificationReason"
})
public class ZfcsPublicDiscussionRegionMunicipalType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(required = true)
    protected String registryNum;
    @XmlElement(required = true)
    protected String revisionNumber;
    @XmlElement(required = true)
    protected ZfcsOrganizationInfoType publishOrg;
    @XmlElement(required = true)
    protected ZfcsOrganizationInfoType customer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsPublicDiscussionLevelEnum level;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionRegionMunicipalType.Document document;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion publicDiscussion;
    protected ZfcsAttachmentListType attachments;
    protected String modificationReason;

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
     * Gets the value of the registryNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNum() {
        return registryNum;
    }

    /**
     * Sets the value of the registryNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryNum(String value) {
        this.registryNum = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the publishOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public ZfcsOrganizationInfoType getPublishOrg() {
        return publishOrg;
    }

    /**
     * Sets the value of the publishOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public void setPublishOrg(ZfcsOrganizationInfoType value) {
        this.publishOrg = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public ZfcsOrganizationInfoType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public void setCustomer(ZfcsOrganizationInfoType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionLevelEnum }
     *     
     */
    public ZfcsPublicDiscussionLevelEnum getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionLevelEnum }
     *     
     */
    public void setLevel(ZfcsPublicDiscussionLevelEnum value) {
        this.level = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionRegionMunicipalType.Document }
     *     
     */
    public ZfcsPublicDiscussionRegionMunicipalType.Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionRegionMunicipalType.Document }
     *     
     */
    public void setDocument(ZfcsPublicDiscussionRegionMunicipalType.Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the publicDiscussion property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion }
     *     
     */
    public ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion getPublicDiscussion() {
        return publicDiscussion;
    }

    /**
     * Sets the value of the publicDiscussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion }
     *     
     */
    public void setPublicDiscussion(ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion value) {
        this.publicDiscussion = value;
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
     * Gets the value of the modificationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationReason() {
        return modificationReason;
    }

    /**
     * Sets the value of the modificationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationReason(String value) {
        this.modificationReason = value;
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
     *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "number",
        "date"
    })
    public static class Document {

        protected int name;
        @XmlElement(required = true)
        protected String number;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;

        /**
         * Gets the value of the name property.
         * 
         */
        public int getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         */
        public void setName(int value) {
            this.name = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
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
     *         &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
     *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="objectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="url" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="stages">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="stage" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                             &lt;element name="period">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                                       &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                           &lt;/sequence>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "number",
        "purchaseNumber",
        "lotNumber",
        "objectInfo",
        "url",
        "stages"
    })
    public static class PublicDiscussion {

        @XmlElement(required = true)
        protected String number;
        @XmlElement(required = true)
        protected String purchaseNumber;
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger lotNumber;
        @XmlElement(required = true)
        protected String objectInfo;
        @XmlElement(required = true)
        protected String url;
        @XmlElement(required = true)
        protected ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages stages;

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

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
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLotNumber() {
            return lotNumber;
        }

        /**
         * Sets the value of the lotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLotNumber(BigInteger value) {
            this.lotNumber = value;
        }

        /**
         * Gets the value of the objectInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectInfo() {
            return objectInfo;
        }

        /**
         * Sets the value of the objectInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectInfo(String value) {
            this.objectInfo = value;
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
         * Gets the value of the stages property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages }
         *     
         */
        public ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages getStages() {
            return stages;
        }

        /**
         * Sets the value of the stages property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages }
         *     
         */
        public void setStages(ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages value) {
            this.stages = value;
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
         *         &lt;element name="stage" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *                   &lt;element name="period">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
            "stage"
        })
        public static class Stages {

            @XmlElement(required = true)
            protected List<ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages.Stage> stage;

            /**
             * Gets the value of the stage property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stage property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStage().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages.Stage }
             * 
             * 
             */
            public List<ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages.Stage> getStage() {
                if (stage == null) {
                    stage = new ArrayList<ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages.Stage>();
                }
                return this.stage;
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
             *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
             *         &lt;element name="period">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="result" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
                "number",
                "period",
                "result"
            })
            public static class Stage {

                @XmlElement(required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger number;
                @XmlElement(required = true)
                protected ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages.Stage.Period period;
                @XmlElement(required = true)
                protected String result;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setNumber(BigInteger value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the period property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages.Stage.Period }
                 *     
                 */
                public ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages.Stage.Period getPeriod() {
                    return period;
                }

                /**
                 * Sets the value of the period property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages.Stage.Period }
                 *     
                 */
                public void setPeriod(ZfcsPublicDiscussionRegionMunicipalType.PublicDiscussion.Stages.Stage.Period value) {
                    this.period = value;
                }

                /**
                 * Gets the value of the result property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResult() {
                    return result;
                }

                /**
                 * Sets the value of the result property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResult(String value) {
                    this.result = value;
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
                 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
                 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
                    "startDate",
                    "endDate"
                })
                public static class Period {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar startDate;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "dateTime")
                    protected XMLGregorianCalendar endDate;

                    /**
                     * Gets the value of the startDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getStartDate() {
                        return startDate;
                    }

                    /**
                     * Sets the value of the startDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setStartDate(XMLGregorianCalendar value) {
                        this.startDate = value;
                    }

                    /**
                     * Gets the value of the endDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getEndDate() {
                        return endDate;
                    }

                    /**
                     * Sets the value of the endDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setEndDate(XMLGregorianCalendar value) {
                        this.endDate = value;
                    }

                }

            }

        }

    }

}
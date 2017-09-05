//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Уведомление об исключении информации и документов с официального сайта ЕИС
 * 
 * <p>Java class for zfcs_notificationExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_notificationExceptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="notificationNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationExceptionNumberType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="docPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="exceptionOrgInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationExceptionOrgType"/>
 *         &lt;element name="excludedInfoInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="excludedInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_excludedInfoTypeType"/>
 *                   &lt;element name="regNumber">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="firstVersionPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="lastVersionPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="placementOrgInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationExceptionOrgType">
 *                 &lt;sequence>
 *                   &lt;element name="organizationRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placementOrgRoleType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="excludedInfoBase">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="courtsDecision">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="courtsDecisionOrgName">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="federalAuthorityOrder">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="federalAuthorityOrderInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationExceptionOrgType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="baseExcludedDocInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="number" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="entryIntoForceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="addInfoText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="modificationInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="description">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_notificationExceptionType", propOrder = {
    "id",
    "notificationNumber",
    "versionNumber",
    "docDate",
    "docPublishDate",
    "exceptionOrgInfo",
    "excludedInfoInfo",
    "placementOrgInfo",
    "excludedInfoBase",
    "baseExcludedDocInfo",
    "entryIntoForceDate",
    "addInfoText",
    "modificationInfo",
    "printForm",
    "attachments"
})
public class ZfcsNotificationExceptionType {

    protected Long id;
    protected String notificationNumber;
    protected Integer versionNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docPublishDate;
    @XmlElement(required = true)
    protected ZfcsNotificationExceptionOrgType exceptionOrgInfo;
    @XmlElement(required = true)
    protected ZfcsNotificationExceptionType.ExcludedInfoInfo excludedInfoInfo;
    @XmlElement(required = true)
    protected ZfcsNotificationExceptionType.PlacementOrgInfo placementOrgInfo;
    @XmlElement(required = true)
    protected ZfcsNotificationExceptionType.ExcludedInfoBase excludedInfoBase;
    protected ZfcsNotificationExceptionType.BaseExcludedDocInfo baseExcludedDocInfo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryIntoForceDate;
    protected String addInfoText;
    protected ZfcsNotificationExceptionType.ModificationInfo modificationInfo;
    protected ZfcsPrintFormType printForm;
    protected ZfcsAttachmentListType attachments;

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
     * Gets the value of the notificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationNumber() {
        return notificationNumber;
    }

    /**
     * Sets the value of the notificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationNumber(String value) {
        this.notificationNumber = value;
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
     * Gets the value of the exceptionOrgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationExceptionOrgType }
     *     
     */
    public ZfcsNotificationExceptionOrgType getExceptionOrgInfo() {
        return exceptionOrgInfo;
    }

    /**
     * Sets the value of the exceptionOrgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationExceptionOrgType }
     *     
     */
    public void setExceptionOrgInfo(ZfcsNotificationExceptionOrgType value) {
        this.exceptionOrgInfo = value;
    }

    /**
     * Gets the value of the excludedInfoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationExceptionType.ExcludedInfoInfo }
     *     
     */
    public ZfcsNotificationExceptionType.ExcludedInfoInfo getExcludedInfoInfo() {
        return excludedInfoInfo;
    }

    /**
     * Sets the value of the excludedInfoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationExceptionType.ExcludedInfoInfo }
     *     
     */
    public void setExcludedInfoInfo(ZfcsNotificationExceptionType.ExcludedInfoInfo value) {
        this.excludedInfoInfo = value;
    }

    /**
     * Gets the value of the placementOrgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationExceptionType.PlacementOrgInfo }
     *     
     */
    public ZfcsNotificationExceptionType.PlacementOrgInfo getPlacementOrgInfo() {
        return placementOrgInfo;
    }

    /**
     * Sets the value of the placementOrgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationExceptionType.PlacementOrgInfo }
     *     
     */
    public void setPlacementOrgInfo(ZfcsNotificationExceptionType.PlacementOrgInfo value) {
        this.placementOrgInfo = value;
    }

    /**
     * Gets the value of the excludedInfoBase property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationExceptionType.ExcludedInfoBase }
     *     
     */
    public ZfcsNotificationExceptionType.ExcludedInfoBase getExcludedInfoBase() {
        return excludedInfoBase;
    }

    /**
     * Sets the value of the excludedInfoBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationExceptionType.ExcludedInfoBase }
     *     
     */
    public void setExcludedInfoBase(ZfcsNotificationExceptionType.ExcludedInfoBase value) {
        this.excludedInfoBase = value;
    }

    /**
     * Gets the value of the baseExcludedDocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationExceptionType.BaseExcludedDocInfo }
     *     
     */
    public ZfcsNotificationExceptionType.BaseExcludedDocInfo getBaseExcludedDocInfo() {
        return baseExcludedDocInfo;
    }

    /**
     * Sets the value of the baseExcludedDocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationExceptionType.BaseExcludedDocInfo }
     *     
     */
    public void setBaseExcludedDocInfo(ZfcsNotificationExceptionType.BaseExcludedDocInfo value) {
        this.baseExcludedDocInfo = value;
    }

    /**
     * Gets the value of the entryIntoForceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryIntoForceDate() {
        return entryIntoForceDate;
    }

    /**
     * Sets the value of the entryIntoForceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryIntoForceDate(XMLGregorianCalendar value) {
        this.entryIntoForceDate = value;
    }

    /**
     * Gets the value of the addInfoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfoText() {
        return addInfoText;
    }

    /**
     * Sets the value of the addInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfoText(String value) {
        this.addInfoText = value;
    }

    /**
     * Gets the value of the modificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationExceptionType.ModificationInfo }
     *     
     */
    public ZfcsNotificationExceptionType.ModificationInfo getModificationInfo() {
        return modificationInfo;
    }

    /**
     * Sets the value of the modificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationExceptionType.ModificationInfo }
     *     
     */
    public void setModificationInfo(ZfcsNotificationExceptionType.ModificationInfo value) {
        this.modificationInfo = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="number" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    public static class BaseExcludedDocInfo {

        protected String name;
        protected String number;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
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
     *       &lt;choice>
     *         &lt;element name="courtsDecision">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="courtsDecisionOrgName">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="federalAuthorityOrder">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="federalAuthorityOrderInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationExceptionOrgType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "courtsDecision",
        "federalAuthorityOrder"
    })
    public static class ExcludedInfoBase {

        protected ZfcsNotificationExceptionType.ExcludedInfoBase.CourtsDecision courtsDecision;
        protected ZfcsNotificationExceptionType.ExcludedInfoBase.FederalAuthorityOrder federalAuthorityOrder;

        /**
         * Gets the value of the courtsDecision property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNotificationExceptionType.ExcludedInfoBase.CourtsDecision }
         *     
         */
        public ZfcsNotificationExceptionType.ExcludedInfoBase.CourtsDecision getCourtsDecision() {
            return courtsDecision;
        }

        /**
         * Sets the value of the courtsDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNotificationExceptionType.ExcludedInfoBase.CourtsDecision }
         *     
         */
        public void setCourtsDecision(ZfcsNotificationExceptionType.ExcludedInfoBase.CourtsDecision value) {
            this.courtsDecision = value;
        }

        /**
         * Gets the value of the federalAuthorityOrder property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNotificationExceptionType.ExcludedInfoBase.FederalAuthorityOrder }
         *     
         */
        public ZfcsNotificationExceptionType.ExcludedInfoBase.FederalAuthorityOrder getFederalAuthorityOrder() {
            return federalAuthorityOrder;
        }

        /**
         * Sets the value of the federalAuthorityOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNotificationExceptionType.ExcludedInfoBase.FederalAuthorityOrder }
         *     
         */
        public void setFederalAuthorityOrder(ZfcsNotificationExceptionType.ExcludedInfoBase.FederalAuthorityOrder value) {
            this.federalAuthorityOrder = value;
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
         *         &lt;element name="courtsDecisionOrgName">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="255"/>
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
            "courtsDecisionOrgName"
        })
        public static class CourtsDecision {

            @XmlElement(required = true)
            protected String courtsDecisionOrgName;

            /**
             * Gets the value of the courtsDecisionOrgName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCourtsDecisionOrgName() {
                return courtsDecisionOrgName;
            }

            /**
             * Sets the value of the courtsDecisionOrgName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCourtsDecisionOrgName(String value) {
                this.courtsDecisionOrgName = value;
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
         *         &lt;element name="federalAuthorityOrderInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationExceptionOrgType"/>
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
            "federalAuthorityOrderInfo"
        })
        public static class FederalAuthorityOrder {

            @XmlElement(required = true)
            protected ZfcsNotificationExceptionOrgType federalAuthorityOrderInfo;

            /**
             * Gets the value of the federalAuthorityOrderInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsNotificationExceptionOrgType }
             *     
             */
            public ZfcsNotificationExceptionOrgType getFederalAuthorityOrderInfo() {
                return federalAuthorityOrderInfo;
            }

            /**
             * Sets the value of the federalAuthorityOrderInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsNotificationExceptionOrgType }
             *     
             */
            public void setFederalAuthorityOrderInfo(ZfcsNotificationExceptionOrgType value) {
                this.federalAuthorityOrderInfo = value;
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
     *         &lt;element name="excludedInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_excludedInfoTypeType"/>
     *         &lt;element name="regNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="firstVersionPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="lastVersionPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "excludedInfo",
        "regNumber",
        "firstVersionPublishDate",
        "lastVersionPublishDate"
    })
    public static class ExcludedInfoInfo {

        @XmlElement(required = true)
        protected String excludedInfo;
        @XmlElement(required = true)
        protected String regNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar firstVersionPublishDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastVersionPublishDate;

        /**
         * Gets the value of the excludedInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExcludedInfo() {
            return excludedInfo;
        }

        /**
         * Sets the value of the excludedInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExcludedInfo(String value) {
            this.excludedInfo = value;
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
         * Gets the value of the firstVersionPublishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFirstVersionPublishDate() {
            return firstVersionPublishDate;
        }

        /**
         * Sets the value of the firstVersionPublishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFirstVersionPublishDate(XMLGregorianCalendar value) {
            this.firstVersionPublishDate = value;
        }

        /**
         * Gets the value of the lastVersionPublishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastVersionPublishDate() {
            return lastVersionPublishDate;
        }

        /**
         * Sets the value of the lastVersionPublishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastVersionPublishDate(XMLGregorianCalendar value) {
            this.lastVersionPublishDate = value;
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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="description">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="255"/>
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
        "date",
        "description"
    })
    public static class ModificationInfo {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlElement(required = true)
        protected String description;

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

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationExceptionOrgType">
     *       &lt;sequence>
     *         &lt;element name="organizationRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_placementOrgRoleType" minOccurs="0"/>
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
        "organizationRole"
    })
    public static class PlacementOrgInfo
        extends ZfcsNotificationExceptionOrgType
    {

        @XmlSchemaType(name = "string")
        protected ZfcsPlacementOrgRoleType organizationRole;

        /**
         * Gets the value of the organizationRole property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPlacementOrgRoleType }
         *     
         */
        public ZfcsPlacementOrgRoleType getOrganizationRole() {
            return organizationRole;
        }

        /**
         * Sets the value of the organizationRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPlacementOrgRoleType }
         *     
         */
        public void setOrganizationRole(ZfcsPlacementOrgRoleType value) {
            this.organizationRole = value;
        }

    }

}

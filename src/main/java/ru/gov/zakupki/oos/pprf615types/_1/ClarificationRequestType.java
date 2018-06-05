//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Запрос ЭП о даче разъяснений положений документации по ПП РФ № 615
 * 
 * <p>Java class for clarificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clarificationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumber615Type"/>
 *                   &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType"/>
 *                   &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="topic" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="participantInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                   &lt;element name="email" type="{http://zakupki.gov.ru/oos/base/1}eMailType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachmentsInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}attachmentListType" minOccurs="0"/>
 *         &lt;element name="printFormFieldsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                   &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/pprf615types/1}placingWayType" minOccurs="0"/>
 *                   &lt;element name="fullNameResponsible" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                   &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "clarificationRequestType", propOrder = {
    "externalId",
    "commonInfo",
    "participantInfo",
    "attachmentsInfo",
    "printFormFieldsInfo"
})
public class ClarificationRequestType {

    protected String externalId;
    @XmlElement(required = true)
    protected ClarificationRequestType.CommonInfo commonInfo;
    @XmlElement(required = true)
    protected ClarificationRequestType.ParticipantInfo participantInfo;
    protected AttachmentListType attachmentsInfo;
    protected ClarificationRequestType.PrintFormFieldsInfo printFormFieldsInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

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
     *     {@link ClarificationRequestType.CommonInfo }
     *     
     */
    public ClarificationRequestType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClarificationRequestType.CommonInfo }
     *     
     */
    public void setCommonInfo(ClarificationRequestType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the participantInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClarificationRequestType.ParticipantInfo }
     *     
     */
    public ClarificationRequestType.ParticipantInfo getParticipantInfo() {
        return participantInfo;
    }

    /**
     * Sets the value of the participantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClarificationRequestType.ParticipantInfo }
     *     
     */
    public void setParticipantInfo(ClarificationRequestType.ParticipantInfo value) {
        this.participantInfo = value;
    }

    /**
     * Gets the value of the attachmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentListType }
     *     
     */
    public AttachmentListType getAttachmentsInfo() {
        return attachmentsInfo;
    }

    /**
     * Sets the value of the attachmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentListType }
     *     
     */
    public void setAttachmentsInfo(AttachmentListType value) {
        this.attachmentsInfo = value;
    }

    /**
     * Gets the value of the printFormFieldsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClarificationRequestType.PrintFormFieldsInfo }
     *     
     */
    public ClarificationRequestType.PrintFormFieldsInfo getPrintFormFieldsInfo() {
        return printFormFieldsInfo;
    }

    /**
     * Sets the value of the printFormFieldsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClarificationRequestType.PrintFormFieldsInfo }
     *     
     */
    public void setPrintFormFieldsInfo(ClarificationRequestType.PrintFormFieldsInfo value) {
        this.printFormFieldsInfo = value;
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
     *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/base/1}purchaseNumber615Type"/>
     *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType"/>
     *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="topic" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
        "purchaseNumber",
        "docNumber",
        "docDate",
        "topic"
    })
    public static class CommonInfo {

        @XmlElement(required = true)
        protected String purchaseNumber;
        @XmlElement(required = true)
        protected String docNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar docDate;
        @XmlElement(required = true)
        protected String topic;

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
         * Gets the value of the topic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTopic() {
            return topic;
        }

        /**
         * Sets the value of the topic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTopic(String value) {
            this.topic = value;
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
     *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
     *         &lt;element name="email" type="{http://zakupki.gov.ru/oos/base/1}eMailType" minOccurs="0"/>
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
        "email"
    })
    public static class ParticipantInfo {

        @XmlElement(required = true)
        protected String name;
        protected String email;

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
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
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
     *         &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *         &lt;element name="placingWay" type="{http://zakupki.gov.ru/oos/pprf615types/1}placingWayType" minOccurs="0"/>
     *         &lt;element name="fullNameResponsible" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "purchaseObjectInfo",
        "placingWay",
        "fullNameResponsible",
        "requestDate"
    })
    public static class PrintFormFieldsInfo {

        protected String purchaseObjectInfo;
        protected PlacingWayType placingWay;
        protected String fullNameResponsible;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar requestDate;

        /**
         * Gets the value of the purchaseObjectInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseObjectInfo() {
            return purchaseObjectInfo;
        }

        /**
         * Sets the value of the purchaseObjectInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseObjectInfo(String value) {
            this.purchaseObjectInfo = value;
        }

        /**
         * Gets the value of the placingWay property.
         * 
         * @return
         *     possible object is
         *     {@link PlacingWayType }
         *     
         */
        public PlacingWayType getPlacingWay() {
            return placingWay;
        }

        /**
         * Sets the value of the placingWay property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlacingWayType }
         *     
         */
        public void setPlacingWay(PlacingWayType value) {
            this.placingWay = value;
        }

        /**
         * Gets the value of the fullNameResponsible property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullNameResponsible() {
            return fullNameResponsible;
        }

        /**
         * Sets the value of the fullNameResponsible property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullNameResponsible(String value) {
            this.fullNameResponsible = value;
        }

        /**
         * Gets the value of the requestDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRequestDate() {
            return requestDate;
        }

        /**
         * Sets the value of the requestDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRequestDate(XMLGregorianCalendar value) {
            this.requestDate = value;
        }

    }

}

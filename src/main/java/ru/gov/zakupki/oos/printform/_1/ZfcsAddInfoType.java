//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:58:14 AM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.types._1.ZfcsAttachmentListType;
import ru.gov.zakupki.oos.types._1.ZfcsContactPersonType;


/**
 * Дополнительная информация ДИЗК
 * 
 * <p>Java class for zfcs_addInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_addInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="registryNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *         &lt;element name="publishOrg" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_organizationInfoType"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="revisionNumber" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_revisionNumType"/>
 *         &lt;element name="firstPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="modificationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="infoType" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_addInfoTypeEnum"/>
 *         &lt;choice>
 *           &lt;element name="contract">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
 *                     &lt;element name="number">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;maxLength value="30"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     &lt;element name="customer" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_organizationInfoType"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;sequence>
 *             &lt;element name="purchase">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                       &lt;element name="purchaseObjectInfo">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             &lt;maxLength value="2000"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="placingWay">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlacingWayCodeType"/>
 *                                 &lt;element name="name" minOccurs="0">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       &lt;maxLength value="500"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *                       &lt;element name="customer" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_organizationInfoType"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="contractor">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;choice>
 *                         &lt;element name="organization">
 *                           &lt;complexType>
 *                             &lt;complexContent>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 &lt;sequence>
 *                                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                                   &lt;element name="shortName" minOccurs="0">
 *                                     &lt;simpleType>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         &lt;maxLength value="250"/>
 *                                       &lt;/restriction>
 *                                     &lt;/simpleType>
 *                                   &lt;/element>
 *                                   &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innOrganizationType" minOccurs="0"/>
 *                                   &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *                                 &lt;/sequence>
 *                               &lt;/restriction>
 *                             &lt;/complexContent>
 *                           &lt;/complexType>
 *                         &lt;/element>
 *                         &lt;element name="person">
 *                           &lt;complexType>
 *                             &lt;complexContent>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 &lt;sequence>
 *                                   &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
 *                                   &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
 *                                 &lt;/sequence>
 *                               &lt;/restriction>
 *                             &lt;/complexContent>
 *                           &lt;/complexType>
 *                         &lt;/element>
 *                       &lt;/choice>
 *                       &lt;element name="rfResident" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
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
@XmlType(name = "zfcs_addInfoType", propOrder = {
    "publishDate",
    "registryNum",
    "publishOrg",
    "attachments",
    "revisionNumber",
    "firstPublishDate",
    "modificationReason",
    "infoType",
    "contract",
    "purchase",
    "contractor"
})
public class ZfcsAddInfoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(required = true)
    protected String registryNum;
    @XmlElement(required = true)
    protected ZfcsOrganizationInfoType publishOrg;
    protected ZfcsAttachmentListType attachments;
    @XmlElement(required = true)
    protected String revisionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstPublishDate;
    protected String modificationReason;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsAddInfoTypeEnum infoType;
    protected ZfcsAddInfoType.Contract contract;
    protected ZfcsAddInfoType.Purchase purchase;
    protected ZfcsAddInfoType.Contractor contractor;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

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
     * Gets the value of the firstPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPublishDate() {
        return firstPublishDate;
    }

    /**
     * Sets the value of the firstPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPublishDate(XMLGregorianCalendar value) {
        this.firstPublishDate = value;
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
     * Gets the value of the infoType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoTypeEnum }
     *     
     */
    public ZfcsAddInfoTypeEnum getInfoType() {
        return infoType;
    }

    /**
     * Sets the value of the infoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoTypeEnum }
     *     
     */
    public void setInfoType(ZfcsAddInfoTypeEnum value) {
        this.infoType = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoType.Contract }
     *     
     */
    public ZfcsAddInfoType.Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoType.Contract }
     *     
     */
    public void setContract(ZfcsAddInfoType.Contract value) {
        this.contract = value;
    }

    /**
     * Gets the value of the purchase property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoType.Purchase }
     *     
     */
    public ZfcsAddInfoType.Purchase getPurchase() {
        return purchase;
    }

    /**
     * Sets the value of the purchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoType.Purchase }
     *     
     */
    public void setPurchase(ZfcsAddInfoType.Purchase value) {
        this.purchase = value;
    }

    /**
     * Gets the value of the contractor property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAddInfoType.Contractor }
     *     
     */
    public ZfcsAddInfoType.Contractor getContractor() {
        return contractor;
    }

    /**
     * Sets the value of the contractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAddInfoType.Contractor }
     *     
     */
    public void setContractor(ZfcsAddInfoType.Contractor value) {
        this.contractor = value;
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
     *         &lt;element name="regNum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.regNumType"/>
     *         &lt;element name="number">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_organizationInfoType"/>
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
        "regNum",
        "number",
        "signDate",
        "customer"
    })
    public static class Contract {

        @XmlElement(required = true)
        protected String regNum;
        @XmlElement(required = true)
        protected String number;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signDate;
        @XmlElement(required = true)
        protected ZfcsOrganizationInfoType customer;

        /**
         * Gets the value of the regNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegNum() {
            return regNum;
        }

        /**
         * Sets the value of the regNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegNum(String value) {
            this.regNum = value;
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
         * Gets the value of the signDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSignDate() {
            return signDate;
        }

        /**
         * Sets the value of the signDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSignDate(XMLGregorianCalendar value) {
            this.signDate = value;
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
     *         &lt;choice>
     *           &lt;element name="organization">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                     &lt;element name="shortName" minOccurs="0">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;maxLength value="250"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innOrganizationType" minOccurs="0"/>
     *                     &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="person">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
     *                     &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="rfResident" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "organization",
        "person",
        "rfResident"
    })
    public static class Contractor {

        protected ZfcsAddInfoType.Contractor.Organization organization;
        protected ZfcsAddInfoType.Contractor.Person person;
        protected boolean rfResident;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsAddInfoType.Contractor.Organization }
         *     
         */
        public ZfcsAddInfoType.Contractor.Organization getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsAddInfoType.Contractor.Organization }
         *     
         */
        public void setOrganization(ZfcsAddInfoType.Contractor.Organization value) {
            this.organization = value;
        }

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsAddInfoType.Contractor.Person }
         *     
         */
        public ZfcsAddInfoType.Contractor.Person getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsAddInfoType.Contractor.Person }
         *     
         */
        public void setPerson(ZfcsAddInfoType.Contractor.Person value) {
            this.person = value;
        }

        /**
         * Gets the value of the rfResident property.
         * 
         */
        public boolean isRfResident() {
            return rfResident;
        }

        /**
         * Sets the value of the rfResident property.
         * 
         */
        public void setRfResident(boolean value) {
            this.rfResident = value;
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
         *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
         *         &lt;element name="shortName" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="250"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innOrganizationType" minOccurs="0"/>
         *         &lt;element name="kpp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
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
            "fullName",
            "shortName",
            "inn",
            "kpp"
        })
        public static class Organization {

            protected String fullName;
            protected String shortName;
            protected String inn;
            protected String kpp;

            /**
             * Gets the value of the fullName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullName() {
                return fullName;
            }

            /**
             * Sets the value of the fullName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullName(String value) {
                this.fullName = value;
            }

            /**
             * Gets the value of the shortName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShortName() {
                return shortName;
            }

            /**
             * Sets the value of the shortName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShortName(String value) {
                this.shortName = value;
            }

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInn() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInn(String value) {
                this.inn = value;
            }

            /**
             * Gets the value of the kpp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKpp() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKpp(String value) {
                this.kpp = value;
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
         *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
         *         &lt;element name="inn" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType"/>
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
            "inn"
        })
        public static class Person {

            @XmlElement(required = true)
            protected ZfcsContactPersonType name;
            @XmlElement(required = true)
            protected String inn;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsContactPersonType }
             *     
             */
            public ZfcsContactPersonType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsContactPersonType }
             *     
             */
            public void setName(ZfcsContactPersonType value) {
                this.name = value;
            }

            /**
             * Gets the value of the inn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInn() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInn(String value) {
                this.inn = value;
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
     *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="purchaseObjectInfo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="placingWay">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlacingWayCodeType"/>
     *                   &lt;element name="name" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="500"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
     *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_organizationInfoType"/>
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
        "lotNumber",
        "purchaseObjectInfo",
        "placingWay",
        "purchaseNumber",
        "customer"
    })
    public static class Purchase {

        @XmlElement(required = true)
        protected BigInteger lotNumber;
        @XmlElement(required = true)
        protected String purchaseObjectInfo;
        @XmlElement(required = true)
        protected ZfcsAddInfoType.Purchase.PlacingWay placingWay;
        @XmlElement(required = true)
        protected String purchaseNumber;
        @XmlElement(required = true)
        protected ZfcsOrganizationInfoType customer;

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
         *     {@link ZfcsAddInfoType.Purchase.PlacingWay }
         *     
         */
        public ZfcsAddInfoType.Purchase.PlacingWay getPlacingWay() {
            return placingWay;
        }

        /**
         * Sets the value of the placingWay property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsAddInfoType.Purchase.PlacingWay }
         *     
         */
        public void setPlacingWay(ZfcsAddInfoType.Purchase.PlacingWay value) {
            this.placingWay = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlacingWayCodeType"/>
         *         &lt;element name="name" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="500"/>
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
            "code",
            "name"
        })
        public static class PlacingWay {

            @XmlElement(required = true)
            protected String code;
            protected String name;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

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

        }

    }

}

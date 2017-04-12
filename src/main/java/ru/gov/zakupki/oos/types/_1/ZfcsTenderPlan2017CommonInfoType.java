//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:05:46 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Общая информация о плане-графике с 01.01.2017
 * 
 * <p>Java class for zfcs_tenderPlan2017CommonInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017CommonInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017BasementEnum" minOccurs="0"/>
 *         &lt;element name="purchasePlanNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanNumberType"/>
 *         &lt;element name="isLoadedFromFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="confirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="approveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="directDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customerInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanOrganizationType">
 *                 &lt;sequence>
 *                   &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
 *                   &lt;element name="OKTMOPPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMOPPORef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ownerInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanOrganizationType">
 *                 &lt;sequence>
 *                   &lt;element name="ownerRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanVersionOwnerRoleType"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="responsibleContactInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType"/>
 *         &lt;element name="confirmContactInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType">
 *                 &lt;sequence>
 *                   &lt;element name="position">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="256"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "zfcs_tenderPlan2017CommonInfoType", propOrder = {
    "base",
    "purchasePlanNumber",
    "isLoadedFromFile",
    "year",
    "createDate",
    "confirmDate",
    "approveDate",
    "directDate",
    "publishDate",
    "customerInfo",
    "ownerInfo",
    "responsibleContactInfo",
    "confirmContactInfo"
})
public class ZfcsTenderPlan2017CommonInfoType {

    @XmlSchemaType(name = "string")
    protected ZfcsTenderPlan2017BasementEnum base;
    @XmlElement(required = true)
    protected String purchasePlanNumber;
    protected Boolean isLoadedFromFile;
    protected int year;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar directDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(required = true)
    protected ZfcsTenderPlan2017CommonInfoType.CustomerInfo customerInfo;
    @XmlElement(required = true)
    protected ZfcsTenderPlan2017CommonInfoType.OwnerInfo ownerInfo;
    @XmlElement(required = true)
    protected ZfcsContactPersonType responsibleContactInfo;
    @XmlElement(required = true)
    protected ZfcsTenderPlan2017CommonInfoType.ConfirmContactInfo confirmContactInfo;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017BasementEnum }
     *     
     */
    public ZfcsTenderPlan2017BasementEnum getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017BasementEnum }
     *     
     */
    public void setBase(ZfcsTenderPlan2017BasementEnum value) {
        this.base = value;
    }

    /**
     * Gets the value of the purchasePlanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasePlanNumber() {
        return purchasePlanNumber;
    }

    /**
     * Sets the value of the purchasePlanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasePlanNumber(String value) {
        this.purchasePlanNumber = value;
    }

    /**
     * Gets the value of the isLoadedFromFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoadedFromFile() {
        return isLoadedFromFile;
    }

    /**
     * Sets the value of the isLoadedFromFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoadedFromFile(Boolean value) {
        this.isLoadedFromFile = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
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
     * Gets the value of the confirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmDate() {
        return confirmDate;
    }

    /**
     * Sets the value of the confirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmDate(XMLGregorianCalendar value) {
        this.confirmDate = value;
    }

    /**
     * Gets the value of the approveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproveDate() {
        return approveDate;
    }

    /**
     * Sets the value of the approveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproveDate(XMLGregorianCalendar value) {
        this.approveDate = value;
    }

    /**
     * Gets the value of the directDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDirectDate() {
        return directDate;
    }

    /**
     * Sets the value of the directDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDirectDate(XMLGregorianCalendar value) {
        this.directDate = value;
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
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017CommonInfoType.CustomerInfo }
     *     
     */
    public ZfcsTenderPlan2017CommonInfoType.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017CommonInfoType.CustomerInfo }
     *     
     */
    public void setCustomerInfo(ZfcsTenderPlan2017CommonInfoType.CustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the ownerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017CommonInfoType.OwnerInfo }
     *     
     */
    public ZfcsTenderPlan2017CommonInfoType.OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }

    /**
     * Sets the value of the ownerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017CommonInfoType.OwnerInfo }
     *     
     */
    public void setOwnerInfo(ZfcsTenderPlan2017CommonInfoType.OwnerInfo value) {
        this.ownerInfo = value;
    }

    /**
     * Gets the value of the responsibleContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsContactPersonType }
     *     
     */
    public ZfcsContactPersonType getResponsibleContactInfo() {
        return responsibleContactInfo;
    }

    /**
     * Sets the value of the responsibleContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsContactPersonType }
     *     
     */
    public void setResponsibleContactInfo(ZfcsContactPersonType value) {
        this.responsibleContactInfo = value;
    }

    /**
     * Gets the value of the confirmContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlan2017CommonInfoType.ConfirmContactInfo }
     *     
     */
    public ZfcsTenderPlan2017CommonInfoType.ConfirmContactInfo getConfirmContactInfo() {
        return confirmContactInfo;
    }

    /**
     * Sets the value of the confirmContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlan2017CommonInfoType.ConfirmContactInfo }
     *     
     */
    public void setConfirmContactInfo(ZfcsTenderPlan2017CommonInfoType.ConfirmContactInfo value) {
        this.confirmContactInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contactPersonType">
     *       &lt;sequence>
     *         &lt;element name="position">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="256"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "position"
    })
    public static class ConfirmContactInfo
        extends ZfcsContactPersonType
    {

        @XmlElement(required = true)
        protected String position;

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosition(String value) {
            this.position = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanOrganizationType">
     *       &lt;sequence>
     *         &lt;element name="OKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_okopfRef" minOccurs="0"/>
     *         &lt;element name="OKTMOPPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMOPPORef" minOccurs="0"/>
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
        "okopf",
        "oktmoppo"
    })
    public static class CustomerInfo
        extends ZfcsPurchasePlanOrganizationType
    {

        @XmlElement(name = "OKOPF")
        protected ZfcsOkopfRef okopf;
        @XmlElement(name = "OKTMOPPO")
        protected ZfcsOKTMOPPORef oktmoppo;

        /**
         * Gets the value of the okopf property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOkopfRef }
         *     
         */
        public ZfcsOkopfRef getOKOPF() {
            return okopf;
        }

        /**
         * Sets the value of the okopf property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOkopfRef }
         *     
         */
        public void setOKOPF(ZfcsOkopfRef value) {
            this.okopf = value;
        }

        /**
         * Gets the value of the oktmoppo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOKTMOPPORef }
         *     
         */
        public ZfcsOKTMOPPORef getOKTMOPPO() {
            return oktmoppo;
        }

        /**
         * Sets the value of the oktmoppo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOKTMOPPORef }
         *     
         */
        public void setOKTMOPPO(ZfcsOKTMOPPORef value) {
            this.oktmoppo = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanOrganizationType">
     *       &lt;sequence>
     *         &lt;element name="ownerRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanVersionOwnerRoleType"/>
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
        "ownerRole"
    })
    public static class OwnerInfo
        extends ZfcsPurchasePlanOrganizationType
    {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsPurchasePlanVersionOwnerRoleType ownerRole;

        /**
         * Gets the value of the ownerRole property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchasePlanVersionOwnerRoleType }
         *     
         */
        public ZfcsPurchasePlanVersionOwnerRoleType getOwnerRole() {
            return ownerRole;
        }

        /**
         * Sets the value of the ownerRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchasePlanVersionOwnerRoleType }
         *     
         */
        public void setOwnerRole(ZfcsPurchasePlanVersionOwnerRoleType value) {
            this.ownerRole = value;
        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Первый этап ООКЗ
 * 
 * <p>Java class for zfcs_publicDiscussionPhase1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionPhase1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicDiscussionOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType"/>
 *         &lt;element name="purchasePlanInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionPurchasePlanAddInfoType"/>
 *         &lt;element name="ZKPart14St112" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="term">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hearing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="changeType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="changeCondition" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="protocolPlacement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionProtocolType"/>
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
@XmlType(name = "zfcs_publicDiscussionPhase1Type", propOrder = {
    "publicDiscussionOrg",
    "purchasePlanInfo",
    "zkPart14St112",
    "term",
    "hearing",
    "changeType"
})
public class ZfcsPublicDiscussionPhase1Type {

    @XmlElement(required = true)
    protected ZfcsOrganizationInfoType publicDiscussionOrg;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionPurchasePlanAddInfoType purchasePlanInfo;
    @XmlElement(name = "ZKPart14St112")
    protected Boolean zkPart14St112;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionPhase1Type.Term term;
    protected ZfcsPublicDiscussionPhase1Type.Hearing hearing;
    protected ZfcsPublicDiscussionPhase1Type.ChangeType changeType;

    /**
     * Gets the value of the publicDiscussionOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public ZfcsOrganizationInfoType getPublicDiscussionOrg() {
        return publicDiscussionOrg;
    }

    /**
     * Sets the value of the publicDiscussionOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public void setPublicDiscussionOrg(ZfcsOrganizationInfoType value) {
        this.publicDiscussionOrg = value;
    }

    /**
     * Gets the value of the purchasePlanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPurchasePlanAddInfoType }
     *     
     */
    public ZfcsPublicDiscussionPurchasePlanAddInfoType getPurchasePlanInfo() {
        return purchasePlanInfo;
    }

    /**
     * Sets the value of the purchasePlanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPurchasePlanAddInfoType }
     *     
     */
    public void setPurchasePlanInfo(ZfcsPublicDiscussionPurchasePlanAddInfoType value) {
        this.purchasePlanInfo = value;
    }

    /**
     * Gets the value of the zkPart14St112 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZKPart14St112() {
        return zkPart14St112;
    }

    /**
     * Sets the value of the zkPart14St112 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZKPart14St112(Boolean value) {
        this.zkPart14St112 = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPhase1Type.Term }
     *     
     */
    public ZfcsPublicDiscussionPhase1Type.Term getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPhase1Type.Term }
     *     
     */
    public void setTerm(ZfcsPublicDiscussionPhase1Type.Term value) {
        this.term = value;
    }

    /**
     * Gets the value of the hearing property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPhase1Type.Hearing }
     *     
     */
    public ZfcsPublicDiscussionPhase1Type.Hearing getHearing() {
        return hearing;
    }

    /**
     * Sets the value of the hearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPhase1Type.Hearing }
     *     
     */
    public void setHearing(ZfcsPublicDiscussionPhase1Type.Hearing value) {
        this.hearing = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPhase1Type.ChangeType }
     *     
     */
    public ZfcsPublicDiscussionPhase1Type.ChangeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPhase1Type.ChangeType }
     *     
     */
    public void setChangeType(ZfcsPublicDiscussionPhase1Type.ChangeType value) {
        this.changeType = value;
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
     *         &lt;element name="changeCondition" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="protocolPlacement" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionProtocolType"/>
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
        "changeCondition",
        "protocolPlacement"
    })
    public static class ChangeType {

        protected Boolean changeCondition;
        protected ZfcsPublicDiscussionProtocolType protocolPlacement;

        /**
         * Gets the value of the changeCondition property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChangeCondition() {
            return changeCondition;
        }

        /**
         * Sets the value of the changeCondition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChangeCondition(Boolean value) {
            this.changeCondition = value;
        }

        /**
         * Gets the value of the protocolPlacement property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPublicDiscussionProtocolType }
         *     
         */
        public ZfcsPublicDiscussionProtocolType getProtocolPlacement() {
            return protocolPlacement;
        }

        /**
         * Sets the value of the protocolPlacement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPublicDiscussionProtocolType }
         *     
         */
        public void setProtocolPlacement(ZfcsPublicDiscussionProtocolType value) {
            this.protocolPlacement = value;
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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "place"
    })
    public static class Hearing {

        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        protected String place;

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
         * Gets the value of the place property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlace() {
            return place;
        }

        /**
         * Sets the value of the place property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlace(String value) {
            this.place = value;
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
     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
    public static class Term {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
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

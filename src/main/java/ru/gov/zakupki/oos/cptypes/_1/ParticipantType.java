//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.cptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.OKSMRef;
import ru.gov.zakupki.oos.common._1.PersonType;


/**
 * Тип: Поставщик
 * 
 * <p>Java class for participantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="participantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="legalEntityRFInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innEntityType"/>
 *                   &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/base/1}kppType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="legalEntityForeignStateInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innEntityType" minOccurs="0"/>
 *                   &lt;element name="taxPayerCode" type="{http://zakupki.gov.ru/oos/base/1}taxPayerCode"/>
 *                   &lt;element name="country" type="{http://zakupki.gov.ru/oos/base/1}OKSMRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="individualPersonRFInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/common/1}personType" minOccurs="0"/>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innIndividualType"/>
 *                   &lt;element name="isIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="individualPersonForeignStateInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/common/1}personType" minOccurs="0"/>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innIndividualType" minOccurs="0"/>
 *                   &lt;element name="taxPayerCode" type="{http://zakupki.gov.ru/oos/base/1}taxPayerCode"/>
 *                   &lt;element name="country" type="{http://zakupki.gov.ru/oos/base/1}OKSMRef" minOccurs="0"/>
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
@XmlType(name = "participantType", propOrder = {
    "legalEntityRFInfo",
    "legalEntityForeignStateInfo",
    "individualPersonRFInfo",
    "individualPersonForeignStateInfo"
})
public class ParticipantType {

    protected ParticipantType.LegalEntityRFInfo legalEntityRFInfo;
    protected ParticipantType.LegalEntityForeignStateInfo legalEntityForeignStateInfo;
    protected ParticipantType.IndividualPersonRFInfo individualPersonRFInfo;
    protected ParticipantType.IndividualPersonForeignStateInfo individualPersonForeignStateInfo;

    /**
     * Gets the value of the legalEntityRFInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantType.LegalEntityRFInfo }
     *     
     */
    public ParticipantType.LegalEntityRFInfo getLegalEntityRFInfo() {
        return legalEntityRFInfo;
    }

    /**
     * Sets the value of the legalEntityRFInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantType.LegalEntityRFInfo }
     *     
     */
    public void setLegalEntityRFInfo(ParticipantType.LegalEntityRFInfo value) {
        this.legalEntityRFInfo = value;
    }

    /**
     * Gets the value of the legalEntityForeignStateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantType.LegalEntityForeignStateInfo }
     *     
     */
    public ParticipantType.LegalEntityForeignStateInfo getLegalEntityForeignStateInfo() {
        return legalEntityForeignStateInfo;
    }

    /**
     * Sets the value of the legalEntityForeignStateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantType.LegalEntityForeignStateInfo }
     *     
     */
    public void setLegalEntityForeignStateInfo(ParticipantType.LegalEntityForeignStateInfo value) {
        this.legalEntityForeignStateInfo = value;
    }

    /**
     * Gets the value of the individualPersonRFInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantType.IndividualPersonRFInfo }
     *     
     */
    public ParticipantType.IndividualPersonRFInfo getIndividualPersonRFInfo() {
        return individualPersonRFInfo;
    }

    /**
     * Sets the value of the individualPersonRFInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantType.IndividualPersonRFInfo }
     *     
     */
    public void setIndividualPersonRFInfo(ParticipantType.IndividualPersonRFInfo value) {
        this.individualPersonRFInfo = value;
    }

    /**
     * Gets the value of the individualPersonForeignStateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantType.IndividualPersonForeignStateInfo }
     *     
     */
    public ParticipantType.IndividualPersonForeignStateInfo getIndividualPersonForeignStateInfo() {
        return individualPersonForeignStateInfo;
    }

    /**
     * Sets the value of the individualPersonForeignStateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantType.IndividualPersonForeignStateInfo }
     *     
     */
    public void setIndividualPersonForeignStateInfo(ParticipantType.IndividualPersonForeignStateInfo value) {
        this.individualPersonForeignStateInfo = value;
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
     *         &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/common/1}personType" minOccurs="0"/>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innIndividualType" minOccurs="0"/>
     *         &lt;element name="taxPayerCode" type="{http://zakupki.gov.ru/oos/base/1}taxPayerCode"/>
     *         &lt;element name="country" type="{http://zakupki.gov.ru/oos/base/1}OKSMRef" minOccurs="0"/>
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
        "nameInfo",
        "inn",
        "taxPayerCode",
        "country"
    })
    public static class IndividualPersonForeignStateInfo {

        protected PersonType nameInfo;
        @XmlElement(name = "INN")
        protected String inn;
        @XmlElement(required = true)
        protected String taxPayerCode;
        protected OKSMRef country;

        /**
         * Gets the value of the nameInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PersonType }
         *     
         */
        public PersonType getNameInfo() {
            return nameInfo;
        }

        /**
         * Sets the value of the nameInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonType }
         *     
         */
        public void setNameInfo(PersonType value) {
            this.nameInfo = value;
        }

        /**
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
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
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * Gets the value of the taxPayerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxPayerCode() {
            return taxPayerCode;
        }

        /**
         * Sets the value of the taxPayerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxPayerCode(String value) {
            this.taxPayerCode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link OKSMRef }
         *     
         */
        public OKSMRef getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link OKSMRef }
         *     
         */
        public void setCountry(OKSMRef value) {
            this.country = value;
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
     *         &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/common/1}personType" minOccurs="0"/>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innIndividualType"/>
     *         &lt;element name="isIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "nameInfo",
        "inn",
        "isIP"
    })
    public static class IndividualPersonRFInfo {

        protected PersonType nameInfo;
        @XmlElement(name = "INN", required = true)
        protected String inn;
        protected Boolean isIP;

        /**
         * Gets the value of the nameInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PersonType }
         *     
         */
        public PersonType getNameInfo() {
            return nameInfo;
        }

        /**
         * Sets the value of the nameInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonType }
         *     
         */
        public void setNameInfo(PersonType value) {
            this.nameInfo = value;
        }

        /**
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
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
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * Gets the value of the isIP property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsIP() {
            return isIP;
        }

        /**
         * Sets the value of the isIP property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsIP(Boolean value) {
            this.isIP = value;
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
     *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innEntityType" minOccurs="0"/>
     *         &lt;element name="taxPayerCode" type="{http://zakupki.gov.ru/oos/base/1}taxPayerCode"/>
     *         &lt;element name="country" type="{http://zakupki.gov.ru/oos/base/1}OKSMRef" minOccurs="0"/>
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
        "inn",
        "taxPayerCode",
        "country"
    })
    public static class LegalEntityForeignStateInfo {

        protected String fullName;
        @XmlElement(name = "INN")
        protected String inn;
        @XmlElement(required = true)
        protected String taxPayerCode;
        protected OKSMRef country;

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
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
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
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * Gets the value of the taxPayerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxPayerCode() {
            return taxPayerCode;
        }

        /**
         * Sets the value of the taxPayerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxPayerCode(String value) {
            this.taxPayerCode = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link OKSMRef }
         *     
         */
        public OKSMRef getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link OKSMRef }
         *     
         */
        public void setCountry(OKSMRef value) {
            this.country = value;
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
     *         &lt;element name="fullName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innEntityType"/>
     *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/base/1}kppType"/>
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
        "inn",
        "kpp"
    })
    public static class LegalEntityRFInfo {

        protected String fullName;
        @XmlElement(name = "INN", required = true)
        protected String inn;
        @XmlElement(name = "KPP", required = true)
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
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
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
        public void setINN(String value) {
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
        public String getKPP() {
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
        public void setKPP(String value) {
            this.kpp = value;
        }

    }

}

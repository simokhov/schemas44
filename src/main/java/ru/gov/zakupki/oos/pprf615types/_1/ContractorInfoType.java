//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.base._1.OKOPFRef;
import ru.gov.zakupki.oos.base._1.QualifiedContractorRef;


/**
 * Тип: Сведения о подрядной организации в сведениях о договоре о проведении капитального ремонта по ПП РФ № 615
 * 
 * <p>Java class for contractorInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractorInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="legalEntityRFInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}legalEntityRFType">
 *                 &lt;sequence>
 *                   &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
 *                   &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/base/1}OKOPFRef" minOccurs="0"/>
 *                   &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType" minOccurs="0"/>
 *                   &lt;element name="contactPerson" type="{http://zakupki.gov.ru/oos/pprf615types/1}personType" minOccurs="0"/>
 *                   &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="legalEntityForeignStateInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}legalEntityForeignStateType">
 *                 &lt;sequence>
 *                   &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
 *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType" minOccurs="0"/>
 *                   &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="individualPersonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}personType"/>
 *                   &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innType"/>
 *                   &lt;element name="factAddress" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                   &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
 *                   &lt;element name="taxPayerCode" type="{http://zakupki.gov.ru/oos/base/1}taxPayerCode" minOccurs="0"/>
 *                   &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType" minOccurs="0"/>
 *                   &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
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
@XmlType(name = "contractorInfoType", propOrder = {
    "legalEntityRFInfo",
    "legalEntityForeignStateInfo",
    "individualPersonInfo"
})
public class ContractorInfoType {

    protected ContractorInfoType.LegalEntityRFInfo legalEntityRFInfo;
    protected ContractorInfoType.LegalEntityForeignStateInfo legalEntityForeignStateInfo;
    protected ContractorInfoType.IndividualPersonInfo individualPersonInfo;

    /**
     * Gets the value of the legalEntityRFInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorInfoType.LegalEntityRFInfo }
     *     
     */
    public ContractorInfoType.LegalEntityRFInfo getLegalEntityRFInfo() {
        return legalEntityRFInfo;
    }

    /**
     * Sets the value of the legalEntityRFInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorInfoType.LegalEntityRFInfo }
     *     
     */
    public void setLegalEntityRFInfo(ContractorInfoType.LegalEntityRFInfo value) {
        this.legalEntityRFInfo = value;
    }

    /**
     * Gets the value of the legalEntityForeignStateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorInfoType.LegalEntityForeignStateInfo }
     *     
     */
    public ContractorInfoType.LegalEntityForeignStateInfo getLegalEntityForeignStateInfo() {
        return legalEntityForeignStateInfo;
    }

    /**
     * Sets the value of the legalEntityForeignStateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorInfoType.LegalEntityForeignStateInfo }
     *     
     */
    public void setLegalEntityForeignStateInfo(ContractorInfoType.LegalEntityForeignStateInfo value) {
        this.legalEntityForeignStateInfo = value;
    }

    /**
     * Gets the value of the individualPersonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorInfoType.IndividualPersonInfo }
     *     
     */
    public ContractorInfoType.IndividualPersonInfo getIndividualPersonInfo() {
        return individualPersonInfo;
    }

    /**
     * Sets the value of the individualPersonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorInfoType.IndividualPersonInfo }
     *     
     */
    public void setIndividualPersonInfo(ContractorInfoType.IndividualPersonInfo value) {
        this.individualPersonInfo = value;
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
     *         &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}personType"/>
     *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innType"/>
     *         &lt;element name="factAddress" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
     *         &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
     *         &lt;element name="taxPayerCode" type="{http://zakupki.gov.ru/oos/base/1}taxPayerCode" minOccurs="0"/>
     *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType" minOccurs="0"/>
     *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
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
        "factAddress",
        "qualifiedContractorInfo",
        "taxPayerCode",
        "registrationDate",
        "eMail",
        "phone"
    })
    public static class IndividualPersonInfo {

        @XmlElement(required = true)
        protected PersonType nameInfo;
        @XmlElement(name = "INN", required = true)
        protected String inn;
        @XmlElement(required = true)
        protected String factAddress;
        protected QualifiedContractorRef qualifiedContractorInfo;
        protected String taxPayerCode;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registrationDate;
        protected String eMail;
        protected String phone;

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
         * Gets the value of the factAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFactAddress() {
            return factAddress;
        }

        /**
         * Sets the value of the factAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFactAddress(String value) {
            this.factAddress = value;
        }

        /**
         * Gets the value of the qualifiedContractorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public QualifiedContractorRef getQualifiedContractorInfo() {
            return qualifiedContractorInfo;
        }

        /**
         * Sets the value of the qualifiedContractorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public void setQualifiedContractorInfo(QualifiedContractorRef value) {
            this.qualifiedContractorInfo = value;
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
         * Gets the value of the registrationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegistrationDate() {
            return registrationDate;
        }

        /**
         * Sets the value of the registrationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegistrationDate(XMLGregorianCalendar value) {
            this.registrationDate = value;
        }

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}legalEntityForeignStateType">
     *       &lt;sequence>
     *         &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
     *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType" minOccurs="0"/>
     *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
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
        "qualifiedContractorInfo",
        "registrationDate",
        "eMail",
        "phone"
    })
    public static class LegalEntityForeignStateInfo
        extends LegalEntityForeignStateType
    {

        protected QualifiedContractorRef qualifiedContractorInfo;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registrationDate;
        protected String eMail;
        protected String phone;

        /**
         * Gets the value of the qualifiedContractorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public QualifiedContractorRef getQualifiedContractorInfo() {
            return qualifiedContractorInfo;
        }

        /**
         * Sets the value of the qualifiedContractorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public void setQualifiedContractorInfo(QualifiedContractorRef value) {
            this.qualifiedContractorInfo = value;
        }

        /**
         * Gets the value of the registrationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegistrationDate() {
            return registrationDate;
        }

        /**
         * Sets the value of the registrationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegistrationDate(XMLGregorianCalendar value) {
            this.registrationDate = value;
        }

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}legalEntityRFType">
     *       &lt;sequence>
     *         &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
     *         &lt;element name="legalForm" type="{http://zakupki.gov.ru/oos/base/1}OKOPFRef" minOccurs="0"/>
     *         &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType" minOccurs="0"/>
     *         &lt;element name="contactPerson" type="{http://zakupki.gov.ru/oos/pprf615types/1}personType" minOccurs="0"/>
     *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
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
        "qualifiedContractorInfo",
        "legalForm",
        "shortName",
        "registrationDate",
        "eMail",
        "contactPerson",
        "phone"
    })
    public static class LegalEntityRFInfo
        extends LegalEntityRFType
    {

        protected QualifiedContractorRef qualifiedContractorInfo;
        protected OKOPFRef legalForm;
        protected String shortName;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar registrationDate;
        protected String eMail;
        protected PersonType contactPerson;
        protected String phone;

        /**
         * Gets the value of the qualifiedContractorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public QualifiedContractorRef getQualifiedContractorInfo() {
            return qualifiedContractorInfo;
        }

        /**
         * Sets the value of the qualifiedContractorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public void setQualifiedContractorInfo(QualifiedContractorRef value) {
            this.qualifiedContractorInfo = value;
        }

        /**
         * Gets the value of the legalForm property.
         * 
         * @return
         *     possible object is
         *     {@link OKOPFRef }
         *     
         */
        public OKOPFRef getLegalForm() {
            return legalForm;
        }

        /**
         * Sets the value of the legalForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link OKOPFRef }
         *     
         */
        public void setLegalForm(OKOPFRef value) {
            this.legalForm = value;
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
         * Gets the value of the registrationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegistrationDate() {
            return registrationDate;
        }

        /**
         * Sets the value of the registrationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRegistrationDate(XMLGregorianCalendar value) {
            this.registrationDate = value;
        }

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
        }

        /**
         * Gets the value of the contactPerson property.
         * 
         * @return
         *     possible object is
         *     {@link PersonType }
         *     
         */
        public PersonType getContactPerson() {
            return contactPerson;
        }

        /**
         * Sets the value of the contactPerson property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonType }
         *     
         */
        public void setContactPerson(PersonType value) {
            this.contactPerson = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

    }

}

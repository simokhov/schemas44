//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 11:02:43 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Субъект проекта жалобы
 * 
 * <p>Java class for zfcs_complaintProjectSubjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_complaintProjectSubjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;choice>
 *           &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="customerNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="authority" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="authorityNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="authorityAgency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="authorityAgencyNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="specialized" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *           &lt;element name="specializedNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *         &lt;/choice>
 *         &lt;element name="commission44">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="commission94">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contractServiceOfficer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contractService">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="legalEntity44">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="legalEntity307">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                     &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
 *                   &lt;/choice>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "zfcs_complaintProjectSubjectType", propOrder = {
    "customer",
    "customerNew",
    "authority",
    "authorityNew",
    "authorityAgency",
    "authorityAgencyNew",
    "specialized",
    "specializedNew",
    "commission44",
    "commission94",
    "contractServiceOfficer",
    "contractService",
    "legalEntity44",
    "legalEntity307"
})
public class ZfcsComplaintProjectSubjectType {

    protected ZfcsOrganizationRef customer;
    protected ZfcsOrganizationControlRegistersRef customerNew;
    protected ZfcsOrganizationRef authority;
    protected ZfcsOrganizationControlRegistersRef authorityNew;
    protected ZfcsOrganizationRef authorityAgency;
    protected ZfcsOrganizationControlRegistersRef authorityAgencyNew;
    protected ZfcsOrganizationRef specialized;
    protected ZfcsOrganizationControlRegistersRef specializedNew;
    protected ZfcsComplaintProjectSubjectType.Commission44 commission44;
    protected ZfcsComplaintProjectSubjectType.Commission94 commission94;
    protected ZfcsComplaintProjectSubjectType.ContractServiceOfficer contractServiceOfficer;
    protected ZfcsComplaintProjectSubjectType.ContractService contractService;
    protected ZfcsComplaintProjectSubjectType.LegalEntity44 legalEntity44;
    protected ZfcsComplaintProjectSubjectType.LegalEntity307 legalEntity307;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setCustomer(ZfcsOrganizationRef value) {
        this.customer = value;
    }

    /**
     * Gets the value of the customerNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getCustomerNew() {
        return customerNew;
    }

    /**
     * Sets the value of the customerNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setCustomerNew(ZfcsOrganizationControlRegistersRef value) {
        this.customerNew = value;
    }

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setAuthority(ZfcsOrganizationRef value) {
        this.authority = value;
    }

    /**
     * Gets the value of the authorityNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getAuthorityNew() {
        return authorityNew;
    }

    /**
     * Sets the value of the authorityNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setAuthorityNew(ZfcsOrganizationControlRegistersRef value) {
        this.authorityNew = value;
    }

    /**
     * Gets the value of the authorityAgency property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getAuthorityAgency() {
        return authorityAgency;
    }

    /**
     * Sets the value of the authorityAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setAuthorityAgency(ZfcsOrganizationRef value) {
        this.authorityAgency = value;
    }

    /**
     * Gets the value of the authorityAgencyNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getAuthorityAgencyNew() {
        return authorityAgencyNew;
    }

    /**
     * Sets the value of the authorityAgencyNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setAuthorityAgencyNew(ZfcsOrganizationControlRegistersRef value) {
        this.authorityAgencyNew = value;
    }

    /**
     * Gets the value of the specialized property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getSpecialized() {
        return specialized;
    }

    /**
     * Sets the value of the specialized property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setSpecialized(ZfcsOrganizationRef value) {
        this.specialized = value;
    }

    /**
     * Gets the value of the specializedNew property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public ZfcsOrganizationControlRegistersRef getSpecializedNew() {
        return specializedNew;
    }

    /**
     * Sets the value of the specializedNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationControlRegistersRef }
     *     
     */
    public void setSpecializedNew(ZfcsOrganizationControlRegistersRef value) {
        this.specializedNew = value;
    }

    /**
     * Gets the value of the commission44 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintProjectSubjectType.Commission44 }
     *     
     */
    public ZfcsComplaintProjectSubjectType.Commission44 getCommission44() {
        return commission44;
    }

    /**
     * Sets the value of the commission44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintProjectSubjectType.Commission44 }
     *     
     */
    public void setCommission44(ZfcsComplaintProjectSubjectType.Commission44 value) {
        this.commission44 = value;
    }

    /**
     * Gets the value of the commission94 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintProjectSubjectType.Commission94 }
     *     
     */
    public ZfcsComplaintProjectSubjectType.Commission94 getCommission94() {
        return commission94;
    }

    /**
     * Sets the value of the commission94 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintProjectSubjectType.Commission94 }
     *     
     */
    public void setCommission94(ZfcsComplaintProjectSubjectType.Commission94 value) {
        this.commission94 = value;
    }

    /**
     * Gets the value of the contractServiceOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintProjectSubjectType.ContractServiceOfficer }
     *     
     */
    public ZfcsComplaintProjectSubjectType.ContractServiceOfficer getContractServiceOfficer() {
        return contractServiceOfficer;
    }

    /**
     * Sets the value of the contractServiceOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintProjectSubjectType.ContractServiceOfficer }
     *     
     */
    public void setContractServiceOfficer(ZfcsComplaintProjectSubjectType.ContractServiceOfficer value) {
        this.contractServiceOfficer = value;
    }

    /**
     * Gets the value of the contractService property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintProjectSubjectType.ContractService }
     *     
     */
    public ZfcsComplaintProjectSubjectType.ContractService getContractService() {
        return contractService;
    }

    /**
     * Sets the value of the contractService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintProjectSubjectType.ContractService }
     *     
     */
    public void setContractService(ZfcsComplaintProjectSubjectType.ContractService value) {
        this.contractService = value;
    }

    /**
     * Gets the value of the legalEntity44 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintProjectSubjectType.LegalEntity44 }
     *     
     */
    public ZfcsComplaintProjectSubjectType.LegalEntity44 getLegalEntity44() {
        return legalEntity44;
    }

    /**
     * Sets the value of the legalEntity44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintProjectSubjectType.LegalEntity44 }
     *     
     */
    public void setLegalEntity44(ZfcsComplaintProjectSubjectType.LegalEntity44 value) {
        this.legalEntity44 = value;
    }

    /**
     * Gets the value of the legalEntity307 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsComplaintProjectSubjectType.LegalEntity307 }
     *     
     */
    public ZfcsComplaintProjectSubjectType.LegalEntity307 getLegalEntity307() {
        return legalEntity307;
    }

    /**
     * Sets the value of the legalEntity307 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsComplaintProjectSubjectType.LegalEntity307 }
     *     
     */
    public void setLegalEntity307(ZfcsComplaintProjectSubjectType.LegalEntity307 value) {
        this.legalEntity307 = value;
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
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *               &lt;minLength value="1"/>
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
        "organization",
        "organizationNew",
        "info"
    })
    public static class Commission44 {

        protected ZfcsOrganizationRef organization;
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
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
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *               &lt;minLength value="1"/>
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
        "organization",
        "organizationNew",
        "info"
    })
    public static class Commission94 {

        protected ZfcsOrganizationRef organization;
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
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
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1000"/>
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
        "organization",
        "organizationNew",
        "info"
    })
    public static class ContractService {

        protected ZfcsOrganizationRef organization;
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
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
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1000"/>
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
        "organization",
        "organizationNew",
        "info"
    })
    public static class ContractServiceOfficer {

        protected ZfcsOrganizationRef organization;
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
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
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1000"/>
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
        "organization",
        "organizationNew",
        "info"
    })
    public static class LegalEntity307 {

        protected ZfcsOrganizationRef organization;
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
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
     *           &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *           &lt;element name="organizationNew" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationControlRegistersRef"/>
     *         &lt;/choice>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="1000"/>
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
        "organization",
        "organizationNew",
        "info"
    })
    public static class LegalEntity44 {

        protected ZfcsOrganizationRef organization;
        protected ZfcsOrganizationControlRegistersRef organizationNew;
        protected String info;

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public ZfcsOrganizationRef getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRef }
         *     
         */
        public void setOrganization(ZfcsOrganizationRef value) {
            this.organization = value;
        }

        /**
         * Gets the value of the organizationNew property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public ZfcsOrganizationControlRegistersRef getOrganizationNew() {
            return organizationNew;
        }

        /**
         * Sets the value of the organizationNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationControlRegistersRef }
         *     
         */
        public void setOrganizationNew(ZfcsOrganizationControlRegistersRef value) {
            this.organizationNew = value;
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

    }

}

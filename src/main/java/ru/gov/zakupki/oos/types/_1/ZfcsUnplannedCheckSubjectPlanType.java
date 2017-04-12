//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:58:14 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Субъект внеплановой проверки
 * 
 * <p>Java class for zfcs_unplannedCheckSubjectPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_unplannedCheckSubjectPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="authority" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="authorityAgency" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="specialized" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="EP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="commission44">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
 *                   &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
 *                   &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
 *                   &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *                   &lt;element name="info" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OOS_authority" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="OOS_support" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="RC_authority" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="FC_authority" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *         &lt;element name="other" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_unplannedCheckSubjectPlanType", propOrder = {
    "customer",
    "authority",
    "authorityAgency",
    "specialized",
    "ep",
    "commission44",
    "commission94",
    "contractServiceOfficer",
    "contractService",
    "oosAuthority",
    "oosSupport",
    "rcAuthority",
    "fcAuthority",
    "other"
})
public class ZfcsUnplannedCheckSubjectPlanType {

    protected ZfcsOrganizationRef customer;
    protected ZfcsOrganizationRef authority;
    protected ZfcsOrganizationRef authorityAgency;
    protected ZfcsOrganizationRef specialized;
    @XmlElement(name = "EP")
    protected ZfcsOrganizationRef ep;
    protected ZfcsUnplannedCheckSubjectPlanType.Commission44 commission44;
    protected ZfcsUnplannedCheckSubjectPlanType.Commission94 commission94;
    protected ZfcsUnplannedCheckSubjectPlanType.ContractServiceOfficer contractServiceOfficer;
    protected ZfcsUnplannedCheckSubjectPlanType.ContractService contractService;
    @XmlElement(name = "OOS_authority")
    protected ZfcsOrganizationRef oosAuthority;
    @XmlElement(name = "OOS_support")
    protected ZfcsOrganizationRef oosSupport;
    @XmlElement(name = "RC_authority")
    protected ZfcsOrganizationRef rcAuthority;
    @XmlElement(name = "FC_authority")
    protected ZfcsOrganizationRef fcAuthority;
    protected ZfcsOrganizationRef other;

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
     * Gets the value of the ep property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getEP() {
        return ep;
    }

    /**
     * Sets the value of the ep property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setEP(ZfcsOrganizationRef value) {
        this.ep = value;
    }

    /**
     * Gets the value of the commission44 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckSubjectPlanType.Commission44 }
     *     
     */
    public ZfcsUnplannedCheckSubjectPlanType.Commission44 getCommission44() {
        return commission44;
    }

    /**
     * Sets the value of the commission44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckSubjectPlanType.Commission44 }
     *     
     */
    public void setCommission44(ZfcsUnplannedCheckSubjectPlanType.Commission44 value) {
        this.commission44 = value;
    }

    /**
     * Gets the value of the commission94 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckSubjectPlanType.Commission94 }
     *     
     */
    public ZfcsUnplannedCheckSubjectPlanType.Commission94 getCommission94() {
        return commission94;
    }

    /**
     * Sets the value of the commission94 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckSubjectPlanType.Commission94 }
     *     
     */
    public void setCommission94(ZfcsUnplannedCheckSubjectPlanType.Commission94 value) {
        this.commission94 = value;
    }

    /**
     * Gets the value of the contractServiceOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckSubjectPlanType.ContractServiceOfficer }
     *     
     */
    public ZfcsUnplannedCheckSubjectPlanType.ContractServiceOfficer getContractServiceOfficer() {
        return contractServiceOfficer;
    }

    /**
     * Sets the value of the contractServiceOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckSubjectPlanType.ContractServiceOfficer }
     *     
     */
    public void setContractServiceOfficer(ZfcsUnplannedCheckSubjectPlanType.ContractServiceOfficer value) {
        this.contractServiceOfficer = value;
    }

    /**
     * Gets the value of the contractService property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedCheckSubjectPlanType.ContractService }
     *     
     */
    public ZfcsUnplannedCheckSubjectPlanType.ContractService getContractService() {
        return contractService;
    }

    /**
     * Sets the value of the contractService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedCheckSubjectPlanType.ContractService }
     *     
     */
    public void setContractService(ZfcsUnplannedCheckSubjectPlanType.ContractService value) {
        this.contractService = value;
    }

    /**
     * Gets the value of the oosAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getOOSAuthority() {
        return oosAuthority;
    }

    /**
     * Sets the value of the oosAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setOOSAuthority(ZfcsOrganizationRef value) {
        this.oosAuthority = value;
    }

    /**
     * Gets the value of the oosSupport property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getOOSSupport() {
        return oosSupport;
    }

    /**
     * Sets the value of the oosSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setOOSSupport(ZfcsOrganizationRef value) {
        this.oosSupport = value;
    }

    /**
     * Gets the value of the rcAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getRCAuthority() {
        return rcAuthority;
    }

    /**
     * Sets the value of the rcAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setRCAuthority(ZfcsOrganizationRef value) {
        this.rcAuthority = value;
    }

    /**
     * Gets the value of the fcAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getFCAuthority() {
        return fcAuthority;
    }

    /**
     * Sets the value of the fcAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setFCAuthority(ZfcsOrganizationRef value) {
        this.fcAuthority = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public ZfcsOrganizationRef getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationRef }
     *     
     */
    public void setOther(ZfcsOrganizationRef value) {
        this.other = value;
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
     *         &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
        "info"
    })
    public static class Commission44 {

        @XmlElement(required = true)
        protected ZfcsOrganizationRef organization;
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
     *         &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
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
        "info"
    })
    public static class Commission94 {

        @XmlElement(required = true)
        protected ZfcsOrganizationRef organization;
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
     *         &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
        "info"
    })
    public static class ContractService {

        @XmlElement(required = true)
        protected ZfcsOrganizationRef organization;
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
     *         &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef"/>
     *         &lt;element name="info" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
        "info"
    })
    public static class ContractServiceOfficer {

        @XmlElement(required = true)
        protected ZfcsOrganizationRef organization;
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

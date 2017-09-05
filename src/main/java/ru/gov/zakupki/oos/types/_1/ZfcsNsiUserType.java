//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Справочник пользователей
 * 
 * <p>Java class for zfcs_nsiUserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiUserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="firstName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="middleName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lastName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codePhrase" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="position" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_phoneType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eMailType" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
 *         &lt;element name="certificateSN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="certificateMask" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="esIssuerDN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4096"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="esIssuerSN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="userOrganizationRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/oos/types/1}zfcs_userStatusType"/>
 *         &lt;element name="ETPPrivilegesByOrganizationRole" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userOrganizationRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRoleType"/>
 *                   &lt;element name="ETPPrivileges" type="{http://zakupki.gov.ru/oos/types/1}zfcs_etpPrivilege" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ETPPrivileges" type="{http://zakupki.gov.ru/oos/types/1}zfcs_etpPrivilege" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiUserType", propOrder = {
    "login",
    "password",
    "firstName",
    "middleName",
    "lastName",
    "codePhrase",
    "position",
    "phone",
    "email",
    "organization",
    "certificateSN",
    "certificateMask",
    "esIssuerDN",
    "esIssuerSN",
    "userOrganizationRole",
    "status",
    "etpPrivilegesByOrganizationRole",
    "etpPrivileges"
})
public class ZfcsNsiUserType {

    @XmlElement(required = true)
    protected String login;
    protected byte[] password;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String codePhrase;
    protected String position;
    protected String phone;
    protected String email;
    protected ZfcsOrganizationRef organization;
    protected String certificateSN;
    protected String certificateMask;
    protected String esIssuerDN;
    protected String esIssuerSN;
    @XmlSchemaType(name = "string")
    protected List<ZfcsOrganizationRoleType> userOrganizationRole;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsUserStatusType status;
    @XmlElement(name = "ETPPrivilegesByOrganizationRole")
    protected List<ZfcsNsiUserType.ETPPrivilegesByOrganizationRole> etpPrivilegesByOrganizationRole;
    @XmlElement(name = "ETPPrivileges")
    protected List<ZfcsEtpPrivilege> etpPrivileges;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPassword(byte[] value) {
        this.password = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the codePhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePhrase() {
        return codePhrase;
    }

    /**
     * Sets the value of the codePhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePhrase(String value) {
        this.codePhrase = value;
    }

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
     * Gets the value of the certificateSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateSN() {
        return certificateSN;
    }

    /**
     * Sets the value of the certificateSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateSN(String value) {
        this.certificateSN = value;
    }

    /**
     * Gets the value of the certificateMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateMask() {
        return certificateMask;
    }

    /**
     * Sets the value of the certificateMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateMask(String value) {
        this.certificateMask = value;
    }

    /**
     * Gets the value of the esIssuerDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsIssuerDN() {
        return esIssuerDN;
    }

    /**
     * Sets the value of the esIssuerDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsIssuerDN(String value) {
        this.esIssuerDN = value;
    }

    /**
     * Gets the value of the esIssuerSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsIssuerSN() {
        return esIssuerSN;
    }

    /**
     * Sets the value of the esIssuerSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsIssuerSN(String value) {
        this.esIssuerSN = value;
    }

    /**
     * Gets the value of the userOrganizationRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userOrganizationRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserOrganizationRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsOrganizationRoleType }
     * 
     * 
     */
    public List<ZfcsOrganizationRoleType> getUserOrganizationRole() {
        if (userOrganizationRole == null) {
            userOrganizationRole = new ArrayList<ZfcsOrganizationRoleType>();
        }
        return this.userOrganizationRole;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUserStatusType }
     *     
     */
    public ZfcsUserStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUserStatusType }
     *     
     */
    public void setStatus(ZfcsUserStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the etpPrivilegesByOrganizationRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etpPrivilegesByOrganizationRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETPPrivilegesByOrganizationRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsNsiUserType.ETPPrivilegesByOrganizationRole }
     * 
     * 
     */
    public List<ZfcsNsiUserType.ETPPrivilegesByOrganizationRole> getETPPrivilegesByOrganizationRole() {
        if (etpPrivilegesByOrganizationRole == null) {
            etpPrivilegesByOrganizationRole = new ArrayList<ZfcsNsiUserType.ETPPrivilegesByOrganizationRole>();
        }
        return this.etpPrivilegesByOrganizationRole;
    }

    /**
     * Gets the value of the etpPrivileges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etpPrivileges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getETPPrivileges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsEtpPrivilege }
     * 
     * 
     */
    public List<ZfcsEtpPrivilege> getETPPrivileges() {
        if (etpPrivileges == null) {
            etpPrivileges = new ArrayList<ZfcsEtpPrivilege>();
        }
        return this.etpPrivileges;
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
     *         &lt;element name="userOrganizationRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRoleType"/>
     *         &lt;element name="ETPPrivileges" type="{http://zakupki.gov.ru/oos/types/1}zfcs_etpPrivilege" maxOccurs="unbounded"/>
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
        "userOrganizationRole",
        "etpPrivileges"
    })
    public static class ETPPrivilegesByOrganizationRole {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsOrganizationRoleType userOrganizationRole;
        @XmlElement(name = "ETPPrivileges", required = true)
        protected List<ZfcsEtpPrivilege> etpPrivileges;

        /**
         * Gets the value of the userOrganizationRole property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOrganizationRoleType }
         *     
         */
        public ZfcsOrganizationRoleType getUserOrganizationRole() {
            return userOrganizationRole;
        }

        /**
         * Sets the value of the userOrganizationRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOrganizationRoleType }
         *     
         */
        public void setUserOrganizationRole(ZfcsOrganizationRoleType value) {
            this.userOrganizationRole = value;
        }

        /**
         * Gets the value of the etpPrivileges property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the etpPrivileges property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getETPPrivileges().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsEtpPrivilege }
         * 
         * 
         */
        public List<ZfcsEtpPrivilege> getETPPrivileges() {
            if (etpPrivileges == null) {
                etpPrivileges = new ArrayList<ZfcsEtpPrivilege>();
            }
            return this.etpPrivileges;
        }

    }

}

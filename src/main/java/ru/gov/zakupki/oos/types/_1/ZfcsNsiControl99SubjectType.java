//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:46:03 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Справочник: Субъект контроля по 99 статье
 * 
 * <p>Java class for zfcs_nsiControl99SubjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiControl99SubjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="controlAuthorityInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiControl99SubjectOrgType"/>
 *         &lt;element name="customerInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiControl99SubjectOrgType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="powersCustomerOfgInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiControl99SubjectOrgType" minOccurs="0"/>
 *         &lt;element name="personalAccount" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99PersonalAccountType" minOccurs="0"/>
 *         &lt;element name="powersFOInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiControl99SubjectOrgType" minOccurs="0"/>
 *         &lt;element name="subjectType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="TOFK_SUBJECT"/>
 *               &lt;enumeration value="POWERS_DELEGATED_TO_TOFK"/>
 *               &lt;enumeration value="OTHER"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="CREATED"/>
 *               &lt;enumeration value="CONFIRMED"/>
 *               &lt;enumeration value="LOCKED"/>
 *               &lt;enumeration value="INVALID"/>
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
@XmlType(name = "zfcs_nsiControl99SubjectType", propOrder = {
    "id",
    "controlAuthorityInfo",
    "customerInfo",
    "powersCustomerOfgInfo",
    "personalAccount",
    "powersFOInfo",
    "subjectType",
    "status"
})
public class ZfcsNsiControl99SubjectType {

    protected long id;
    @XmlElement(required = true)
    protected ZfcsNsiControl99SubjectOrgType controlAuthorityInfo;
    @XmlElement(required = true)
    protected ZfcsNsiControl99SubjectType.CustomerInfo customerInfo;
    protected ZfcsNsiControl99SubjectOrgType powersCustomerOfgInfo;
    protected String personalAccount;
    protected ZfcsNsiControl99SubjectOrgType powersFOInfo;
    @XmlElement(required = true)
    protected String subjectType;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the controlAuthorityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiControl99SubjectOrgType }
     *     
     */
    public ZfcsNsiControl99SubjectOrgType getControlAuthorityInfo() {
        return controlAuthorityInfo;
    }

    /**
     * Sets the value of the controlAuthorityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiControl99SubjectOrgType }
     *     
     */
    public void setControlAuthorityInfo(ZfcsNsiControl99SubjectOrgType value) {
        this.controlAuthorityInfo = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiControl99SubjectType.CustomerInfo }
     *     
     */
    public ZfcsNsiControl99SubjectType.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiControl99SubjectType.CustomerInfo }
     *     
     */
    public void setCustomerInfo(ZfcsNsiControl99SubjectType.CustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the powersCustomerOfgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiControl99SubjectOrgType }
     *     
     */
    public ZfcsNsiControl99SubjectOrgType getPowersCustomerOfgInfo() {
        return powersCustomerOfgInfo;
    }

    /**
     * Sets the value of the powersCustomerOfgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiControl99SubjectOrgType }
     *     
     */
    public void setPowersCustomerOfgInfo(ZfcsNsiControl99SubjectOrgType value) {
        this.powersCustomerOfgInfo = value;
    }

    /**
     * Gets the value of the personalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAccount() {
        return personalAccount;
    }

    /**
     * Sets the value of the personalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAccount(String value) {
        this.personalAccount = value;
    }

    /**
     * Gets the value of the powersFOInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNsiControl99SubjectOrgType }
     *     
     */
    public ZfcsNsiControl99SubjectOrgType getPowersFOInfo() {
        return powersFOInfo;
    }

    /**
     * Sets the value of the powersFOInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNsiControl99SubjectOrgType }
     *     
     */
    public void setPowersFOInfo(ZfcsNsiControl99SubjectOrgType value) {
        this.powersFOInfo = value;
    }

    /**
     * Gets the value of the subjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectType() {
        return subjectType;
    }

    /**
     * Sets the value of the subjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectType(String value) {
        this.subjectType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiControl99SubjectOrgType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="OKTMO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMORef"/>
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
        "oktmo"
    })
    public static class CustomerInfo
        extends ZfcsNsiControl99SubjectOrgType
    {

        @XmlElement(name = "OKTMO")
        protected ZfcsOKTMORef oktmo;

        /**
         * Gets the value of the oktmo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOKTMORef }
         *     
         */
        public ZfcsOKTMORef getOKTMO() {
            return oktmo;
        }

        /**
         * Sets the value of the oktmo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOKTMORef }
         *     
         */
        public void setOKTMO(ZfcsOKTMORef value) {
            this.oktmo = value;
        }

    }

}

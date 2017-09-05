//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Привилегии пользователя на ЭП
 * 
 * <p>Java class for zfcs_etpPrivilege complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_etpPrivilege">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etp" type="{http://zakupki.gov.ru/oos/types/1}zfcs_ETPType"/>
 *         &lt;element name="etpAction" type="{http://zakupki.gov.ru/oos/types/1}zfcs_etpActionType"/>
 *         &lt;element name="organization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/oos/types/1}zfcs_etpActionStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_etpPrivilege", propOrder = {
    "etp",
    "etpAction",
    "organization",
    "status"
})
public class ZfcsEtpPrivilege {

    @XmlElement(required = true)
    protected ZfcsETPType etp;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsEtpActionType etpAction;
    protected ZfcsOrganizationRef organization;
    @XmlSchemaType(name = "string")
    protected ZfcsEtpActionStatusType status;

    /**
     * Gets the value of the etp property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsETPType }
     *     
     */
    public ZfcsETPType getEtp() {
        return etp;
    }

    /**
     * Sets the value of the etp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsETPType }
     *     
     */
    public void setEtp(ZfcsETPType value) {
        this.etp = value;
    }

    /**
     * Gets the value of the etpAction property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEtpActionType }
     *     
     */
    public ZfcsEtpActionType getEtpAction() {
        return etpAction;
    }

    /**
     * Sets the value of the etpAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEtpActionType }
     *     
     */
    public void setEtpAction(ZfcsEtpActionType value) {
        this.etpAction = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsEtpActionStatusType }
     *     
     */
    public ZfcsEtpActionStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsEtpActionStatusType }
     *     
     */
    public void setStatus(ZfcsEtpActionStatusType value) {
        this.status = value;
    }

}

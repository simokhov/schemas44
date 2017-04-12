//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:00 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Список связей "право - пользователь"
 * 
 * <p>Java class for zfcs_linkUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_linkUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="blockStatus" type="{http://zakupki.gov.ru/oos/types/1}zfcs_userLinkBlockStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_linkUser", propOrder = {
    "user",
    "blockStatus"
})
public class ZfcsLinkUser {

    @XmlElement(required = true)
    protected String user;
    @XmlSchemaType(name = "string")
    protected ZfcsUserLinkBlockStatusType blockStatus;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the blockStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUserLinkBlockStatusType }
     *     
     */
    public ZfcsUserLinkBlockStatusType getBlockStatus() {
        return blockStatus;
    }

    /**
     * Sets the value of the blockStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUserLinkBlockStatusType }
     *     
     */
    public void setBlockStatus(ZfcsUserLinkBlockStatusType value) {
        this.blockStatus = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.ResponsibleRoleEFType;


/**
 * Протокол проведения электронного аукциона
 * 
 * <p>Java class for protocolEF2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolEF2Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseProtocolType">
 *       &lt;sequence>
 *         &lt;element name="protocolPublisherInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="publisherOrgInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseOrganizationInfoType"/>
 *                   &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/base/1}responsibleRoleEFType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="protocolInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}protocolEF2InfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolEF2Type", propOrder = {
    "protocolPublisherInfo",
    "protocolInfo"
})
public class ProtocolEF2Type
    extends PurchaseProtocolType
{

    @XmlElement(required = true)
    protected ProtocolEF2Type.ProtocolPublisherInfo protocolPublisherInfo;
    @XmlElement(required = true)
    protected ProtocolEF2InfoType protocolInfo;

    /**
     * Gets the value of the protocolPublisherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEF2Type.ProtocolPublisherInfo }
     *     
     */
    public ProtocolEF2Type.ProtocolPublisherInfo getProtocolPublisherInfo() {
        return protocolPublisherInfo;
    }

    /**
     * Sets the value of the protocolPublisherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEF2Type.ProtocolPublisherInfo }
     *     
     */
    public void setProtocolPublisherInfo(ProtocolEF2Type.ProtocolPublisherInfo value) {
        this.protocolPublisherInfo = value;
    }

    /**
     * Gets the value of the protocolInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEF2InfoType }
     *     
     */
    public ProtocolEF2InfoType getProtocolInfo() {
        return protocolInfo;
    }

    /**
     * Sets the value of the protocolInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEF2InfoType }
     *     
     */
    public void setProtocolInfo(ProtocolEF2InfoType value) {
        this.protocolInfo = value;
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
     *         &lt;element name="publisherOrgInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseOrganizationInfoType"/>
     *         &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/base/1}responsibleRoleEFType"/>
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
        "publisherOrgInfo",
        "publisherRole"
    })
    public static class ProtocolPublisherInfo {

        @XmlElement(required = true)
        protected PurchaseOrganizationInfoType publisherOrgInfo;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ResponsibleRoleEFType publisherRole;

        /**
         * Gets the value of the publisherOrgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseOrganizationInfoType }
         *     
         */
        public PurchaseOrganizationInfoType getPublisherOrgInfo() {
            return publisherOrgInfo;
        }

        /**
         * Sets the value of the publisherOrgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseOrganizationInfoType }
         *     
         */
        public void setPublisherOrgInfo(PurchaseOrganizationInfoType value) {
            this.publisherOrgInfo = value;
        }

        /**
         * Gets the value of the publisherRole property.
         * 
         * @return
         *     possible object is
         *     {@link ResponsibleRoleEFType }
         *     
         */
        public ResponsibleRoleEFType getPublisherRole() {
            return publisherRole;
        }

        /**
         * Sets the value of the publisherRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponsibleRoleEFType }
         *     
         */
        public void setPublisherRole(ResponsibleRoleEFType value) {
            this.publisherRole = value;
        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.ResponsibleRoleEFType;


/**
 * Извещение о проведении ЭА (электронный аукцион);
 * внесение изменений
 * 
 * <p>Java class for notificationEFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationEFType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseNotificationType">
 *       &lt;sequence>
 *         &lt;element name="purchaseResponsibleInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/base/1}responsibleRoleEFType"/>
 *                   &lt;element name="responsibleOrgInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseOrganizationInfoType"/>
 *                   &lt;element name="responsibleInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}contactInfoType"/>
 *                   &lt;element name="specializedOrgInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseOrganizationInfoType" minOccurs="0"/>
 *                   &lt;element name="specializedInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}contactInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notificationInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}notificationEFInfoType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationEFType", propOrder = {
    "purchaseResponsibleInfo",
    "notificationInfo"
})
public class NotificationEFType
    extends PurchaseNotificationType
{

    @XmlElement(required = true)
    protected NotificationEFType.PurchaseResponsibleInfo purchaseResponsibleInfo;
    @XmlElement(required = true)
    protected NotificationEFInfoType notificationInfo;

    /**
     * Gets the value of the purchaseResponsibleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEFType.PurchaseResponsibleInfo }
     *     
     */
    public NotificationEFType.PurchaseResponsibleInfo getPurchaseResponsibleInfo() {
        return purchaseResponsibleInfo;
    }

    /**
     * Sets the value of the purchaseResponsibleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEFType.PurchaseResponsibleInfo }
     *     
     */
    public void setPurchaseResponsibleInfo(NotificationEFType.PurchaseResponsibleInfo value) {
        this.purchaseResponsibleInfo = value;
    }

    /**
     * Gets the value of the notificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEFInfoType }
     *     
     */
    public NotificationEFInfoType getNotificationInfo() {
        return notificationInfo;
    }

    /**
     * Sets the value of the notificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEFInfoType }
     *     
     */
    public void setNotificationInfo(NotificationEFInfoType value) {
        this.notificationInfo = value;
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
     *         &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/base/1}responsibleRoleEFType"/>
     *         &lt;element name="responsibleOrgInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseOrganizationInfoType"/>
     *         &lt;element name="responsibleInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}contactInfoType"/>
     *         &lt;element name="specializedOrgInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseOrganizationInfoType" minOccurs="0"/>
     *         &lt;element name="specializedInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}contactInfoType" minOccurs="0"/>
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
        "publisherRole",
        "responsibleOrgInfo",
        "responsibleInfo",
        "specializedOrgInfo",
        "specializedInfo"
    })
    public static class PurchaseResponsibleInfo {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ResponsibleRoleEFType publisherRole;
        @XmlElement(required = true)
        protected PurchaseOrganizationInfoType responsibleOrgInfo;
        @XmlElement(required = true)
        protected ContactInfoType responsibleInfo;
        protected PurchaseOrganizationInfoType specializedOrgInfo;
        protected ContactInfoType specializedInfo;

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

        /**
         * Gets the value of the responsibleOrgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseOrganizationInfoType }
         *     
         */
        public PurchaseOrganizationInfoType getResponsibleOrgInfo() {
            return responsibleOrgInfo;
        }

        /**
         * Sets the value of the responsibleOrgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseOrganizationInfoType }
         *     
         */
        public void setResponsibleOrgInfo(PurchaseOrganizationInfoType value) {
            this.responsibleOrgInfo = value;
        }

        /**
         * Gets the value of the responsibleInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ContactInfoType }
         *     
         */
        public ContactInfoType getResponsibleInfo() {
            return responsibleInfo;
        }

        /**
         * Sets the value of the responsibleInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactInfoType }
         *     
         */
        public void setResponsibleInfo(ContactInfoType value) {
            this.responsibleInfo = value;
        }

        /**
         * Gets the value of the specializedOrgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseOrganizationInfoType }
         *     
         */
        public PurchaseOrganizationInfoType getSpecializedOrgInfo() {
            return specializedOrgInfo;
        }

        /**
         * Sets the value of the specializedOrgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseOrganizationInfoType }
         *     
         */
        public void setSpecializedOrgInfo(PurchaseOrganizationInfoType value) {
            this.specializedOrgInfo = value;
        }

        /**
         * Gets the value of the specializedInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ContactInfoType }
         *     
         */
        public ContactInfoType getSpecializedInfo() {
            return specializedInfo;
        }

        /**
         * Sets the value of the specializedInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactInfoType }
         *     
         */
        public void setSpecializedInfo(ContactInfoType value) {
            this.specializedInfo = value;
        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.ResponsibleRoleEPType;
import ru.gov.zakupki.oos.common._1.AttachmentListType;
import ru.gov.zakupki.oos.common._1.ExtPrintFormType;
import ru.gov.zakupki.oos.common._1.PrintFormType;


/**
 * Тип: Общие поля извещений
 * 
 * <p>Java class for notificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}notificationCommonInfoType"/>
 *         &lt;element name="purchaseResponsibleInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="responsibleOrgInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}organizationType"/>
 *                   &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/base/1}responsibleRoleEPType"/>
 *                   &lt;element name="responsibleInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}contactInfoType"/>
 *                   &lt;element name="specializedOrgInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}organizationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/common/1}printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/oos/common/1}extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachmentsInfo" type="{http://zakupki.gov.ru/oos/common/1}attachmentListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationType", propOrder = {
    "id",
    "externalId",
    "versionNumber",
    "commonInfo",
    "purchaseResponsibleInfo",
    "printFormInfo",
    "extPrintFormInfo",
    "attachmentsInfo"
})
@XmlSeeAlso({
    NotificationEZakAType.class,
    NotificationEZakKType.class,
    NotificationEZakKDType.class,
    NotificationEZPPFType.class,
    NotificationEZakKOUType.class,
    NotificationEOKOUPFType.class,
    NotificationEOKDPFType.class,
    NotificationEOKPFType.class,
    NotificationEZKType.class
})
public class NotificationType {

    protected Long id;
    protected String externalId;
    protected Integer versionNumber;
    @XmlElement(required = true)
    protected NotificationCommonInfoType commonInfo;
    @XmlElement(required = true)
    protected NotificationType.PurchaseResponsibleInfo purchaseResponsibleInfo;
    protected PrintFormType printFormInfo;
    protected ExtPrintFormType extPrintFormInfo;
    protected AttachmentListType attachmentsInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionNumber(Integer value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCommonInfoType }
     *     
     */
    public NotificationCommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCommonInfoType }
     *     
     */
    public void setCommonInfo(NotificationCommonInfoType value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the purchaseResponsibleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType.PurchaseResponsibleInfo }
     *     
     */
    public NotificationType.PurchaseResponsibleInfo getPurchaseResponsibleInfo() {
        return purchaseResponsibleInfo;
    }

    /**
     * Sets the value of the purchaseResponsibleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType.PurchaseResponsibleInfo }
     *     
     */
    public void setPurchaseResponsibleInfo(NotificationType.PurchaseResponsibleInfo value) {
        this.purchaseResponsibleInfo = value;
    }

    /**
     * Gets the value of the printFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrintFormType }
     *     
     */
    public PrintFormType getPrintFormInfo() {
        return printFormInfo;
    }

    /**
     * Sets the value of the printFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintFormType }
     *     
     */
    public void setPrintFormInfo(PrintFormType value) {
        this.printFormInfo = value;
    }

    /**
     * Gets the value of the extPrintFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtPrintFormType }
     *     
     */
    public ExtPrintFormType getExtPrintFormInfo() {
        return extPrintFormInfo;
    }

    /**
     * Sets the value of the extPrintFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtPrintFormType }
     *     
     */
    public void setExtPrintFormInfo(ExtPrintFormType value) {
        this.extPrintFormInfo = value;
    }

    /**
     * Gets the value of the attachmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentListType }
     *     
     */
    public AttachmentListType getAttachmentsInfo() {
        return attachmentsInfo;
    }

    /**
     * Sets the value of the attachmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentListType }
     *     
     */
    public void setAttachmentsInfo(AttachmentListType value) {
        this.attachmentsInfo = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
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
     *         &lt;element name="responsibleOrgInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}organizationType"/>
     *         &lt;element name="responsibleRole" type="{http://zakupki.gov.ru/oos/base/1}responsibleRoleEPType"/>
     *         &lt;element name="responsibleInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}contactInfoType"/>
     *         &lt;element name="specializedOrgInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}organizationType" minOccurs="0"/>
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
        "responsibleOrgInfo",
        "responsibleRole",
        "responsibleInfo",
        "specializedOrgInfo"
    })
    public static class PurchaseResponsibleInfo {

        @XmlElement(required = true)
        protected OrganizationType responsibleOrgInfo;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ResponsibleRoleEPType responsibleRole;
        @XmlElement(required = true)
        protected ContactInfoType responsibleInfo;
        protected OrganizationType specializedOrgInfo;

        /**
         * Gets the value of the responsibleOrgInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationType }
         *     
         */
        public OrganizationType getResponsibleOrgInfo() {
            return responsibleOrgInfo;
        }

        /**
         * Sets the value of the responsibleOrgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationType }
         *     
         */
        public void setResponsibleOrgInfo(OrganizationType value) {
            this.responsibleOrgInfo = value;
        }

        /**
         * Gets the value of the responsibleRole property.
         * 
         * @return
         *     possible object is
         *     {@link ResponsibleRoleEPType }
         *     
         */
        public ResponsibleRoleEPType getResponsibleRole() {
            return responsibleRole;
        }

        /**
         * Sets the value of the responsibleRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponsibleRoleEPType }
         *     
         */
        public void setResponsibleRole(ResponsibleRoleEPType value) {
            this.responsibleRole = value;
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
         *     {@link OrganizationType }
         *     
         */
        public OrganizationType getSpecializedOrgInfo() {
            return specializedOrgInfo;
        }

        /**
         * Sets the value of the specializedOrgInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationType }
         *     
         */
        public void setSpecializedOrgInfo(OrganizationType value) {
            this.specializedOrgInfo = value;
        }

    }

}

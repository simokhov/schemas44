//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.base._1.ResponsibleRoleRKPOType;


/**
 * Информация об отмене протокола
 * 
 * <p>Java class for protocolCancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolCancelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}protocolCommonInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="canceledProtocolNumber" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}extPrintFormType"/>
 *         &lt;element name="attachmentsInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}attachmentListType" minOccurs="0"/>
 *         &lt;element name="cancelReason" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseCancelType"/>
 *         &lt;element name="printFormFieldsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolPublisherInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="publisherOrgInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseOrganizationInfoType"/>
 *                             &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/base/1}responsibleRoleRKPOType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="protocolName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                   &lt;element name="protocolPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "protocolCancelType", propOrder = {
    "id",
    "externalId",
    "commonInfo",
    "printFormInfo",
    "extPrintFormInfo",
    "attachmentsInfo",
    "cancelReason",
    "printFormFieldsInfo"
})
public class ProtocolCancelType {

    protected Long id;
    protected String externalId;
    @XmlElement(required = true)
    protected ProtocolCancelType.CommonInfo commonInfo;
    protected PrintFormType printFormInfo;
    @XmlElement(required = true)
    protected ExtPrintFormType extPrintFormInfo;
    protected AttachmentListType attachmentsInfo;
    @XmlElement(required = true)
    protected PurchaseCancelType cancelReason;
    protected ProtocolCancelType.PrintFormFieldsInfo printFormFieldsInfo;
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
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolCancelType.CommonInfo }
     *     
     */
    public ProtocolCancelType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolCancelType.CommonInfo }
     *     
     */
    public void setCommonInfo(ProtocolCancelType.CommonInfo value) {
        this.commonInfo = value;
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
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseCancelType }
     *     
     */
    public PurchaseCancelType getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseCancelType }
     *     
     */
    public void setCancelReason(PurchaseCancelType value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the printFormFieldsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolCancelType.PrintFormFieldsInfo }
     *     
     */
    public ProtocolCancelType.PrintFormFieldsInfo getPrintFormFieldsInfo() {
        return printFormFieldsInfo;
    }

    /**
     * Sets the value of the printFormFieldsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolCancelType.PrintFormFieldsInfo }
     *     
     */
    public void setPrintFormFieldsInfo(ProtocolCancelType.PrintFormFieldsInfo value) {
        this.printFormFieldsInfo = value;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}protocolCommonInfoType">
     *       &lt;sequence>
     *         &lt;element name="canceledProtocolNumber" type="{http://zakupki.gov.ru/oos/base/1}documentNumberType"/>
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
        "canceledProtocolNumber"
    })
    public static class CommonInfo
        extends ProtocolCommonInfoType
    {

        @XmlElement(required = true)
        protected String canceledProtocolNumber;

        /**
         * Gets the value of the canceledProtocolNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCanceledProtocolNumber() {
            return canceledProtocolNumber;
        }

        /**
         * Sets the value of the canceledProtocolNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCanceledProtocolNumber(String value) {
            this.canceledProtocolNumber = value;
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
     *         &lt;element name="protocolPublisherInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="publisherOrgInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseOrganizationInfoType"/>
     *                   &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/base/1}responsibleRoleRKPOType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="protocolName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *         &lt;element name="protocolPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "protocolPublisherInfo",
        "protocolName",
        "protocolPublishDate"
    })
    public static class PrintFormFieldsInfo {

        protected ProtocolCancelType.PrintFormFieldsInfo.ProtocolPublisherInfo protocolPublisherInfo;
        protected String protocolName;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar protocolPublishDate;

        /**
         * Gets the value of the protocolPublisherInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolCancelType.PrintFormFieldsInfo.ProtocolPublisherInfo }
         *     
         */
        public ProtocolCancelType.PrintFormFieldsInfo.ProtocolPublisherInfo getProtocolPublisherInfo() {
            return protocolPublisherInfo;
        }

        /**
         * Sets the value of the protocolPublisherInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolCancelType.PrintFormFieldsInfo.ProtocolPublisherInfo }
         *     
         */
        public void setProtocolPublisherInfo(ProtocolCancelType.PrintFormFieldsInfo.ProtocolPublisherInfo value) {
            this.protocolPublisherInfo = value;
        }

        /**
         * Gets the value of the protocolName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolName() {
            return protocolName;
        }

        /**
         * Sets the value of the protocolName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolName(String value) {
            this.protocolName = value;
        }

        /**
         * Gets the value of the protocolPublishDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getProtocolPublishDate() {
            return protocolPublishDate;
        }

        /**
         * Sets the value of the protocolPublishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setProtocolPublishDate(XMLGregorianCalendar value) {
            this.protocolPublishDate = value;
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
         *         &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/base/1}responsibleRoleRKPOType"/>
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
            protected ResponsibleRoleRKPOType publisherRole;

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
             *     {@link ResponsibleRoleRKPOType }
             *     
             */
            public ResponsibleRoleRKPOType getPublisherRole() {
                return publisherRole;
            }

            /**
             * Sets the value of the publisherRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResponsibleRoleRKPOType }
             *     
             */
            public void setPublisherRole(ResponsibleRoleRKPOType value) {
                this.publisherRole = value;
            }

        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.OrganizationRef;


/**
 * Тип: Общая информация о документе закупки
 * 
 * <p>Java class for purchaseDocumentCommonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseDocumentCommonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseCommonInfoType"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/pprf615types/1}printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/pprf615types/1}extPrintFormType" minOccurs="0"/>
 *         &lt;element name="attachmentsInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}attachmentListType" minOccurs="0"/>
 *         &lt;element name="printFormFieldsInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="customerInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
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
@XmlType(name = "purchaseDocumentCommonType", propOrder = {
    "id",
    "externalId",
    "commonInfo",
    "printForm",
    "extPrintForm",
    "attachmentsInfo",
    "printFormFieldsInfo"
})
@XmlSeeAlso({
    NotificationCancelType.class
})
public class PurchaseDocumentCommonType {

    protected Long id;
    protected String externalId;
    @XmlElement(required = true)
    protected PurchaseCommonInfoType commonInfo;
    protected PrintFormType printForm;
    protected ExtPrintFormType extPrintForm;
    protected AttachmentListType attachmentsInfo;
    protected PurchaseDocumentCommonType.PrintFormFieldsInfo printFormFieldsInfo;
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
     *     {@link PurchaseCommonInfoType }
     *     
     */
    public PurchaseCommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseCommonInfoType }
     *     
     */
    public void setCommonInfo(PurchaseCommonInfoType value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link PrintFormType }
     *     
     */
    public PrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintFormType }
     *     
     */
    public void setPrintForm(PrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ExtPrintFormType }
     *     
     */
    public ExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ExtPrintFormType value) {
        this.extPrintForm = value;
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
     * Gets the value of the printFormFieldsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseDocumentCommonType.PrintFormFieldsInfo }
     *     
     */
    public PurchaseDocumentCommonType.PrintFormFieldsInfo getPrintFormFieldsInfo() {
        return printFormFieldsInfo;
    }

    /**
     * Sets the value of the printFormFieldsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseDocumentCommonType.PrintFormFieldsInfo }
     *     
     */
    public void setPrintFormFieldsInfo(PurchaseDocumentCommonType.PrintFormFieldsInfo value) {
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="customerInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="purchaseObjectInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
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
        "customerInfo",
        "purchaseObjectInfo"
    })
    public static class PrintFormFieldsInfo {

        protected PurchaseDocumentCommonType.PrintFormFieldsInfo.CustomerInfo customerInfo;
        protected String purchaseObjectInfo;

        /**
         * Gets the value of the customerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseDocumentCommonType.PrintFormFieldsInfo.CustomerInfo }
         *     
         */
        public PurchaseDocumentCommonType.PrintFormFieldsInfo.CustomerInfo getCustomerInfo() {
            return customerInfo;
        }

        /**
         * Sets the value of the customerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseDocumentCommonType.PrintFormFieldsInfo.CustomerInfo }
         *     
         */
        public void setCustomerInfo(PurchaseDocumentCommonType.PrintFormFieldsInfo.CustomerInfo value) {
            this.customerInfo = value;
        }

        /**
         * Gets the value of the purchaseObjectInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurchaseObjectInfo() {
            return purchaseObjectInfo;
        }

        /**
         * Sets the value of the purchaseObjectInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurchaseObjectInfo(String value) {
            this.purchaseObjectInfo = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://zakupki.gov.ru/oos/base/1}organizationRef">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CustomerInfo
            extends OrganizationRef
        {


        }

    }

}

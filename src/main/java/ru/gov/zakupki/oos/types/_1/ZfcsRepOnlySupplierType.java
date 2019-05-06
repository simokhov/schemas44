//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о единственном поставщике из Реестра единственных поставщиков товара, производство которого создается или модернизируется и (или) осваивается на территории Российской Федерации (ст. 111.3, ст. 111.4 44-ФЗ) (РЕП)
 * 
 * <p>Java class for zfcs_repOnlySupplierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_repOnlySupplierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="repRegNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repRegNumber" minOccurs="0"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repCommonInfo"/>
 *         &lt;element name="products" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repProductsType"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType" minOccurs="0"/>
 *         &lt;element name="autoTestNoticeExtPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_repOnlySupplierType", propOrder = {
    "id",
    "externalId",
    "repRegNumber",
    "publishDate",
    "versionNumber",
    "commonInfo",
    "products",
    "attachments",
    "printForm",
    "autoTestNoticeExtPrintForm",
    "extPrintForm"
})
public class ZfcsRepOnlySupplierType {

    protected Long id;
    protected String externalId;
    protected String repRegNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    protected Integer versionNumber;
    @XmlElement(required = true)
    protected ZfcsRepCommonInfo commonInfo;
    @XmlElement(required = true)
    protected ZfcsRepProductsType products;
    protected ZfcsAttachmentListType attachments;
    protected ZfcsPrintFormType printForm;
    protected ZfcsExtPrintFormType autoTestNoticeExtPrintForm;
    protected ZfcsExtPrintFormType extPrintForm;

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
     * Gets the value of the repRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepRegNumber() {
        return repRegNumber;
    }

    /**
     * Sets the value of the repRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepRegNumber(String value) {
        this.repRegNumber = value;
    }

    /**
     * Gets the value of the publishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublishDate(XMLGregorianCalendar value) {
        this.publishDate = value;
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
     *     {@link ZfcsRepCommonInfo }
     *     
     */
    public ZfcsRepCommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepCommonInfo }
     *     
     */
    public void setCommonInfo(ZfcsRepCommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepProductsType }
     *     
     */
    public ZfcsRepProductsType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepProductsType }
     *     
     */
    public void setProducts(ZfcsRepProductsType value) {
        this.products = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public ZfcsAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the printForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public ZfcsPrintFormType getPrintForm() {
        return printForm;
    }

    /**
     * Sets the value of the printForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPrintFormType }
     *     
     */
    public void setPrintForm(ZfcsPrintFormType value) {
        this.printForm = value;
    }

    /**
     * Gets the value of the autoTestNoticeExtPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getAutoTestNoticeExtPrintForm() {
        return autoTestNoticeExtPrintForm;
    }

    /**
     * Sets the value of the autoTestNoticeExtPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setAutoTestNoticeExtPrintForm(ZfcsExtPrintFormType value) {
        this.autoTestNoticeExtPrintForm = value;
    }

    /**
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public ZfcsExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsExtPrintFormType value) {
        this.extPrintForm = value;
    }

}

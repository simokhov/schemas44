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


/**
 * Тип: Общая информация о протоколах
 * 
 * <p>Java class for purchaseProtocolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="versionNumber" type="{http://zakupki.gov.ru/oos/base/1}versionNumberType" minOccurs="0"/>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}protocolCommonInfoType"/>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}extPrintFormType"/>
 *         &lt;element name="attachmentsInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}attachmentListType" minOccurs="0"/>
 *         &lt;element name="modificationInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseModificationType" minOccurs="0"/>
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
@XmlType(name = "purchaseProtocolType", propOrder = {
    "id",
    "externalId",
    "versionNumber",
    "commonInfo",
    "printFormInfo",
    "extPrintFormInfo",
    "attachmentsInfo",
    "modificationInfo"
})
@XmlSeeAlso({
    ProtocolEF2Type.class,
    ProtocolPOType.class,
    ProtocolEF1Type.class
})
public class PurchaseProtocolType {

    protected Long id;
    protected String externalId;
    protected Integer versionNumber;
    @XmlElement(required = true)
    protected ProtocolCommonInfoType commonInfo;
    protected PrintFormType printFormInfo;
    @XmlElement(required = true)
    protected ExtPrintFormType extPrintFormInfo;
    protected AttachmentListType attachmentsInfo;
    protected PurchaseModificationType modificationInfo;
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
     *     {@link ProtocolCommonInfoType }
     *     
     */
    public ProtocolCommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolCommonInfoType }
     *     
     */
    public void setCommonInfo(ProtocolCommonInfoType value) {
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
     * Gets the value of the modificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseModificationType }
     *     
     */
    public PurchaseModificationType getModificationInfo() {
        return modificationInfo;
    }

    /**
     * Sets the value of the modificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseModificationType }
     *     
     */
    public void setModificationInfo(PurchaseModificationType value) {
        this.modificationInfo = value;
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

}

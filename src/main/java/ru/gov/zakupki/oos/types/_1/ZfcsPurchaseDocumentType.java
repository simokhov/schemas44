//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:55:40 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.printform._1.FcsPurchaseDocumentType;


/**
 * Информация о документе закупки
 * 
 * <p>Java class for zfcs_purchaseDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseDocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseDocumentCommonType">
 *       &lt;sequence>
 *         &lt;element name="docType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_docType"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="modification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modificationNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="addInfo" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseChangeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchaseDocumentType", propOrder = {
    "docType",
    "addInfo",
    "attachments",
    "modification"
})
@XmlSeeAlso({
    FcsPurchaseDocumentType.class
})
public class ZfcsPurchaseDocumentType
    extends ZfcsPurchaseDocumentCommonType
{

    @XmlElement(required = true)
    protected ZfcsDocType docType;
    protected String addInfo;
    protected ZfcsAttachmentListType attachments;
    protected ZfcsPurchaseDocumentType.Modification modification;

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsDocType }
     *     
     */
    public ZfcsDocType getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsDocType }
     *     
     */
    public void setDocType(ZfcsDocType value) {
        this.docType = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
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
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseDocumentType.Modification }
     *     
     */
    public ZfcsPurchaseDocumentType.Modification getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseDocumentType.Modification }
     *     
     */
    public void setModification(ZfcsPurchaseDocumentType.Modification value) {
        this.modification = value;
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
     *         &lt;element name="modificationNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="addInfo" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseChangeType" minOccurs="0"/>
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
        "modificationNumber",
        "info",
        "addInfo",
        "reason"
    })
    public static class Modification {

        protected int modificationNumber;
        @XmlElement(required = true)
        protected String info;
        protected String addInfo;
        protected ZfcsPurchaseChangeType reason;

        /**
         * Gets the value of the modificationNumber property.
         * 
         */
        public int getModificationNumber() {
            return modificationNumber;
        }

        /**
         * Sets the value of the modificationNumber property.
         * 
         */
        public void setModificationNumber(int value) {
            this.modificationNumber = value;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

        /**
         * Gets the value of the addInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddInfo() {
            return addInfo;
        }

        /**
         * Sets the value of the addInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddInfo(String value) {
            this.addInfo = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseChangeType }
         *     
         */
        public ZfcsPurchaseChangeType getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseChangeType }
         *     
         */
        public void setReason(ZfcsPurchaseChangeType value) {
            this.reason = value;
        }

    }

}

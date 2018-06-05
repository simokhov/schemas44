//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Прикрепленные документы в выжимке контракта для контроля по 99 статье
 * 
 * <p>Java class for zfcs_control99ContractAttachmentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99ContractAttachmentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
 *                 &lt;sequence>
 *                   &lt;element name="docType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ContractDocTypeType" minOccurs="0"/>
 *                   &lt;element name="internalUrl" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1024"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_control99ContractAttachmentListType", propOrder = {
    "attachment"
})
public class ZfcsControl99ContractAttachmentListType {

    @XmlElement(required = true)
    protected List<ZfcsControl99ContractAttachmentListType.Attachment> attachment;

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsControl99ContractAttachmentListType.Attachment }
     * 
     * 
     */
    public List<ZfcsControl99ContractAttachmentListType.Attachment> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<ZfcsControl99ContractAttachmentListType.Attachment>();
        }
        return this.attachment;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
     *       &lt;sequence>
     *         &lt;element name="docType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ContractDocTypeType" minOccurs="0"/>
     *         &lt;element name="internalUrl" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1024"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
    @XmlType(name = "", propOrder = {
        "docType",
        "internalUrl"
    })
    public static class Attachment
        extends ZfcsAttachmentType
    {

        @XmlSchemaType(name = "string")
        protected ZfcsControl99ContractDocTypeType docType;
        protected String internalUrl;

        /**
         * Gets the value of the docType property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsControl99ContractDocTypeType }
         *     
         */
        public ZfcsControl99ContractDocTypeType getDocType() {
            return docType;
        }

        /**
         * Sets the value of the docType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsControl99ContractDocTypeType }
         *     
         */
        public void setDocType(ZfcsControl99ContractDocTypeType value) {
            this.docType = value;
        }

        /**
         * Gets the value of the internalUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternalUrl() {
            return internalUrl;
        }

        /**
         * Sets the value of the internalUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternalUrl(String value) {
            this.internalUrl = value;
        }

    }

}

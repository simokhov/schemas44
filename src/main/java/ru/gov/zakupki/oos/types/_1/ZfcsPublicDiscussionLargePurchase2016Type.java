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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация об обязательном общественном обсуждения крупной закупки (ООКЗ)
 * 
 * <p>Java class for zfcs_publicDiscussionLargePurchase2016Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionLargePurchase2016Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionCommonInfo2016Type"/>
 *         &lt;element name="topic" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="ZK-14.112" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="publishOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType"/>
 *         &lt;element name="phases" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionPhases2016Type"/>
 *         &lt;element name="attachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attachment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
 *                           &lt;sequence>
 *                             &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_extPrintFormType" minOccurs="0"/>
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
@XmlType(name = "zfcs_publicDiscussionLargePurchase2016Type", propOrder = {
    "commonInfo",
    "topic",
    "zk14112",
    "publishOrg",
    "phases",
    "attachments",
    "extPrintForm"
})
@XmlSeeAlso({
    ZfcsPublicDiscussionSuspension2016Type.class
})
public class ZfcsPublicDiscussionLargePurchase2016Type {

    @XmlElement(required = true)
    protected ZfcsPublicDiscussionCommonInfo2016Type commonInfo;
    @XmlElement(required = true)
    protected String topic;
    @XmlElement(name = "ZK-14.112")
    protected Boolean zk14112;
    @XmlElement(required = true)
    protected ZfcsOrganizationInfoType publishOrg;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionPhases2016Type phases;
    protected ZfcsPublicDiscussionLargePurchase2016Type.Attachments attachments;
    protected ZfcsExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionCommonInfo2016Type }
     *     
     */
    public ZfcsPublicDiscussionCommonInfo2016Type getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionCommonInfo2016Type }
     *     
     */
    public void setCommonInfo(ZfcsPublicDiscussionCommonInfo2016Type value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the zk14112 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZK14112() {
        return zk14112;
    }

    /**
     * Sets the value of the zk14112 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZK14112(Boolean value) {
        this.zk14112 = value;
    }

    /**
     * Gets the value of the publishOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public ZfcsOrganizationInfoType getPublishOrg() {
        return publishOrg;
    }

    /**
     * Sets the value of the publishOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public void setPublishOrg(ZfcsOrganizationInfoType value) {
        this.publishOrg = value;
    }

    /**
     * Gets the value of the phases property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPhases2016Type }
     *     
     */
    public ZfcsPublicDiscussionPhases2016Type getPhases() {
        return phases;
    }

    /**
     * Sets the value of the phases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPhases2016Type }
     *     
     */
    public void setPhases(ZfcsPublicDiscussionPhases2016Type value) {
        this.phases = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionLargePurchase2016Type.Attachments }
     *     
     */
    public ZfcsPublicDiscussionLargePurchase2016Type.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionLargePurchase2016Type.Attachments }
     *     
     */
    public void setAttachments(ZfcsPublicDiscussionLargePurchase2016Type.Attachments value) {
        this.attachments = value;
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
     *         &lt;element name="attachment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
     *                 &lt;sequence>
     *                   &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "attachment"
    })
    public static class Attachments {

        @XmlElement(required = true)
        protected List<ZfcsPublicDiscussionLargePurchase2016Type.Attachments.Attachment> attachment;

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
         * {@link ZfcsPublicDiscussionLargePurchase2016Type.Attachments.Attachment }
         * 
         * 
         */
        public List<ZfcsPublicDiscussionLargePurchase2016Type.Attachments.Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<ZfcsPublicDiscussionLargePurchase2016Type.Attachments.Attachment>();
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
         *         &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
            "placingDate"
        })
        public static class Attachment
            extends ZfcsAttachmentType
        {

            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar placingDate;

            /**
             * Gets the value of the placingDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPlacingDate() {
                return placingDate;
            }

            /**
             * Sets the value of the placingDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPlacingDate(XMLGregorianCalendar value) {
                this.placingDate = value;
            }

        }

    }

}

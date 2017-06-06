//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:26:31 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Протокол этапа ООКЗ
 * 
 * <p>Java class for zfcs_publicDiscussionProtocolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionProtocolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="protocolPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="protocolNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionProtocolNumType"/>
 *         &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionDecisionRef"/>
 *         &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionFoundationRef" minOccurs="0"/>
 *         &lt;element name="attachments">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_publicDiscussionProtocolType", propOrder = {
    "protocolDate",
    "protocolPublishDate",
    "protocolNumber",
    "decision",
    "foundation",
    "attachments"
})
public class ZfcsPublicDiscussionProtocolType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protocolDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protocolPublishDate;
    @XmlElement(required = true)
    protected String protocolNumber;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionDecisionRef decision;
    protected ZfcsPublicDiscussionFoundationRef foundation;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionProtocolType.Attachments attachments;

    /**
     * Gets the value of the protocolDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtocolDate() {
        return protocolDate;
    }

    /**
     * Sets the value of the protocolDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtocolDate(XMLGregorianCalendar value) {
        this.protocolDate = value;
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
     * Gets the value of the protocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolNumber() {
        return protocolNumber;
    }

    /**
     * Sets the value of the protocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolNumber(String value) {
        this.protocolNumber = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionDecisionRef }
     *     
     */
    public ZfcsPublicDiscussionDecisionRef getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionDecisionRef }
     *     
     */
    public void setDecision(ZfcsPublicDiscussionDecisionRef value) {
        this.decision = value;
    }

    /**
     * Gets the value of the foundation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionFoundationRef }
     *     
     */
    public ZfcsPublicDiscussionFoundationRef getFoundation() {
        return foundation;
    }

    /**
     * Sets the value of the foundation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionFoundationRef }
     *     
     */
    public void setFoundation(ZfcsPublicDiscussionFoundationRef value) {
        this.foundation = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionProtocolType.Attachments }
     *     
     */
    public ZfcsPublicDiscussionProtocolType.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionProtocolType.Attachments }
     *     
     */
    public void setAttachments(ZfcsPublicDiscussionProtocolType.Attachments value) {
        this.attachments = value;
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
        protected List<ZfcsPublicDiscussionProtocolType.Attachments.Attachment> attachment;

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
         * {@link ZfcsPublicDiscussionProtocolType.Attachments.Attachment }
         * 
         * 
         */
        public List<ZfcsPublicDiscussionProtocolType.Attachments.Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<ZfcsPublicDiscussionProtocolType.Attachments.Attachment>();
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

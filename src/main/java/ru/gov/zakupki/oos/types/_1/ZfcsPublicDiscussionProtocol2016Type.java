//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:36 PM MSK 
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
 * <p>Java class for zfcs_publicDiscussionProtocol2016Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionProtocol2016Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "zfcs_publicDiscussionProtocol2016Type", propOrder = {
    "protocolDate",
    "decision",
    "foundation",
    "attachments"
})
public class ZfcsPublicDiscussionProtocol2016Type {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protocolDate;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionDecisionRef decision;
    protected ZfcsPublicDiscussionFoundationRef foundation;
    @XmlElement(required = true)
    protected ZfcsPublicDiscussionProtocol2016Type.Attachments attachments;

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
     *     {@link ZfcsPublicDiscussionProtocol2016Type.Attachments }
     *     
     */
    public ZfcsPublicDiscussionProtocol2016Type.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionProtocol2016Type.Attachments }
     *     
     */
    public void setAttachments(ZfcsPublicDiscussionProtocol2016Type.Attachments value) {
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
        protected List<ZfcsPublicDiscussionProtocol2016Type.Attachments.Attachment> attachment;

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
         * {@link ZfcsPublicDiscussionProtocol2016Type.Attachments.Attachment }
         * 
         * 
         */
        public List<ZfcsPublicDiscussionProtocol2016Type.Attachments.Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<ZfcsPublicDiscussionProtocol2016Type.Attachments.Attachment>();
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

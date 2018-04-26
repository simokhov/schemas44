//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация об общественном обсуждении по лоту закупки
 * 
 * <p>Java class for zfcs_publicDiscussionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="number" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType"/>
 *           &lt;element name="organizationCh5St15" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *           &lt;element name="publicDiscussion2017">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="publicDiscussionLargePurchasePhase2" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                               &lt;element name="protocolPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                               &lt;element name="publicDiscussionPhase2Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType" minOccurs="0"/>
 *                               &lt;element name="hrefPhase2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                               &lt;element name="attachments" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="attachment" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionPlaceEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_publicDiscussionType", propOrder = {
    "number",
    "organizationCh5St15",
    "href",
    "publicDiscussion2017",
    "place"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsNotificationEFType.Lot.PublicDiscussion.class,
    ru.gov.zakupki.oos.types._1.ZfcsNotificationEPType.Lot.PublicDiscussion.class
})
public class ZfcsPublicDiscussionType {

    protected String number;
    protected Boolean organizationCh5St15;
    protected String href;
    protected ZfcsPublicDiscussionType.PublicDiscussion2017 publicDiscussion2017;
    @XmlSchemaType(name = "string")
    protected ZfcsPublicDiscussionPlaceEnum place;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the organizationCh5St15 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrganizationCh5St15() {
        return organizationCh5St15;
    }

    /**
     * Sets the value of the organizationCh5St15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrganizationCh5St15(Boolean value) {
        this.organizationCh5St15 = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the publicDiscussion2017 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionType.PublicDiscussion2017 }
     *     
     */
    public ZfcsPublicDiscussionType.PublicDiscussion2017 getPublicDiscussion2017() {
        return publicDiscussion2017;
    }

    /**
     * Sets the value of the publicDiscussion2017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionType.PublicDiscussion2017 }
     *     
     */
    public void setPublicDiscussion2017(ZfcsPublicDiscussionType.PublicDiscussion2017 value) {
        this.publicDiscussion2017 = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionPlaceEnum }
     *     
     */
    public ZfcsPublicDiscussionPlaceEnum getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionPlaceEnum }
     *     
     */
    public void setPlace(ZfcsPublicDiscussionPlaceEnum value) {
        this.place = value;
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
     *         &lt;element name="publicDiscussionLargePurchasePhase2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="protocolPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="publicDiscussionPhase2Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType" minOccurs="0"/>
     *                   &lt;element name="hrefPhase2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                   &lt;element name="attachments" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="attachment" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentType">
     *                                     &lt;sequence>
     *                                       &lt;element name="placingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
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
    @XmlType(name = "", propOrder = {
        "publicDiscussionLargePurchasePhase2"
    })
    public static class PublicDiscussion2017 {

        protected ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 publicDiscussionLargePurchasePhase2;

        /**
         * Gets the value of the publicDiscussionLargePurchasePhase2 property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 }
         *     
         */
        public ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 getPublicDiscussionLargePurchasePhase2() {
            return publicDiscussionLargePurchasePhase2;
        }

        /**
         * Sets the value of the publicDiscussionLargePurchasePhase2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 }
         *     
         */
        public void setPublicDiscussionLargePurchasePhase2(ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 value) {
            this.publicDiscussionLargePurchasePhase2 = value;
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
         *         &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="protocolPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="publicDiscussionPhase2Num" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionNumType" minOccurs="0"/>
         *         &lt;element name="hrefPhase2" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
            "protocolDate",
            "protocolPublishDate",
            "publicDiscussionPhase2Num",
            "hrefPhase2",
            "attachments"
        })
        public static class PublicDiscussionLargePurchasePhase2 {

            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar protocolDate;
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar protocolPublishDate;
            protected String publicDiscussionPhase2Num;
            protected String hrefPhase2;
            protected ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 .Attachments attachments;

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
             * Gets the value of the publicDiscussionPhase2Num property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPublicDiscussionPhase2Num() {
                return publicDiscussionPhase2Num;
            }

            /**
             * Sets the value of the publicDiscussionPhase2Num property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPublicDiscussionPhase2Num(String value) {
                this.publicDiscussionPhase2Num = value;
            }

            /**
             * Gets the value of the hrefPhase2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHrefPhase2() {
                return hrefPhase2;
            }

            /**
             * Sets the value of the hrefPhase2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHrefPhase2(String value) {
                this.hrefPhase2 = value;
            }

            /**
             * Gets the value of the attachments property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 .Attachments }
             *     
             */
            public ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 .Attachments getAttachments() {
                return attachments;
            }

            /**
             * Sets the value of the attachments property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 .Attachments }
             *     
             */
            public void setAttachments(ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 .Attachments value) {
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
                protected List<ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 .Attachments.Attachment> attachment;

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
                 * {@link ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 .Attachments.Attachment }
                 * 
                 * 
                 */
                public List<ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 .Attachments.Attachment> getAttachment() {
                    if (attachment == null) {
                        attachment = new ArrayList<ZfcsPublicDiscussionType.PublicDiscussion2017 .PublicDiscussionLargePurchasePhase2 .Attachments.Attachment>();
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

    }

}

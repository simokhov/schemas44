//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:54:10 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Протокол проведения электронного аукциона
 * 
 * <p>Java class for zfcs_protocolEF2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolEF2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="purchaseNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNumberType"/>
 *         &lt;element name="protocolNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType"/>
 *         &lt;element name="foundationProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *         &lt;element name="parentProtocolNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_documentNumberType" minOccurs="0"/>
 *         &lt;element name="place" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="publishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="href" type="{http://zakupki.gov.ru/oos/types/1}zfcs_hrefType"/>
 *         &lt;element name="printForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_printFormType"/>
 *         &lt;element name="protocolPublisher" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="publisherOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
 *                   &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_protocolModificationType" minOccurs="0"/>
 *         &lt;element name="protocolLot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applications">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="application" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
 *                                       &lt;element name="priceOffers" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="firstOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
 *                                                 &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
 *                                                 &lt;element name="offersQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
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
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolEF2Type", propOrder = {
    "id",
    "externalId",
    "purchaseNumber",
    "protocolNumber",
    "foundationProtocolNumber",
    "parentProtocolNumber",
    "place",
    "protocolDate",
    "signDate",
    "publishDate",
    "href",
    "printForm",
    "protocolPublisher",
    "attachments",
    "modification",
    "protocolLot"
})
public class ZfcsProtocolEF2Type {

    protected Long id;
    protected String externalId;
    @XmlElement(required = true)
    protected String purchaseNumber;
    @XmlElement(required = true)
    protected String protocolNumber;
    protected String foundationProtocolNumber;
    protected String parentProtocolNumber;
    @XmlElement(required = true)
    protected String place;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protocolDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    @XmlElement(required = true)
    protected String href;
    @XmlElement(required = true)
    protected ZfcsPrintFormType printForm;
    protected ZfcsProtocolEF2Type.ProtocolPublisher protocolPublisher;
    protected ZfcsAttachmentListType attachments;
    protected ZfcsProtocolModificationType modification;
    @XmlElement(required = true)
    protected ZfcsProtocolEF2Type.ProtocolLot protocolLot;
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
     * Gets the value of the purchaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    /**
     * Sets the value of the purchaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseNumber(String value) {
        this.purchaseNumber = value;
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
     * Gets the value of the foundationProtocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundationProtocolNumber() {
        return foundationProtocolNumber;
    }

    /**
     * Sets the value of the foundationProtocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundationProtocolNumber(String value) {
        this.foundationProtocolNumber = value;
    }

    /**
     * Gets the value of the parentProtocolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProtocolNumber() {
        return parentProtocolNumber;
    }

    /**
     * Sets the value of the parentProtocolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProtocolNumber(String value) {
        this.parentProtocolNumber = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

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
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDate(XMLGregorianCalendar value) {
        this.signDate = value;
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
     * Gets the value of the protocolPublisher property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEF2Type.ProtocolPublisher }
     *     
     */
    public ZfcsProtocolEF2Type.ProtocolPublisher getProtocolPublisher() {
        return protocolPublisher;
    }

    /**
     * Sets the value of the protocolPublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEF2Type.ProtocolPublisher }
     *     
     */
    public void setProtocolPublisher(ZfcsProtocolEF2Type.ProtocolPublisher value) {
        this.protocolPublisher = value;
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
     *     {@link ZfcsProtocolModificationType }
     *     
     */
    public ZfcsProtocolModificationType getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolModificationType }
     *     
     */
    public void setModification(ZfcsProtocolModificationType value) {
        this.modification = value;
    }

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEF2Type.ProtocolLot }
     *     
     */
    public ZfcsProtocolEF2Type.ProtocolLot getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEF2Type.ProtocolLot }
     *     
     */
    public void setProtocolLot(ZfcsProtocolEF2Type.ProtocolLot value) {
        this.protocolLot = value;
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
     *         &lt;element name="applications">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="application" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
     *                             &lt;element name="priceOffers" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="firstOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
     *                                       &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
     *                                       &lt;element name="offersQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
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
        "applications"
    })
    public static class ProtocolLot {

        @XmlElement(required = true)
        protected ZfcsProtocolEF2Type.ProtocolLot.Applications applications;

        /**
         * Gets the value of the applications property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsProtocolEF2Type.ProtocolLot.Applications }
         *     
         */
        public ZfcsProtocolEF2Type.ProtocolLot.Applications getApplications() {
            return applications;
        }

        /**
         * Sets the value of the applications property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsProtocolEF2Type.ProtocolLot.Applications }
         *     
         */
        public void setApplications(ZfcsProtocolEF2Type.ProtocolLot.Applications value) {
            this.applications = value;
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
         *         &lt;element name="application" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
         *                   &lt;element name="priceOffers" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="firstOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
         *                             &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
         *                             &lt;element name="offersQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
            "application"
        })
        public static class Applications {

            @XmlElement(required = true)
            protected List<ZfcsProtocolEF2Type.ProtocolLot.Applications.Application> application;

            /**
             * Gets the value of the application property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the application property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getApplication().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsProtocolEF2Type.ProtocolLot.Applications.Application }
             * 
             * 
             */
            public List<ZfcsProtocolEF2Type.ProtocolLot.Applications.Application> getApplication() {
                if (application == null) {
                    application = new ArrayList<ZfcsProtocolEF2Type.ProtocolLot.Applications.Application>();
                }
                return this.application;
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
             *         &lt;element name="journalNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_journalNumberType"/>
             *         &lt;element name="priceOffers" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="firstOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
             *                   &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
             *                   &lt;element name="offersQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
                "journalNumber",
                "priceOffers"
            })
            public static class Application {

                @XmlElement(required = true)
                protected String journalNumber;
                protected ZfcsProtocolEF2Type.ProtocolLot.Applications.Application.PriceOffers priceOffers;

                /**
                 * Gets the value of the journalNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getJournalNumber() {
                    return journalNumber;
                }

                /**
                 * Sets the value of the journalNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setJournalNumber(String value) {
                    this.journalNumber = value;
                }

                /**
                 * Gets the value of the priceOffers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsProtocolEF2Type.ProtocolLot.Applications.Application.PriceOffers }
                 *     
                 */
                public ZfcsProtocolEF2Type.ProtocolLot.Applications.Application.PriceOffers getPriceOffers() {
                    return priceOffers;
                }

                /**
                 * Sets the value of the priceOffers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsProtocolEF2Type.ProtocolLot.Applications.Application.PriceOffers }
                 *     
                 */
                public void setPriceOffers(ZfcsProtocolEF2Type.ProtocolLot.Applications.Application.PriceOffers value) {
                    this.priceOffers = value;
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
                 *         &lt;element name="firstOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
                 *         &lt;element name="lastOffer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bidType"/>
                 *         &lt;element name="offersQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
                    "firstOffer",
                    "lastOffer",
                    "offersQuantity"
                })
                public static class PriceOffers {

                    @XmlElement(required = true)
                    protected ZfcsBidType firstOffer;
                    @XmlElement(required = true)
                    protected ZfcsBidType lastOffer;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger offersQuantity;

                    /**
                     * Gets the value of the firstOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsBidType }
                     *     
                     */
                    public ZfcsBidType getFirstOffer() {
                        return firstOffer;
                    }

                    /**
                     * Sets the value of the firstOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsBidType }
                     *     
                     */
                    public void setFirstOffer(ZfcsBidType value) {
                        this.firstOffer = value;
                    }

                    /**
                     * Gets the value of the lastOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ZfcsBidType }
                     *     
                     */
                    public ZfcsBidType getLastOffer() {
                        return lastOffer;
                    }

                    /**
                     * Sets the value of the lastOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ZfcsBidType }
                     *     
                     */
                    public void setLastOffer(ZfcsBidType value) {
                        this.lastOffer = value;
                    }

                    /**
                     * Gets the value of the offersQuantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getOffersQuantity() {
                        return offersQuantity;
                    }

                    /**
                     * Sets the value of the offersQuantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setOffersQuantity(BigInteger value) {
                        this.offersQuantity = value;
                    }

                }

            }

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
     *         &lt;element name="publisherOrg" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType"/>
     *         &lt;element name="publisherRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_responsibleRoleType"/>
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
        "publisherOrg",
        "publisherRole"
    })
    public static class ProtocolPublisher {

        @XmlElement(required = true)
        protected ZfcsPurchaseOrganizationType publisherOrg;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ZfcsResponsibleRoleType publisherRole;

        /**
         * Gets the value of the publisherOrg property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public ZfcsPurchaseOrganizationType getPublisherOrg() {
            return publisherOrg;
        }

        /**
         * Sets the value of the publisherOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseOrganizationType }
         *     
         */
        public void setPublisherOrg(ZfcsPurchaseOrganizationType value) {
            this.publisherOrg = value;
        }

        /**
         * Gets the value of the publisherRole property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsResponsibleRoleType }
         *     
         */
        public ZfcsResponsibleRoleType getPublisherRole() {
            return publisherRole;
        }

        /**
         * Sets the value of the publisherRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsResponsibleRoleType }
         *     
         */
        public void setPublisherRole(ZfcsResponsibleRoleType value) {
            this.publisherRole = value;
        }

    }

}

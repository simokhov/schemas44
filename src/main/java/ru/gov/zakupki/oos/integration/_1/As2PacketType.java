//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:54:10 AM MSK 
//


package ru.gov.zakupki.oos.integration._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.types._1.ZfcsSignatureType;


/**
 * Пакет данных AS2 протокола
 * 
 * <p>Java class for as2PacketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="as2PacketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="36"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sender">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="receiver">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="objectType" type="{http://zakupki.gov.ru/oos/integration/1}indexObjectTypeEnum"/>
 *                   &lt;element name="objectId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="36"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="indexNum" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="signature">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                           &lt;attribute name="type" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mode" type="{http://zakupki.gov.ru/oos/integration/1}indexModeType"/>
 *                   &lt;element name="testCase" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
@XmlType(name = "as2PacketType", propOrder = {
    "index"
})
@XmlSeeAlso({
    BankGuaranteeRefusal.class,
    NotificationPlacerChange.class,
    FcsProtocolEFSinglePart.class,
    NotificationOK.class,
    FcsNotificationLotCancel.class,
    TenderSuspension.class,
    Complaint.class,
    ProtocolPO1 .class,
    NotificationSZ.class,
    FcsNotificationZakA.class,
    Clarification.class,
    NotificationCancel.class,
    FcsNotificationZKBI.class,
    FcsClarification.class,
    FcsPurchaseDocumentCancel.class,
    TenderPlanUnstructured.class,
    SketchPlan.class,
    FcsClarificationRequest.class,
    UnplannedCheckCancel.class,
    ClarificationRequest.class,
    ContractCancel.class,
    ComplaintCancel.class,
    FcsPurchaseProlongationZK.class,
    FcsProtocolOKSingleApp.class,
    FcsNotificationZakK.class,
    NotificationPO.class,
    FcsProtocolOK1 .class,
    TenderPlanChange.class,
    PlacementResult.class,
    FcsNotificationPO.class,
    ProtocolCancel.class,
    FcsNotificationOKOU.class,
    TimeEF.class,
    FcsPurchaseDocument.class,
    MasterData.class,
    FcsProtocolOK2 .class,
    FcsProtocolCancel.class,
    FcsNotificationZP.class,
    CheckResultCancel.class,
    SketchPlanExecution.class,
    FcsNotificationCancel.class,
    FcsNotificationZK.class,
    ProtocolOK3 .class,
    FcsNotificationZakKD.class,
    ProtocolOK2 .class,
    ProtocolOK1 .class,
    FcsProtocolEFInvalidation.class,
    FcsTimeEF.class,
    FcsPurchaseProlongationOK.class,
    FcsNotificationZakKOU.class,
    NotificationEF.class,
    FcsProtocolEF3 .class,
    FcsProtocolEF1 .class,
    Confirmation.class,
    FcsProtocolEF2 .class,
    FcsProtocolZK.class,
    FcsNotificationEF.class,
    FcsContractSign.class,
    Contract.class,
    FcsNotificationEP.class,
    ContractProcedure.class,
    TenderPlan.class,
    NotificationZK.class,
    FcsProtocolEFSingleApp.class,
    ComplaintGroup.class,
    FcsProtocolZKAfterProlong.class,
    FcsProtocolOKOU3 .class,
    FcsNotificationOK.class,
    ContractProcedureCancel.class,
    FcsProtocolOKOU2 .class,
    FcsProtocolOKOU1 .class,
    ProtocolEF3 .class,
    ProtocolEF2 .class,
    CheckPlan.class,
    ProtocolEF1 .class,
    ProtocolEvasion.class,
    CheckResult.class,
    FcsNotificationLotChange.class,
    FcsNotificationISM.class,
    FcsNotificationISO.class,
    FcsNotificationOKD.class,
    UnplannedCheck.class,
    ContractSign.class,
    ProtocolZK5 .class,
    FcsProtocolOKOUSingleApp.class,
    ProtocolZK1 .class
})
public abstract class As2PacketType {

    @XmlElement(required = true)
    protected As2PacketType.Index index;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link As2PacketType.Index }
     *     
     */
    public As2PacketType.Index getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link As2PacketType.Index }
     *     
     */
    public void setIndex(As2PacketType.Index value) {
        this.index = value;
    }


    /**
     * Индексная карточка пакета данных
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="36"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sender">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="receiver">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="objectType" type="{http://zakupki.gov.ru/oos/integration/1}indexObjectTypeEnum"/>
     *         &lt;element name="objectId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="36"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="indexNum" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="signature">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *                 &lt;attribute name="type" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mode" type="{http://zakupki.gov.ru/oos/integration/1}indexModeType"/>
     *         &lt;element name="testCase" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "id",
        "sender",
        "receiver",
        "createDateTime",
        "objectType",
        "objectId",
        "indexNum",
        "signature",
        "mode",
        "testCase"
    })
    public static class Index {

        @XmlElement(required = true)
        protected String id;
        @XmlElement(required = true)
        protected String sender;
        @XmlElement(required = true)
        protected String receiver;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDateTime;
        @XmlElement(required = true)
        protected String objectType;
        protected String objectId;
        protected Integer indexNum;
        @XmlElement(required = true)
        protected As2PacketType.Index.Signature signature;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected IndexModeType mode;
        protected Integer testCase;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the sender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSender() {
            return sender;
        }

        /**
         * Sets the value of the sender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSender(String value) {
            this.sender = value;
        }

        /**
         * Gets the value of the receiver property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiver() {
            return receiver;
        }

        /**
         * Sets the value of the receiver property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiver(String value) {
            this.receiver = value;
        }

        /**
         * Gets the value of the createDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateDateTime() {
            return createDateTime;
        }

        /**
         * Sets the value of the createDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateDateTime(XMLGregorianCalendar value) {
            this.createDateTime = value;
        }

        /**
         * Gets the value of the objectType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectType() {
            return objectType;
        }

        /**
         * Sets the value of the objectType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectType(String value) {
            this.objectType = value;
        }

        /**
         * Gets the value of the objectId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectId() {
            return objectId;
        }

        /**
         * Sets the value of the objectId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectId(String value) {
            this.objectId = value;
        }

        /**
         * Gets the value of the indexNum property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIndexNum() {
            return indexNum;
        }

        /**
         * Sets the value of the indexNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIndexNum(Integer value) {
            this.indexNum = value;
        }

        /**
         * Gets the value of the signature property.
         * 
         * @return
         *     possible object is
         *     {@link As2PacketType.Index.Signature }
         *     
         */
        public As2PacketType.Index.Signature getSignature() {
            return signature;
        }

        /**
         * Sets the value of the signature property.
         * 
         * @param value
         *     allowed object is
         *     {@link As2PacketType.Index.Signature }
         *     
         */
        public void setSignature(As2PacketType.Index.Signature value) {
            this.signature = value;
        }

        /**
         * Gets the value of the mode property.
         * 
         * @return
         *     possible object is
         *     {@link IndexModeType }
         *     
         */
        public IndexModeType getMode() {
            return mode;
        }

        /**
         * Sets the value of the mode property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndexModeType }
         *     
         */
        public void setMode(IndexModeType value) {
            this.mode = value;
        }

        /**
         * Gets the value of the testCase property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTestCase() {
            return testCase;
        }

        /**
         * Sets the value of the testCase property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTestCase(Integer value) {
            this.testCase = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
         *       &lt;attribute name="type" use="required" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signatureType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Signature {

            @XmlValue
            protected byte[] value;
            @XmlAttribute(name = "type", required = true)
            protected ZfcsSignatureType type;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setValue(byte[] value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsSignatureType }
             *     
             */
            public ZfcsSignatureType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsSignatureType }
             *     
             */
            public void setType(ZfcsSignatureType value) {
                this.type = value;
            }

        }

    }

}

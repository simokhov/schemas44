//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.base._1.SignatureType;


/**
 * Информационный пакет
 * 
 * <p>Java class for packetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="packetUid" type="{http://zakupki.gov.ru/oos/base/1}guidType"/>
 *                   &lt;element name="sender">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="senderType" type="{http://zakupki.gov.ru/oos/signIncoming/1}partnerType"/>
 *                   &lt;element name="receiver">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="receiverType" type="{http://zakupki.gov.ru/oos/signIncoming/1}partnerType"/>
 *                   &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="objectType" type="{http://zakupki.gov.ru/oos/signIncoming/1}indexObjectTypeEnum"/>
 *                   &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signIncomingRegNumberType" minOccurs="0"/>
 *                   &lt;element name="mode" type="{http://zakupki.gov.ru/oos/signIncoming/1}indexModeType"/>
 *                   &lt;element name="signature" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                           &lt;attribute name="type" use="required" type="{http://zakupki.gov.ru/oos/base/1}signatureType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
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
@XmlType(name = "packetType", propOrder = {
    "index"
})
@XmlSeeAlso({
    ProcessingResultType.class,
    ProcessingProjectResultType.class,
    PublicDiscussionLargePurchasePhase2 .class,
    NotificationZakKWithControl99NoticeCompliance.class,
    PublicDiscussionLargePurchasePhase1 .class,
    PublicDiscussionAnswer.class,
    ElectronicComplaint.class,
    ProcessingResultRequest.class,
    NotificationOKOUWithControl99NoticeCompliance.class,
    NotificationZPWithControl99NoticeCompliance.class,
    RequestForQuotation.class,
    CustomerReportSmallScaleBusiness.class,
    CheckResult.class,
    NotificationZakKDWithControl99NoticeCompliance.class,
    NsiBusinessControl.class,
    CustomerReportSingleContractor.class,
    UnplannedEvent.class,
    ComplaintGroup.class,
    NotificationZakK.class,
    ProtocolOKOU3 .class,
    ProtocolOKOU2 .class,
    TenderPlanChange2017 .class,
    NotificationOKOU.class,
    Contract.class,
    NotificationEP.class,
    CustomerReportSingleContractorInvalid.class,
    ProtocolOKOU1 .class,
    NotificationEF.class,
    CustomerReportBigProjectMonitoring.class,
    ProtocolPO.class,
    NotificationZakA.class,
    ProtocolZKAfterProlong.class,
    PurchaseProlongationZK.class,
    EventPlan.class,
    PurchasePlanChange.class,
    NotificationZKWithControl99NoticeCompliance.class,
    ProtocolZKAfterProlongWithControl99NoticeCompliance.class,
    ProtocolZKBI.class,
    TenderPlanChange.class,
    ProtocolZKWithControl99NoticeCompliance.class,
    EventPlanProject.class,
    NotificationEFWithControl99NoticeCompliance.class,
    CustomerReportSmallScaleBusinessInvalid.class,
    AddInfoInvalid.class,
    ProtocolOKD5WithControl99NoticeCompliance.class,
    BankGuaranteeReturnInvalid.class,
    NotificationOKDWithControl99NoticeCompliance.class,
    TenderPlan2017WithControl99NoticeCompliance.class,
    NotificationEPWithControl99NoticeCompliance.class,
    ProtocolOKSingleAppWithControl99NoticeCompliance.class,
    SketchPlan.class,
    PurchasePlanExecution.class,
    RequestForQuotationCancel.class,
    ProtocolZK.class,
    AddInfo.class,
    ProtocolOKDSingleApp.class,
    CustomerReportContractExecution.class,
    PurchaseProlongationOK.class,
    UnplannedEventSuspension.class,
    ProtocolZP.class,
    NotificationZakKOU.class,
    ProtocolOKD4 .class,
    ProtocolOKD5 .class,
    ProtocolOKD2 .class,
    EventPlanSuspension.class,
    ProtocolOKD3 .class,
    ProtocolZKBIWithControl99NoticeCompliance.class,
    ProtocolOKD1 .class,
    NotificationZakAWithControl99NoticeCompliance.class,
    NotificationLotChange.class,
    NotificationOKWithControl99NoticeCompliance.class,
    NotificationOrgChange.class,
    ProtocolZPFinal.class,
    PublicDiscussionSuspensionPhase1 .class,
    PublicDiscussionSuspensionPhase2 .class,
    UnplannedCheck.class,
    AuditResult.class,
    EventResult.class,
    ProtocolEvasion.class,
    CheckPlan.class,
    ContractProcedureCancel.class,
    PurchaseDocumentCancel.class,
    NotificationOKD.class,
    NotificationZakKOUWithControl99NoticeCompliance.class,
    NotificationZP.class,
    NotificationZK.class,
    TenderPlan.class,
    ContractProcedure.class,
    UnplannedEventCancel.class,
    ProtocolDeviation.class,
    BankGuaranteeTerminationInvalid.class,
    EventResultCancel.class,
    UnplannedEventCancelProject.class,
    EventResultCancelProject.class,
    NotificationZakKD.class,
    CustomerReportBigProjectMonitoringInvalid.class,
    PurchaseDocument.class,
    ProtocolOK1 .class,
    NotificationCancelFailure.class,
    ProtocolOK2 .class,
    SketchPlanExecution.class,
    ProtocolZPExtract.class,
    CheckResultCancel.class,
    Notification111 .class,
    UnplannedEventProject.class,
    NotificationEFDateChange.class,
    BankGuaranteeRefusalInvalid.class,
    ProtocolCancel.class,
    ProtocolOKOUSingleAppWithControl99NoticeCompliance.class,
    PurchasePlanWithControl99NoticeCompliance.class,
    ContractWithControl99NoticeCompliance.class,
    NotificationPO.class,
    PurchasePlan.class,
    CustomerReportContractExecutionInvalid.class,
    ComplaintCancel.class,
    ProtocolZPFinalWithControl99NoticeCompliance.class,
    UnplannedCheckCancel.class,
    NotificationCancel.class,
    Clarification.class,
    NotificationLotCancel.class,
    BankGuaranteeTermination.class,
    Notification111WithControl99NoticeCompliance.class,
    TenderPlanCancel.class,
    Complaint.class,
    ProtocolOKOU3WithControl99NoticeCompliance.class,
    ProtocolOKOUSingleApp.class,
    ProtocolOKDSingleAppWithControl99NoticeCompliance.class,
    TenderPlan2017 .class,
    BankGuaranteeReturn.class,
    ProtocolOKSingleApp.class,
    NotificationOK.class,
    EventResultProject.class,
    ProtocolOK2WithControl99NoticeCompliance.class,
    BankGuaranteeRefusal.class
})
public abstract class PacketType {

    @XmlElement(required = true)
    protected PacketType.Index index;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link PacketType.Index }
     *     
     */
    public PacketType.Index getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacketType.Index }
     *     
     */
    public void setIndex(PacketType.Index value) {
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
     *         &lt;element name="packetUid" type="{http://zakupki.gov.ru/oos/base/1}guidType"/>
     *         &lt;element name="sender">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="senderType" type="{http://zakupki.gov.ru/oos/signIncoming/1}partnerType"/>
     *         &lt;element name="receiver">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="receiverType" type="{http://zakupki.gov.ru/oos/signIncoming/1}partnerType"/>
     *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="objectType" type="{http://zakupki.gov.ru/oos/signIncoming/1}indexObjectTypeEnum"/>
     *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_signIncomingRegNumberType" minOccurs="0"/>
     *         &lt;element name="mode" type="{http://zakupki.gov.ru/oos/signIncoming/1}indexModeType"/>
     *         &lt;element name="signature" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *                 &lt;attribute name="type" use="required" type="{http://zakupki.gov.ru/oos/base/1}signatureType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "packetUid",
        "sender",
        "senderType",
        "receiver",
        "receiverType",
        "createDateTime",
        "objectType",
        "regNumber",
        "mode",
        "signature"
    })
    public static class Index {

        @XmlElement(required = true)
        protected String packetUid;
        @XmlElement(required = true)
        protected String sender;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected PartnerType senderType;
        @XmlElement(required = true)
        protected String receiver;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected PartnerType receiverType;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDateTime;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected IndexObjectTypeEnum objectType;
        protected String regNumber;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected IndexModeType mode;
        protected PacketType.Index.Signature signature;

        /**
         * Gets the value of the packetUid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPacketUid() {
            return packetUid;
        }

        /**
         * Sets the value of the packetUid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPacketUid(String value) {
            this.packetUid = value;
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
         * Gets the value of the senderType property.
         * 
         * @return
         *     possible object is
         *     {@link PartnerType }
         *     
         */
        public PartnerType getSenderType() {
            return senderType;
        }

        /**
         * Sets the value of the senderType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartnerType }
         *     
         */
        public void setSenderType(PartnerType value) {
            this.senderType = value;
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
         * Gets the value of the receiverType property.
         * 
         * @return
         *     possible object is
         *     {@link PartnerType }
         *     
         */
        public PartnerType getReceiverType() {
            return receiverType;
        }

        /**
         * Sets the value of the receiverType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartnerType }
         *     
         */
        public void setReceiverType(PartnerType value) {
            this.receiverType = value;
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
         *     {@link IndexObjectTypeEnum }
         *     
         */
        public IndexObjectTypeEnum getObjectType() {
            return objectType;
        }

        /**
         * Sets the value of the objectType property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndexObjectTypeEnum }
         *     
         */
        public void setObjectType(IndexObjectTypeEnum value) {
            this.objectType = value;
        }

        /**
         * Gets the value of the regNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegNumber() {
            return regNumber;
        }

        /**
         * Sets the value of the regNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegNumber(String value) {
            this.regNumber = value;
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
         * Gets the value of the signature property.
         * 
         * @return
         *     possible object is
         *     {@link PacketType.Index.Signature }
         *     
         */
        public PacketType.Index.Signature getSignature() {
            return signature;
        }

        /**
         * Sets the value of the signature property.
         * 
         * @param value
         *     allowed object is
         *     {@link PacketType.Index.Signature }
         *     
         */
        public void setSignature(PacketType.Index.Signature value) {
            this.signature = value;
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
         *       &lt;attribute name="type" use="required" type="{http://zakupki.gov.ru/oos/base/1}signatureType" />
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
            protected SignatureType type;

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
             *     {@link SignatureType }
             *     
             */
            public SignatureType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link SignatureType }
             *     
             */
            public void setType(SignatureType value) {
                this.type = value;
            }

        }

    }

}

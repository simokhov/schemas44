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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Общие поля уведомления о соответствии (протокола о несоответствии) контролируемой информации
 * 
 * <p>Java class for zfcs_control99NoticeProtocolCommonInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99NoticeProtocolCommonInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="refExternalId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_externalIdType" minOccurs="0"/>
 *         &lt;element name="refPacketUid" type="{http://zakupki.gov.ru/oos/types/1}zfcs_guidType" minOccurs="0"/>
 *         &lt;element name="refVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="refEditionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="documentType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_control99DocumentType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99DocNumberType" minOccurs="0"/>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="controlAuthorityInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlAuthorityInfoType" minOccurs="0"/>
 *         &lt;element name="customerInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_control99CustomerInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="OKTMOPPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMOPPORef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="controlObjectsInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="controlObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlObjectType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="responsibleInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ResponsibleType" minOccurs="0"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ExtPrintFormType" minOccurs="0"/>
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
@XmlType(name = "zfcs_control99NoticeProtocolCommonInfoType", propOrder = {
    "refId",
    "refExternalId",
    "refPacketUid",
    "refVersionNumber",
    "refEditionNumber",
    "documentType",
    "docNumber",
    "docDate",
    "signDate",
    "controlAuthorityInfo",
    "customerInfo",
    "controlObjectsInfo",
    "responsibleInfo",
    "extPrintForm"
})
@XmlSeeAlso({
    ZfcsControl99ProtocolMismatchReductFundsType.class,
    ZfcsControl99ProtocolMismatchType.class,
    ZfcsControl99NoticeComplianceType.class,
    ZfcsControl99ProtocolCommonInfoType.class
})
public class ZfcsControl99NoticeProtocolCommonInfoType {

    protected long refId;
    protected String refExternalId;
    protected String refPacketUid;
    protected Integer refVersionNumber;
    protected Integer refEditionNumber;
    protected ZfcsControl99DocumentType documentType;
    protected String docNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    protected ZfcsControl99ControlAuthorityInfoType controlAuthorityInfo;
    protected ZfcsControl99NoticeProtocolCommonInfoType.CustomerInfo customerInfo;
    @XmlElement(required = true)
    protected ZfcsControl99NoticeProtocolCommonInfoType.ControlObjectsInfo controlObjectsInfo;
    protected ZfcsControl99ResponsibleType responsibleInfo;
    protected ZfcsControl99ExtPrintFormType extPrintForm;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the refId property.
     * 
     */
    public long getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     */
    public void setRefId(long value) {
        this.refId = value;
    }

    /**
     * Gets the value of the refExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefExternalId() {
        return refExternalId;
    }

    /**
     * Sets the value of the refExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefExternalId(String value) {
        this.refExternalId = value;
    }

    /**
     * Gets the value of the refPacketUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPacketUid() {
        return refPacketUid;
    }

    /**
     * Sets the value of the refPacketUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPacketUid(String value) {
        this.refPacketUid = value;
    }

    /**
     * Gets the value of the refVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefVersionNumber() {
        return refVersionNumber;
    }

    /**
     * Sets the value of the refVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefVersionNumber(Integer value) {
        this.refVersionNumber = value;
    }

    /**
     * Gets the value of the refEditionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefEditionNumber() {
        return refEditionNumber;
    }

    /**
     * Sets the value of the refEditionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefEditionNumber(Integer value) {
        this.refEditionNumber = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99DocumentType }
     *     
     */
    public ZfcsControl99DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99DocumentType }
     *     
     */
    public void setDocumentType(ZfcsControl99DocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
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
     * Gets the value of the controlAuthorityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99ControlAuthorityInfoType }
     *     
     */
    public ZfcsControl99ControlAuthorityInfoType getControlAuthorityInfo() {
        return controlAuthorityInfo;
    }

    /**
     * Sets the value of the controlAuthorityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99ControlAuthorityInfoType }
     *     
     */
    public void setControlAuthorityInfo(ZfcsControl99ControlAuthorityInfoType value) {
        this.controlAuthorityInfo = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99NoticeProtocolCommonInfoType.CustomerInfo }
     *     
     */
    public ZfcsControl99NoticeProtocolCommonInfoType.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99NoticeProtocolCommonInfoType.CustomerInfo }
     *     
     */
    public void setCustomerInfo(ZfcsControl99NoticeProtocolCommonInfoType.CustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the controlObjectsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99NoticeProtocolCommonInfoType.ControlObjectsInfo }
     *     
     */
    public ZfcsControl99NoticeProtocolCommonInfoType.ControlObjectsInfo getControlObjectsInfo() {
        return controlObjectsInfo;
    }

    /**
     * Sets the value of the controlObjectsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99NoticeProtocolCommonInfoType.ControlObjectsInfo }
     *     
     */
    public void setControlObjectsInfo(ZfcsControl99NoticeProtocolCommonInfoType.ControlObjectsInfo value) {
        this.controlObjectsInfo = value;
    }

    /**
     * Gets the value of the responsibleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99ResponsibleType }
     *     
     */
    public ZfcsControl99ResponsibleType getResponsibleInfo() {
        return responsibleInfo;
    }

    /**
     * Sets the value of the responsibleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99ResponsibleType }
     *     
     */
    public void setResponsibleInfo(ZfcsControl99ResponsibleType value) {
        this.responsibleInfo = value;
    }

    /**
     * Gets the value of the extPrintForm property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99ExtPrintFormType }
     *     
     */
    public ZfcsControl99ExtPrintFormType getExtPrintForm() {
        return extPrintForm;
    }

    /**
     * Sets the value of the extPrintForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99ExtPrintFormType }
     *     
     */
    public void setExtPrintForm(ZfcsControl99ExtPrintFormType value) {
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
     *         &lt;element name="controlObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlObjectType" maxOccurs="unbounded"/>
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
        "controlObjectInfo"
    })
    public static class ControlObjectsInfo {

        @XmlElement(required = true)
        protected List<ZfcsControl99ControlObjectType> controlObjectInfo;

        /**
         * Gets the value of the controlObjectInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the controlObjectInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getControlObjectInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsControl99ControlObjectType }
         * 
         * 
         */
        public List<ZfcsControl99ControlObjectType> getControlObjectInfo() {
            if (controlObjectInfo == null) {
                controlObjectInfo = new ArrayList<ZfcsControl99ControlObjectType>();
            }
            return this.controlObjectInfo;
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_control99CustomerInfoType">
     *       &lt;sequence>
     *         &lt;element name="OKTMOPPO" type="{http://zakupki.gov.ru/oos/types/1}zfcs_OKTMOPPORef" minOccurs="0"/>
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
        "oktmoppo"
    })
    public static class CustomerInfo
        extends ZfcsControl99CustomerInfoType
    {

        @XmlElement(name = "OKTMOPPO")
        protected ZfcsOKTMOPPORef oktmoppo;

        /**
         * Gets the value of the oktmoppo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsOKTMOPPORef }
         *     
         */
        public ZfcsOKTMOPPORef getOKTMOPPO() {
            return oktmoppo;
        }

        /**
         * Sets the value of the oktmoppo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsOKTMOPPORef }
         *     
         */
        public void setOKTMOPPO(ZfcsOKTMOPPORef value) {
            this.oktmoppo = value;
        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 09:11:06 AM MSK 
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
 * Уведомление о соответствии контролируемой информации, принятое от РМИС вместе с контролируемым документом
 * 
 * <p>Java class for zfcs_control99NoticeComplianceForRMISType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99NoticeComplianceForRMISType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99DocNumberType"/>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="controlAuthorityInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlAuthorityInfoType"/>
 *         &lt;element name="customerInfo">
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
 *                   &lt;element name="controlObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlObjectWithMandatoryDocsInfoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="responsibleInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ResponsibleType"/>
 *         &lt;element name="extPrintForm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ExtPrintFormType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_control99NoticeComplianceForRMISType", propOrder = {
    "docNumber",
    "docDate",
    "signDate",
    "controlAuthorityInfo",
    "customerInfo",
    "controlObjectsInfo",
    "responsibleInfo",
    "extPrintForm"
})
public class ZfcsControl99NoticeComplianceForRMISType {

    @XmlElement(required = true)
    protected String docNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    @XmlElement(required = true)
    protected ZfcsControl99ControlAuthorityInfoType controlAuthorityInfo;
    @XmlElement(required = true)
    protected ZfcsControl99NoticeComplianceForRMISType.CustomerInfo customerInfo;
    @XmlElement(required = true)
    protected ZfcsControl99NoticeComplianceForRMISType.ControlObjectsInfo controlObjectsInfo;
    @XmlElement(required = true)
    protected ZfcsControl99ResponsibleType responsibleInfo;
    @XmlElement(required = true)
    protected ZfcsControl99ExtPrintFormType extPrintForm;

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
     *     {@link ZfcsControl99NoticeComplianceForRMISType.CustomerInfo }
     *     
     */
    public ZfcsControl99NoticeComplianceForRMISType.CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99NoticeComplianceForRMISType.CustomerInfo }
     *     
     */
    public void setCustomerInfo(ZfcsControl99NoticeComplianceForRMISType.CustomerInfo value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the controlObjectsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99NoticeComplianceForRMISType.ControlObjectsInfo }
     *     
     */
    public ZfcsControl99NoticeComplianceForRMISType.ControlObjectsInfo getControlObjectsInfo() {
        return controlObjectsInfo;
    }

    /**
     * Sets the value of the controlObjectsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99NoticeComplianceForRMISType.ControlObjectsInfo }
     *     
     */
    public void setControlObjectsInfo(ZfcsControl99NoticeComplianceForRMISType.ControlObjectsInfo value) {
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="controlObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlObjectWithMandatoryDocsInfoType" maxOccurs="unbounded"/>
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
        protected List<ZfcsControl99ControlObjectWithMandatoryDocsInfoType> controlObjectInfo;

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
         * {@link ZfcsControl99ControlObjectWithMandatoryDocsInfoType }
         * 
         * 
         */
        public List<ZfcsControl99ControlObjectWithMandatoryDocsInfoType> getControlObjectInfo() {
            if (controlObjectInfo == null) {
                controlObjectInfo = new ArrayList<ZfcsControl99ControlObjectWithMandatoryDocsInfoType>();
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

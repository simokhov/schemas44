//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
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
 * Извещение о проведении закупки способом определения поставщика (подрядчика, исполнителя), установленным Правительством Российской Федерации в соответствии со ст. 111 Федерального закона № 44-ФЗ
 * 
 * <p>Java class for zfcs_notificationI111Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_notificationI111Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNotification111Type">
 *       &lt;sequence>
 *         &lt;element name="procedureInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="collectingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lot" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotI111Type" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationModification111Type" minOccurs="0"/>
 *         &lt;element name="particularsActProcurement" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="revisionRequisitesPO2018" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_notificationI111Type", propOrder = {
    "procedureInfo",
    "lots",
    "attachments",
    "modification",
    "particularsActProcurement",
    "revisionRequisitesPO2018"
})
@XmlSeeAlso({
    ZfcsNotification111WithControl99NoticeComplianceType.class
})
public class ZfcsNotificationI111Type
    extends ZfcsPurchaseNotification111Type
{

    protected ZfcsNotificationI111Type.ProcedureInfo procedureInfo;
    @XmlElement(required = true)
    protected ZfcsNotificationI111Type.Lots lots;
    protected ZfcsAttachmentListType attachments;
    protected ZfcsNotificationModification111Type modification;
    protected String particularsActProcurement;
    protected Boolean revisionRequisitesPO2018;

    /**
     * Gets the value of the procedureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationI111Type.ProcedureInfo }
     *     
     */
    public ZfcsNotificationI111Type.ProcedureInfo getProcedureInfo() {
        return procedureInfo;
    }

    /**
     * Sets the value of the procedureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationI111Type.ProcedureInfo }
     *     
     */
    public void setProcedureInfo(ZfcsNotificationI111Type.ProcedureInfo value) {
        this.procedureInfo = value;
    }

    /**
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationI111Type.Lots }
     *     
     */
    public ZfcsNotificationI111Type.Lots getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationI111Type.Lots }
     *     
     */
    public void setLots(ZfcsNotificationI111Type.Lots value) {
        this.lots = value;
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
     *     {@link ZfcsNotificationModification111Type }
     *     
     */
    public ZfcsNotificationModification111Type getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationModification111Type }
     *     
     */
    public void setModification(ZfcsNotificationModification111Type value) {
        this.modification = value;
    }

    /**
     * Gets the value of the particularsActProcurement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticularsActProcurement() {
        return particularsActProcurement;
    }

    /**
     * Sets the value of the particularsActProcurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticularsActProcurement(String value) {
        this.particularsActProcurement = value;
    }

    /**
     * Gets the value of the revisionRequisitesPO2018 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevisionRequisitesPO2018() {
        return revisionRequisitesPO2018;
    }

    /**
     * Sets the value of the revisionRequisitesPO2018 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevisionRequisitesPO2018(Boolean value) {
        this.revisionRequisitesPO2018 = value;
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
     *         &lt;element name="lot" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotI111Type" maxOccurs="unbounded"/>
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
        "lot"
    })
    public static class Lots {

        @XmlElement(required = true)
        protected List<ZfcsLotI111Type> lot;

        /**
         * Gets the value of the lot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsLotI111Type }
         * 
         * 
         */
        public List<ZfcsLotI111Type> getLot() {
            if (lot == null) {
                lot = new ArrayList<ZfcsLotI111Type>();
            }
            return this.lot;
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
     *         &lt;element name="collectingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "collectingEndDate"
    })
    public static class ProcedureInfo {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar collectingEndDate;

        /**
         * Gets the value of the collectingEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCollectingEndDate() {
            return collectingEndDate;
        }

        /**
         * Sets the value of the collectingEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCollectingEndDate(XMLGregorianCalendar value) {
            this.collectingEndDate = value;
        }

    }

}

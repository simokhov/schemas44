//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.base._1.ETPRef;
import ru.gov.zakupki.oos.base._1.PurchaseSubjectRef;


/**
 * Тип: Информация о закупке ПО (предварительный отбор)
 * 
 * <p>Java class for notificationPOInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationPOInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ETPInfo" type="{http://zakupki.gov.ru/oos/base/1}ETPRef"/>
 *         &lt;element name="procedureInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="collectingStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="collectingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="scoringDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseSubject" type="{http://zakupki.gov.ru/oos/base/1}purchaseSubjectRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationPOInfoType", propOrder = {
    "etpInfo",
    "procedureInfo",
    "purchaseSubject"
})
public class NotificationPOInfoType {

    @XmlElement(name = "ETPInfo", required = true)
    protected ETPRef etpInfo;
    @XmlElement(required = true)
    protected NotificationPOInfoType.ProcedureInfo procedureInfo;
    @XmlElement(required = true)
    protected PurchaseSubjectRef purchaseSubject;

    /**
     * Gets the value of the etpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ETPRef }
     *     
     */
    public ETPRef getETPInfo() {
        return etpInfo;
    }

    /**
     * Sets the value of the etpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETPRef }
     *     
     */
    public void setETPInfo(ETPRef value) {
        this.etpInfo = value;
    }

    /**
     * Gets the value of the procedureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPOInfoType.ProcedureInfo }
     *     
     */
    public NotificationPOInfoType.ProcedureInfo getProcedureInfo() {
        return procedureInfo;
    }

    /**
     * Sets the value of the procedureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPOInfoType.ProcedureInfo }
     *     
     */
    public void setProcedureInfo(NotificationPOInfoType.ProcedureInfo value) {
        this.procedureInfo = value;
    }

    /**
     * Gets the value of the purchaseSubject property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseSubjectRef }
     *     
     */
    public PurchaseSubjectRef getPurchaseSubject() {
        return purchaseSubject;
    }

    /**
     * Sets the value of the purchaseSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseSubjectRef }
     *     
     */
    public void setPurchaseSubject(PurchaseSubjectRef value) {
        this.purchaseSubject = value;
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
     *         &lt;element name="collectingStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="collectingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="scoringDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "collectingStartDate",
        "collectingEndDate",
        "scoringDate"
    })
    public static class ProcedureInfo {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar collectingStartDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar collectingEndDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar scoringDate;

        /**
         * Gets the value of the collectingStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCollectingStartDate() {
            return collectingStartDate;
        }

        /**
         * Sets the value of the collectingStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCollectingStartDate(XMLGregorianCalendar value) {
            this.collectingStartDate = value;
        }

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

        /**
         * Gets the value of the scoringDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getScoringDate() {
            return scoringDate;
        }

        /**
         * Sets the value of the scoringDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setScoringDate(XMLGregorianCalendar value) {
            this.scoringDate = value;
        }

    }

}

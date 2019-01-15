//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Причины отказа рассмотрения заявки без указания причины отказа из справочника
 * 
 * <p>Java class for zfcs_appRejectedReasonNotIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_appRejectedReasonNotIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nsiRejectReason" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                     &lt;element name="code" type="{http://zakupki.gov.ru/oos/base/1}rejectReasonCode"/>
 *                   &lt;/choice>
 *                   &lt;element name="reason" type="{http://zakupki.gov.ru/oos/base/1}rejectReasonName" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="explanation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_appRejectedReasonNotIDType", propOrder = {
    "nsiRejectReason",
    "explanation"
})
public class ZfcsAppRejectedReasonNotIDType {

    protected ZfcsAppRejectedReasonNotIDType.NsiRejectReason nsiRejectReason;
    @XmlElement(required = true)
    protected String explanation;

    /**
     * Gets the value of the nsiRejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAppRejectedReasonNotIDType.NsiRejectReason }
     *     
     */
    public ZfcsAppRejectedReasonNotIDType.NsiRejectReason getNsiRejectReason() {
        return nsiRejectReason;
    }

    /**
     * Sets the value of the nsiRejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAppRejectedReasonNotIDType.NsiRejectReason }
     *     
     */
    public void setNsiRejectReason(ZfcsAppRejectedReasonNotIDType.NsiRejectReason value) {
        this.nsiRejectReason = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
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
     *         &lt;choice>
     *           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *           &lt;element name="code" type="{http://zakupki.gov.ru/oos/base/1}rejectReasonCode"/>
     *         &lt;/choice>
     *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/base/1}rejectReasonName" minOccurs="0"/>
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
        "code",
        "reason"
    })
    public static class NsiRejectReason {

        protected Long id;
        protected String code;
        protected String reason;

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
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Протокол о признании электронного аукциона несостоявшимся
 * 
 * <p>Java class for zfcs_protocolEFInvalidationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_protocolEFInvalidationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProtocolEFNoCommissionType">
 *       &lt;sequence>
 *         &lt;element name="protocolLot" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_abandonedReasonType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_protocolEFInvalidationType", propOrder = {
    "protocolLot"
})
public class ZfcsProtocolEFInvalidationType
    extends ZfcsPurchaseProtocolEFNoCommissionType
{

    protected ZfcsProtocolEFInvalidationType.ProtocolLot protocolLot;

    /**
     * Gets the value of the protocolLot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsProtocolEFInvalidationType.ProtocolLot }
     *     
     */
    public ZfcsProtocolEFInvalidationType.ProtocolLot getProtocolLot() {
        return protocolLot;
    }

    /**
     * Sets the value of the protocolLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsProtocolEFInvalidationType.ProtocolLot }
     *     
     */
    public void setProtocolLot(ZfcsProtocolEFInvalidationType.ProtocolLot value) {
        this.protocolLot = value;
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
     *         &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_abandonedReasonType" minOccurs="0"/>
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
        "abandonedReason"
    })
    public static class ProtocolLot {

        protected ZfcsAbandonedReasonType abandonedReason;

        /**
         * Gets the value of the abandonedReason property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsAbandonedReasonType }
         *     
         */
        public ZfcsAbandonedReasonType getAbandonedReason() {
            return abandonedReason;
        }

        /**
         * Sets the value of the abandonedReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsAbandonedReasonType }
         *     
         */
        public void setAbandonedReason(ZfcsAbandonedReasonType value) {
            this.abandonedReason = value;
        }

    }

}

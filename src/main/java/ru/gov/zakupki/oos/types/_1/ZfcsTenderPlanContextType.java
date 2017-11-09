//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.09 at 09:11:06 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Суммы в разрезе КБК и КОСГУ в плане-графике
 * 
 * <p>Java class for zfcs_tenderPlan.ContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan.ContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="amountKBKs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanTotalPositionKBKsType" minOccurs="0"/>
 *           &lt;element name="amountKBKs2016" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanTotalPositionKBK2016sType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="amountKOSGUs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanTotalPositionKOSGUsType" minOccurs="0"/>
 *           &lt;element name="amountKVRs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanTotalPositionKVRsType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tenderPlan.ContextType", propOrder = {
    "amountKBKs",
    "amountKBKs2016",
    "amountKOSGUs",
    "amountKVRs"
})
public class ZfcsTenderPlanContextType {

    protected ZfcsTenderPlanTotalPositionKBKsType amountKBKs;
    protected ZfcsTenderPlanTotalPositionKBK2016SType amountKBKs2016;
    protected ZfcsTenderPlanTotalPositionKOSGUsType amountKOSGUs;
    protected ZfcsTenderPlanTotalPositionKVRsType amountKVRs;

    /**
     * Gets the value of the amountKBKs property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanTotalPositionKBKsType }
     *     
     */
    public ZfcsTenderPlanTotalPositionKBKsType getAmountKBKs() {
        return amountKBKs;
    }

    /**
     * Sets the value of the amountKBKs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanTotalPositionKBKsType }
     *     
     */
    public void setAmountKBKs(ZfcsTenderPlanTotalPositionKBKsType value) {
        this.amountKBKs = value;
    }

    /**
     * Gets the value of the amountKBKs2016 property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanTotalPositionKBK2016SType }
     *     
     */
    public ZfcsTenderPlanTotalPositionKBK2016SType getAmountKBKs2016() {
        return amountKBKs2016;
    }

    /**
     * Sets the value of the amountKBKs2016 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanTotalPositionKBK2016SType }
     *     
     */
    public void setAmountKBKs2016(ZfcsTenderPlanTotalPositionKBK2016SType value) {
        this.amountKBKs2016 = value;
    }

    /**
     * Gets the value of the amountKOSGUs property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanTotalPositionKOSGUsType }
     *     
     */
    public ZfcsTenderPlanTotalPositionKOSGUsType getAmountKOSGUs() {
        return amountKOSGUs;
    }

    /**
     * Sets the value of the amountKOSGUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanTotalPositionKOSGUsType }
     *     
     */
    public void setAmountKOSGUs(ZfcsTenderPlanTotalPositionKOSGUsType value) {
        this.amountKOSGUs = value;
    }

    /**
     * Gets the value of the amountKVRs property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsTenderPlanTotalPositionKVRsType }
     *     
     */
    public ZfcsTenderPlanTotalPositionKVRsType getAmountKVRs() {
        return amountKVRs;
    }

    /**
     * Sets the value of the amountKVRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsTenderPlanTotalPositionKVRsType }
     *     
     */
    public void setAmountKVRs(ZfcsTenderPlanTotalPositionKVRsType value) {
        this.amountKVRs = value;
    }

}

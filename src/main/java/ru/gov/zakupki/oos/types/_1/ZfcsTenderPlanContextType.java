//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:54:41 AM MSK 
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
 *         &lt;element name="amountKBKs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanTotalPositionKBKsType" minOccurs="0"/>
 *         &lt;element name="amountKOSGUs" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlanTotalPositionKOSGUsType" minOccurs="0"/>
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
    "amountKOSGUs"
})
public class ZfcsTenderPlanContextType {

    protected ZfcsTenderPlanTotalPositionKBKsType amountKBKs;
    protected ZfcsTenderPlanTotalPositionKOSGUsType amountKOSGUs;

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

}

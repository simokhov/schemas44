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
 * Вынесенное решение для позиции плана-графика закупок
 * 
 * <p>Java class for zfcs_tenderPlan2017PositionDecisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017PositionDecisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="purchaseCanceled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="purchaseChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tenderPlan2017PositionDecisionType", propOrder = {
    "purchaseCanceled",
    "purchaseChanged"
})
public class ZfcsTenderPlan2017PositionDecisionType {

    protected Boolean purchaseCanceled;
    protected Boolean purchaseChanged;

    /**
     * Gets the value of the purchaseCanceled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseCanceled() {
        return purchaseCanceled;
    }

    /**
     * Sets the value of the purchaseCanceled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseCanceled(Boolean value) {
        this.purchaseCanceled = value;
    }

    /**
     * Gets the value of the purchaseChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchaseChanged() {
        return purchaseChanged;
    }

    /**
     * Sets the value of the purchaseChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchaseChanged(Boolean value) {
        this.purchaseChanged = value;
    }

}

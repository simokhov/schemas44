//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:46:03 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения позиции плана закупок в позиции плана-графика с 01.01.2017
 * 
 * <p>Java class for zfcs_tenderPlan2017PurchasePlanPositionRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_tenderPlan2017PurchasePlanPositionRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonNumberType" minOccurs="0"/>
 *         &lt;element name="extNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPositonExtNumberType" minOccurs="0"/>
 *         &lt;element name="purchasePlanIKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_tenderPlan2017PurchasePlanPositionRefType", propOrder = {
    "positionNumber",
    "extNumber",
    "purchasePlanIKZ"
})
public class ZfcsTenderPlan2017PurchasePlanPositionRefType {

    protected String positionNumber;
    protected String extNumber;
    protected String purchasePlanIKZ;

    /**
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

    /**
     * Gets the value of the extNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtNumber() {
        return extNumber;
    }

    /**
     * Sets the value of the extNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtNumber(String value) {
        this.extNumber = value;
    }

    /**
     * Gets the value of the purchasePlanIKZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasePlanIKZ() {
        return purchasePlanIKZ;
    }

    /**
     * Sets the value of the purchasePlanIKZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasePlanIKZ(String value) {
        this.purchasePlanIKZ = value;
    }

}

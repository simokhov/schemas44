//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:55:40 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о плане-графике
 * 
 * <p>Java class for tendePlanInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tendePlanInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="planNumber" type="{http://zakupki.gov.ru/oos/types/1}tenderPlanNumberType"/>
 *         &lt;element name="planPositionNumber" type="{http://zakupki.gov.ru/oos/types/1}tenderPlanPositionNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tendePlanInfoType", propOrder = {
    "planNumber",
    "planPositionNumber"
})
public class TendePlanInfoType {

    @XmlElement(required = true)
    protected String planNumber;
    @XmlElement(required = true)
    protected String planPositionNumber;

    /**
     * Gets the value of the planNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNumber() {
        return planNumber;
    }

    /**
     * Sets the value of the planNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNumber(String value) {
        this.planNumber = value;
    }

    /**
     * Gets the value of the planPositionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanPositionNumber() {
        return planPositionNumber;
    }

    /**
     * Sets the value of the planPositionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanPositionNumber(String value) {
        this.planPositionNumber = value;
    }

}

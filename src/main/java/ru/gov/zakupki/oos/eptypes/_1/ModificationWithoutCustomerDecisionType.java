//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Внесение исправлений в документ закупки без изменений на основании решения заказчика
 * 
 * <p>Java class for modificationWithoutCustomerDecisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modificationWithoutCustomerDecisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *         &lt;element name="reasonInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}changeReasonWithoutCustomerDecisionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificationWithoutCustomerDecisionType", propOrder = {
    "info",
    "addInfo",
    "reasonInfo"
})
public class ModificationWithoutCustomerDecisionType {

    @XmlElement(required = true)
    protected String info;
    protected String addInfo;
    @XmlElement(required = true)
    protected ChangeReasonWithoutCustomerDecisionType reasonInfo;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
    }

    /**
     * Gets the value of the reasonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeReasonWithoutCustomerDecisionType }
     *     
     */
    public ChangeReasonWithoutCustomerDecisionType getReasonInfo() {
        return reasonInfo;
    }

    /**
     * Sets the value of the reasonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeReasonWithoutCustomerDecisionType }
     *     
     */
    public void setReasonInfo(ChangeReasonWithoutCustomerDecisionType value) {
        this.reasonInfo = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Данные процедуры контрактования
 * 
 * <p>Java class for zfcs_purchaseProcedureContractingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseProcedureContractingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractingTerm" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="evadeConditions" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchaseProcedureContractingType", propOrder = {
    "contractingTerm",
    "evadeConditions"
})
public class ZfcsPurchaseProcedureContractingType {

    @XmlElement(required = true)
    protected String contractingTerm;
    @XmlElement(required = true)
    protected String evadeConditions;

    /**
     * Gets the value of the contractingTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractingTerm() {
        return contractingTerm;
    }

    /**
     * Sets the value of the contractingTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractingTerm(String value) {
        this.contractingTerm = value;
    }

    /**
     * Gets the value of the evadeConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvadeConditions() {
        return evadeConditions;
    }

    /**
     * Sets the value of the evadeConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvadeConditions(String value) {
        this.evadeConditions = value;
    }

}

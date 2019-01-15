//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.common._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Информации о банковском и (или) казначейском сопровождении контакта
 * 
 * <p>Java class for bankSupportContractRequiredInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankSupportContractRequiredInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankSupportContractRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="treasurySupportContractRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankSupportContractRequiredInfoType", propOrder = {
    "bankSupportContractRequired",
    "treasurySupportContractRequired"
})
public class BankSupportContractRequiredInfoType {

    protected Boolean bankSupportContractRequired;
    protected Boolean treasurySupportContractRequired;

    /**
     * Gets the value of the bankSupportContractRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBankSupportContractRequired() {
        return bankSupportContractRequired;
    }

    /**
     * Sets the value of the bankSupportContractRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBankSupportContractRequired(Boolean value) {
        this.bankSupportContractRequired = value;
    }

    /**
     * Gets the value of the treasurySupportContractRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTreasurySupportContractRequired() {
        return treasurySupportContractRequired;
    }

    /**
     * Sets the value of the treasurySupportContractRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTreasurySupportContractRequired(Boolean value) {
        this.treasurySupportContractRequired = value;
    }

}
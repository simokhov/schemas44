//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Периодичность осуществления закупки
 * 
 * <p>Java class for zfcs_purchasePlanPeriodicityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchasePlanPeriodicityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="periodicityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanPeriodicityTypeEnum"/>
 *         &lt;element name="otherPeriodicityText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchasePlanPeriodicityType", propOrder = {
    "periodicityType",
    "otherPeriodicityText"
})
public class ZfcsPurchasePlanPeriodicityType {

    @XmlSchemaType(name = "string")
    protected ZfcsPurchasePlanPeriodicityTypeEnum periodicityType;
    protected String otherPeriodicityText;

    /**
     * Gets the value of the periodicityType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanPeriodicityTypeEnum }
     *     
     */
    public ZfcsPurchasePlanPeriodicityTypeEnum getPeriodicityType() {
        return periodicityType;
    }

    /**
     * Sets the value of the periodicityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanPeriodicityTypeEnum }
     *     
     */
    public void setPeriodicityType(ZfcsPurchasePlanPeriodicityTypeEnum value) {
        this.periodicityType = value;
    }

    /**
     * Gets the value of the otherPeriodicityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPeriodicityText() {
        return otherPeriodicityText;
    }

    /**
     * Sets the value of the otherPeriodicityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPeriodicityText(String value) {
        this.otherPeriodicityText = value;
    }

}

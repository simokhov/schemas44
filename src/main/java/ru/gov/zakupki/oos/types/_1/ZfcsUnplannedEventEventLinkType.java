//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация по связанному контрольному мероприятию для ВКМ
 * 
 * <p>Java class for zfcs_unplannedEventEventLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_unplannedEventEventLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="parentCheckNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkNumberType" minOccurs="0"/>
 *           &lt;element name="parentRegNumber" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="25"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="parentUnplannedEventCheckNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckNumberType" minOccurs="0"/>
 *           &lt;element name="parentUnplannedEventRegNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_unplannedEventEventLinkType", propOrder = {
    "parentCheckNumber",
    "parentRegNumber",
    "parentUnplannedEventCheckNumber",
    "parentUnplannedEventRegNumber"
})
public class ZfcsUnplannedEventEventLinkType {

    protected String parentCheckNumber;
    protected String parentRegNumber;
    protected String parentUnplannedEventCheckNumber;
    protected String parentUnplannedEventRegNumber;

    /**
     * Gets the value of the parentCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCheckNumber() {
        return parentCheckNumber;
    }

    /**
     * Sets the value of the parentCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCheckNumber(String value) {
        this.parentCheckNumber = value;
    }

    /**
     * Gets the value of the parentRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRegNumber() {
        return parentRegNumber;
    }

    /**
     * Sets the value of the parentRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRegNumber(String value) {
        this.parentRegNumber = value;
    }

    /**
     * Gets the value of the parentUnplannedEventCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUnplannedEventCheckNumber() {
        return parentUnplannedEventCheckNumber;
    }

    /**
     * Sets the value of the parentUnplannedEventCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUnplannedEventCheckNumber(String value) {
        this.parentUnplannedEventCheckNumber = value;
    }

    /**
     * Gets the value of the parentUnplannedEventRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUnplannedEventRegNumber() {
        return parentUnplannedEventRegNumber;
    }

    /**
     * Sets the value of the parentUnplannedEventRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUnplannedEventRegNumber(String value) {
        this.parentUnplannedEventRegNumber = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.cptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.DocPropertyType;


/**
 * Тип: Решение судебного органа
 * 
 * <p>Java class for courtDecisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="courtDecisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="courtName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *         &lt;element name="decisionPropertyInfo" type="{http://zakupki.gov.ru/oos/common/1}docPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "courtDecisionType", propOrder = {
    "courtName",
    "decisionPropertyInfo"
})
public class CourtDecisionType {

    @XmlElement(required = true)
    protected String courtName;
    @XmlElement(required = true)
    protected DocPropertyType decisionPropertyInfo;

    /**
     * Gets the value of the courtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtName() {
        return courtName;
    }

    /**
     * Sets the value of the courtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtName(String value) {
        this.courtName = value;
    }

    /**
     * Gets the value of the decisionPropertyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DocPropertyType }
     *     
     */
    public DocPropertyType getDecisionPropertyInfo() {
        return decisionPropertyInfo;
    }

    /**
     * Sets the value of the decisionPropertyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPropertyType }
     *     
     */
    public void setDecisionPropertyInfo(DocPropertyType value) {
        this.decisionPropertyInfo = value;
    }

}

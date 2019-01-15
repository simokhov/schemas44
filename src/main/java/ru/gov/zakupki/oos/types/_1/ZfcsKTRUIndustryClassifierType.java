//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип КТРУ: Отраслевой классификатор, соответствующий позиции КТРУ
 * 
 * <p>Java class for zfcs_KTRUIndustryClassifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_KTRUIndustryClassifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classisfierName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="positionClassifierNode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRUIndustryClassifierNodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_KTRUIndustryClassifierType", propOrder = {
    "classisfierName",
    "positionClassifierNode"
})
public class ZfcsKTRUIndustryClassifierType {

    @XmlElement(required = true)
    protected String classisfierName;
    @XmlElement(required = true)
    protected ZfcsKTRUIndustryClassifierNodeType positionClassifierNode;

    /**
     * Gets the value of the classisfierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassisfierName() {
        return classisfierName;
    }

    /**
     * Sets the value of the classisfierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassisfierName(String value) {
        this.classisfierName = value;
    }

    /**
     * Gets the value of the positionClassifierNode property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsKTRUIndustryClassifierNodeType }
     *     
     */
    public ZfcsKTRUIndustryClassifierNodeType getPositionClassifierNode() {
        return positionClassifierNode;
    }

    /**
     * Sets the value of the positionClassifierNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsKTRUIndustryClassifierNodeType }
     *     
     */
    public void setPositionClassifierNode(ZfcsKTRUIndustryClassifierNodeType value) {
        this.positionClassifierNode = value;
    }

}

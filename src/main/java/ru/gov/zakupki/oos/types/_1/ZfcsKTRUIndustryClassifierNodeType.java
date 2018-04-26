//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:48:41 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип КТРУ: Позиция отраслевого классификатора, соответствующая позиции КТРУ
 * 
 * <p>Java class for zfcs_KTRUIndustryClassifierNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_KTRUIndustryClassifierNodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="parentNode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_KTRUIndustryClassifierNodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_KTRUIndustryClassifierNodeType", propOrder = {
    "code",
    "name",
    "parentNode"
})
public class ZfcsKTRUIndustryClassifierNodeType {

    protected String code;
    @XmlElement(required = true)
    protected String name;
    protected ZfcsKTRUIndustryClassifierNodeType parentNode;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentNode property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsKTRUIndustryClassifierNodeType }
     *     
     */
    public ZfcsKTRUIndustryClassifierNodeType getParentNode() {
        return parentNode;
    }

    /**
     * Sets the value of the parentNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsKTRUIndustryClassifierNodeType }
     *     
     */
    public void setParentNode(ZfcsKTRUIndustryClassifierNodeType value) {
        this.parentNode = value;
    }

}

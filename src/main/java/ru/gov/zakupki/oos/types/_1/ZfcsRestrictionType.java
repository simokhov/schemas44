//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.RestrictionSt14Type;


/**
 * Тип: Ограничение для участников
 * 
 * <p>Java class for zfcs_restrictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_restrictionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shortName" type="{http://zakupki.gov.ru/oos/base/1}prefsReqsShortNameType"/>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="content" type="{http://zakupki.gov.ru/oos/base/1}text4000Type" minOccurs="0"/>
 *           &lt;element name="restrictionsSt14" type="{http://zakupki.gov.ru/oos/common/1}restrictionSt14Type" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_restrictionType", propOrder = {
    "shortName",
    "name",
    "content",
    "restrictionsSt14"
})
public class ZfcsRestrictionType {

    @XmlElement(required = true)
    protected String shortName;
    protected String name;
    protected String content;
    protected RestrictionSt14Type restrictionsSt14;

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the restrictionsSt14 property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionSt14Type }
     *     
     */
    public RestrictionSt14Type getRestrictionsSt14() {
        return restrictionsSt14;
    }

    /**
     * Sets the value of the restrictionsSt14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionSt14Type }
     *     
     */
    public void setRestrictionsSt14(RestrictionSt14Type value) {
        this.restrictionsSt14 = value;
    }

}

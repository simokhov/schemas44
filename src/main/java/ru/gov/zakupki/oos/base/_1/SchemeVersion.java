//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.base._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Текущая версия схем
 * 
 * <p>Java class for schemeVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schemeVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="current" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType" fixed="9.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schemeVersion")
public class SchemeVersion {

    @XmlAttribute(name = "current")
    protected String current;

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrent() {
        if (current == null) {
            return "9.0";
        } else {
            return current;
        }
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrent(String value) {
        this.current = value;
    }

}

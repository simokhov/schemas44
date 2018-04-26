//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:44:23 AM MSK 
//


package ru.gov.zakupki.filestore.ws.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Ошибка
 * 
 * <p>Java class for errorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="errorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errCode" type="{http://zakupki.gov.ru/filestore/ws/data}errCodeType"/>
 *         &lt;element name="errName" type="{http://zakupki.gov.ru/filestore/ws/data}shortNameType"/>
 *         &lt;element name="description" type="{http://zakupki.gov.ru/filestore/ws/data}longTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorType", propOrder = {
    "errCode",
    "errName",
    "description"
})
public class ErrorType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ErrCodeType errCode;
    @XmlElement(required = true)
    protected String errName;
    protected String description;

    /**
     * Gets the value of the errCode property.
     * 
     * @return
     *     possible object is
     *     {@link ErrCodeType }
     *     
     */
    public ErrCodeType getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrCodeType }
     *     
     */
    public void setErrCode(ErrCodeType value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the errName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrName() {
        return errName;
    }

    /**
     * Sets the value of the errName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrName(String value) {
        this.errName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}

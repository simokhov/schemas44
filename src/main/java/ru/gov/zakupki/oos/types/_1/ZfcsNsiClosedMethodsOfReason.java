//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Справочник: Основания применения закрытого способа определения поставщика (подрядчика, исполнителя)
 * 
 * <p>Java class for zfcs_nsiClosedMethodsOfReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_nsiClosedMethodsOfReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="reasonName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="reasonLaw" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isHideInfoRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_nsiClosedMethodsOfReason", propOrder = {
    "reasonCode",
    "reasonName",
    "reasonLaw",
    "lastUpdateDate",
    "actual",
    "isHideInfoRequired"
})
public class ZfcsNsiClosedMethodsOfReason {

    @XmlElement(required = true)
    protected String reasonCode;
    @XmlElement(required = true)
    protected String reasonName;
    protected String reasonLaw;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    protected boolean actual;
    protected boolean isHideInfoRequired;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reasonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonName() {
        return reasonName;
    }

    /**
     * Sets the value of the reasonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonName(String value) {
        this.reasonName = value;
    }

    /**
     * Gets the value of the reasonLaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonLaw() {
        return reasonLaw;
    }

    /**
     * Sets the value of the reasonLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonLaw(String value) {
        this.reasonLaw = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the actual property.
     * 
     */
    public boolean isActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     */
    public void setActual(boolean value) {
        this.actual = value;
    }

    /**
     * Gets the value of the isHideInfoRequired property.
     * 
     */
    public boolean isIsHideInfoRequired() {
        return isHideInfoRequired;
    }

    /**
     * Sets the value of the isHideInfoRequired property.
     * 
     */
    public void setIsHideInfoRequired(boolean value) {
        this.isHideInfoRequired = value;
    }

}

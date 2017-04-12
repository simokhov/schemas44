//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:36 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о бюджетном обязательстве в требованиях заказчика
 * 
 * <p>Java class for zfcs_purchaseBOInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseBOInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BONumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99BONumber"/>
 *         &lt;element name="BODate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="inputBOFlag">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="auto"/>
 *               &lt;enumeration value="manual"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchaseBOInfoType", propOrder = {
    "boNumber",
    "boDate",
    "inputBOFlag"
})
public class ZfcsPurchaseBOInfoType {

    @XmlElement(name = "BONumber", required = true)
    protected String boNumber;
    @XmlElement(name = "BODate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar boDate;
    @XmlElement(required = true)
    protected String inputBOFlag;

    /**
     * Gets the value of the boNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBONumber() {
        return boNumber;
    }

    /**
     * Sets the value of the boNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBONumber(String value) {
        this.boNumber = value;
    }

    /**
     * Gets the value of the boDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBODate() {
        return boDate;
    }

    /**
     * Sets the value of the boDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBODate(XMLGregorianCalendar value) {
        this.boDate = value;
    }

    /**
     * Gets the value of the inputBOFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputBOFlag() {
        return inputBOFlag;
    }

    /**
     * Sets the value of the inputBOFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputBOFlag(String value) {
        this.inputBOFlag = value;
    }

}

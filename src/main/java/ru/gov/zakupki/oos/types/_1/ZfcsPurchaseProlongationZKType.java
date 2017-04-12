//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:57:13 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Извещение продлении срока подачи котировочных заявок
 * 
 * <p>Java class for zfcs_purchaseProlongationZKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseProlongationZKType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProlongationCommonType">
 *       &lt;sequence>
 *         &lt;element name="collectingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="collectingProlongationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="openingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="openingProlongationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchaseProlongationZKType", propOrder = {
    "collectingEndDate",
    "collectingProlongationDate",
    "openingDate",
    "openingProlongationDate"
})
public class ZfcsPurchaseProlongationZKType
    extends ZfcsPurchaseProlongationCommonType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectingEndDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectingProlongationDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingProlongationDate;

    /**
     * Gets the value of the collectingEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectingEndDate() {
        return collectingEndDate;
    }

    /**
     * Sets the value of the collectingEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectingEndDate(XMLGregorianCalendar value) {
        this.collectingEndDate = value;
    }

    /**
     * Gets the value of the collectingProlongationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectingProlongationDate() {
        return collectingProlongationDate;
    }

    /**
     * Sets the value of the collectingProlongationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectingProlongationDate(XMLGregorianCalendar value) {
        this.collectingProlongationDate = value;
    }

    /**
     * Gets the value of the openingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpeningDate() {
        return openingDate;
    }

    /**
     * Sets the value of the openingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpeningDate(XMLGregorianCalendar value) {
        this.openingDate = value;
    }

    /**
     * Gets the value of the openingProlongationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpeningProlongationDate() {
        return openingProlongationDate;
    }

    /**
     * Sets the value of the openingProlongationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpeningProlongationDate(XMLGregorianCalendar value) {
        this.openingProlongationDate = value;
    }

}

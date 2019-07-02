//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Данные процедуры Информация о процедуре рассмотрения и оценки заявок
 * 
 * <p>Java class for procedureScoringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="procedureScoringType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstPartsDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="finalOfferDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="secondPartsDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procedureScoringType", propOrder = {
    "firstPartsDT",
    "finalOfferDate",
    "secondPartsDT"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.eptypes._1.ProcedureEOKDType.SecondStageInfo.ScoringInfo.class,
    ru.gov.zakupki.oos.eptypes._1.ProcedureEOKType.ScoringInfo.class
})
public class ProcedureScoringType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstPartsDT;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finalOfferDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar secondPartsDT;

    /**
     * Gets the value of the firstPartsDT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPartsDT() {
        return firstPartsDT;
    }

    /**
     * Sets the value of the firstPartsDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPartsDT(XMLGregorianCalendar value) {
        this.firstPartsDT = value;
    }

    /**
     * Gets the value of the finalOfferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalOfferDate() {
        return finalOfferDate;
    }

    /**
     * Sets the value of the finalOfferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalOfferDate(XMLGregorianCalendar value) {
        this.finalOfferDate = value;
    }

    /**
     * Gets the value of the secondPartsDT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSecondPartsDT() {
        return secondPartsDT;
    }

    /**
     * Sets the value of the secondPartsDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSecondPartsDT(XMLGregorianCalendar value) {
        this.secondPartsDT = value;
    }

}

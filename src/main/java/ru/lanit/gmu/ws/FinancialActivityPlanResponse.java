//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:05:13 PM MSK 
//


package ru.lanit.gmu.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for financialActivityPlanResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financialActivityPlanResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="result" type="{http://ws.gmu.lanit.ru/}errorResult" minOccurs="0"/>
 *         &lt;element name="financialActivityPlan" type="{http://ws.gmu.lanit.ru/}financialActivityPlanDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financialActivityPlanResponse", propOrder = {
    "eventDate",
    "result",
    "financialActivityPlan"
})
public class FinancialActivityPlanResponse {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    protected ErrorResult result;
    protected FinancialActivityPlanDto financialActivityPlan;

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResult }
     *     
     */
    public ErrorResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResult }
     *     
     */
    public void setResult(ErrorResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the financialActivityPlan property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialActivityPlanDto }
     *     
     */
    public FinancialActivityPlanDto getFinancialActivityPlan() {
        return financialActivityPlan;
    }

    /**
     * Sets the value of the financialActivityPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialActivityPlanDto }
     *     
     */
    public void setFinancialActivityPlan(FinancialActivityPlanDto value) {
        this.financialActivityPlan = value;
    }

}

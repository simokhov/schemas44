//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.RequestForQuotation;
import ru.gov.zakupki.oos.signincoming._1.RequestForQuotationCancel;


/**
 * <p>Java class for receiveZcRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveZcRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="requestForQuotationCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}requestForQuotationCancel"/>
 *         &lt;element name="requestForQuotation" type="{http://zakupki.gov.ru/oos/signIncoming/1}requestForQuotation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveZcRequestType", propOrder = {
    "requestForQuotationCancel",
    "requestForQuotation"
})
public class ReceiveZcRequestType {

    protected RequestForQuotationCancel requestForQuotationCancel;
    protected RequestForQuotation requestForQuotation;

    /**
     * Gets the value of the requestForQuotationCancel property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForQuotationCancel }
     *     
     */
    public RequestForQuotationCancel getRequestForQuotationCancel() {
        return requestForQuotationCancel;
    }

    /**
     * Sets the value of the requestForQuotationCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForQuotationCancel }
     *     
     */
    public void setRequestForQuotationCancel(RequestForQuotationCancel value) {
        this.requestForQuotationCancel = value;
    }

    /**
     * Gets the value of the requestForQuotation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForQuotation }
     *     
     */
    public RequestForQuotation getRequestForQuotation() {
        return requestForQuotation;
    }

    /**
     * Sets the value of the requestForQuotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForQuotation }
     *     
     */
    public void setRequestForQuotation(RequestForQuotation value) {
        this.requestForQuotation = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:00:11 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.EventResult;
import ru.gov.zakupki.oos.signincoming._1.EventResultCancel;


/**
 * <p>Java class for receiveRrkRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRrkRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="eventResult" type="{http://zakupki.gov.ru/oos/signIncoming/1}eventResult"/>
 *         &lt;element name="eventResultCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}eventResultCancel"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRrkRequestType", propOrder = {
    "eventResult",
    "eventResultCancel"
})
public class ReceiveRrkRequestType {

    protected EventResult eventResult;
    protected EventResultCancel eventResultCancel;

    /**
     * Gets the value of the eventResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResult }
     *     
     */
    public EventResult getEventResult() {
        return eventResult;
    }

    /**
     * Sets the value of the eventResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResult }
     *     
     */
    public void setEventResult(EventResult value) {
        this.eventResult = value;
    }

    /**
     * Gets the value of the eventResultCancel property.
     * 
     * @return
     *     possible object is
     *     {@link EventResultCancel }
     *     
     */
    public EventResultCancel getEventResultCancel() {
        return eventResultCancel;
    }

    /**
     * Sets the value of the eventResultCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResultCancel }
     *     
     */
    public void setEventResultCancel(EventResultCancel value) {
        this.eventResultCancel = value;
    }

}

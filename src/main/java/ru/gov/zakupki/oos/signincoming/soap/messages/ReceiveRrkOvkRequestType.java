//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:26:31 AM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.EventResult;
import ru.gov.zakupki.oos.signincoming._1.EventResultCancel;
import ru.gov.zakupki.oos.signincoming._1.EventResultCancelProject;
import ru.gov.zakupki.oos.signincoming._1.EventResultProject;


/**
 * <p>Java class for receiveRrkOvkRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRrkOvkRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="eventResult" type="{http://zakupki.gov.ru/oos/signIncoming/1}eventResult"/>
 *         &lt;element name="eventResultProject" type="{http://zakupki.gov.ru/oos/signIncoming/1}eventResultProject"/>
 *         &lt;element name="eventResultCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}eventResultCancel"/>
 *         &lt;element name="eventResultCancelProject" type="{http://zakupki.gov.ru/oos/signIncoming/1}eventResultCancelProject"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRrkOvkRequestType", propOrder = {
    "eventResult",
    "eventResultProject",
    "eventResultCancel",
    "eventResultCancelProject"
})
public class ReceiveRrkOvkRequestType {

    protected EventResult eventResult;
    protected EventResultProject eventResultProject;
    protected EventResultCancel eventResultCancel;
    protected EventResultCancelProject eventResultCancelProject;

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
     * Gets the value of the eventResultProject property.
     * 
     * @return
     *     possible object is
     *     {@link EventResultProject }
     *     
     */
    public EventResultProject getEventResultProject() {
        return eventResultProject;
    }

    /**
     * Sets the value of the eventResultProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResultProject }
     *     
     */
    public void setEventResultProject(EventResultProject value) {
        this.eventResultProject = value;
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

    /**
     * Gets the value of the eventResultCancelProject property.
     * 
     * @return
     *     possible object is
     *     {@link EventResultCancelProject }
     *     
     */
    public EventResultCancelProject getEventResultCancelProject() {
        return eventResultCancelProject;
    }

    /**
     * Sets the value of the eventResultCancelProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResultCancelProject }
     *     
     */
    public void setEventResultCancelProject(EventResultCancelProject value) {
        this.eventResultCancelProject = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.EventPlan;
import ru.gov.zakupki.oos.signincoming._1.EventPlanProject;
import ru.gov.zakupki.oos.signincoming._1.EventPlanSuspension;


/**
 * <p>Java class for receiveRppOvkRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRppOvkRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="eventPlan" type="{http://zakupki.gov.ru/oos/signIncoming/1}eventPlan"/>
 *         &lt;element name="eventPlanProject" type="{http://zakupki.gov.ru/oos/signIncoming/1}eventPlanProject"/>
 *         &lt;element name="eventPlanSuspension" type="{http://zakupki.gov.ru/oos/signIncoming/1}eventPlanSuspension"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRppOvkRequestType", propOrder = {
    "eventPlan",
    "eventPlanProject",
    "eventPlanSuspension"
})
public class ReceiveRppOvkRequestType {

    protected EventPlan eventPlan;
    protected EventPlanProject eventPlanProject;
    protected EventPlanSuspension eventPlanSuspension;

    /**
     * Gets the value of the eventPlan property.
     * 
     * @return
     *     possible object is
     *     {@link EventPlan }
     *     
     */
    public EventPlan getEventPlan() {
        return eventPlan;
    }

    /**
     * Sets the value of the eventPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPlan }
     *     
     */
    public void setEventPlan(EventPlan value) {
        this.eventPlan = value;
    }

    /**
     * Gets the value of the eventPlanProject property.
     * 
     * @return
     *     possible object is
     *     {@link EventPlanProject }
     *     
     */
    public EventPlanProject getEventPlanProject() {
        return eventPlanProject;
    }

    /**
     * Sets the value of the eventPlanProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPlanProject }
     *     
     */
    public void setEventPlanProject(EventPlanProject value) {
        this.eventPlanProject = value;
    }

    /**
     * Gets the value of the eventPlanSuspension property.
     * 
     * @return
     *     possible object is
     *     {@link EventPlanSuspension }
     *     
     */
    public EventPlanSuspension getEventPlanSuspension() {
        return eventPlanSuspension;
    }

    /**
     * Sets the value of the eventPlanSuspension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPlanSuspension }
     *     
     */
    public void setEventPlanSuspension(EventPlanSuspension value) {
        this.eventPlanSuspension = value;
    }

}

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
import ru.gov.zakupki.oos.signincoming._1.UnplannedEvent;
import ru.gov.zakupki.oos.signincoming._1.UnplannedEventCancel;
import ru.gov.zakupki.oos.signincoming._1.UnplannedEventCancelProject;
import ru.gov.zakupki.oos.signincoming._1.UnplannedEventProject;
import ru.gov.zakupki.oos.signincoming._1.UnplannedEventSuspension;


/**
 * <p>Java class for receiveRvpOvkRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRvpOvkRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="unplannedEvent" type="{http://zakupki.gov.ru/oos/signIncoming/1}unplannedEvent"/>
 *         &lt;element name="unplannedEventProject" type="{http://zakupki.gov.ru/oos/signIncoming/1}unplannedEventProject"/>
 *         &lt;element name="unplannedEventSuspension" type="{http://zakupki.gov.ru/oos/signIncoming/1}unplannedEventSuspension"/>
 *         &lt;element name="unplannedEventCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}unplannedEventCancel"/>
 *         &lt;element name="unplannedEventCancelProject" type="{http://zakupki.gov.ru/oos/signIncoming/1}unplannedEventCancelProject"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRvpOvkRequestType", propOrder = {
    "unplannedEvent",
    "unplannedEventProject",
    "unplannedEventSuspension",
    "unplannedEventCancel",
    "unplannedEventCancelProject"
})
public class ReceiveRvpOvkRequestType {

    protected UnplannedEvent unplannedEvent;
    protected UnplannedEventProject unplannedEventProject;
    protected UnplannedEventSuspension unplannedEventSuspension;
    protected UnplannedEventCancel unplannedEventCancel;
    protected UnplannedEventCancelProject unplannedEventCancelProject;

    /**
     * Gets the value of the unplannedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link UnplannedEvent }
     *     
     */
    public UnplannedEvent getUnplannedEvent() {
        return unplannedEvent;
    }

    /**
     * Sets the value of the unplannedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnplannedEvent }
     *     
     */
    public void setUnplannedEvent(UnplannedEvent value) {
        this.unplannedEvent = value;
    }

    /**
     * Gets the value of the unplannedEventProject property.
     * 
     * @return
     *     possible object is
     *     {@link UnplannedEventProject }
     *     
     */
    public UnplannedEventProject getUnplannedEventProject() {
        return unplannedEventProject;
    }

    /**
     * Sets the value of the unplannedEventProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnplannedEventProject }
     *     
     */
    public void setUnplannedEventProject(UnplannedEventProject value) {
        this.unplannedEventProject = value;
    }

    /**
     * Gets the value of the unplannedEventSuspension property.
     * 
     * @return
     *     possible object is
     *     {@link UnplannedEventSuspension }
     *     
     */
    public UnplannedEventSuspension getUnplannedEventSuspension() {
        return unplannedEventSuspension;
    }

    /**
     * Sets the value of the unplannedEventSuspension property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnplannedEventSuspension }
     *     
     */
    public void setUnplannedEventSuspension(UnplannedEventSuspension value) {
        this.unplannedEventSuspension = value;
    }

    /**
     * Gets the value of the unplannedEventCancel property.
     * 
     * @return
     *     possible object is
     *     {@link UnplannedEventCancel }
     *     
     */
    public UnplannedEventCancel getUnplannedEventCancel() {
        return unplannedEventCancel;
    }

    /**
     * Sets the value of the unplannedEventCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnplannedEventCancel }
     *     
     */
    public void setUnplannedEventCancel(UnplannedEventCancel value) {
        this.unplannedEventCancel = value;
    }

    /**
     * Gets the value of the unplannedEventCancelProject property.
     * 
     * @return
     *     possible object is
     *     {@link UnplannedEventCancelProject }
     *     
     */
    public UnplannedEventCancelProject getUnplannedEventCancelProject() {
        return unplannedEventCancelProject;
    }

    /**
     * Sets the value of the unplannedEventCancelProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnplannedEventCancelProject }
     *     
     */
    public void setUnplannedEventCancelProject(UnplannedEventCancelProject value) {
        this.unplannedEventCancelProject = value;
    }

}

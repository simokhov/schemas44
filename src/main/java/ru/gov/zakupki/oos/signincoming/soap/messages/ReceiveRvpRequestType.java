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
import ru.gov.zakupki.oos.signincoming._1.UnplannedCheck;
import ru.gov.zakupki.oos.signincoming._1.UnplannedCheckCancel;


/**
 * <p>Java class for receiveRvpRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRvpRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="unplannedCheck" type="{http://zakupki.gov.ru/oos/signIncoming/1}unplannedCheck"/>
 *         &lt;element name="unplannedCheckCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}unplannedCheckCancel"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRvpRequestType", propOrder = {
    "unplannedCheck",
    "unplannedCheckCancel"
})
public class ReceiveRvpRequestType {

    protected UnplannedCheck unplannedCheck;
    protected UnplannedCheckCancel unplannedCheckCancel;

    /**
     * Gets the value of the unplannedCheck property.
     * 
     * @return
     *     possible object is
     *     {@link UnplannedCheck }
     *     
     */
    public UnplannedCheck getUnplannedCheck() {
        return unplannedCheck;
    }

    /**
     * Sets the value of the unplannedCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnplannedCheck }
     *     
     */
    public void setUnplannedCheck(UnplannedCheck value) {
        this.unplannedCheck = value;
    }

    /**
     * Gets the value of the unplannedCheckCancel property.
     * 
     * @return
     *     possible object is
     *     {@link UnplannedCheckCancel }
     *     
     */
    public UnplannedCheckCancel getUnplannedCheckCancel() {
        return unplannedCheckCancel;
    }

    /**
     * Sets the value of the unplannedCheckCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnplannedCheckCancel }
     *     
     */
    public void setUnplannedCheckCancel(UnplannedCheckCancel value) {
        this.unplannedCheckCancel = value;
    }

}

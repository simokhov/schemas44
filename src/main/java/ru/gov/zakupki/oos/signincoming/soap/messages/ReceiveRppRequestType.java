//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.CheckPlan;


/**
 * <p>Java class for receiveRppRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRppRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="checkPlan" type="{http://zakupki.gov.ru/oos/signIncoming/1}checkPlan"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRppRequestType", propOrder = {
    "checkPlan"
})
public class ReceiveRppRequestType {

    protected CheckPlan checkPlan;

    /**
     * Gets the value of the checkPlan property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPlan }
     *     
     */
    public CheckPlan getCheckPlan() {
        return checkPlan;
    }

    /**
     * Sets the value of the checkPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPlan }
     *     
     */
    public void setCheckPlan(CheckPlan value) {
        this.checkPlan = value;
    }

}

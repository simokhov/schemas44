//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.NsiBusinessControl;


/**
 * <p>Java class for receiveBusinessControlRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveBusinessControlRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="businessControl" type="{http://zakupki.gov.ru/oos/signIncoming/1}nsiBusinessControl"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveBusinessControlRequestType", propOrder = {
    "businessControl"
})
public class ReceiveBusinessControlRequestType {

    protected NsiBusinessControl businessControl;

    /**
     * Gets the value of the businessControl property.
     * 
     * @return
     *     possible object is
     *     {@link NsiBusinessControl }
     *     
     */
    public NsiBusinessControl getBusinessControl() {
        return businessControl;
    }

    /**
     * Sets the value of the businessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiBusinessControl }
     *     
     */
    public void setBusinessControl(NsiBusinessControl value) {
        this.businessControl = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:48:41 AM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.AuditResult;


/**
 * <p>Java class for receiveRraRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRraRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="auditResult" type="{http://zakupki.gov.ru/oos/signIncoming/1}auditResult"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRraRequestType", propOrder = {
    "auditResult"
})
public class ReceiveRraRequestType {

    protected AuditResult auditResult;

    /**
     * Gets the value of the auditResult property.
     * 
     * @return
     *     possible object is
     *     {@link AuditResult }
     *     
     */
    public AuditResult getAuditResult() {
        return auditResult;
    }

    /**
     * Sets the value of the auditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditResult }
     *     
     */
    public void setAuditResult(AuditResult value) {
        this.auditResult = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.CheckResult;
import ru.gov.zakupki.oos.signincoming._1.CheckResultCancel;


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
 *         &lt;element name="checkResult" type="{http://zakupki.gov.ru/oos/signIncoming/1}checkResult"/>
 *         &lt;element name="checkResultCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}checkResultCancel"/>
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
    "checkResult",
    "checkResultCancel"
})
public class ReceiveRrkRequestType {

    protected CheckResult checkResult;
    protected CheckResultCancel checkResultCancel;

    /**
     * Gets the value of the checkResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckResult }
     *     
     */
    public CheckResult getCheckResult() {
        return checkResult;
    }

    /**
     * Sets the value of the checkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckResult }
     *     
     */
    public void setCheckResult(CheckResult value) {
        this.checkResult = value;
    }

    /**
     * Gets the value of the checkResultCancel property.
     * 
     * @return
     *     possible object is
     *     {@link CheckResultCancel }
     *     
     */
    public CheckResultCancel getCheckResultCancel() {
        return checkResultCancel;
    }

    /**
     * Sets the value of the checkResultCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckResultCancel }
     *     
     */
    public void setCheckResultCancel(CheckResultCancel value) {
        this.checkResultCancel = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:36 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Приостановление/возобновление ООКЗ
 * 
 * <p>Java class for zfcs_publicDiscussionSuspension2016Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_publicDiscussionSuspension2016Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionLargePurchase2016Type">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://zakupki.gov.ru/oos/types/1}zfcs_publicDiscussionrSuspensionActionType"/>
 *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_publicDiscussionSuspension2016Type", propOrder = {
    "action",
    "reason"
})
public class ZfcsPublicDiscussionSuspension2016Type
    extends ZfcsPublicDiscussionLargePurchase2016Type
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsPublicDiscussionrSuspensionActionType action;
    @XmlElement(required = true)
    protected String reason;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPublicDiscussionrSuspensionActionType }
     *     
     */
    public ZfcsPublicDiscussionrSuspensionActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPublicDiscussionrSuspensionActionType }
     *     
     */
    public void setAction(ZfcsPublicDiscussionrSuspensionActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
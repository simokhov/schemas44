//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:05:46 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.PublicDiscussionAnswer;
import ru.gov.zakupki.oos.signincoming._1.PublicDiscussionLargePurchasePhase1;
import ru.gov.zakupki.oos.signincoming._1.PublicDiscussionLargePurchasePhase2;
import ru.gov.zakupki.oos.signincoming._1.PublicDiscussionSuspensionPhase1;
import ru.gov.zakupki.oos.signincoming._1.PublicDiscussionSuspensionPhase2;


/**
 * <p>Java class for receiveOokzRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveOokzRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="publicDiscussionLargePurchasePhase1" type="{http://zakupki.gov.ru/oos/signIncoming/1}publicDiscussionLargePurchasePhase1"/>
 *         &lt;element name="publicDiscussionLargePurchasePhase2" type="{http://zakupki.gov.ru/oos/signIncoming/1}publicDiscussionLargePurchasePhase2"/>
 *         &lt;element name="publicDiscussionSuspensionPhase1" type="{http://zakupki.gov.ru/oos/signIncoming/1}publicDiscussionSuspensionPhase1"/>
 *         &lt;element name="publicDiscussionSuspensionPhase2" type="{http://zakupki.gov.ru/oos/signIncoming/1}publicDiscussionSuspensionPhase2"/>
 *         &lt;element name="publicDiscussionAnswer" type="{http://zakupki.gov.ru/oos/signIncoming/1}publicDiscussionAnswer"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveOokzRequestType", propOrder = {
    "publicDiscussionLargePurchasePhase1",
    "publicDiscussionLargePurchasePhase2",
    "publicDiscussionSuspensionPhase1",
    "publicDiscussionSuspensionPhase2",
    "publicDiscussionAnswer"
})
public class ReceiveOokzRequestType {

    protected PublicDiscussionLargePurchasePhase1 publicDiscussionLargePurchasePhase1;
    protected PublicDiscussionLargePurchasePhase2 publicDiscussionLargePurchasePhase2;
    protected PublicDiscussionSuspensionPhase1 publicDiscussionSuspensionPhase1;
    protected PublicDiscussionSuspensionPhase2 publicDiscussionSuspensionPhase2;
    protected PublicDiscussionAnswer publicDiscussionAnswer;

    /**
     * Gets the value of the publicDiscussionLargePurchasePhase1 property.
     * 
     * @return
     *     possible object is
     *     {@link PublicDiscussionLargePurchasePhase1 }
     *     
     */
    public PublicDiscussionLargePurchasePhase1 getPublicDiscussionLargePurchasePhase1() {
        return publicDiscussionLargePurchasePhase1;
    }

    /**
     * Sets the value of the publicDiscussionLargePurchasePhase1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicDiscussionLargePurchasePhase1 }
     *     
     */
    public void setPublicDiscussionLargePurchasePhase1(PublicDiscussionLargePurchasePhase1 value) {
        this.publicDiscussionLargePurchasePhase1 = value;
    }

    /**
     * Gets the value of the publicDiscussionLargePurchasePhase2 property.
     * 
     * @return
     *     possible object is
     *     {@link PublicDiscussionLargePurchasePhase2 }
     *     
     */
    public PublicDiscussionLargePurchasePhase2 getPublicDiscussionLargePurchasePhase2() {
        return publicDiscussionLargePurchasePhase2;
    }

    /**
     * Sets the value of the publicDiscussionLargePurchasePhase2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicDiscussionLargePurchasePhase2 }
     *     
     */
    public void setPublicDiscussionLargePurchasePhase2(PublicDiscussionLargePurchasePhase2 value) {
        this.publicDiscussionLargePurchasePhase2 = value;
    }

    /**
     * Gets the value of the publicDiscussionSuspensionPhase1 property.
     * 
     * @return
     *     possible object is
     *     {@link PublicDiscussionSuspensionPhase1 }
     *     
     */
    public PublicDiscussionSuspensionPhase1 getPublicDiscussionSuspensionPhase1() {
        return publicDiscussionSuspensionPhase1;
    }

    /**
     * Sets the value of the publicDiscussionSuspensionPhase1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicDiscussionSuspensionPhase1 }
     *     
     */
    public void setPublicDiscussionSuspensionPhase1(PublicDiscussionSuspensionPhase1 value) {
        this.publicDiscussionSuspensionPhase1 = value;
    }

    /**
     * Gets the value of the publicDiscussionSuspensionPhase2 property.
     * 
     * @return
     *     possible object is
     *     {@link PublicDiscussionSuspensionPhase2 }
     *     
     */
    public PublicDiscussionSuspensionPhase2 getPublicDiscussionSuspensionPhase2() {
        return publicDiscussionSuspensionPhase2;
    }

    /**
     * Sets the value of the publicDiscussionSuspensionPhase2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicDiscussionSuspensionPhase2 }
     *     
     */
    public void setPublicDiscussionSuspensionPhase2(PublicDiscussionSuspensionPhase2 value) {
        this.publicDiscussionSuspensionPhase2 = value;
    }

    /**
     * Gets the value of the publicDiscussionAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link PublicDiscussionAnswer }
     *     
     */
    public PublicDiscussionAnswer getPublicDiscussionAnswer() {
        return publicDiscussionAnswer;
    }

    /**
     * Sets the value of the publicDiscussionAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicDiscussionAnswer }
     *     
     */
    public void setPublicDiscussionAnswer(PublicDiscussionAnswer value) {
        this.publicDiscussionAnswer = value;
    }

}

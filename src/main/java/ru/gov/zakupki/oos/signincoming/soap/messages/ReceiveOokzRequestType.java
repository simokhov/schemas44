//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:00:50 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.PublicDiscussionAnswer;
import ru.gov.zakupki.oos.signincoming._1.PublicDiscussionLargePurchase;
import ru.gov.zakupki.oos.signincoming._1.PublicDiscussionProtocol;


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
 *         &lt;element name="publicDiscussionAnswer" type="{http://zakupki.gov.ru/oos/signIncoming/1}publicDiscussionAnswer"/>
 *         &lt;element name="publicDiscussionProtocol" type="{http://zakupki.gov.ru/oos/signIncoming/1}publicDiscussionProtocol"/>
 *         &lt;element name="publicDiscussionLargePurchase" type="{http://zakupki.gov.ru/oos/signIncoming/1}publicDiscussionLargePurchase"/>
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
    "publicDiscussionAnswer",
    "publicDiscussionProtocol",
    "publicDiscussionLargePurchase"
})
public class ReceiveOokzRequestType {

    protected PublicDiscussionAnswer publicDiscussionAnswer;
    protected PublicDiscussionProtocol publicDiscussionProtocol;
    protected PublicDiscussionLargePurchase publicDiscussionLargePurchase;

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

    /**
     * Gets the value of the publicDiscussionProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link PublicDiscussionProtocol }
     *     
     */
    public PublicDiscussionProtocol getPublicDiscussionProtocol() {
        return publicDiscussionProtocol;
    }

    /**
     * Sets the value of the publicDiscussionProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicDiscussionProtocol }
     *     
     */
    public void setPublicDiscussionProtocol(PublicDiscussionProtocol value) {
        this.publicDiscussionProtocol = value;
    }

    /**
     * Gets the value of the publicDiscussionLargePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link PublicDiscussionLargePurchase }
     *     
     */
    public PublicDiscussionLargePurchase getPublicDiscussionLargePurchase() {
        return publicDiscussionLargePurchase;
    }

    /**
     * Sets the value of the publicDiscussionLargePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicDiscussionLargePurchase }
     *     
     */
    public void setPublicDiscussionLargePurchase(PublicDiscussionLargePurchase value) {
        this.publicDiscussionLargePurchase = value;
    }

}

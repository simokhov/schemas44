//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.AddInfo;
import ru.gov.zakupki.oos.signincoming._1.AddInfoInvalid;


/**
 * <p>Java class for receiveRdiRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRdiRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="addInfoInvalid" type="{http://zakupki.gov.ru/oos/signIncoming/1}addInfoInvalid"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/signIncoming/1}addInfo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRdiRequestType", propOrder = {
    "addInfoInvalid",
    "addInfo"
})
public class ReceiveRdiRequestType {

    protected AddInfoInvalid addInfoInvalid;
    protected AddInfo addInfo;

    /**
     * Gets the value of the addInfoInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link AddInfoInvalid }
     *     
     */
    public AddInfoInvalid getAddInfoInvalid() {
        return addInfoInvalid;
    }

    /**
     * Sets the value of the addInfoInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddInfoInvalid }
     *     
     */
    public void setAddInfoInvalid(AddInfoInvalid value) {
        this.addInfoInvalid = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddInfo }
     *     
     */
    public AddInfo getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddInfo }
     *     
     */
    public void setAddInfo(AddInfo value) {
        this.addInfo = value;
    }

}

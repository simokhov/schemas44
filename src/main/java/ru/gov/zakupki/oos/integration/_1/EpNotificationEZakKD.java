//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.integration._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.eptypes._1.NotificationEZakKDType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/integration/1}as2PacketType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/EPtypes/1}notificationEZakKDType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "data"
})
@XmlRootElement(name = "epNotificationEZakKD")
public class EpNotificationEZakKD
    extends As2PacketType
{

    @XmlElement(required = true)
    protected NotificationEZakKDType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEZakKDType }
     *     
     */
    public NotificationEZakKDType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEZakKDType }
     *     
     */
    public void setData(NotificationEZakKDType value) {
        this.data = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Извещение об отмене определения поставщика (подрядчика, исполнителя)
 * 
 * <p>Java class for notificationCancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationCancelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}purchaseDocumentType">
 *       &lt;sequence>
 *         &lt;element name="cancelReasonInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}notificationChangeReasonType"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationCancelType", propOrder = {
    "cancelReasonInfo",
    "addInfo"
})
public class NotificationCancelType
    extends PurchaseDocumentType
{

    @XmlElement(required = true)
    protected NotificationChangeReasonType cancelReasonInfo;
    protected String addInfo;

    /**
     * Gets the value of the cancelReasonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationChangeReasonType }
     *     
     */
    public NotificationChangeReasonType getCancelReasonInfo() {
        return cancelReasonInfo;
    }

    /**
     * Sets the value of the cancelReasonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationChangeReasonType }
     *     
     */
    public void setCancelReasonInfo(NotificationChangeReasonType value) {
        this.cancelReasonInfo = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
    }

}

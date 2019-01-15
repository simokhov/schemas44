//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Извещение об отказе от проведения закупки
 * 
 * <p>Java class for notificationCancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationCancelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseDocumentCommonType">
 *       &lt;sequence>
 *         &lt;element name="cancelReasonInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}purchaseCancelType"/>
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
    "cancelReasonInfo"
})
public class NotificationCancelType
    extends PurchaseDocumentCommonType
{

    @XmlElement(required = true)
    protected PurchaseCancelType cancelReasonInfo;

    /**
     * Gets the value of the cancelReasonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseCancelType }
     *     
     */
    public PurchaseCancelType getCancelReasonInfo() {
        return cancelReasonInfo;
    }

    /**
     * Sets the value of the cancelReasonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseCancelType }
     *     
     */
    public void setCancelReasonInfo(PurchaseCancelType value) {
        this.cancelReasonInfo = value;
    }

}

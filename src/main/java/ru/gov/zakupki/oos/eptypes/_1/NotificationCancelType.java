//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
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
 *         &lt;element name="cancelReasonInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}notificationModificationType"/>
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
    extends PurchaseDocumentType
{

    @XmlElement(required = true)
    protected NotificationModificationType cancelReasonInfo;

    /**
     * Gets the value of the cancelReasonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationModificationType }
     *     
     */
    public NotificationModificationType getCancelReasonInfo() {
        return cancelReasonInfo;
    }

    /**
     * Sets the value of the cancelReasonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationModificationType }
     *     
     */
    public void setCancelReasonInfo(NotificationModificationType value) {
        this.cancelReasonInfo = value;
    }

}

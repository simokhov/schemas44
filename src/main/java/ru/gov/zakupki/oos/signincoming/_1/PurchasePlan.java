//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:05:13 PM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.types._1.ZfcsPurchasePlanType;


/**
 * Пакет данных:
 * План закупок в структурированной форме
 * 
 * <p>Java class for purchasePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlan", propOrder = {
    "data"
})
public class PurchasePlan
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsPurchasePlanType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanType }
     *     
     */
    public ZfcsPurchasePlanType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanType }
     *     
     */
    public void setData(ZfcsPurchasePlanType value) {
        this.data = value;
    }

}

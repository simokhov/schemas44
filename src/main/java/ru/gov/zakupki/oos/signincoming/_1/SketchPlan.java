//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:03:02 PM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.types._1.ZfcsSketchPlanType;


/**
 * Пакет данных:
 * План закупок в неструктурированной форме
 * 
 * <p>Java class for sketchPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sketchPlan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_sketchPlanType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sketchPlan", propOrder = {
    "data"
})
public class SketchPlan
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsSketchPlanType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsSketchPlanType }
     *     
     */
    public ZfcsSketchPlanType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsSketchPlanType }
     *     
     */
    public void setData(ZfcsSketchPlanType value) {
        this.data = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:44:23 AM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.types._1.ZfcsCustomerReportSmallScaleBusinessInvalidType;


/**
 * Пакет данных:
 * Информация о недействительности сведений отчета об объеме закупок у СМП (субъектов малого предпринимательства), СОНО (социально ориентированных некоммерческих организаций)
 * 
 * <p>Java class for customerReportSmallScaleBusinessInvalid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerReportSmallScaleBusinessInvalid">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSmallScaleBusinessInvalidType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerReportSmallScaleBusinessInvalid", propOrder = {
    "data"
})
public class CustomerReportSmallScaleBusinessInvalid
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsCustomerReportSmallScaleBusinessInvalidType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessInvalidType }
     *     
     */
    public ZfcsCustomerReportSmallScaleBusinessInvalidType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessInvalidType }
     *     
     */
    public void setData(ZfcsCustomerReportSmallScaleBusinessInvalidType value) {
        this.data = value;
    }

}

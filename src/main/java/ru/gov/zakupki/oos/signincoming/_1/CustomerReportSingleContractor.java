//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 11:23:43 AM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.types._1.ZfcsCustomerReportSingleContractorType;


/**
 * Пакет данных:
 * Отчет с обоснованием закупки у единственного поставщика (подрядчика, исполнителя)
 * 
 * <p>Java class for customerReportSingleContractor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerReportSingleContractor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/signIncoming/1}packetType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSingleContractorType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerReportSingleContractor", propOrder = {
    "data"
})
public class CustomerReportSingleContractor
    extends PacketType
{

    @XmlElement(required = true)
    protected ZfcsCustomerReportSingleContractorType data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSingleContractorType }
     *     
     */
    public ZfcsCustomerReportSingleContractorType getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSingleContractorType }
     *     
     */
    public void setData(ZfcsCustomerReportSingleContractorType value) {
        this.data = value;
    }

}

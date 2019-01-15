//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о недействительности сведений отчета об объеме закупок у СМП (субъектов малого предпринимательства), СОНО (социально ориентированных некоммерческих организаций)
 * 
 * <p>Java class for zfcs_customerReportSmallScaleBusinessInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportSmallScaleBusinessInvalidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportInvalidType">
 *       &lt;sequence>
 *         &lt;element name="report" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportSmallScaleBusinessType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportSmallScaleBusinessInvalidType", propOrder = {
    "report"
})
public class ZfcsCustomerReportSmallScaleBusinessInvalidType
    extends ZfcsCustomerReportInvalidType
{

    protected ZfcsCustomerReportSmallScaleBusinessType report;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessType }
     *     
     */
    public ZfcsCustomerReportSmallScaleBusinessType getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportSmallScaleBusinessType }
     *     
     */
    public void setReport(ZfcsCustomerReportSmallScaleBusinessType value) {
        this.report = value;
    }

}

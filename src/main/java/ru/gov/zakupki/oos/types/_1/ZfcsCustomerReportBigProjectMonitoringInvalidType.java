//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:48:41 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о недействительности сведений отчета по мониторингу реализации крупных проектов с государственным участием
 * 
 * <p>Java class for zfcs_customerReportBigProjectMonitoringInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportBigProjectMonitoringInvalidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportInvalidType">
 *       &lt;sequence>
 *         &lt;element name="report" type="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportBigProjectMonitoringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportBigProjectMonitoringInvalidType", propOrder = {
    "report"
})
public class ZfcsCustomerReportBigProjectMonitoringInvalidType
    extends ZfcsCustomerReportInvalidType
{

    protected ZfcsCustomerReportBigProjectMonitoringType report;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType }
     *     
     */
    public ZfcsCustomerReportBigProjectMonitoringType getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCustomerReportBigProjectMonitoringType }
     *     
     */
    public void setReport(ZfcsCustomerReportBigProjectMonitoringType value) {
        this.report = value;
    }

}

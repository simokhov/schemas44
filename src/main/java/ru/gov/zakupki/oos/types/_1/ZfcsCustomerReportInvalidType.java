//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:05:13 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Общая информация о недействительности сведений отчета заказчика
 * 
 * <p>Java class for zfcs_customerReportInvalidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_customerReportInvalidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_customerReportBaseType">
 *       &lt;sequence>
 *         &lt;element name="reportId" type="{http://zakupki.gov.ru/oos/types/1}zfcs_reportIdType"/>
 *         &lt;element name="invalidReportInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_invalidReportType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_customerReportInvalidType", propOrder = {
    "reportId",
    "invalidReportInfo"
})
@XmlSeeAlso({
    ZfcsCustomerReportSingleContractorInvalidType.class,
    ZfcsCustomerReportContractExecutionInvalidType.class,
    ZfcsCustomerReportSmallScaleBusinessInvalidType.class,
    ZfcsCustomerReportBigProjectMonitoringInvalidType.class
})
public class ZfcsCustomerReportInvalidType
    extends ZfcsCustomerReportBaseType
{

    @XmlElement(required = true)
    protected String reportId;
    @XmlElement(required = true)
    protected ZfcsInvalidReportType invalidReportInfo;

    /**
     * Gets the value of the reportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * Sets the value of the reportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportId(String value) {
        this.reportId = value;
    }

    /**
     * Gets the value of the invalidReportInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsInvalidReportType }
     *     
     */
    public ZfcsInvalidReportType getInvalidReportInfo() {
        return invalidReportInfo;
    }

    /**
     * Sets the value of the invalidReportInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsInvalidReportType }
     *     
     */
    public void setInvalidReportInfo(ZfcsInvalidReportType value) {
        this.invalidReportInfo = value;
    }

}

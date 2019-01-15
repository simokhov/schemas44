//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Сведения об организации для отчетов
 * 
 * <p>Java class for organizationReporterInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationReporterInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reporterOrgFullName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="reporterOrgShortName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;element name="reporterOrgINN" type="{http://zakupki.gov.ru/oos/base/1}innType" minOccurs="0"/>
 *         &lt;element name="reporterOrgKPP" type="{http://zakupki.gov.ru/oos/base/1}kppType" minOccurs="0"/>
 *         &lt;element name="reporterOrgOGRN" type="{http://zakupki.gov.ru/oos/base/1}ogrnCodeType" minOccurs="0"/>
 *         &lt;element name="subordinationType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_subordinationTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizationReporterInfoType", propOrder = {
    "reporterOrgFullName",
    "reporterOrgShortName",
    "reporterOrgINN",
    "reporterOrgKPP",
    "reporterOrgOGRN",
    "subordinationType"
})
public class OrganizationReporterInfoType {

    protected String reporterOrgFullName;
    protected String reporterOrgShortName;
    protected String reporterOrgINN;
    protected String reporterOrgKPP;
    protected String reporterOrgOGRN;
    protected String subordinationType;

    /**
     * Gets the value of the reporterOrgFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporterOrgFullName() {
        return reporterOrgFullName;
    }

    /**
     * Sets the value of the reporterOrgFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporterOrgFullName(String value) {
        this.reporterOrgFullName = value;
    }

    /**
     * Gets the value of the reporterOrgShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporterOrgShortName() {
        return reporterOrgShortName;
    }

    /**
     * Sets the value of the reporterOrgShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporterOrgShortName(String value) {
        this.reporterOrgShortName = value;
    }

    /**
     * Gets the value of the reporterOrgINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporterOrgINN() {
        return reporterOrgINN;
    }

    /**
     * Sets the value of the reporterOrgINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporterOrgINN(String value) {
        this.reporterOrgINN = value;
    }

    /**
     * Gets the value of the reporterOrgKPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporterOrgKPP() {
        return reporterOrgKPP;
    }

    /**
     * Sets the value of the reporterOrgKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporterOrgKPP(String value) {
        this.reporterOrgKPP = value;
    }

    /**
     * Gets the value of the reporterOrgOGRN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporterOrgOGRN() {
        return reporterOrgOGRN;
    }

    /**
     * Sets the value of the reporterOrgOGRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporterOrgOGRN(String value) {
        this.reporterOrgOGRN = value;
    }

    /**
     * Gets the value of the subordinationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubordinationType() {
        return subordinationType;
    }

    /**
     * Sets the value of the subordinationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubordinationType(String value) {
        this.subordinationType = value;
    }

}

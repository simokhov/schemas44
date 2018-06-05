//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Отчет о проведенных мероприятиях органом внутреннего контроля
 * 
 * <p>Java class for fcsReportMeasureSuperInnerAuthType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fcsReportMeasureSuperInnerAuthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportStatus" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_reportMeasuresStatus" minOccurs="0"/>
 *         &lt;element name="reportPeriodFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="reportPeriodTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="reportDateCreation" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="reportDateDepl" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="organizationInfo" type="{http://zakupki.gov.ru/oos/printform/1}organizationReporterInfoType" minOccurs="0"/>
 *         &lt;element name="procurSuperInRegionCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="munSuperInRegionCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="munProcurSuperInRegionCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pnpProcurSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pProcurSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="npProcurSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pnpMunSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cpMunSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rpMunSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rplMunSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cnpMunSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rnpMunSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rnplMunSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pnpMunProcurSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cpMunProcurSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rpMunProcurSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rplMunProcurSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cnplMunProcurSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rnplMunProcurSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rnplanMunProcurSuperMonEventCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="complaintReasonsFZ44" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="allPrecentCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="failedPrecentCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="trueFailedPrecentCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="falseFailedPrecentCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pretrialAppealCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pretrialTrueAppealCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pretrialFalseAppealCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="canceledFailedPrecentCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="partlyFailedPrecentCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="upheldFailedPrecentCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalFailedPrecentCnt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fcsReportMeasureSuperInnerAuthType", propOrder = {
    "reportStatus",
    "reportPeriodFrom",
    "reportPeriodTo",
    "reportDateCreation",
    "reportDateDepl",
    "organizationInfo",
    "procurSuperInRegionCnt",
    "munSuperInRegionCnt",
    "munProcurSuperInRegionCnt",
    "pnpProcurSuperMonEventCnt",
    "pProcurSuperMonEventCnt",
    "npProcurSuperMonEventCnt",
    "pnpMunSuperMonEventCnt",
    "cpMunSuperMonEventCnt",
    "rpMunSuperMonEventCnt",
    "rplMunSuperMonEventCnt",
    "cnpMunSuperMonEventCnt",
    "rnpMunSuperMonEventCnt",
    "rnplMunSuperMonEventCnt",
    "pnpMunProcurSuperMonEventCnt",
    "cpMunProcurSuperMonEventCnt",
    "rpMunProcurSuperMonEventCnt",
    "rplMunProcurSuperMonEventCnt",
    "cnplMunProcurSuperMonEventCnt",
    "rnplMunProcurSuperMonEventCnt",
    "rnplanMunProcurSuperMonEventCnt",
    "complaintReasonsFZ44",
    "allPrecentCnt",
    "failedPrecentCnt",
    "trueFailedPrecentCnt",
    "falseFailedPrecentCnt",
    "pretrialAppealCnt",
    "pretrialTrueAppealCnt",
    "pretrialFalseAppealCnt",
    "canceledFailedPrecentCnt",
    "partlyFailedPrecentCnt",
    "upheldFailedPrecentCnt",
    "totalFailedPrecentCnt"
})
public class FcsReportMeasureSuperInnerAuthType {

    @XmlSchemaType(name = "string")
    protected ZfcsReportMeasuresStatus reportStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportPeriodFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportPeriodTo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportDateCreation;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportDateDepl;
    protected OrganizationReporterInfoType organizationInfo;
    protected long procurSuperInRegionCnt;
    protected long munSuperInRegionCnt;
    protected long munProcurSuperInRegionCnt;
    protected long pnpProcurSuperMonEventCnt;
    protected long pProcurSuperMonEventCnt;
    protected long npProcurSuperMonEventCnt;
    protected long pnpMunSuperMonEventCnt;
    protected long cpMunSuperMonEventCnt;
    protected long rpMunSuperMonEventCnt;
    protected long rplMunSuperMonEventCnt;
    protected long cnpMunSuperMonEventCnt;
    protected long rnpMunSuperMonEventCnt;
    protected long rnplMunSuperMonEventCnt;
    protected long pnpMunProcurSuperMonEventCnt;
    protected long cpMunProcurSuperMonEventCnt;
    protected long rpMunProcurSuperMonEventCnt;
    protected long rplMunProcurSuperMonEventCnt;
    protected long cnplMunProcurSuperMonEventCnt;
    protected long rnplMunProcurSuperMonEventCnt;
    protected long rnplanMunProcurSuperMonEventCnt;
    @XmlElement(required = true)
    protected String complaintReasonsFZ44;
    protected long allPrecentCnt;
    protected long failedPrecentCnt;
    protected long trueFailedPrecentCnt;
    protected long falseFailedPrecentCnt;
    protected long pretrialAppealCnt;
    protected long pretrialTrueAppealCnt;
    protected long pretrialFalseAppealCnt;
    protected long canceledFailedPrecentCnt;
    protected long partlyFailedPrecentCnt;
    protected long upheldFailedPrecentCnt;
    protected long totalFailedPrecentCnt;

    /**
     * Gets the value of the reportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsReportMeasuresStatus }
     *     
     */
    public ZfcsReportMeasuresStatus getReportStatus() {
        return reportStatus;
    }

    /**
     * Sets the value of the reportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsReportMeasuresStatus }
     *     
     */
    public void setReportStatus(ZfcsReportMeasuresStatus value) {
        this.reportStatus = value;
    }

    /**
     * Gets the value of the reportPeriodFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportPeriodFrom() {
        return reportPeriodFrom;
    }

    /**
     * Sets the value of the reportPeriodFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportPeriodFrom(XMLGregorianCalendar value) {
        this.reportPeriodFrom = value;
    }

    /**
     * Gets the value of the reportPeriodTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportPeriodTo() {
        return reportPeriodTo;
    }

    /**
     * Sets the value of the reportPeriodTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportPeriodTo(XMLGregorianCalendar value) {
        this.reportPeriodTo = value;
    }

    /**
     * Gets the value of the reportDateCreation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDateCreation() {
        return reportDateCreation;
    }

    /**
     * Sets the value of the reportDateCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDateCreation(XMLGregorianCalendar value) {
        this.reportDateCreation = value;
    }

    /**
     * Gets the value of the reportDateDepl property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDateDepl() {
        return reportDateDepl;
    }

    /**
     * Sets the value of the reportDateDepl property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDateDepl(XMLGregorianCalendar value) {
        this.reportDateDepl = value;
    }

    /**
     * Gets the value of the organizationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationReporterInfoType }
     *     
     */
    public OrganizationReporterInfoType getOrganizationInfo() {
        return organizationInfo;
    }

    /**
     * Sets the value of the organizationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationReporterInfoType }
     *     
     */
    public void setOrganizationInfo(OrganizationReporterInfoType value) {
        this.organizationInfo = value;
    }

    /**
     * Gets the value of the procurSuperInRegionCnt property.
     * 
     */
    public long getProcurSuperInRegionCnt() {
        return procurSuperInRegionCnt;
    }

    /**
     * Sets the value of the procurSuperInRegionCnt property.
     * 
     */
    public void setProcurSuperInRegionCnt(long value) {
        this.procurSuperInRegionCnt = value;
    }

    /**
     * Gets the value of the munSuperInRegionCnt property.
     * 
     */
    public long getMunSuperInRegionCnt() {
        return munSuperInRegionCnt;
    }

    /**
     * Sets the value of the munSuperInRegionCnt property.
     * 
     */
    public void setMunSuperInRegionCnt(long value) {
        this.munSuperInRegionCnt = value;
    }

    /**
     * Gets the value of the munProcurSuperInRegionCnt property.
     * 
     */
    public long getMunProcurSuperInRegionCnt() {
        return munProcurSuperInRegionCnt;
    }

    /**
     * Sets the value of the munProcurSuperInRegionCnt property.
     * 
     */
    public void setMunProcurSuperInRegionCnt(long value) {
        this.munProcurSuperInRegionCnt = value;
    }

    /**
     * Gets the value of the pnpProcurSuperMonEventCnt property.
     * 
     */
    public long getPnpProcurSuperMonEventCnt() {
        return pnpProcurSuperMonEventCnt;
    }

    /**
     * Sets the value of the pnpProcurSuperMonEventCnt property.
     * 
     */
    public void setPnpProcurSuperMonEventCnt(long value) {
        this.pnpProcurSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the pProcurSuperMonEventCnt property.
     * 
     */
    public long getPProcurSuperMonEventCnt() {
        return pProcurSuperMonEventCnt;
    }

    /**
     * Sets the value of the pProcurSuperMonEventCnt property.
     * 
     */
    public void setPProcurSuperMonEventCnt(long value) {
        this.pProcurSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the npProcurSuperMonEventCnt property.
     * 
     */
    public long getNpProcurSuperMonEventCnt() {
        return npProcurSuperMonEventCnt;
    }

    /**
     * Sets the value of the npProcurSuperMonEventCnt property.
     * 
     */
    public void setNpProcurSuperMonEventCnt(long value) {
        this.npProcurSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the pnpMunSuperMonEventCnt property.
     * 
     */
    public long getPnpMunSuperMonEventCnt() {
        return pnpMunSuperMonEventCnt;
    }

    /**
     * Sets the value of the pnpMunSuperMonEventCnt property.
     * 
     */
    public void setPnpMunSuperMonEventCnt(long value) {
        this.pnpMunSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the cpMunSuperMonEventCnt property.
     * 
     */
    public long getCpMunSuperMonEventCnt() {
        return cpMunSuperMonEventCnt;
    }

    /**
     * Sets the value of the cpMunSuperMonEventCnt property.
     * 
     */
    public void setCpMunSuperMonEventCnt(long value) {
        this.cpMunSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the rpMunSuperMonEventCnt property.
     * 
     */
    public long getRpMunSuperMonEventCnt() {
        return rpMunSuperMonEventCnt;
    }

    /**
     * Sets the value of the rpMunSuperMonEventCnt property.
     * 
     */
    public void setRpMunSuperMonEventCnt(long value) {
        this.rpMunSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the rplMunSuperMonEventCnt property.
     * 
     */
    public long getRplMunSuperMonEventCnt() {
        return rplMunSuperMonEventCnt;
    }

    /**
     * Sets the value of the rplMunSuperMonEventCnt property.
     * 
     */
    public void setRplMunSuperMonEventCnt(long value) {
        this.rplMunSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the cnpMunSuperMonEventCnt property.
     * 
     */
    public long getCnpMunSuperMonEventCnt() {
        return cnpMunSuperMonEventCnt;
    }

    /**
     * Sets the value of the cnpMunSuperMonEventCnt property.
     * 
     */
    public void setCnpMunSuperMonEventCnt(long value) {
        this.cnpMunSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the rnpMunSuperMonEventCnt property.
     * 
     */
    public long getRnpMunSuperMonEventCnt() {
        return rnpMunSuperMonEventCnt;
    }

    /**
     * Sets the value of the rnpMunSuperMonEventCnt property.
     * 
     */
    public void setRnpMunSuperMonEventCnt(long value) {
        this.rnpMunSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the rnplMunSuperMonEventCnt property.
     * 
     */
    public long getRnplMunSuperMonEventCnt() {
        return rnplMunSuperMonEventCnt;
    }

    /**
     * Sets the value of the rnplMunSuperMonEventCnt property.
     * 
     */
    public void setRnplMunSuperMonEventCnt(long value) {
        this.rnplMunSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the pnpMunProcurSuperMonEventCnt property.
     * 
     */
    public long getPnpMunProcurSuperMonEventCnt() {
        return pnpMunProcurSuperMonEventCnt;
    }

    /**
     * Sets the value of the pnpMunProcurSuperMonEventCnt property.
     * 
     */
    public void setPnpMunProcurSuperMonEventCnt(long value) {
        this.pnpMunProcurSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the cpMunProcurSuperMonEventCnt property.
     * 
     */
    public long getCpMunProcurSuperMonEventCnt() {
        return cpMunProcurSuperMonEventCnt;
    }

    /**
     * Sets the value of the cpMunProcurSuperMonEventCnt property.
     * 
     */
    public void setCpMunProcurSuperMonEventCnt(long value) {
        this.cpMunProcurSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the rpMunProcurSuperMonEventCnt property.
     * 
     */
    public long getRpMunProcurSuperMonEventCnt() {
        return rpMunProcurSuperMonEventCnt;
    }

    /**
     * Sets the value of the rpMunProcurSuperMonEventCnt property.
     * 
     */
    public void setRpMunProcurSuperMonEventCnt(long value) {
        this.rpMunProcurSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the rplMunProcurSuperMonEventCnt property.
     * 
     */
    public long getRplMunProcurSuperMonEventCnt() {
        return rplMunProcurSuperMonEventCnt;
    }

    /**
     * Sets the value of the rplMunProcurSuperMonEventCnt property.
     * 
     */
    public void setRplMunProcurSuperMonEventCnt(long value) {
        this.rplMunProcurSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the cnplMunProcurSuperMonEventCnt property.
     * 
     */
    public long getCnplMunProcurSuperMonEventCnt() {
        return cnplMunProcurSuperMonEventCnt;
    }

    /**
     * Sets the value of the cnplMunProcurSuperMonEventCnt property.
     * 
     */
    public void setCnplMunProcurSuperMonEventCnt(long value) {
        this.cnplMunProcurSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the rnplMunProcurSuperMonEventCnt property.
     * 
     */
    public long getRnplMunProcurSuperMonEventCnt() {
        return rnplMunProcurSuperMonEventCnt;
    }

    /**
     * Sets the value of the rnplMunProcurSuperMonEventCnt property.
     * 
     */
    public void setRnplMunProcurSuperMonEventCnt(long value) {
        this.rnplMunProcurSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the rnplanMunProcurSuperMonEventCnt property.
     * 
     */
    public long getRnplanMunProcurSuperMonEventCnt() {
        return rnplanMunProcurSuperMonEventCnt;
    }

    /**
     * Sets the value of the rnplanMunProcurSuperMonEventCnt property.
     * 
     */
    public void setRnplanMunProcurSuperMonEventCnt(long value) {
        this.rnplanMunProcurSuperMonEventCnt = value;
    }

    /**
     * Gets the value of the complaintReasonsFZ44 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaintReasonsFZ44() {
        return complaintReasonsFZ44;
    }

    /**
     * Sets the value of the complaintReasonsFZ44 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaintReasonsFZ44(String value) {
        this.complaintReasonsFZ44 = value;
    }

    /**
     * Gets the value of the allPrecentCnt property.
     * 
     */
    public long getAllPrecentCnt() {
        return allPrecentCnt;
    }

    /**
     * Sets the value of the allPrecentCnt property.
     * 
     */
    public void setAllPrecentCnt(long value) {
        this.allPrecentCnt = value;
    }

    /**
     * Gets the value of the failedPrecentCnt property.
     * 
     */
    public long getFailedPrecentCnt() {
        return failedPrecentCnt;
    }

    /**
     * Sets the value of the failedPrecentCnt property.
     * 
     */
    public void setFailedPrecentCnt(long value) {
        this.failedPrecentCnt = value;
    }

    /**
     * Gets the value of the trueFailedPrecentCnt property.
     * 
     */
    public long getTrueFailedPrecentCnt() {
        return trueFailedPrecentCnt;
    }

    /**
     * Sets the value of the trueFailedPrecentCnt property.
     * 
     */
    public void setTrueFailedPrecentCnt(long value) {
        this.trueFailedPrecentCnt = value;
    }

    /**
     * Gets the value of the falseFailedPrecentCnt property.
     * 
     */
    public long getFalseFailedPrecentCnt() {
        return falseFailedPrecentCnt;
    }

    /**
     * Sets the value of the falseFailedPrecentCnt property.
     * 
     */
    public void setFalseFailedPrecentCnt(long value) {
        this.falseFailedPrecentCnt = value;
    }

    /**
     * Gets the value of the pretrialAppealCnt property.
     * 
     */
    public long getPretrialAppealCnt() {
        return pretrialAppealCnt;
    }

    /**
     * Sets the value of the pretrialAppealCnt property.
     * 
     */
    public void setPretrialAppealCnt(long value) {
        this.pretrialAppealCnt = value;
    }

    /**
     * Gets the value of the pretrialTrueAppealCnt property.
     * 
     */
    public long getPretrialTrueAppealCnt() {
        return pretrialTrueAppealCnt;
    }

    /**
     * Sets the value of the pretrialTrueAppealCnt property.
     * 
     */
    public void setPretrialTrueAppealCnt(long value) {
        this.pretrialTrueAppealCnt = value;
    }

    /**
     * Gets the value of the pretrialFalseAppealCnt property.
     * 
     */
    public long getPretrialFalseAppealCnt() {
        return pretrialFalseAppealCnt;
    }

    /**
     * Sets the value of the pretrialFalseAppealCnt property.
     * 
     */
    public void setPretrialFalseAppealCnt(long value) {
        this.pretrialFalseAppealCnt = value;
    }

    /**
     * Gets the value of the canceledFailedPrecentCnt property.
     * 
     */
    public long getCanceledFailedPrecentCnt() {
        return canceledFailedPrecentCnt;
    }

    /**
     * Sets the value of the canceledFailedPrecentCnt property.
     * 
     */
    public void setCanceledFailedPrecentCnt(long value) {
        this.canceledFailedPrecentCnt = value;
    }

    /**
     * Gets the value of the partlyFailedPrecentCnt property.
     * 
     */
    public long getPartlyFailedPrecentCnt() {
        return partlyFailedPrecentCnt;
    }

    /**
     * Sets the value of the partlyFailedPrecentCnt property.
     * 
     */
    public void setPartlyFailedPrecentCnt(long value) {
        this.partlyFailedPrecentCnt = value;
    }

    /**
     * Gets the value of the upheldFailedPrecentCnt property.
     * 
     */
    public long getUpheldFailedPrecentCnt() {
        return upheldFailedPrecentCnt;
    }

    /**
     * Sets the value of the upheldFailedPrecentCnt property.
     * 
     */
    public void setUpheldFailedPrecentCnt(long value) {
        this.upheldFailedPrecentCnt = value;
    }

    /**
     * Gets the value of the totalFailedPrecentCnt property.
     * 
     */
    public long getTotalFailedPrecentCnt() {
        return totalFailedPrecentCnt;
    }

    /**
     * Sets the value of the totalFailedPrecentCnt property.
     * 
     */
    public void setTotalFailedPrecentCnt(long value) {
        this.totalFailedPrecentCnt = value;
    }

}

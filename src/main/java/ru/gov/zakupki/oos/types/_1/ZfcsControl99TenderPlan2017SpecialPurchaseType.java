//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:45:05 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Сведения об особой закупки плана-графика для контроля по 99 статье
 * 
 * <p>Java class for zfcs_control99TenderPlan2017SpecialPurchaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99TenderPlan2017SpecialPurchaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_tenderPlan2017PositionNumberType"/>
 *         &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType"/>
 *         &lt;element name="yearFinances" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyPositiveType" minOccurs="0"/>
 *         &lt;element name="yearFinanceInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchasePlanFinanceResourcesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_control99TenderPlan2017SpecialPurchaseType", propOrder = {
    "positionNumber",
    "ikz",
    "yearFinances",
    "yearFinanceInfo"
})
public class ZfcsControl99TenderPlan2017SpecialPurchaseType {

    @XmlElement(required = true)
    protected String positionNumber;
    @XmlElement(name = "IKZ", required = true)
    protected String ikz;
    protected String yearFinances;
    protected ZfcsPurchasePlanFinanceResourcesType yearFinanceInfo;

    /**
     * Gets the value of the positionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the value of the positionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNumber(String value) {
        this.positionNumber = value;
    }

    /**
     * Gets the value of the ikz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIKZ() {
        return ikz;
    }

    /**
     * Sets the value of the ikz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIKZ(String value) {
        this.ikz = value;
    }

    /**
     * Gets the value of the yearFinances property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearFinances() {
        return yearFinances;
    }

    /**
     * Sets the value of the yearFinances property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearFinances(String value) {
        this.yearFinances = value;
    }

    /**
     * Gets the value of the yearFinanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchasePlanFinanceResourcesType }
     *     
     */
    public ZfcsPurchasePlanFinanceResourcesType getYearFinanceInfo() {
        return yearFinanceInfo;
    }

    /**
     * Sets the value of the yearFinanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchasePlanFinanceResourcesType }
     *     
     */
    public void setYearFinanceInfo(ZfcsPurchasePlanFinanceResourcesType value) {
        this.yearFinanceInfo = value;
    }

}

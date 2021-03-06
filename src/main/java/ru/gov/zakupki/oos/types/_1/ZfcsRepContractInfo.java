//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о контракте в реестровой записи РЕП
 * 
 * <p>Java class for zfcs_repContractInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_repContractInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="SP"/>
 *               &lt;enumeration value="ST"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="signedContractOrgInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repSimpleOrganizationInfo"/>
 *         &lt;element name="regulationPricesOrgInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repSimpleOrganizationInfo"/>
 *         &lt;element name="contractDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.Number2015Type" minOccurs="0"/>
 *         &lt;element name="contractDates" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repDates"/>
 *         &lt;element name="plannedDates" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repDates"/>
 *         &lt;element name="factDates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="investmentAmount" type="{http://zakupki.gov.ru/oos/base/1}moneyPositiveType"/>
 *         &lt;element name="contractNPAInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repNPA"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_repContractInfo", propOrder = {
    "contractType",
    "signedContractOrgInfo",
    "regulationPricesOrgInfo",
    "contractDate",
    "contractNumber",
    "contractDates",
    "plannedDates",
    "factDates",
    "investmentAmount",
    "contractNPAInfo"
})
public class ZfcsRepContractInfo {

    @XmlElement(required = true)
    protected String contractType;
    @XmlElement(required = true)
    protected ZfcsRepSimpleOrganizationInfo signedContractOrgInfo;
    @XmlElement(required = true)
    protected ZfcsRepSimpleOrganizationInfo regulationPricesOrgInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractDate;
    protected String contractNumber;
    @XmlElement(required = true)
    protected ZfcsRepDates contractDates;
    @XmlElement(required = true)
    protected ZfcsRepDates plannedDates;
    protected ZfcsRepContractInfo.FactDates factDates;
    @XmlElement(required = true)
    protected String investmentAmount;
    @XmlElement(required = true)
    protected ZfcsRepNPA contractNPAInfo;

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the signedContractOrgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepSimpleOrganizationInfo }
     *     
     */
    public ZfcsRepSimpleOrganizationInfo getSignedContractOrgInfo() {
        return signedContractOrgInfo;
    }

    /**
     * Sets the value of the signedContractOrgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepSimpleOrganizationInfo }
     *     
     */
    public void setSignedContractOrgInfo(ZfcsRepSimpleOrganizationInfo value) {
        this.signedContractOrgInfo = value;
    }

    /**
     * Gets the value of the regulationPricesOrgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepSimpleOrganizationInfo }
     *     
     */
    public ZfcsRepSimpleOrganizationInfo getRegulationPricesOrgInfo() {
        return regulationPricesOrgInfo;
    }

    /**
     * Sets the value of the regulationPricesOrgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepSimpleOrganizationInfo }
     *     
     */
    public void setRegulationPricesOrgInfo(ZfcsRepSimpleOrganizationInfo value) {
        this.regulationPricesOrgInfo = value;
    }

    /**
     * Gets the value of the contractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDate(XMLGregorianCalendar value) {
        this.contractDate = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractDates property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepDates }
     *     
     */
    public ZfcsRepDates getContractDates() {
        return contractDates;
    }

    /**
     * Sets the value of the contractDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepDates }
     *     
     */
    public void setContractDates(ZfcsRepDates value) {
        this.contractDates = value;
    }

    /**
     * Gets the value of the plannedDates property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepDates }
     *     
     */
    public ZfcsRepDates getPlannedDates() {
        return plannedDates;
    }

    /**
     * Sets the value of the plannedDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepDates }
     *     
     */
    public void setPlannedDates(ZfcsRepDates value) {
        this.plannedDates = value;
    }

    /**
     * Gets the value of the factDates property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepContractInfo.FactDates }
     *     
     */
    public ZfcsRepContractInfo.FactDates getFactDates() {
        return factDates;
    }

    /**
     * Sets the value of the factDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepContractInfo.FactDates }
     *     
     */
    public void setFactDates(ZfcsRepContractInfo.FactDates value) {
        this.factDates = value;
    }

    /**
     * Gets the value of the investmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestmentAmount() {
        return investmentAmount;
    }

    /**
     * Sets the value of the investmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestmentAmount(String value) {
        this.investmentAmount = value;
    }

    /**
     * Gets the value of the contractNPAInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepNPA }
     *     
     */
    public ZfcsRepNPA getContractNPAInfo() {
        return contractNPAInfo;
    }

    /**
     * Sets the value of the contractNPAInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepNPA }
     *     
     */
    public void setContractNPAInfo(ZfcsRepNPA value) {
        this.contractNPAInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startDate",
        "endDate"
    })
    public static class FactDates {

        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

    }

}

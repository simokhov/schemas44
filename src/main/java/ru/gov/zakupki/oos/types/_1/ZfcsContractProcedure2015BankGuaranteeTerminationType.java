//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о прекращении обязательств поставщика, обеспеченных банковской гарантией
 * 
 * <p>Java class for zfcs_contractProcedure2015BankGuaranteeTerminationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_contractProcedure2015BankGuaranteeTerminationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/base/1}bankGuaranteeRegNumberType" minOccurs="0"/>
 *           &lt;element name="docNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_bankGuaranteeDocNumberType" minOccurs="0"/>
 *           &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="terminationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="notPublishedOnEIS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_contractProcedure2015BankGuaranteeTerminationType", propOrder = {
    "regNumber",
    "docNumber",
    "terminationDate",
    "terminationReason",
    "notPublishedOnEIS"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsBankGuaranteeTerminationInvalidType.BankGuaranteeTerminationInfo.BankGuaranteeTermination.class
})
public class ZfcsContractProcedure2015BankGuaranteeTerminationType {

    protected String regNumber;
    protected String docNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationDate;
    protected String terminationReason;
    protected Boolean notPublishedOnEIS;

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the terminationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationReason() {
        return terminationReason;
    }

    /**
     * Sets the value of the terminationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationReason(String value) {
        this.terminationReason = value;
    }

    /**
     * Gets the value of the notPublishedOnEIS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotPublishedOnEIS() {
        return notPublishedOnEIS;
    }

    /**
     * Sets the value of the notPublishedOnEIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotPublishedOnEIS(Boolean value) {
        this.notPublishedOnEIS = value;
    }

}

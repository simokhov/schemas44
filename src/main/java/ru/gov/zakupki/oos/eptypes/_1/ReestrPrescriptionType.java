//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Предписание органа, уполномоченного на осуществление контроля, содержащееся в реестре результатов контроля
 * 
 * <p>Java class for reestrPrescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reestrPrescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/base/1}checkResultNumberType"/>
 *         &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/base/1}prescriptionNumberType" minOccurs="0"/>
 *         &lt;element name="foundation" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reestrPrescriptionType", propOrder = {
    "checkResultNumber",
    "prescriptionNumber",
    "foundation",
    "authorityName",
    "docDate"
})
public class ReestrPrescriptionType {

    @XmlElement(required = true)
    protected String checkResultNumber;
    protected String prescriptionNumber;
    protected String foundation;
    protected String authorityName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;

    /**
     * Gets the value of the checkResultNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckResultNumber() {
        return checkResultNumber;
    }

    /**
     * Sets the value of the checkResultNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckResultNumber(String value) {
        this.checkResultNumber = value;
    }

    /**
     * Gets the value of the prescriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescriptionNumber() {
        return prescriptionNumber;
    }

    /**
     * Sets the value of the prescriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescriptionNumber(String value) {
        this.prescriptionNumber = value;
    }

    /**
     * Gets the value of the foundation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundation() {
        return foundation;
    }

    /**
     * Sets the value of the foundation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundation(String value) {
        this.foundation = value;
    }

    /**
     * Gets the value of the authorityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * Sets the value of the authorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityName(String value) {
        this.authorityName = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

}

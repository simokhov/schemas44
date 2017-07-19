//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 11:02:43 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о расторжении контракта в реестровой записи РЕП
 * 
 * <p>Java class for zfcs_repContractTerminationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_repContractTerminationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="terminationReasonText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType"/>
 *         &lt;element name="terminationNPAInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repNPA"/>
 *         &lt;element name="terminationNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_repContractTerminationInfo", propOrder = {
    "terminationDate",
    "terminationReasonText",
    "terminationNPAInfo",
    "terminationNote"
})
public class ZfcsRepContractTerminationInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationDate;
    @XmlElement(required = true)
    protected String terminationReasonText;
    @XmlElement(required = true)
    protected ZfcsRepNPA terminationNPAInfo;
    protected String terminationNote;

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
     * Gets the value of the terminationReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationReasonText() {
        return terminationReasonText;
    }

    /**
     * Sets the value of the terminationReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationReasonText(String value) {
        this.terminationReasonText = value;
    }

    /**
     * Gets the value of the terminationNPAInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepNPA }
     *     
     */
    public ZfcsRepNPA getTerminationNPAInfo() {
        return terminationNPAInfo;
    }

    /**
     * Sets the value of the terminationNPAInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepNPA }
     *     
     */
    public void setTerminationNPAInfo(ZfcsRepNPA value) {
        this.terminationNPAInfo = value;
    }

    /**
     * Gets the value of the terminationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationNote() {
        return terminationNote;
    }

    /**
     * Sets the value of the terminationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationNote(String value) {
        this.terminationNote = value;
    }

}

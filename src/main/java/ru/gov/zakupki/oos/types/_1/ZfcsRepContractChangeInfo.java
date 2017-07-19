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
 * Сведения об изменении условий контракта в реестровой записи РЕП
 * 
 * <p>Java class for zfcs_repContractChangeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_repContractChangeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="changeNPAInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_repNPA"/>
 *         &lt;element name="changeNote" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_repContractChangeInfo", propOrder = {
    "changeDate",
    "changeNPAInfo",
    "changeNote"
})
public class ZfcsRepContractChangeInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar changeDate;
    @XmlElement(required = true)
    protected ZfcsRepNPA changeNPAInfo;
    protected String changeNote;

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the changeNPAInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsRepNPA }
     *     
     */
    public ZfcsRepNPA getChangeNPAInfo() {
        return changeNPAInfo;
    }

    /**
     * Sets the value of the changeNPAInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsRepNPA }
     *     
     */
    public void setChangeNPAInfo(ZfcsRepNPA value) {
        this.changeNPAInfo = value;
    }

    /**
     * Gets the value of the changeNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeNote() {
        return changeNote;
    }

    /**
     * Sets the value of the changeNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeNote(String value) {
        this.changeNote = value;
    }

}

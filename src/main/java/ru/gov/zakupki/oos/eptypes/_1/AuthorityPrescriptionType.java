//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Предписание органа, уполномоченного на осуществление контроля
 * 
 * <p>Java class for authorityPrescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorityPrescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="reestrPrescription" type="{http://zakupki.gov.ru/oos/EPtypes/1}reestrPrescriptionType"/>
 *         &lt;element name="externalPrescription" type="{http://zakupki.gov.ru/oos/EPtypes/1}prescriptionType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorityPrescriptionType", propOrder = {
    "reestrPrescription",
    "externalPrescription"
})
public class AuthorityPrescriptionType {

    protected ReestrPrescriptionType reestrPrescription;
    protected PrescriptionType externalPrescription;

    /**
     * Gets the value of the reestrPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link ReestrPrescriptionType }
     *     
     */
    public ReestrPrescriptionType getReestrPrescription() {
        return reestrPrescription;
    }

    /**
     * Sets the value of the reestrPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReestrPrescriptionType }
     *     
     */
    public void setReestrPrescription(ReestrPrescriptionType value) {
        this.reestrPrescription = value;
    }

    /**
     * Gets the value of the externalPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionType }
     *     
     */
    public PrescriptionType getExternalPrescription() {
        return externalPrescription;
    }

    /**
     * Sets the value of the externalPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionType }
     *     
     */
    public void setExternalPrescription(PrescriptionType value) {
        this.externalPrescription = value;
    }

}

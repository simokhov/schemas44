//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Основание внесения изменений без изменений на основании решения заказчика
 * 
 * <p>Java class for changeReasonWithoutCustomerDecisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeReasonWithoutCustomerDecisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="authorityPrescriptionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}authorityPrescriptionType"/>
 *         &lt;element name="courtDecisionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}courtDecisionType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeReasonWithoutCustomerDecisionType", propOrder = {
    "authorityPrescriptionInfo",
    "courtDecisionInfo"
})
public class ChangeReasonWithoutCustomerDecisionType {

    protected AuthorityPrescriptionType authorityPrescriptionInfo;
    protected CourtDecisionType courtDecisionInfo;

    /**
     * Gets the value of the authorityPrescriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityPrescriptionType }
     *     
     */
    public AuthorityPrescriptionType getAuthorityPrescriptionInfo() {
        return authorityPrescriptionInfo;
    }

    /**
     * Sets the value of the authorityPrescriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityPrescriptionType }
     *     
     */
    public void setAuthorityPrescriptionInfo(AuthorityPrescriptionType value) {
        this.authorityPrescriptionInfo = value;
    }

    /**
     * Gets the value of the courtDecisionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CourtDecisionType }
     *     
     */
    public CourtDecisionType getCourtDecisionInfo() {
        return courtDecisionInfo;
    }

    /**
     * Sets the value of the courtDecisionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtDecisionType }
     *     
     */
    public void setCourtDecisionInfo(CourtDecisionType value) {
        this.courtDecisionInfo = value;
    }

}
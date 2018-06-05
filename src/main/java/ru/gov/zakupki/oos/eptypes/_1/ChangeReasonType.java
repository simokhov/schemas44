//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Основание внесения изменений
 * 
 * <p>Java class for changeReasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeReasonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="responsibleDecisionInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "changeReasonType", propOrder = {
    "responsibleDecisionInfo",
    "authorityPrescriptionInfo",
    "courtDecisionInfo"
})
public class ChangeReasonType {

    protected ChangeReasonType.ResponsibleDecisionInfo responsibleDecisionInfo;
    protected AuthorityPrescriptionType authorityPrescriptionInfo;
    protected CourtDecisionType courtDecisionInfo;

    /**
     * Gets the value of the responsibleDecisionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeReasonType.ResponsibleDecisionInfo }
     *     
     */
    public ChangeReasonType.ResponsibleDecisionInfo getResponsibleDecisionInfo() {
        return responsibleDecisionInfo;
    }

    /**
     * Sets the value of the responsibleDecisionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeReasonType.ResponsibleDecisionInfo }
     *     
     */
    public void setResponsibleDecisionInfo(ChangeReasonType.ResponsibleDecisionInfo value) {
        this.responsibleDecisionInfo = value;
    }

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
     *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "decisionDate"
    })
    public static class ResponsibleDecisionInfo {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar decisionDate;

        /**
         * Gets the value of the decisionDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDecisionDate() {
            return decisionDate;
        }

        /**
         * Sets the value of the decisionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDecisionDate(XMLGregorianCalendar value) {
            this.decisionDate = value;
        }

    }

}

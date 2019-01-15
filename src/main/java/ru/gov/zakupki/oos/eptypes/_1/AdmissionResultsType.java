//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.CommissionMemberType;


/**
 * Тип: Результаты допуска заявки
 * 
 * <p>Java class for admissionResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="admissionResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="admissionResultInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="commissionMemberInfo" type="{http://zakupki.gov.ru/oos/common/1}commissionMemberType"/>
 *                   &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "admissionResultsType", propOrder = {
    "admissionResultInfo"
})
public class AdmissionResultsType {

    @XmlElement(required = true)
    protected List<AdmissionResultsType.AdmissionResultInfo> admissionResultInfo;

    /**
     * Gets the value of the admissionResultInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the admissionResultInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdmissionResultInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdmissionResultsType.AdmissionResultInfo }
     * 
     * 
     */
    public List<AdmissionResultsType.AdmissionResultInfo> getAdmissionResultInfo() {
        if (admissionResultInfo == null) {
            admissionResultInfo = new ArrayList<AdmissionResultsType.AdmissionResultInfo>();
        }
        return this.admissionResultInfo;
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
     *         &lt;element name="commissionMemberInfo" type="{http://zakupki.gov.ru/oos/common/1}commissionMemberType"/>
     *         &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "commissionMemberInfo",
        "admitted"
    })
    public static class AdmissionResultInfo {

        @XmlElement(required = true)
        protected CommissionMemberType commissionMemberInfo;
        protected boolean admitted;

        /**
         * Gets the value of the commissionMemberInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CommissionMemberType }
         *     
         */
        public CommissionMemberType getCommissionMemberInfo() {
            return commissionMemberInfo;
        }

        /**
         * Sets the value of the commissionMemberInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommissionMemberType }
         *     
         */
        public void setCommissionMemberInfo(CommissionMemberType value) {
            this.commissionMemberInfo = value;
        }

        /**
         * Gets the value of the admitted property.
         * 
         */
        public boolean isAdmitted() {
            return admitted;
        }

        /**
         * Sets the value of the admitted property.
         * 
         */
        public void setAdmitted(boolean value) {
            this.admitted = value;
        }

    }

}

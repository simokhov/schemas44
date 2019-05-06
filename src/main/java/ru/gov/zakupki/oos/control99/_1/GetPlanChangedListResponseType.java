//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.control99._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип элемента: Ответ с перечнем организаций, изменивших ПФХД за период
 * 
 * <p>Java class for getPlanChangedListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPlanChangedListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="success">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organizations">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="organization" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/control99/1}tOrganization">
 *                                     &lt;sequence>
 *                                       &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="planYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="violations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="violation" type="{http://zakupki.gov.ru/oos/control99/1}tViolation" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="violationsEIS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="violationEIS" type="{http://zakupki.gov.ru/oos/control99/1}tViolation" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlanChangedListResponseType", propOrder = {
    "success",
    "violations",
    "violationsEIS"
})
public class GetPlanChangedListResponseType {

    protected GetPlanChangedListResponseType.Success success;
    protected GetPlanChangedListResponseType.Violations violations;
    protected GetPlanChangedListResponseType.ViolationsEIS violationsEIS;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link GetPlanChangedListResponseType.Success }
     *     
     */
    public GetPlanChangedListResponseType.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPlanChangedListResponseType.Success }
     *     
     */
    public void setSuccess(GetPlanChangedListResponseType.Success value) {
        this.success = value;
    }

    /**
     * Gets the value of the violations property.
     * 
     * @return
     *     possible object is
     *     {@link GetPlanChangedListResponseType.Violations }
     *     
     */
    public GetPlanChangedListResponseType.Violations getViolations() {
        return violations;
    }

    /**
     * Sets the value of the violations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPlanChangedListResponseType.Violations }
     *     
     */
    public void setViolations(GetPlanChangedListResponseType.Violations value) {
        this.violations = value;
    }

    /**
     * Gets the value of the violationsEIS property.
     * 
     * @return
     *     possible object is
     *     {@link GetPlanChangedListResponseType.ViolationsEIS }
     *     
     */
    public GetPlanChangedListResponseType.ViolationsEIS getViolationsEIS() {
        return violationsEIS;
    }

    /**
     * Sets the value of the violationsEIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPlanChangedListResponseType.ViolationsEIS }
     *     
     */
    public void setViolationsEIS(GetPlanChangedListResponseType.ViolationsEIS value) {
        this.violationsEIS = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
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
     *         &lt;element name="organizations">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="organization" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/control99/1}tOrganization">
     *                           &lt;sequence>
     *                             &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="planYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
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
        "organizations",
        "planYear"
    })
    public static class Success {

        @XmlElement(required = true)
        protected GetPlanChangedListResponseType.Success.Organizations organizations;
        protected int planYear;

        /**
         * Gets the value of the organizations property.
         * 
         * @return
         *     possible object is
         *     {@link GetPlanChangedListResponseType.Success.Organizations }
         *     
         */
        public GetPlanChangedListResponseType.Success.Organizations getOrganizations() {
            return organizations;
        }

        /**
         * Sets the value of the organizations property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetPlanChangedListResponseType.Success.Organizations }
         *     
         */
        public void setOrganizations(GetPlanChangedListResponseType.Success.Organizations value) {
            this.organizations = value;
        }

        /**
         * Gets the value of the planYear property.
         * 
         */
        public int getPlanYear() {
            return planYear;
        }

        /**
         * Sets the value of the planYear property.
         * 
         */
        public void setPlanYear(int value) {
            this.planYear = value;
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
         *         &lt;element name="organization" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/control99/1}tOrganization">
         *                 &lt;sequence>
         *                   &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
        @XmlType(name = "", propOrder = {
            "organization"
        })
        public static class Organizations {

            @XmlElement(required = true)
            protected List<GetPlanChangedListResponseType.Success.Organizations.Organization> organization;

            /**
             * Gets the value of the organization property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the organization property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrganization().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetPlanChangedListResponseType.Success.Organizations.Organization }
             * 
             * 
             */
            public List<GetPlanChangedListResponseType.Success.Organizations.Organization> getOrganization() {
                if (organization == null) {
                    organization = new ArrayList<GetPlanChangedListResponseType.Success.Organizations.Organization>();
                }
                return this.organization;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/control99/1}tOrganization">
             *       &lt;sequence>
             *         &lt;element name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "changeDate"
            })
            public static class Organization
                extends TOrganization
            {

                @XmlElement(required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar changeDate;

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

            }

        }

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
     *         &lt;element name="violation" type="{http://zakupki.gov.ru/oos/control99/1}tViolation" maxOccurs="unbounded"/>
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
        "violation"
    })
    public static class Violations {

        @XmlElement(required = true)
        protected List<TViolation> violation;

        /**
         * Gets the value of the violation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the violation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getViolation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TViolation }
         * 
         * 
         */
        public List<TViolation> getViolation() {
            if (violation == null) {
                violation = new ArrayList<TViolation>();
            }
            return this.violation;
        }

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
     *         &lt;element name="violationEIS" type="{http://zakupki.gov.ru/oos/control99/1}tViolation" maxOccurs="unbounded"/>
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
        "violationEIS"
    })
    public static class ViolationsEIS {

        @XmlElement(required = true)
        protected List<TViolation> violationEIS;

        /**
         * Gets the value of the violationEIS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the violationEIS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getViolationEIS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TViolation }
         * 
         * 
         */
        public List<TViolation> getViolationEIS() {
            if (violationEIS == null) {
                violationEIS = new ArrayList<TViolation>();
            }
            return this.violationEIS;
        }

    }

}

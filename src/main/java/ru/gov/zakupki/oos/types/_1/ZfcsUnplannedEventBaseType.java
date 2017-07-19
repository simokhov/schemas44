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
 * Тип: Основание проведения проверки во внеплановом контрольном мероприятии
 * 
 * <p>Java class for zfcs_unplannedEventBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_unplannedEventBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="violationInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="infoReceivingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="source" type="{http://zakupki.gov.ru/oos/types/1}zfcs_sourceUnplannedCheckType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="prescriptionControl">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="prescriptionInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
 *                             &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType"/>
 *                             &lt;element name="prescriptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="decisionInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
 *                             &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                             &lt;element name="desDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="desNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="baseOther" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="complaint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_unplannedEventBaseType", propOrder = {
    "violationInfo",
    "prescriptionControl",
    "baseOther",
    "complaint"
})
public class ZfcsUnplannedEventBaseType {

    protected ZfcsUnplannedEventBaseType.ViolationInfo violationInfo;
    protected ZfcsUnplannedEventBaseType.PrescriptionControl prescriptionControl;
    protected String baseOther;
    protected Boolean complaint;

    /**
     * Gets the value of the violationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedEventBaseType.ViolationInfo }
     *     
     */
    public ZfcsUnplannedEventBaseType.ViolationInfo getViolationInfo() {
        return violationInfo;
    }

    /**
     * Sets the value of the violationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedEventBaseType.ViolationInfo }
     *     
     */
    public void setViolationInfo(ZfcsUnplannedEventBaseType.ViolationInfo value) {
        this.violationInfo = value;
    }

    /**
     * Gets the value of the prescriptionControl property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsUnplannedEventBaseType.PrescriptionControl }
     *     
     */
    public ZfcsUnplannedEventBaseType.PrescriptionControl getPrescriptionControl() {
        return prescriptionControl;
    }

    /**
     * Sets the value of the prescriptionControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsUnplannedEventBaseType.PrescriptionControl }
     *     
     */
    public void setPrescriptionControl(ZfcsUnplannedEventBaseType.PrescriptionControl value) {
        this.prescriptionControl = value;
    }

    /**
     * Gets the value of the baseOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseOther() {
        return baseOther;
    }

    /**
     * Sets the value of the baseOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseOther(String value) {
        this.baseOther = value;
    }

    /**
     * Gets the value of the complaint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplaint(Boolean value) {
        this.complaint = value;
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
     *       &lt;choice>
     *         &lt;element name="prescriptionInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
     *                   &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType"/>
     *                   &lt;element name="prescriptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="decisionInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
     *                   &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *                   &lt;element name="desDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="desNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prescriptionInfo",
        "decisionInfo"
    })
    public static class PrescriptionControl {

        protected ZfcsUnplannedEventBaseType.PrescriptionControl.PrescriptionInfo prescriptionInfo;
        protected ZfcsUnplannedEventBaseType.PrescriptionControl.DecisionInfo decisionInfo;

        /**
         * Gets the value of the prescriptionInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnplannedEventBaseType.PrescriptionControl.PrescriptionInfo }
         *     
         */
        public ZfcsUnplannedEventBaseType.PrescriptionControl.PrescriptionInfo getPrescriptionInfo() {
            return prescriptionInfo;
        }

        /**
         * Sets the value of the prescriptionInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnplannedEventBaseType.PrescriptionControl.PrescriptionInfo }
         *     
         */
        public void setPrescriptionInfo(ZfcsUnplannedEventBaseType.PrescriptionControl.PrescriptionInfo value) {
            this.prescriptionInfo = value;
        }

        /**
         * Gets the value of the decisionInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsUnplannedEventBaseType.PrescriptionControl.DecisionInfo }
         *     
         */
        public ZfcsUnplannedEventBaseType.PrescriptionControl.DecisionInfo getDecisionInfo() {
            return decisionInfo;
        }

        /**
         * Sets the value of the decisionInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsUnplannedEventBaseType.PrescriptionControl.DecisionInfo }
         *     
         */
        public void setDecisionInfo(ZfcsUnplannedEventBaseType.PrescriptionControl.DecisionInfo value) {
            this.decisionInfo = value;
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
         *         &lt;element name="authorityType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_modification.authorityType"/>
         *         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
         *         &lt;element name="desDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="desNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "authorityType",
            "authorityName",
            "desDate",
            "desNumber"
        })
        public static class DecisionInfo {

            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected ZfcsModificationAuthorityType authorityType;
            @XmlElement(required = true)
            protected String authorityName;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar desDate;
            @XmlElement(required = true)
            protected String desNumber;

            /**
             * Gets the value of the authorityType property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsModificationAuthorityType }
             *     
             */
            public ZfcsModificationAuthorityType getAuthorityType() {
                return authorityType;
            }

            /**
             * Sets the value of the authorityType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsModificationAuthorityType }
             *     
             */
            public void setAuthorityType(ZfcsModificationAuthorityType value) {
                this.authorityType = value;
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
             * Gets the value of the desDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDesDate() {
                return desDate;
            }

            /**
             * Sets the value of the desDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDesDate(XMLGregorianCalendar value) {
                this.desDate = value;
            }

            /**
             * Gets the value of the desNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDesNumber() {
                return desNumber;
            }

            /**
             * Sets the value of the desNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDesNumber(String value) {
                this.desNumber = value;
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
         *         &lt;element name="checkResultNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultNumberType"/>
         *         &lt;element name="prescriptionNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_prescriptionNumberType"/>
         *         &lt;element name="prescriptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="authorityName" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
            "checkResultNumber",
            "prescriptionNumber",
            "prescriptionDate",
            "authorityName"
        })
        public static class PrescriptionInfo {

            @XmlElement(required = true)
            protected String checkResultNumber;
            @XmlElement(required = true)
            protected String prescriptionNumber;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar prescriptionDate;
            protected String authorityName;

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
             * Gets the value of the prescriptionDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPrescriptionDate() {
                return prescriptionDate;
            }

            /**
             * Sets the value of the prescriptionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPrescriptionDate(XMLGregorianCalendar value) {
                this.prescriptionDate = value;
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
     *         &lt;element name="infoReceivingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="source" type="{http://zakupki.gov.ru/oos/types/1}zfcs_sourceUnplannedCheckType"/>
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
        "infoReceivingDate",
        "source"
    })
    public static class ViolationInfo {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar infoReceivingDate;
        @XmlElement(required = true)
        protected ZfcsSourceUnplannedCheckType source;

        /**
         * Gets the value of the infoReceivingDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getInfoReceivingDate() {
            return infoReceivingDate;
        }

        /**
         * Sets the value of the infoReceivingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setInfoReceivingDate(XMLGregorianCalendar value) {
            this.infoReceivingDate = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsSourceUnplannedCheckType }
         *     
         */
        public ZfcsSourceUnplannedCheckType getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsSourceUnplannedCheckType }
         *     
         */
        public void setSource(ZfcsSourceUnplannedCheckType value) {
            this.source = value;
        }

    }

}

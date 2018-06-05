//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.AppRejectedReasonType;


/**
 * Тип: Заявка входящая в протокол рассмотрения и оценки первых частей заявок на участие в конкурсе
 * 
 * <p>Java class for competitionApp1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="competitionApp1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}appCommonInfoType"/>
 *         &lt;element name="admittedInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="appAdmittedInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="qualitativeCriterionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}qualitativeCriterionProtocolOK1Type" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/common/1}appRejectedReasonType" maxOccurs="unbounded"/>
 *                 &lt;/choice>
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
@XmlType(name = "competitionApp1Type", propOrder = {
    "commonInfo",
    "admittedInfo"
})
public class CompetitionApp1Type {

    @XmlElement(required = true)
    protected AppCommonInfoType commonInfo;
    @XmlElement(required = true)
    protected CompetitionApp1Type.AdmittedInfo admittedInfo;

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AppCommonInfoType }
     *     
     */
    public AppCommonInfoType getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppCommonInfoType }
     *     
     */
    public void setCommonInfo(AppCommonInfoType value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the admittedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompetitionApp1Type.AdmittedInfo }
     *     
     */
    public CompetitionApp1Type.AdmittedInfo getAdmittedInfo() {
        return admittedInfo;
    }

    /**
     * Sets the value of the admittedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetitionApp1Type.AdmittedInfo }
     *     
     */
    public void setAdmittedInfo(CompetitionApp1Type.AdmittedInfo value) {
        this.admittedInfo = value;
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
     *         &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="appAdmittedInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="qualitativeCriterionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}qualitativeCriterionProtocolOK1Type" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/common/1}appRejectedReasonType" maxOccurs="unbounded"/>
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
        "admitted",
        "appAdmittedInfo",
        "appRejectedReason"
    })
    public static class AdmittedInfo {

        protected Boolean admitted;
        protected CompetitionApp1Type.AdmittedInfo.AppAdmittedInfo appAdmittedInfo;
        protected List<AppRejectedReasonType> appRejectedReason;

        /**
         * Gets the value of the admitted property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAdmitted() {
            return admitted;
        }

        /**
         * Sets the value of the admitted property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAdmitted(Boolean value) {
            this.admitted = value;
        }

        /**
         * Gets the value of the appAdmittedInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CompetitionApp1Type.AdmittedInfo.AppAdmittedInfo }
         *     
         */
        public CompetitionApp1Type.AdmittedInfo.AppAdmittedInfo getAppAdmittedInfo() {
            return appAdmittedInfo;
        }

        /**
         * Sets the value of the appAdmittedInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompetitionApp1Type.AdmittedInfo.AppAdmittedInfo }
         *     
         */
        public void setAppAdmittedInfo(CompetitionApp1Type.AdmittedInfo.AppAdmittedInfo value) {
            this.appAdmittedInfo = value;
        }

        /**
         * Gets the value of the appRejectedReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the appRejectedReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAppRejectedReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AppRejectedReasonType }
         * 
         * 
         */
        public List<AppRejectedReasonType> getAppRejectedReason() {
            if (appRejectedReason == null) {
                appRejectedReason = new ArrayList<AppRejectedReasonType>();
            }
            return this.appRejectedReason;
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
         *         &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="qualitativeCriterionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}qualitativeCriterionProtocolOK1Type" minOccurs="0"/>
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
            "admitted",
            "qualitativeCriterionInfo"
        })
        public static class AppAdmittedInfo {

            protected boolean admitted;
            protected QualitativeCriterionProtocolOK1Type qualitativeCriterionInfo;

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

            /**
             * Gets the value of the qualitativeCriterionInfo property.
             * 
             * @return
             *     possible object is
             *     {@link QualitativeCriterionProtocolOK1Type }
             *     
             */
            public QualitativeCriterionProtocolOK1Type getQualitativeCriterionInfo() {
                return qualitativeCriterionInfo;
            }

            /**
             * Sets the value of the qualitativeCriterionInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link QualitativeCriterionProtocolOK1Type }
             *     
             */
            public void setQualitativeCriterionInfo(QualitativeCriterionProtocolOK1Type value) {
                this.qualitativeCriterionInfo = value;
            }

        }

    }

}

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
import ru.gov.zakupki.oos.base._1.AbandonedReasonRef;
import ru.gov.zakupki.oos.common._1.AppRejectedReasonType;


/**
 * Тип: Протокол рассмотрения заявок на участие в ЭЗК (запрос котировок в электронной форме)
 * 
 * <p>Java class for protocolEZK1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolEZK1Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}protocolType">
 *       &lt;sequence>
 *         &lt;element name="protocolInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationsInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicationInfo" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}appCommonInfoType"/>
 *                                       &lt;element name="appParticipantInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}participantType"/>
 *                                       &lt;element name="correspondencies" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="correspondenceInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}appCorrespondenceType" maxOccurs="unbounded"/>
 *                                                 &lt;element name="overallValue" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *                                                       &lt;minInclusive value="0"/>
 *                                                       &lt;maxInclusive value="100"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="admittedInfo">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                 &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/common/1}appRejectedReasonType" maxOccurs="unbounded"/>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/base/1}abandonedReasonRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolEZK1Type", propOrder = {
    "protocolInfo"
})
public class ProtocolEZK1Type
    extends ProtocolType
{

    @XmlElement(required = true)
    protected ProtocolEZK1Type.ProtocolInfo protocolInfo;

    /**
     * Gets the value of the protocolInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEZK1Type.ProtocolInfo }
     *     
     */
    public ProtocolEZK1Type.ProtocolInfo getProtocolInfo() {
        return protocolInfo;
    }

    /**
     * Sets the value of the protocolInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEZK1Type.ProtocolInfo }
     *     
     */
    public void setProtocolInfo(ProtocolEZK1Type.ProtocolInfo value) {
        this.protocolInfo = value;
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
     *         &lt;element name="applicationsInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicationInfo" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}appCommonInfoType"/>
     *                             &lt;element name="appParticipantInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}participantType"/>
     *                             &lt;element name="correspondencies" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="correspondenceInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}appCorrespondenceType" maxOccurs="unbounded"/>
     *                                       &lt;element name="overallValue" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
     *                                             &lt;minInclusive value="0"/>
     *                                             &lt;maxInclusive value="100"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="admittedInfo">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                       &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/common/1}appRejectedReasonType" maxOccurs="unbounded"/>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/base/1}abandonedReasonRef" minOccurs="0"/>
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
        "applicationsInfo",
        "abandonedReason"
    })
    public static class ProtocolInfo {

        protected ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo applicationsInfo;
        protected AbandonedReasonRef abandonedReason;

        /**
         * Gets the value of the applicationsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo }
         *     
         */
        public ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo getApplicationsInfo() {
            return applicationsInfo;
        }

        /**
         * Sets the value of the applicationsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo }
         *     
         */
        public void setApplicationsInfo(ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo value) {
            this.applicationsInfo = value;
        }

        /**
         * Gets the value of the abandonedReason property.
         * 
         * @return
         *     possible object is
         *     {@link AbandonedReasonRef }
         *     
         */
        public AbandonedReasonRef getAbandonedReason() {
            return abandonedReason;
        }

        /**
         * Sets the value of the abandonedReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbandonedReasonRef }
         *     
         */
        public void setAbandonedReason(AbandonedReasonRef value) {
            this.abandonedReason = value;
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
         *         &lt;element name="applicationInfo" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}appCommonInfoType"/>
         *                   &lt;element name="appParticipantInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}participantType"/>
         *                   &lt;element name="correspondencies" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="correspondenceInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}appCorrespondenceType" maxOccurs="unbounded"/>
         *                             &lt;element name="overallValue" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
         *                                   &lt;minInclusive value="0"/>
         *                                   &lt;maxInclusive value="100"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="admittedInfo">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                             &lt;element name="appRejectedReason" type="{http://zakupki.gov.ru/oos/common/1}appRejectedReasonType" maxOccurs="unbounded"/>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
        @XmlType(name = "", propOrder = {
            "applicationInfo"
        })
        public static class ApplicationsInfo {

            @XmlElement(required = true)
            protected List<ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo> applicationInfo;

            /**
             * Gets the value of the applicationInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the applicationInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getApplicationInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo }
             * 
             * 
             */
            public List<ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo> getApplicationInfo() {
                if (applicationInfo == null) {
                    applicationInfo = new ArrayList<ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo>();
                }
                return this.applicationInfo;
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
             *         &lt;element name="commonInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}appCommonInfoType"/>
             *         &lt;element name="appParticipantInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}participantType"/>
             *         &lt;element name="correspondencies" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="correspondenceInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}appCorrespondenceType" maxOccurs="unbounded"/>
             *                   &lt;element name="overallValue" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
             *                         &lt;minInclusive value="0"/>
             *                         &lt;maxInclusive value="100"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="admittedInfo">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="admitted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            @XmlType(name = "", propOrder = {
                "commonInfo",
                "appParticipantInfo",
                "correspondencies",
                "admittedInfo"
            })
            public static class ApplicationInfo {

                @XmlElement(required = true)
                protected AppCommonInfoType commonInfo;
                @XmlElement(required = true)
                protected ParticipantType appParticipantInfo;
                protected ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo.Correspondencies correspondencies;
                @XmlElement(required = true)
                protected ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo.AdmittedInfo admittedInfo;

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
                 * Gets the value of the appParticipantInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ParticipantType }
                 *     
                 */
                public ParticipantType getAppParticipantInfo() {
                    return appParticipantInfo;
                }

                /**
                 * Sets the value of the appParticipantInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ParticipantType }
                 *     
                 */
                public void setAppParticipantInfo(ParticipantType value) {
                    this.appParticipantInfo = value;
                }

                /**
                 * Gets the value of the correspondencies property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo.Correspondencies }
                 *     
                 */
                public ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo.Correspondencies getCorrespondencies() {
                    return correspondencies;
                }

                /**
                 * Sets the value of the correspondencies property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo.Correspondencies }
                 *     
                 */
                public void setCorrespondencies(ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo.Correspondencies value) {
                    this.correspondencies = value;
                }

                /**
                 * Gets the value of the admittedInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo.AdmittedInfo }
                 *     
                 */
                public ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo.AdmittedInfo getAdmittedInfo() {
                    return admittedInfo;
                }

                /**
                 * Sets the value of the admittedInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo.AdmittedInfo }
                 *     
                 */
                public void setAdmittedInfo(ProtocolEZK1Type.ProtocolInfo.ApplicationsInfo.ApplicationInfo.AdmittedInfo value) {
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
                    "appRejectedReason"
                })
                public static class AdmittedInfo {

                    protected Boolean admitted;
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
                 *         &lt;element name="correspondenceInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}appCorrespondenceType" maxOccurs="unbounded"/>
                 *         &lt;element name="overallValue" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
                 *               &lt;minInclusive value="0"/>
                 *               &lt;maxInclusive value="100"/>
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
                    "correspondenceInfo",
                    "overallValue"
                })
                public static class Correspondencies {

                    @XmlElement(required = true)
                    protected List<AppCorrespondenceType> correspondenceInfo;
                    protected Double overallValue;

                    /**
                     * Gets the value of the correspondenceInfo property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the correspondenceInfo property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCorrespondenceInfo().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link AppCorrespondenceType }
                     * 
                     * 
                     */
                    public List<AppCorrespondenceType> getCorrespondenceInfo() {
                        if (correspondenceInfo == null) {
                            correspondenceInfo = new ArrayList<AppCorrespondenceType>();
                        }
                        return this.correspondenceInfo;
                    }

                    /**
                     * Gets the value of the overallValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getOverallValue() {
                        return overallValue;
                    }

                    /**
                     * Sets the value of the overallValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setOverallValue(Double value) {
                        this.overallValue = value;
                    }

                }

            }

        }

    }

}

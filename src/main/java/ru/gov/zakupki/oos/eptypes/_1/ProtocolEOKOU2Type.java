//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.AbandonedReasonRef;


/**
 * Тип: Протокол рассмотрения и оценки вторых частей заявок на участие в ЭOK-ОУ (открытый конкурс с ограниченным участием в электронной форме);
 *  внесение изменений
 * 
 * <p>Java class for protocolEOKOU2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolEOKOU2Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}protocolType">
 *       &lt;sequence>
 *         &lt;element name="protocolInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationsInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicationInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}competitionApp2Type" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/base/1}abandonedReasonRef" minOccurs="0"/>
 *                   &lt;element name="research" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "protocolEOKOU2Type", propOrder = {
    "protocolInfo"
})
public class ProtocolEOKOU2Type
    extends ProtocolType
{

    @XmlElement(required = true)
    protected ProtocolEOKOU2Type.ProtocolInfo protocolInfo;

    /**
     * Gets the value of the protocolInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEOKOU2Type.ProtocolInfo }
     *     
     */
    public ProtocolEOKOU2Type.ProtocolInfo getProtocolInfo() {
        return protocolInfo;
    }

    /**
     * Sets the value of the protocolInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEOKOU2Type.ProtocolInfo }
     *     
     */
    public void setProtocolInfo(ProtocolEOKOU2Type.ProtocolInfo value) {
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
     *         &lt;element name="applicationsInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicationInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}competitionApp2Type" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="abandonedReason" type="{http://zakupki.gov.ru/oos/base/1}abandonedReasonRef" minOccurs="0"/>
     *         &lt;element name="research" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "abandonedReason",
        "research"
    })
    public static class ProtocolInfo {

        @XmlElement(required = true)
        protected ProtocolEOKOU2Type.ProtocolInfo.ApplicationsInfo applicationsInfo;
        protected AbandonedReasonRef abandonedReason;
        protected boolean research;

        /**
         * Gets the value of the applicationsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolEOKOU2Type.ProtocolInfo.ApplicationsInfo }
         *     
         */
        public ProtocolEOKOU2Type.ProtocolInfo.ApplicationsInfo getApplicationsInfo() {
            return applicationsInfo;
        }

        /**
         * Sets the value of the applicationsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolEOKOU2Type.ProtocolInfo.ApplicationsInfo }
         *     
         */
        public void setApplicationsInfo(ProtocolEOKOU2Type.ProtocolInfo.ApplicationsInfo value) {
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
         * Gets the value of the research property.
         * 
         */
        public boolean isResearch() {
            return research;
        }

        /**
         * Sets the value of the research property.
         * 
         */
        public void setResearch(boolean value) {
            this.research = value;
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
         *         &lt;element name="applicationInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}competitionApp2Type" maxOccurs="unbounded"/>
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
            protected List<CompetitionApp2Type> applicationInfo;

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
             * {@link CompetitionApp2Type }
             * 
             * 
             */
            public List<CompetitionApp2Type> getApplicationInfo() {
                if (applicationInfo == null) {
                    applicationInfo = new ArrayList<CompetitionApp2Type>();
                }
                return this.applicationInfo;
            }

        }

    }

}

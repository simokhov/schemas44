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


/**
 * Тип: Протокол подведения итогов ЭOK (открытый конкурс в электронной форме);
 *  внесение изменений
 * 
 * <p>Java class for protocolEOK3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolEOK3Type">
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
 *                             &lt;element name="applicationInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}competitionApp3Type" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="research" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="contractMultiInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}contractMultiType"/>
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
@XmlType(name = "protocolEOK3Type", propOrder = {
    "protocolInfo"
})
public class ProtocolEOK3Type
    extends ProtocolType
{

    @XmlElement(required = true)
    protected ProtocolEOK3Type.ProtocolInfo protocolInfo;

    /**
     * Gets the value of the protocolInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEOK3Type.ProtocolInfo }
     *     
     */
    public ProtocolEOK3Type.ProtocolInfo getProtocolInfo() {
        return protocolInfo;
    }

    /**
     * Sets the value of the protocolInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEOK3Type.ProtocolInfo }
     *     
     */
    public void setProtocolInfo(ProtocolEOK3Type.ProtocolInfo value) {
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
     *                   &lt;element name="applicationInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}competitionApp3Type" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="research" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="contractMultiInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}contractMultiType"/>
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
        "research",
        "contractMultiInfo"
    })
    public static class ProtocolInfo {

        @XmlElement(required = true)
        protected ProtocolEOK3Type.ProtocolInfo.ApplicationsInfo applicationsInfo;
        protected boolean research;
        @XmlElement(required = true)
        protected ContractMultiType contractMultiInfo;

        /**
         * Gets the value of the applicationsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProtocolEOK3Type.ProtocolInfo.ApplicationsInfo }
         *     
         */
        public ProtocolEOK3Type.ProtocolInfo.ApplicationsInfo getApplicationsInfo() {
            return applicationsInfo;
        }

        /**
         * Sets the value of the applicationsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolEOK3Type.ProtocolInfo.ApplicationsInfo }
         *     
         */
        public void setApplicationsInfo(ProtocolEOK3Type.ProtocolInfo.ApplicationsInfo value) {
            this.applicationsInfo = value;
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
         * Gets the value of the contractMultiInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ContractMultiType }
         *     
         */
        public ContractMultiType getContractMultiInfo() {
            return contractMultiInfo;
        }

        /**
         * Sets the value of the contractMultiInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractMultiType }
         *     
         */
        public void setContractMultiInfo(ContractMultiType value) {
            this.contractMultiInfo = value;
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
         *         &lt;element name="applicationInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}competitionApp3Type" maxOccurs="unbounded"/>
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
            protected List<CompetitionApp3Type> applicationInfo;

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
             * {@link CompetitionApp3Type }
             * 
             * 
             */
            public List<CompetitionApp3Type> getApplicationInfo() {
                if (applicationInfo == null) {
                    applicationInfo = new ArrayList<CompetitionApp3Type>();
                }
                return this.applicationInfo;
            }

        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.cptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.AttachmentListType;


/**
 * Тип: Информация об отмене процедуры заключения контракта
 * 
 * <p>Java class for cancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentsInfo" type="{http://zakupki.gov.ru/oos/common/1}attachmentListType" minOccurs="0"/>
 *         &lt;element name="reasonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="responsibleDecisionInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reasonText" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="authorityPrescriptionInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}authorityPrescriptionType"/>
 *                   &lt;element name="courtDecisionInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}courtDecisionType"/>
 *                   &lt;element name="autoCreationInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reasonText" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelType", propOrder = {
    "attachmentsInfo",
    "reasonInfo"
})
public class CancelType {

    protected AttachmentListType attachmentsInfo;
    @XmlElement(required = true)
    protected CancelType.ReasonInfo reasonInfo;

    /**
     * Gets the value of the attachmentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentListType }
     *     
     */
    public AttachmentListType getAttachmentsInfo() {
        return attachmentsInfo;
    }

    /**
     * Sets the value of the attachmentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentListType }
     *     
     */
    public void setAttachmentsInfo(AttachmentListType value) {
        this.attachmentsInfo = value;
    }

    /**
     * Gets the value of the reasonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CancelType.ReasonInfo }
     *     
     */
    public CancelType.ReasonInfo getReasonInfo() {
        return reasonInfo;
    }

    /**
     * Sets the value of the reasonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelType.ReasonInfo }
     *     
     */
    public void setReasonInfo(CancelType.ReasonInfo value) {
        this.reasonInfo = value;
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
     *         &lt;element name="responsibleDecisionInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="reasonText" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="authorityPrescriptionInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}authorityPrescriptionType"/>
     *         &lt;element name="courtDecisionInfo" type="{http://zakupki.gov.ru/oos/CPtypes/1}courtDecisionType"/>
     *         &lt;element name="autoCreationInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="reasonText" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
        "responsibleDecisionInfo",
        "authorityPrescriptionInfo",
        "courtDecisionInfo",
        "autoCreationInfo"
    })
    public static class ReasonInfo {

        protected CancelType.ReasonInfo.ResponsibleDecisionInfo responsibleDecisionInfo;
        protected AuthorityPrescriptionType authorityPrescriptionInfo;
        protected CourtDecisionType courtDecisionInfo;
        protected CancelType.ReasonInfo.AutoCreationInfo autoCreationInfo;

        /**
         * Gets the value of the responsibleDecisionInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CancelType.ReasonInfo.ResponsibleDecisionInfo }
         *     
         */
        public CancelType.ReasonInfo.ResponsibleDecisionInfo getResponsibleDecisionInfo() {
            return responsibleDecisionInfo;
        }

        /**
         * Sets the value of the responsibleDecisionInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelType.ReasonInfo.ResponsibleDecisionInfo }
         *     
         */
        public void setResponsibleDecisionInfo(CancelType.ReasonInfo.ResponsibleDecisionInfo value) {
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
         * Gets the value of the autoCreationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CancelType.ReasonInfo.AutoCreationInfo }
         *     
         */
        public CancelType.ReasonInfo.AutoCreationInfo getAutoCreationInfo() {
            return autoCreationInfo;
        }

        /**
         * Sets the value of the autoCreationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelType.ReasonInfo.AutoCreationInfo }
         *     
         */
        public void setAutoCreationInfo(CancelType.ReasonInfo.AutoCreationInfo value) {
            this.autoCreationInfo = value;
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
         *         &lt;element name="reasonText" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
            "reasonText"
        })
        public static class AutoCreationInfo {

            @XmlElement(required = true)
            protected String reasonText;

            /**
             * Gets the value of the reasonText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonText() {
                return reasonText;
            }

            /**
             * Sets the value of the reasonText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonText(String value) {
                this.reasonText = value;
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
         *         &lt;element name="reasonText" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
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
            "reasonText"
        })
        public static class ResponsibleDecisionInfo {

            @XmlElement(required = true)
            protected String reasonText;

            /**
             * Gets the value of the reasonText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonText() {
                return reasonText;
            }

            /**
             * Sets the value of the reasonText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonText(String value) {
                this.reasonText = value;
            }

        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:49:49 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Извещение о проведении OK-Д (двухэтапный конкурс);
 *  
 * внесение изменений
 * 
 * <p>Java class for zfcs_notificationOKDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_notificationOKDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNotificationType">
 *       &lt;sequence>
 *         &lt;element name="purchaseDocumentation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_releasePurchaseDocumentationType"/>
 *         &lt;element name="procedureInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stageOne">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
 *                             &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
 *                             &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringType"/>
 *                             &lt;element name="prequalification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedurePrequalificationType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="stageTwo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
 *                             &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
 *                             &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringType"/>
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
 *         &lt;element name="lots">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lot" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotOKType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType"/>
 *         &lt;element name="modification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_notificationModificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_notificationOKDType", propOrder = {
    "purchaseDocumentation",
    "procedureInfo",
    "lots",
    "attachments",
    "modification"
})
public class ZfcsNotificationOKDType
    extends ZfcsPurchaseNotificationType
{

    @XmlElement(required = true)
    protected ZfcsReleasePurchaseDocumentationType purchaseDocumentation;
    @XmlElement(required = true)
    protected ZfcsNotificationOKDType.ProcedureInfo procedureInfo;
    @XmlElement(required = true)
    protected ZfcsNotificationOKDType.Lots lots;
    @XmlElement(required = true)
    protected ZfcsAttachmentListType attachments;
    protected ZfcsNotificationModificationType modification;

    /**
     * Gets the value of the purchaseDocumentation property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsReleasePurchaseDocumentationType }
     *     
     */
    public ZfcsReleasePurchaseDocumentationType getPurchaseDocumentation() {
        return purchaseDocumentation;
    }

    /**
     * Sets the value of the purchaseDocumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsReleasePurchaseDocumentationType }
     *     
     */
    public void setPurchaseDocumentation(ZfcsReleasePurchaseDocumentationType value) {
        this.purchaseDocumentation = value;
    }

    /**
     * Gets the value of the procedureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationOKDType.ProcedureInfo }
     *     
     */
    public ZfcsNotificationOKDType.ProcedureInfo getProcedureInfo() {
        return procedureInfo;
    }

    /**
     * Sets the value of the procedureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationOKDType.ProcedureInfo }
     *     
     */
    public void setProcedureInfo(ZfcsNotificationOKDType.ProcedureInfo value) {
        this.procedureInfo = value;
    }

    /**
     * Gets the value of the lots property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationOKDType.Lots }
     *     
     */
    public ZfcsNotificationOKDType.Lots getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationOKDType.Lots }
     *     
     */
    public void setLots(ZfcsNotificationOKDType.Lots value) {
        this.lots = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public ZfcsAttachmentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsAttachmentListType }
     *     
     */
    public void setAttachments(ZfcsAttachmentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationModificationType }
     *     
     */
    public ZfcsNotificationModificationType getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationModificationType }
     *     
     */
    public void setModification(ZfcsNotificationModificationType value) {
        this.modification = value;
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
     *         &lt;element name="lot" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotOKType" maxOccurs="unbounded"/>
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
        "lot"
    })
    public static class Lots {

        @XmlElement(required = true)
        protected List<ZfcsLotOKType> lot;

        /**
         * Gets the value of the lot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLot().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsLotOKType }
         * 
         * 
         */
        public List<ZfcsLotOKType> getLot() {
            if (lot == null) {
                lot = new ArrayList<ZfcsLotOKType>();
            }
            return this.lot;
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
     *         &lt;element name="stageOne">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
     *                   &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
     *                   &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringType"/>
     *                   &lt;element name="prequalification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedurePrequalificationType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="stageTwo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
     *                   &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
     *                   &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringType"/>
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
        "stageOne",
        "stageTwo"
    })
    public static class ProcedureInfo {

        @XmlElement(required = true)
        protected ZfcsNotificationOKDType.ProcedureInfo.StageOne stageOne;
        @XmlElement(required = true)
        protected ZfcsNotificationOKDType.ProcedureInfo.StageTwo stageTwo;

        /**
         * Gets the value of the stageOne property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNotificationOKDType.ProcedureInfo.StageOne }
         *     
         */
        public ZfcsNotificationOKDType.ProcedureInfo.StageOne getStageOne() {
            return stageOne;
        }

        /**
         * Sets the value of the stageOne property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNotificationOKDType.ProcedureInfo.StageOne }
         *     
         */
        public void setStageOne(ZfcsNotificationOKDType.ProcedureInfo.StageOne value) {
            this.stageOne = value;
        }

        /**
         * Gets the value of the stageTwo property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsNotificationOKDType.ProcedureInfo.StageTwo }
         *     
         */
        public ZfcsNotificationOKDType.ProcedureInfo.StageTwo getStageTwo() {
            return stageTwo;
        }

        /**
         * Sets the value of the stageTwo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsNotificationOKDType.ProcedureInfo.StageTwo }
         *     
         */
        public void setStageTwo(ZfcsNotificationOKDType.ProcedureInfo.StageTwo value) {
            this.stageTwo = value;
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
         *         &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
         *         &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
         *         &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringType"/>
         *         &lt;element name="prequalification" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedurePrequalificationType"/>
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
            "collecting",
            "opening",
            "scoring",
            "prequalification"
        })
        public static class StageOne {

            @XmlElement(required = true)
            protected ZfcsPurchaseProcedureCollectingType collecting;
            @XmlElement(required = true)
            protected ZfcsPurchaseProcedureOpeningType opening;
            @XmlElement(required = true)
            protected ZfcsPurchaseProcedureScoringType scoring;
            @XmlElement(required = true)
            protected ZfcsPurchaseProcedurePrequalificationType prequalification;

            /**
             * Gets the value of the collecting property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchaseProcedureCollectingType }
             *     
             */
            public ZfcsPurchaseProcedureCollectingType getCollecting() {
                return collecting;
            }

            /**
             * Sets the value of the collecting property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchaseProcedureCollectingType }
             *     
             */
            public void setCollecting(ZfcsPurchaseProcedureCollectingType value) {
                this.collecting = value;
            }

            /**
             * Gets the value of the opening property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchaseProcedureOpeningType }
             *     
             */
            public ZfcsPurchaseProcedureOpeningType getOpening() {
                return opening;
            }

            /**
             * Sets the value of the opening property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchaseProcedureOpeningType }
             *     
             */
            public void setOpening(ZfcsPurchaseProcedureOpeningType value) {
                this.opening = value;
            }

            /**
             * Gets the value of the scoring property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchaseProcedureScoringType }
             *     
             */
            public ZfcsPurchaseProcedureScoringType getScoring() {
                return scoring;
            }

            /**
             * Sets the value of the scoring property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchaseProcedureScoringType }
             *     
             */
            public void setScoring(ZfcsPurchaseProcedureScoringType value) {
                this.scoring = value;
            }

            /**
             * Gets the value of the prequalification property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchaseProcedurePrequalificationType }
             *     
             */
            public ZfcsPurchaseProcedurePrequalificationType getPrequalification() {
                return prequalification;
            }

            /**
             * Sets the value of the prequalification property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchaseProcedurePrequalificationType }
             *     
             */
            public void setPrequalification(ZfcsPurchaseProcedurePrequalificationType value) {
                this.prequalification = value;
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
         *         &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingType"/>
         *         &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
         *         &lt;element name="scoring" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureScoringType"/>
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
            "collecting",
            "opening",
            "scoring"
        })
        public static class StageTwo {

            @XmlElement(required = true)
            protected ZfcsPurchaseProcedureCollectingType collecting;
            @XmlElement(required = true)
            protected ZfcsPurchaseProcedureOpeningType opening;
            @XmlElement(required = true)
            protected ZfcsPurchaseProcedureScoringType scoring;

            /**
             * Gets the value of the collecting property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchaseProcedureCollectingType }
             *     
             */
            public ZfcsPurchaseProcedureCollectingType getCollecting() {
                return collecting;
            }

            /**
             * Sets the value of the collecting property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchaseProcedureCollectingType }
             *     
             */
            public void setCollecting(ZfcsPurchaseProcedureCollectingType value) {
                this.collecting = value;
            }

            /**
             * Gets the value of the opening property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchaseProcedureOpeningType }
             *     
             */
            public ZfcsPurchaseProcedureOpeningType getOpening() {
                return opening;
            }

            /**
             * Sets the value of the opening property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchaseProcedureOpeningType }
             *     
             */
            public void setOpening(ZfcsPurchaseProcedureOpeningType value) {
                this.opening = value;
            }

            /**
             * Gets the value of the scoring property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsPurchaseProcedureScoringType }
             *     
             */
            public ZfcsPurchaseProcedureScoringType getScoring() {
                return scoring;
            }

            /**
             * Sets the value of the scoring property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsPurchaseProcedureScoringType }
             *     
             */
            public void setScoring(ZfcsPurchaseProcedureScoringType value) {
                this.scoring = value;
            }

        }

    }

}

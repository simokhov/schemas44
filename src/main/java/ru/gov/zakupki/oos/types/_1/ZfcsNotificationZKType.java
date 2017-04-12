//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:49:49 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Извещение о проведении ЗK (запрос котировок);
 *  
 * внесение изменений
 * 
 * <p>Java class for zfcs_notificationZKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_notificationZKType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseNotificationType">
 *       &lt;sequence>
 *         &lt;element name="contractServiceInfo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="procedureInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingWithFormType"/>
 *                   &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
 *                   &lt;element name="contracting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureContractingType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lot" type="{http://zakupki.gov.ru/oos/types/1}zfcs_lotZKType"/>
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
@XmlType(name = "zfcs_notificationZKType", propOrder = {
    "contractServiceInfo",
    "procedureInfo",
    "lot",
    "attachments",
    "modification"
})
public class ZfcsNotificationZKType
    extends ZfcsPurchaseNotificationType
{

    @XmlElement(required = true)
    protected String contractServiceInfo;
    @XmlElement(required = true)
    protected ZfcsNotificationZKType.ProcedureInfo procedureInfo;
    @XmlElement(required = true)
    protected ZfcsLotZKType lot;
    @XmlElement(required = true)
    protected ZfcsAttachmentListType attachments;
    protected ZfcsNotificationModificationType modification;

    /**
     * Gets the value of the contractServiceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractServiceInfo() {
        return contractServiceInfo;
    }

    /**
     * Sets the value of the contractServiceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractServiceInfo(String value) {
        this.contractServiceInfo = value;
    }

    /**
     * Gets the value of the procedureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNotificationZKType.ProcedureInfo }
     *     
     */
    public ZfcsNotificationZKType.ProcedureInfo getProcedureInfo() {
        return procedureInfo;
    }

    /**
     * Sets the value of the procedureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNotificationZKType.ProcedureInfo }
     *     
     */
    public void setProcedureInfo(ZfcsNotificationZKType.ProcedureInfo value) {
        this.procedureInfo = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLotZKType }
     *     
     */
    public ZfcsLotZKType getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLotZKType }
     *     
     */
    public void setLot(ZfcsLotZKType value) {
        this.lot = value;
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
     *         &lt;element name="collecting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureCollectingWithFormType"/>
     *         &lt;element name="opening" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureOpeningType"/>
     *         &lt;element name="contracting" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProcedureContractingType"/>
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
        "contracting"
    })
    public static class ProcedureInfo {

        @XmlElement(required = true)
        protected ZfcsPurchaseProcedureCollectingWithFormType collecting;
        @XmlElement(required = true)
        protected ZfcsPurchaseProcedureOpeningType opening;
        @XmlElement(required = true)
        protected ZfcsPurchaseProcedureContractingType contracting;

        /**
         * Gets the value of the collecting property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureCollectingWithFormType }
         *     
         */
        public ZfcsPurchaseProcedureCollectingWithFormType getCollecting() {
            return collecting;
        }

        /**
         * Sets the value of the collecting property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureCollectingWithFormType }
         *     
         */
        public void setCollecting(ZfcsPurchaseProcedureCollectingWithFormType value) {
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
         * Gets the value of the contracting property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseProcedureContractingType }
         *     
         */
        public ZfcsPurchaseProcedureContractingType getContracting() {
            return contracting;
        }

        /**
         * Sets the value of the contracting property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseProcedureContractingType }
         *     
         */
        public void setContracting(ZfcsPurchaseProcedureContractingType value) {
            this.contracting = value;
        }

    }

}

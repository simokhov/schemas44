//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:04:36 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о документе закупки
 * 
 * <p>Java class for zfcs_purchaseDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseDocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseDocumentCommonType">
 *       &lt;sequence>
 *         &lt;element name="docType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_docType"/>
 *         &lt;element name="addInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="modification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modificationNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *                   &lt;element name="addInfo" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseChangeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="purchaseInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lots" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lot" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="customerRequirements" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="customerRequirement" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
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
@XmlType(name = "zfcs_purchaseDocumentType", propOrder = {
    "docType",
    "addInfo",
    "attachments",
    "modification",
    "purchaseInfo"
})
public class ZfcsPurchaseDocumentType
    extends ZfcsPurchaseDocumentCommonType
{

    @XmlElement(required = true)
    protected ZfcsDocType docType;
    protected String addInfo;
    protected ZfcsAttachmentListType attachments;
    protected ZfcsPurchaseDocumentType.Modification modification;
    protected ZfcsPurchaseDocumentType.PurchaseInfo purchaseInfo;

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsDocType }
     *     
     */
    public ZfcsDocType getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsDocType }
     *     
     */
    public void setDocType(ZfcsDocType value) {
        this.docType = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddInfo(String value) {
        this.addInfo = value;
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
     *     {@link ZfcsPurchaseDocumentType.Modification }
     *     
     */
    public ZfcsPurchaseDocumentType.Modification getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseDocumentType.Modification }
     *     
     */
    public void setModification(ZfcsPurchaseDocumentType.Modification value) {
        this.modification = value;
    }

    /**
     * Gets the value of the purchaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseDocumentType.PurchaseInfo }
     *     
     */
    public ZfcsPurchaseDocumentType.PurchaseInfo getPurchaseInfo() {
        return purchaseInfo;
    }

    /**
     * Sets the value of the purchaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseDocumentType.PurchaseInfo }
     *     
     */
    public void setPurchaseInfo(ZfcsPurchaseDocumentType.PurchaseInfo value) {
        this.purchaseInfo = value;
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
     *         &lt;element name="modificationNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
     *         &lt;element name="addInfo" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseChangeType" minOccurs="0"/>
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
        "modificationNumber",
        "info",
        "addInfo",
        "reason"
    })
    public static class Modification {

        protected int modificationNumber;
        @XmlElement(required = true)
        protected String info;
        protected String addInfo;
        protected ZfcsPurchaseChangeType reason;

        /**
         * Gets the value of the modificationNumber property.
         * 
         */
        public int getModificationNumber() {
            return modificationNumber;
        }

        /**
         * Sets the value of the modificationNumber property.
         * 
         */
        public void setModificationNumber(int value) {
            this.modificationNumber = value;
        }

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfo(String value) {
            this.info = value;
        }

        /**
         * Gets the value of the addInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddInfo() {
            return addInfo;
        }

        /**
         * Sets the value of the addInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddInfo(String value) {
            this.addInfo = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseChangeType }
         *     
         */
        public ZfcsPurchaseChangeType getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseChangeType }
         *     
         */
        public void setReason(ZfcsPurchaseChangeType value) {
            this.reason = value;
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
     *         &lt;element name="lots" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lot" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="customerRequirements" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="customerRequirement" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
     *                                               &lt;/sequence>
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
        "lots"
    })
    public static class PurchaseInfo {

        protected ZfcsPurchaseDocumentType.PurchaseInfo.Lots lots;

        /**
         * Gets the value of the lots property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsPurchaseDocumentType.PurchaseInfo.Lots }
         *     
         */
        public ZfcsPurchaseDocumentType.PurchaseInfo.Lots getLots() {
            return lots;
        }

        /**
         * Sets the value of the lots property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsPurchaseDocumentType.PurchaseInfo.Lots }
         *     
         */
        public void setLots(ZfcsPurchaseDocumentType.PurchaseInfo.Lots value) {
            this.lots = value;
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
         *         &lt;element name="lot" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="customerRequirements" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="customerRequirement" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
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
            "lot"
        })
        public static class Lots {

            protected List<ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot> lot;

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
             * {@link ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot }
             * 
             * 
             */
            public List<ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot> getLot() {
                if (lot == null) {
                    lot = new ArrayList<ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot>();
                }
                return this.lot;
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
             *         &lt;element name="customerRequirements" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="customerRequirement" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
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
                "customerRequirements"
            })
            public static class Lot {

                protected ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot.CustomerRequirements customerRequirements;

                /**
                 * Gets the value of the customerRequirements property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot.CustomerRequirements }
                 *     
                 */
                public ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot.CustomerRequirements getCustomerRequirements() {
                    return customerRequirements;
                }

                /**
                 * Sets the value of the customerRequirements property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot.CustomerRequirements }
                 *     
                 */
                public void setCustomerRequirements(ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot.CustomerRequirements value) {
                    this.customerRequirements = value;
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
                 *         &lt;element name="customerRequirement" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
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
                    "customerRequirement"
                })
                public static class CustomerRequirements {

                    protected List<ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot.CustomerRequirements.CustomerRequirement> customerRequirement;

                    /**
                     * Gets the value of the customerRequirement property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the customerRequirement property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCustomerRequirement().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot.CustomerRequirements.CustomerRequirement }
                     * 
                     * 
                     */
                    public List<ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot.CustomerRequirements.CustomerRequirement> getCustomerRequirement() {
                        if (customerRequirement == null) {
                            customerRequirement = new ArrayList<ZfcsPurchaseDocumentType.PurchaseInfo.Lots.Lot.CustomerRequirements.CustomerRequirement>();
                        }
                        return this.customerRequirement;
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
                     *         &lt;element name="purchaseCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
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
                        "purchaseCode"
                    })
                    public static class CustomerRequirement {

                        protected String purchaseCode;

                        /**
                         * Gets the value of the purchaseCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPurchaseCode() {
                            return purchaseCode;
                        }

                        /**
                         * Sets the value of the purchaseCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPurchaseCode(String value) {
                            this.purchaseCode = value;
                        }

                    }

                }

            }

        }

    }

}

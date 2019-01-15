//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.PreferenseType;
import ru.gov.zakupki.oos.common._1.PurchaseDrugObjectsInfoType;
import ru.gov.zakupki.oos.common._1.PurchaseObjectsType;
import ru.gov.zakupki.oos.common._1.RequirementRestrictionType;
import ru.gov.zakupki.oos.common._1.RestrictionType;


/**
 * Тип: Извещение о проведении ЭOK (открытый конкурс в электронной форме) для печатной формы Извещения
 * 
 * <p>Java class for notificationEOKPFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationEOKPFType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}notificationType">
 *       &lt;sequence>
 *         &lt;element name="notificationInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedureInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}procedureEOKType"/>
 *                   &lt;element name="contractConditionsInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}contractConditionsType"/>
 *                   &lt;element name="customerRequirementsInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="customerRequirementInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}customerRequirementType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="purchaseObjectsInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="notDrugPurchaseObjectsInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/common/1}purchaseObjectsType">
 *                                     &lt;sequence>
 *                                       &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="drugPurchaseObjectsInfo" type="{http://zakupki.gov.ru/oos/common/1}purchaseDrugObjectsInfoType"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="preferensesInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="preferenseInfo" type="{http://zakupki.gov.ru/oos/common/1}preferenseType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="requirementsInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="requirementInfo" type="{http://zakupki.gov.ru/oos/common/1}requirementRestrictionType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="restrictionsInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="restrictionInfo" type="{http://zakupki.gov.ru/oos/common/1}restrictionType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mustPublicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="publicDiscussionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}publicDiscussionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="modificationInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}notificationModificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationEOKPFType", propOrder = {
    "notificationInfo",
    "modificationInfo"
})
@XmlSeeAlso({
    NotificationEOKType.class
})
public class NotificationEOKPFType
    extends NotificationType
{

    @XmlElement(required = true)
    protected NotificationEOKPFType.NotificationInfo notificationInfo;
    protected NotificationModificationType modificationInfo;

    /**
     * Gets the value of the notificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEOKPFType.NotificationInfo }
     *     
     */
    public NotificationEOKPFType.NotificationInfo getNotificationInfo() {
        return notificationInfo;
    }

    /**
     * Sets the value of the notificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEOKPFType.NotificationInfo }
     *     
     */
    public void setNotificationInfo(NotificationEOKPFType.NotificationInfo value) {
        this.notificationInfo = value;
    }

    /**
     * Gets the value of the modificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationModificationType }
     *     
     */
    public NotificationModificationType getModificationInfo() {
        return modificationInfo;
    }

    /**
     * Sets the value of the modificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationModificationType }
     *     
     */
    public void setModificationInfo(NotificationModificationType value) {
        this.modificationInfo = value;
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
     *         &lt;element name="procedureInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}procedureEOKType"/>
     *         &lt;element name="contractConditionsInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}contractConditionsType"/>
     *         &lt;element name="customerRequirementsInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="customerRequirementInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}customerRequirementType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="purchaseObjectsInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="notDrugPurchaseObjectsInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/common/1}purchaseObjectsType">
     *                           &lt;sequence>
     *                             &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="drugPurchaseObjectsInfo" type="{http://zakupki.gov.ru/oos/common/1}purchaseDrugObjectsInfoType"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="preferensesInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="preferenseInfo" type="{http://zakupki.gov.ru/oos/common/1}preferenseType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="requirementsInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="requirementInfo" type="{http://zakupki.gov.ru/oos/common/1}requirementRestrictionType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="restrictionsInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="restrictionInfo" type="{http://zakupki.gov.ru/oos/common/1}restrictionType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mustPublicDiscussion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="publicDiscussionInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}publicDiscussionType" minOccurs="0"/>
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
        "procedureInfo",
        "contractConditionsInfo",
        "customerRequirementsInfo",
        "purchaseObjectsInfo",
        "preferensesInfo",
        "requirementsInfo",
        "restrictionsInfo",
        "mustPublicDiscussion",
        "publicDiscussionInfo"
    })
    public static class NotificationInfo {

        @XmlElement(required = true)
        protected ProcedureEOKType procedureInfo;
        @XmlElement(required = true)
        protected ContractConditionsType contractConditionsInfo;
        @XmlElement(required = true)
        protected NotificationEOKPFType.NotificationInfo.CustomerRequirementsInfo customerRequirementsInfo;
        @XmlElement(required = true)
        protected NotificationEOKPFType.NotificationInfo.PurchaseObjectsInfo purchaseObjectsInfo;
        protected NotificationEOKPFType.NotificationInfo.PreferensesInfo preferensesInfo;
        protected NotificationEOKPFType.NotificationInfo.RequirementsInfo requirementsInfo;
        protected NotificationEOKPFType.NotificationInfo.RestrictionsInfo restrictionsInfo;
        protected boolean mustPublicDiscussion;
        protected PublicDiscussionType publicDiscussionInfo;

        /**
         * Gets the value of the procedureInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProcedureEOKType }
         *     
         */
        public ProcedureEOKType getProcedureInfo() {
            return procedureInfo;
        }

        /**
         * Sets the value of the procedureInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProcedureEOKType }
         *     
         */
        public void setProcedureInfo(ProcedureEOKType value) {
            this.procedureInfo = value;
        }

        /**
         * Gets the value of the contractConditionsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ContractConditionsType }
         *     
         */
        public ContractConditionsType getContractConditionsInfo() {
            return contractConditionsInfo;
        }

        /**
         * Sets the value of the contractConditionsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractConditionsType }
         *     
         */
        public void setContractConditionsInfo(ContractConditionsType value) {
            this.contractConditionsInfo = value;
        }

        /**
         * Gets the value of the customerRequirementsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEOKPFType.NotificationInfo.CustomerRequirementsInfo }
         *     
         */
        public NotificationEOKPFType.NotificationInfo.CustomerRequirementsInfo getCustomerRequirementsInfo() {
            return customerRequirementsInfo;
        }

        /**
         * Sets the value of the customerRequirementsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEOKPFType.NotificationInfo.CustomerRequirementsInfo }
         *     
         */
        public void setCustomerRequirementsInfo(NotificationEOKPFType.NotificationInfo.CustomerRequirementsInfo value) {
            this.customerRequirementsInfo = value;
        }

        /**
         * Gets the value of the purchaseObjectsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEOKPFType.NotificationInfo.PurchaseObjectsInfo }
         *     
         */
        public NotificationEOKPFType.NotificationInfo.PurchaseObjectsInfo getPurchaseObjectsInfo() {
            return purchaseObjectsInfo;
        }

        /**
         * Sets the value of the purchaseObjectsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEOKPFType.NotificationInfo.PurchaseObjectsInfo }
         *     
         */
        public void setPurchaseObjectsInfo(NotificationEOKPFType.NotificationInfo.PurchaseObjectsInfo value) {
            this.purchaseObjectsInfo = value;
        }

        /**
         * Gets the value of the preferensesInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEOKPFType.NotificationInfo.PreferensesInfo }
         *     
         */
        public NotificationEOKPFType.NotificationInfo.PreferensesInfo getPreferensesInfo() {
            return preferensesInfo;
        }

        /**
         * Sets the value of the preferensesInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEOKPFType.NotificationInfo.PreferensesInfo }
         *     
         */
        public void setPreferensesInfo(NotificationEOKPFType.NotificationInfo.PreferensesInfo value) {
            this.preferensesInfo = value;
        }

        /**
         * Gets the value of the requirementsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEOKPFType.NotificationInfo.RequirementsInfo }
         *     
         */
        public NotificationEOKPFType.NotificationInfo.RequirementsInfo getRequirementsInfo() {
            return requirementsInfo;
        }

        /**
         * Sets the value of the requirementsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEOKPFType.NotificationInfo.RequirementsInfo }
         *     
         */
        public void setRequirementsInfo(NotificationEOKPFType.NotificationInfo.RequirementsInfo value) {
            this.requirementsInfo = value;
        }

        /**
         * Gets the value of the restrictionsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEOKPFType.NotificationInfo.RestrictionsInfo }
         *     
         */
        public NotificationEOKPFType.NotificationInfo.RestrictionsInfo getRestrictionsInfo() {
            return restrictionsInfo;
        }

        /**
         * Sets the value of the restrictionsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEOKPFType.NotificationInfo.RestrictionsInfo }
         *     
         */
        public void setRestrictionsInfo(NotificationEOKPFType.NotificationInfo.RestrictionsInfo value) {
            this.restrictionsInfo = value;
        }

        /**
         * Gets the value of the mustPublicDiscussion property.
         * 
         */
        public boolean isMustPublicDiscussion() {
            return mustPublicDiscussion;
        }

        /**
         * Sets the value of the mustPublicDiscussion property.
         * 
         */
        public void setMustPublicDiscussion(boolean value) {
            this.mustPublicDiscussion = value;
        }

        /**
         * Gets the value of the publicDiscussionInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PublicDiscussionType }
         *     
         */
        public PublicDiscussionType getPublicDiscussionInfo() {
            return publicDiscussionInfo;
        }

        /**
         * Sets the value of the publicDiscussionInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PublicDiscussionType }
         *     
         */
        public void setPublicDiscussionInfo(PublicDiscussionType value) {
            this.publicDiscussionInfo = value;
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
         *         &lt;element name="customerRequirementInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}customerRequirementType" maxOccurs="unbounded"/>
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
            "customerRequirementInfo"
        })
        public static class CustomerRequirementsInfo {

            @XmlElement(required = true)
            protected List<CustomerRequirementType> customerRequirementInfo;

            /**
             * Gets the value of the customerRequirementInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customerRequirementInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomerRequirementInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CustomerRequirementType }
             * 
             * 
             */
            public List<CustomerRequirementType> getCustomerRequirementInfo() {
                if (customerRequirementInfo == null) {
                    customerRequirementInfo = new ArrayList<CustomerRequirementType>();
                }
                return this.customerRequirementInfo;
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
         *         &lt;element name="preferenseInfo" type="{http://zakupki.gov.ru/oos/common/1}preferenseType" maxOccurs="unbounded"/>
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
            "preferenseInfo"
        })
        public static class PreferensesInfo {

            @XmlElement(required = true)
            protected List<PreferenseType> preferenseInfo;

            /**
             * Gets the value of the preferenseInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the preferenseInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPreferenseInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PreferenseType }
             * 
             * 
             */
            public List<PreferenseType> getPreferenseInfo() {
                if (preferenseInfo == null) {
                    preferenseInfo = new ArrayList<PreferenseType>();
                }
                return this.preferenseInfo;
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
         *       &lt;choice>
         *         &lt;element name="notDrugPurchaseObjectsInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/common/1}purchaseObjectsType">
         *                 &lt;sequence>
         *                   &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="drugPurchaseObjectsInfo" type="{http://zakupki.gov.ru/oos/common/1}purchaseDrugObjectsInfoType"/>
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
            "notDrugPurchaseObjectsInfo",
            "drugPurchaseObjectsInfo"
        })
        public static class PurchaseObjectsInfo {

            protected NotificationEOKPFType.NotificationInfo.PurchaseObjectsInfo.NotDrugPurchaseObjectsInfo notDrugPurchaseObjectsInfo;
            protected PurchaseDrugObjectsInfoType drugPurchaseObjectsInfo;

            /**
             * Gets the value of the notDrugPurchaseObjectsInfo property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationEOKPFType.NotificationInfo.PurchaseObjectsInfo.NotDrugPurchaseObjectsInfo }
             *     
             */
            public NotificationEOKPFType.NotificationInfo.PurchaseObjectsInfo.NotDrugPurchaseObjectsInfo getNotDrugPurchaseObjectsInfo() {
                return notDrugPurchaseObjectsInfo;
            }

            /**
             * Sets the value of the notDrugPurchaseObjectsInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationEOKPFType.NotificationInfo.PurchaseObjectsInfo.NotDrugPurchaseObjectsInfo }
             *     
             */
            public void setNotDrugPurchaseObjectsInfo(NotificationEOKPFType.NotificationInfo.PurchaseObjectsInfo.NotDrugPurchaseObjectsInfo value) {
                this.notDrugPurchaseObjectsInfo = value;
            }

            /**
             * Gets the value of the drugPurchaseObjectsInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PurchaseDrugObjectsInfoType }
             *     
             */
            public PurchaseDrugObjectsInfoType getDrugPurchaseObjectsInfo() {
                return drugPurchaseObjectsInfo;
            }

            /**
             * Sets the value of the drugPurchaseObjectsInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PurchaseDrugObjectsInfoType }
             *     
             */
            public void setDrugPurchaseObjectsInfo(PurchaseDrugObjectsInfoType value) {
                this.drugPurchaseObjectsInfo = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://zakupki.gov.ru/oos/common/1}purchaseObjectsType">
             *       &lt;sequence>
             *         &lt;element name="quantityUndefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                "quantityUndefined"
            })
            public static class NotDrugPurchaseObjectsInfo
                extends PurchaseObjectsType
            {

                protected boolean quantityUndefined;

                /**
                 * Gets the value of the quantityUndefined property.
                 * 
                 */
                public boolean isQuantityUndefined() {
                    return quantityUndefined;
                }

                /**
                 * Sets the value of the quantityUndefined property.
                 * 
                 */
                public void setQuantityUndefined(boolean value) {
                    this.quantityUndefined = value;
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
         *         &lt;element name="requirementInfo" type="{http://zakupki.gov.ru/oos/common/1}requirementRestrictionType" maxOccurs="unbounded"/>
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
            "requirementInfo"
        })
        public static class RequirementsInfo {

            @XmlElement(required = true)
            protected List<RequirementRestrictionType> requirementInfo;

            /**
             * Gets the value of the requirementInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the requirementInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRequirementInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RequirementRestrictionType }
             * 
             * 
             */
            public List<RequirementRestrictionType> getRequirementInfo() {
                if (requirementInfo == null) {
                    requirementInfo = new ArrayList<RequirementRestrictionType>();
                }
                return this.requirementInfo;
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
         *         &lt;element name="restrictionInfo" type="{http://zakupki.gov.ru/oos/common/1}restrictionType" maxOccurs="unbounded"/>
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
            "restrictionInfo"
        })
        public static class RestrictionsInfo {

            @XmlElement(required = true)
            protected List<RestrictionType> restrictionInfo;

            /**
             * Gets the value of the restrictionInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the restrictionInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRestrictionInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RestrictionType }
             * 
             * 
             */
            public List<RestrictionType> getRestrictionInfo() {
                if (restrictionInfo == null) {
                    restrictionInfo = new ArrayList<RestrictionType>();
                }
                return this.restrictionInfo;
            }

        }

    }

}
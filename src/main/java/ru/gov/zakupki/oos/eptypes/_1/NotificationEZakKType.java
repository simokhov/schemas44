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
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.AttachmentListType;
import ru.gov.zakupki.oos.common._1.PreferenseType;
import ru.gov.zakupki.oos.common._1.PurchaseDrugObjectsInfoType;
import ru.gov.zakupki.oos.common._1.PurchaseObjectsType;
import ru.gov.zakupki.oos.common._1.RequirementRestrictionType;
import ru.gov.zakupki.oos.common._1.RestrictionType;


/**
 * Тип: Извещение о проведении закрытого конкурса в электронном виде (ЭЗакК); внесение изменений
 * 
 * <p>Java class for notificationEZakKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationEZakKType">
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
 *                             &lt;element name="drugPurchaseObjectsInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://zakupki.gov.ru/oos/common/1}purchaseDrugObjectsInfoType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="p7Ch2St83Purchase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="medicalCommissionDecision" type="{http://zakupki.gov.ru/oos/common/1}attachmentListType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "notificationEZakKType", propOrder = {
    "notificationInfo",
    "modificationInfo"
})
public class NotificationEZakKType
    extends NotificationType
{

    @XmlElement(required = true)
    protected NotificationEZakKType.NotificationInfo notificationInfo;
    protected NotificationModificationType modificationInfo;

    /**
     * Gets the value of the notificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEZakKType.NotificationInfo }
     *     
     */
    public NotificationEZakKType.NotificationInfo getNotificationInfo() {
        return notificationInfo;
    }

    /**
     * Sets the value of the notificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEZakKType.NotificationInfo }
     *     
     */
    public void setNotificationInfo(NotificationEZakKType.NotificationInfo value) {
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
     *                   &lt;element name="drugPurchaseObjectsInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://zakupki.gov.ru/oos/common/1}purchaseDrugObjectsInfoType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="p7Ch2St83Purchase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element name="medicalCommissionDecision" type="{http://zakupki.gov.ru/oos/common/1}attachmentListType"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "purchaseObjectsInfo",
        "customerRequirementsInfo",
        "preferensesInfo",
        "requirementsInfo",
        "restrictionsInfo"
    })
    public static class NotificationInfo {

        @XmlElement(required = true)
        protected ProcedureEOKType procedureInfo;
        @XmlElement(required = true)
        protected ContractConditionsType contractConditionsInfo;
        @XmlElement(required = true)
        protected NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo purchaseObjectsInfo;
        @XmlElement(required = true)
        protected NotificationEZakKType.NotificationInfo.CustomerRequirementsInfo customerRequirementsInfo;
        protected NotificationEZakKType.NotificationInfo.PreferensesInfo preferensesInfo;
        protected NotificationEZakKType.NotificationInfo.RequirementsInfo requirementsInfo;
        protected NotificationEZakKType.NotificationInfo.RestrictionsInfo restrictionsInfo;

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
         * Gets the value of the purchaseObjectsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo }
         *     
         */
        public NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo getPurchaseObjectsInfo() {
            return purchaseObjectsInfo;
        }

        /**
         * Sets the value of the purchaseObjectsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo }
         *     
         */
        public void setPurchaseObjectsInfo(NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo value) {
            this.purchaseObjectsInfo = value;
        }

        /**
         * Gets the value of the customerRequirementsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEZakKType.NotificationInfo.CustomerRequirementsInfo }
         *     
         */
        public NotificationEZakKType.NotificationInfo.CustomerRequirementsInfo getCustomerRequirementsInfo() {
            return customerRequirementsInfo;
        }

        /**
         * Sets the value of the customerRequirementsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEZakKType.NotificationInfo.CustomerRequirementsInfo }
         *     
         */
        public void setCustomerRequirementsInfo(NotificationEZakKType.NotificationInfo.CustomerRequirementsInfo value) {
            this.customerRequirementsInfo = value;
        }

        /**
         * Gets the value of the preferensesInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEZakKType.NotificationInfo.PreferensesInfo }
         *     
         */
        public NotificationEZakKType.NotificationInfo.PreferensesInfo getPreferensesInfo() {
            return preferensesInfo;
        }

        /**
         * Sets the value of the preferensesInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEZakKType.NotificationInfo.PreferensesInfo }
         *     
         */
        public void setPreferensesInfo(NotificationEZakKType.NotificationInfo.PreferensesInfo value) {
            this.preferensesInfo = value;
        }

        /**
         * Gets the value of the requirementsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEZakKType.NotificationInfo.RequirementsInfo }
         *     
         */
        public NotificationEZakKType.NotificationInfo.RequirementsInfo getRequirementsInfo() {
            return requirementsInfo;
        }

        /**
         * Sets the value of the requirementsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEZakKType.NotificationInfo.RequirementsInfo }
         *     
         */
        public void setRequirementsInfo(NotificationEZakKType.NotificationInfo.RequirementsInfo value) {
            this.requirementsInfo = value;
        }

        /**
         * Gets the value of the restrictionsInfo property.
         * 
         * @return
         *     possible object is
         *     {@link NotificationEZakKType.NotificationInfo.RestrictionsInfo }
         *     
         */
        public NotificationEZakKType.NotificationInfo.RestrictionsInfo getRestrictionsInfo() {
            return restrictionsInfo;
        }

        /**
         * Sets the value of the restrictionsInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationEZakKType.NotificationInfo.RestrictionsInfo }
         *     
         */
        public void setRestrictionsInfo(NotificationEZakKType.NotificationInfo.RestrictionsInfo value) {
            this.restrictionsInfo = value;
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
         *         &lt;element name="drugPurchaseObjectsInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://zakupki.gov.ru/oos/common/1}purchaseDrugObjectsInfoType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="p7Ch2St83Purchase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element name="medicalCommissionDecision" type="{http://zakupki.gov.ru/oos/common/1}attachmentListType"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
            "notDrugPurchaseObjectsInfo",
            "drugPurchaseObjectsInfo"
        })
        public static class PurchaseObjectsInfo {

            protected NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo.NotDrugPurchaseObjectsInfo notDrugPurchaseObjectsInfo;
            protected NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo.DrugPurchaseObjectsInfo drugPurchaseObjectsInfo;

            /**
             * Gets the value of the notDrugPurchaseObjectsInfo property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo.NotDrugPurchaseObjectsInfo }
             *     
             */
            public NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo.NotDrugPurchaseObjectsInfo getNotDrugPurchaseObjectsInfo() {
                return notDrugPurchaseObjectsInfo;
            }

            /**
             * Sets the value of the notDrugPurchaseObjectsInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo.NotDrugPurchaseObjectsInfo }
             *     
             */
            public void setNotDrugPurchaseObjectsInfo(NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo.NotDrugPurchaseObjectsInfo value) {
                this.notDrugPurchaseObjectsInfo = value;
            }

            /**
             * Gets the value of the drugPurchaseObjectsInfo property.
             * 
             * @return
             *     possible object is
             *     {@link NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo.DrugPurchaseObjectsInfo }
             *     
             */
            public NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo.DrugPurchaseObjectsInfo getDrugPurchaseObjectsInfo() {
                return drugPurchaseObjectsInfo;
            }

            /**
             * Sets the value of the drugPurchaseObjectsInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo.DrugPurchaseObjectsInfo }
             *     
             */
            public void setDrugPurchaseObjectsInfo(NotificationEZakKType.NotificationInfo.PurchaseObjectsInfo.DrugPurchaseObjectsInfo value) {
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
             *     &lt;extension base="{http://zakupki.gov.ru/oos/common/1}purchaseDrugObjectsInfoType">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="p7Ch2St83Purchase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="medicalCommissionDecision" type="{http://zakupki.gov.ru/oos/common/1}attachmentListType"/>
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
                "p7Ch2St83Purchase",
                "medicalCommissionDecision"
            })
            public static class DrugPurchaseObjectsInfo
                extends PurchaseDrugObjectsInfoType
            {

                protected Boolean p7Ch2St83Purchase;
                protected AttachmentListType medicalCommissionDecision;

                /**
                 * Gets the value of the p7Ch2St83Purchase property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isP7Ch2St83Purchase() {
                    return p7Ch2St83Purchase;
                }

                /**
                 * Sets the value of the p7Ch2St83Purchase property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setP7Ch2St83Purchase(Boolean value) {
                    this.p7Ch2St83Purchase = value;
                }

                /**
                 * Gets the value of the medicalCommissionDecision property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AttachmentListType }
                 *     
                 */
                public AttachmentListType getMedicalCommissionDecision() {
                    return medicalCommissionDecision;
                }

                /**
                 * Sets the value of the medicalCommissionDecision property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AttachmentListType }
                 *     
                 */
                public void setMedicalCommissionDecision(AttachmentListType value) {
                    this.medicalCommissionDecision = value;
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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Набор элементов справочников и классификаторов
 * 
 * <p>Java class for zfcs_masterDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_masterDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="nsiBankGuaranteeRefusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBankGuaranteeRefusalReasonType"/>
 *         &lt;element name="nsiBankGuaranteeRefusal615Reason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBankGuaranteeRefusal615ReasonType"/>
 *         &lt;element name="nsiBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBudgetType"/>
 *         &lt;element name="nsiCalendarDays" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCalendarDaysType"/>
 *         &lt;element name="nsiCommission" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCommissionType"/>
 *         &lt;element name="nsiCommissionRole" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiCommissionRoleType"/>
 *         &lt;element name="nsiContractPriceChangeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPriceChangeReasonType"/>
 *         &lt;element name="nsiContractRefusalReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractRefusalReasonType"/>
 *         &lt;element name="nsiContractSingleCustomerReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractSingleCustomerReasonType"/>
 *         &lt;element name="nsiContractTerminationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractTerminationReasonType"/>
 *         &lt;element name="nsiContractModificationReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractModificationReasonType"/>
 *         &lt;element name="nsiContractExecutionDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractExecutionDocType"/>
 *         &lt;element name="nsiContractReparationDoc" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractReparationDocType"/>
 *         &lt;element name="nsiContractPenaltyReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractPenaltyReasonType"/>
 *         &lt;element name="nsiContractOKOPFExtraBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractOKOPFExtraBudgetType"/>
 *         &lt;element name="nsiContractCurrencyCBRF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiContractCurrencyCBRFType"/>
 *         &lt;element name="nsiEvalCriterion" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiEvalCriterionType"/>
 *         &lt;element name="nsiEtpAction" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiEtpActionType"/>
 *         &lt;element name="nsiKBKBudget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiKBKBudgetType"/>
 *         &lt;element name="nsiKVR" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiKVRType"/>
 *         &lt;element name="nsiKOSGU" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiKOSGUType"/>
 *         &lt;element name="nsiOKFS" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKFSType"/>
 *         &lt;element name="nsiOKOPF" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKOPFType"/>
 *         &lt;element name="nsiOKPD" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKPDType"/>
 *         &lt;element name="nsiOKVED" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOKVEDType"/>
 *         &lt;element name="nsiOrganization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationType"/>
 *         &lt;element name="nsiOrganizationRights" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationRightsType"/>
 *         &lt;element name="nsiOrganizationType" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiOrganizationTypesType"/>
 *         &lt;element name="nsiPlacingWay" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlacingWayType"/>
 *         &lt;element name="nsiPlanPositionChangeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPlanPositionChangeReasonType"/>
 *         &lt;element name="nsiPurchaseDocumentTypes" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchaseDocumentTypesType"/>
 *         &lt;element name="nsiPurchasePreferences" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchasePreferencesType"/>
 *         &lt;element name="nsiTenderPlanPurchaseGroups" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiTenderPlanPurchaseGroupType"/>
 *         &lt;element name="nsiPurchasePlanPositionChangeReasons" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchasePlanPositionChangeReasonType"/>
 *         &lt;element name="nsiTenderPlan2017PositionChangeReasons" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiTenderPlan2017PositionChangeReasonType"/>
 *         &lt;element name="nsiSpecialPurchases" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiSpecialPurchaseType"/>
 *         &lt;element name="nsiPurchaseRejectReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiPurchaseRejectReasonType"/>
 *         &lt;element name="nsiUser" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiUserType"/>
 *         &lt;element name="nsiAbandonedReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiAbandonedReasonType"/>
 *         &lt;element name="nsiTenderPlan2017ContractLifeCycleCases" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiTenderPlan2017ContractLifeCycleCaseType"/>
 *         &lt;element name="nsiETP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiETPType"/>
 *         &lt;element name="unfairSupplier" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unfairSupplierType"/>
 *         &lt;element name="nsiChangePriceFoundation" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiChangePriceFoundationType"/>
 *         &lt;element name="nsiTRUAdmissionNPA" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiTRUAdmissionNPA"/>
 *         &lt;element name="eruzNsiContractorExcludeReason" type="{http://zakupki.gov.ru/oos/types/1}zfcs_eruzNsiContractorExcludeReasonType"/>
 *         &lt;element name="nsiWorldTimeZone" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiWorldTimeZoneType"/>
 *       &lt;/choice>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_masterDataType", propOrder = {
    "nsiBankGuaranteeRefusalReasonOrNsiBankGuaranteeRefusal615ReasonOrNsiBudget"
})
public class ZfcsMasterDataType {

    @XmlElements({
        @XmlElement(name = "nsiBankGuaranteeRefusalReason", type = ZfcsNsiBankGuaranteeRefusalReasonType.class),
        @XmlElement(name = "nsiBankGuaranteeRefusal615Reason", type = ZfcsNsiBankGuaranteeRefusal615ReasonType.class),
        @XmlElement(name = "nsiBudget", type = ZfcsNsiBudgetType.class),
        @XmlElement(name = "nsiCalendarDays", type = ZfcsNsiCalendarDaysType.class),
        @XmlElement(name = "nsiCommission", type = ZfcsNsiCommissionType.class),
        @XmlElement(name = "nsiCommissionRole", type = ZfcsNsiCommissionRoleType.class),
        @XmlElement(name = "nsiContractPriceChangeReason", type = ZfcsNsiContractPriceChangeReasonType.class),
        @XmlElement(name = "nsiContractRefusalReason", type = ZfcsNsiContractRefusalReasonType.class),
        @XmlElement(name = "nsiContractSingleCustomerReason", type = ZfcsNsiContractSingleCustomerReasonType.class),
        @XmlElement(name = "nsiContractTerminationReason", type = ZfcsNsiContractTerminationReasonType.class),
        @XmlElement(name = "nsiContractModificationReason", type = ZfcsNsiContractModificationReasonType.class),
        @XmlElement(name = "nsiContractExecutionDoc", type = ZfcsNsiContractExecutionDocType.class),
        @XmlElement(name = "nsiContractReparationDoc", type = ZfcsNsiContractReparationDocType.class),
        @XmlElement(name = "nsiContractPenaltyReason", type = ZfcsNsiContractPenaltyReasonType.class),
        @XmlElement(name = "nsiContractOKOPFExtraBudget", type = ZfcsNsiContractOKOPFExtraBudgetType.class),
        @XmlElement(name = "nsiContractCurrencyCBRF", type = ZfcsNsiContractCurrencyCBRFType.class),
        @XmlElement(name = "nsiEvalCriterion", type = ZfcsNsiEvalCriterionType.class),
        @XmlElement(name = "nsiEtpAction", type = ZfcsNsiEtpActionType.class),
        @XmlElement(name = "nsiKBKBudget", type = ZfcsNsiKBKBudgetType.class),
        @XmlElement(name = "nsiKVR", type = ZfcsNsiKVRType.class),
        @XmlElement(name = "nsiKOSGU", type = ZfcsNsiKOSGUType.class),
        @XmlElement(name = "nsiOKFS", type = ZfcsNsiOKFSType.class),
        @XmlElement(name = "nsiOKOPF", type = ZfcsNsiOKOPFType.class),
        @XmlElement(name = "nsiOKPD", type = ZfcsNsiOKPDType.class),
        @XmlElement(name = "nsiOKVED", type = ZfcsNsiOKVEDType.class),
        @XmlElement(name = "nsiOrganization", type = ZfcsNsiOrganizationType.class),
        @XmlElement(name = "nsiOrganizationRights", type = ZfcsNsiOrganizationRightsType.class),
        @XmlElement(name = "nsiOrganizationType", type = ZfcsNsiOrganizationTypesType.class),
        @XmlElement(name = "nsiPlacingWay", type = ZfcsNsiPlacingWayType.class),
        @XmlElement(name = "nsiPlanPositionChangeReason", type = ZfcsNsiPlanPositionChangeReasonType.class),
        @XmlElement(name = "nsiPurchaseDocumentTypes", type = ZfcsNsiPurchaseDocumentTypesType.class),
        @XmlElement(name = "nsiPurchasePreferences", type = ZfcsNsiPurchasePreferencesType.class),
        @XmlElement(name = "nsiTenderPlanPurchaseGroups", type = ZfcsNsiTenderPlanPurchaseGroupType.class),
        @XmlElement(name = "nsiPurchasePlanPositionChangeReasons", type = ZfcsNsiPurchasePlanPositionChangeReasonType.class),
        @XmlElement(name = "nsiTenderPlan2017PositionChangeReasons", type = ZfcsNsiTenderPlan2017PositionChangeReasonType.class),
        @XmlElement(name = "nsiSpecialPurchases", type = ZfcsNsiSpecialPurchaseType.class),
        @XmlElement(name = "nsiPurchaseRejectReason", type = ZfcsNsiPurchaseRejectReasonType.class),
        @XmlElement(name = "nsiUser", type = ZfcsNsiUserType.class),
        @XmlElement(name = "nsiAbandonedReason", type = ZfcsNsiAbandonedReasonType.class),
        @XmlElement(name = "nsiTenderPlan2017ContractLifeCycleCases", type = ZfcsNsiTenderPlan2017ContractLifeCycleCaseType.class),
        @XmlElement(name = "nsiETP", type = ZfcsNsiETPType.class),
        @XmlElement(name = "unfairSupplier", type = ZfcsUnfairSupplierType.class),
        @XmlElement(name = "nsiChangePriceFoundation", type = ZfcsNsiChangePriceFoundationType.class),
        @XmlElement(name = "nsiTRUAdmissionNPA", type = ZfcsNsiTRUAdmissionNPA.class),
        @XmlElement(name = "eruzNsiContractorExcludeReason", type = ZfcsEruzNsiContractorExcludeReasonType.class),
        @XmlElement(name = "nsiWorldTimeZone", type = ZfcsNsiWorldTimeZoneType.class)
    })
    protected List<Object> nsiBankGuaranteeRefusalReasonOrNsiBankGuaranteeRefusal615ReasonOrNsiBudget;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the nsiBankGuaranteeRefusalReasonOrNsiBankGuaranteeRefusal615ReasonOrNsiBudget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsiBankGuaranteeRefusalReasonOrNsiBankGuaranteeRefusal615ReasonOrNsiBudget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNsiBankGuaranteeRefusalReasonOrNsiBankGuaranteeRefusal615ReasonOrNsiBudget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsNsiBankGuaranteeRefusalReasonType }
     * {@link ZfcsNsiBankGuaranteeRefusal615ReasonType }
     * {@link ZfcsNsiBudgetType }
     * {@link ZfcsNsiCalendarDaysType }
     * {@link ZfcsNsiCommissionType }
     * {@link ZfcsNsiCommissionRoleType }
     * {@link ZfcsNsiContractPriceChangeReasonType }
     * {@link ZfcsNsiContractRefusalReasonType }
     * {@link ZfcsNsiContractSingleCustomerReasonType }
     * {@link ZfcsNsiContractTerminationReasonType }
     * {@link ZfcsNsiContractModificationReasonType }
     * {@link ZfcsNsiContractExecutionDocType }
     * {@link ZfcsNsiContractReparationDocType }
     * {@link ZfcsNsiContractPenaltyReasonType }
     * {@link ZfcsNsiContractOKOPFExtraBudgetType }
     * {@link ZfcsNsiContractCurrencyCBRFType }
     * {@link ZfcsNsiEvalCriterionType }
     * {@link ZfcsNsiEtpActionType }
     * {@link ZfcsNsiKBKBudgetType }
     * {@link ZfcsNsiKVRType }
     * {@link ZfcsNsiKOSGUType }
     * {@link ZfcsNsiOKFSType }
     * {@link ZfcsNsiOKOPFType }
     * {@link ZfcsNsiOKPDType }
     * {@link ZfcsNsiOKVEDType }
     * {@link ZfcsNsiOrganizationType }
     * {@link ZfcsNsiOrganizationRightsType }
     * {@link ZfcsNsiOrganizationTypesType }
     * {@link ZfcsNsiPlacingWayType }
     * {@link ZfcsNsiPlanPositionChangeReasonType }
     * {@link ZfcsNsiPurchaseDocumentTypesType }
     * {@link ZfcsNsiPurchasePreferencesType }
     * {@link ZfcsNsiTenderPlanPurchaseGroupType }
     * {@link ZfcsNsiPurchasePlanPositionChangeReasonType }
     * {@link ZfcsNsiTenderPlan2017PositionChangeReasonType }
     * {@link ZfcsNsiSpecialPurchaseType }
     * {@link ZfcsNsiPurchaseRejectReasonType }
     * {@link ZfcsNsiUserType }
     * {@link ZfcsNsiAbandonedReasonType }
     * {@link ZfcsNsiTenderPlan2017ContractLifeCycleCaseType }
     * {@link ZfcsNsiETPType }
     * {@link ZfcsUnfairSupplierType }
     * {@link ZfcsNsiChangePriceFoundationType }
     * {@link ZfcsNsiTRUAdmissionNPA }
     * {@link ZfcsEruzNsiContractorExcludeReasonType }
     * {@link ZfcsNsiWorldTimeZoneType }
     * 
     * 
     */
    public List<Object> getNsiBankGuaranteeRefusalReasonOrNsiBankGuaranteeRefusal615ReasonOrNsiBudget() {
        if (nsiBankGuaranteeRefusalReasonOrNsiBankGuaranteeRefusal615ReasonOrNsiBudget == null) {
            nsiBankGuaranteeRefusalReasonOrNsiBankGuaranteeRefusal615ReasonOrNsiBudget = new ArrayList<Object>();
        }
        return this.nsiBankGuaranteeRefusalReasonOrNsiBankGuaranteeRefusal615ReasonOrNsiBudget;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
    }

}

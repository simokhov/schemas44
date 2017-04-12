//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:54:10 AM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.gov.zakupki.oos.types._1.ZfcsBankGuaranteeRefusalType;
import ru.gov.zakupki.oos.types._1.ZfcsBankGuaranteeType;
import ru.gov.zakupki.oos.types._1.ZfcsCheckPlanType;
import ru.gov.zakupki.oos.types._1.ZfcsCheckResultCancelType;
import ru.gov.zakupki.oos.types._1.ZfcsCheckResultType;
import ru.gov.zakupki.oos.types._1.ZfcsClarificationType;
import ru.gov.zakupki.oos.types._1.ZfcsComplaintCancelType;
import ru.gov.zakupki.oos.types._1.ZfcsComplaintGroupType;
import ru.gov.zakupki.oos.types._1.ZfcsComplaintType;
import ru.gov.zakupki.oos.types._1.ZfcsContractProcedureCancelType;
import ru.gov.zakupki.oos.types._1.ZfcsContractProcedureType;
import ru.gov.zakupki.oos.types._1.ZfcsContractType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationCancelType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationEFType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationEPType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationISMType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationISOType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationLotCancelType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationLotChangeType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationOKDType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationOKOUType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationOKType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationPOType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationZKBIType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationZKType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationZPType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationZakAType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationZakKDType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationZakKOUType;
import ru.gov.zakupki.oos.types._1.ZfcsNotificationZakKType;
import ru.gov.zakupki.oos.types._1.ZfcsPurchaseApprovalType;
import ru.gov.zakupki.oos.types._1.ZfcsPurchaseProlongationOKType;
import ru.gov.zakupki.oos.types._1.ZfcsPurchaseProlongationZKType;
import ru.gov.zakupki.oos.types._1.ZfcsSketchPlanExecutionType;
import ru.gov.zakupki.oos.types._1.ZfcsSketchPlanType;
import ru.gov.zakupki.oos.types._1.ZfcsTenderPlanType;
import ru.gov.zakupki.oos.types._1.ZfcsTenderPlanUnstructuredType;
import ru.gov.zakupki.oos.types._1.ZfcsTenderSuspensionType;
import ru.gov.zakupki.oos.types._1.ZfcsUnplannedCheckCancelType;
import ru.gov.zakupki.oos.types._1.ZfcsUnplannedCheckType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gov.zakupki.oos.printform._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FcsNotificationOK_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationOK");
    private final static QName _ComplaintGroup_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "complaintGroup");
    private final static QName _CheckResult_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "checkResult");
    private final static QName _FcsNotificationISM_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationISM");
    private final static QName _BankGuarantee_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "bankGuarantee");
    private final static QName _FcsNotificationISO_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationISO");
    private final static QName _FcsNotificationZakKD_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationZakKD");
    private final static QName _FcsNotificationZakKOU_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationZakKOU");
    private final static QName _FcsAddInfo_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsAddInfo");
    private final static QName _Contract_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "contract");
    private final static QName _FcsNotificationEP_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationEP");
    private final static QName _FcsNotificationEF_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationEF");
    private final static QName _FcsPurchaseDocument_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsPurchaseDocument");
    private final static QName _TenderSuspension_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "tenderSuspension");
    private final static QName _TenderPlanUnstructured_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "tenderPlanUnstructured");
    private final static QName _SketchPlan_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "sketchPlan");
    private final static QName _FcsPurchaseDocumentCancel_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsPurchaseDocumentCancel");
    private final static QName _FcsClarification_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsClarification");
    private final static QName _FcsNotificationZKBI_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationZKBI");
    private final static QName _FcsCustomerReportSmallScaleBusiness_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsCustomerReportSmallScaleBusiness");
    private final static QName _ContractProcedureCancel_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "contractProcedureCancel");
    private final static QName _CheckPlan_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "checkPlan");
    private final static QName _FcsNotificationLotChange_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationLotChange");
    private final static QName _FcsNotificationOKD_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationOKD");
    private final static QName _UnplannedCheck_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "unplannedCheck");
    private final static QName _FcsPurchaseProlongationOK_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsPurchaseProlongationOK");
    private final static QName _FcsNotificationZP_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationZP");
    private final static QName _CheckResultCancel_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "checkResultCancel");
    private final static QName _FcsNotificationZK_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationZK");
    private final static QName _FcsNotificationCancel_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationCancel");
    private final static QName _SketchPlanExecution_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "sketchPlanExecution");
    private final static QName _TenderPlan_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "tenderPlan");
    private final static QName _ContractProcedure_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "contractProcedure");
    private final static QName _ComplaintCancel_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "complaintCancel");
    private final static QName _FcsNotificationZakK_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationZakK");
    private final static QName _FcsPurchaseProlongationZK_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsPurchaseProlongationZK");
    private final static QName _FcsNotificationOKOU_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationOKOU");
    private final static QName _FcsNotificationPO_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationPO");
    private final static QName _Complaint_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "complaint");
    private final static QName _FcsCustomerReportSingleContractor_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsCustomerReportSingleContractor");
    private final static QName _FcsCustomerReportContractExecution_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsCustomerReportContractExecution");
    private final static QName _BankGuaranteeRefusal_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "bankGuaranteeRefusal");
    private final static QName _FcsNotificationLotCancel_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationLotCancel");
    private final static QName _UnplannedCheckCancel_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "unplannedCheckCancel");
    private final static QName _FcsPurchaseApproval_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsPurchaseApproval");
    private final static QName _FcsNotificationZakA_QNAME = new QName("http://zakupki.gov.ru/oos/printform/1", "fcsNotificationZakA");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gov.zakupki.oos.printform._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ZfcsCustomerReportSmallScaleBusinessType }
     * 
     */
    public ZfcsCustomerReportSmallScaleBusinessType createZfcsCustomerReportSmallScaleBusinessType() {
        return new ZfcsCustomerReportSmallScaleBusinessType();
    }

    /**
     * Create an instance of {@link FcsPurchaseDocumentCancelType }
     * 
     */
    public FcsPurchaseDocumentCancelType createFcsPurchaseDocumentCancelType() {
        return new FcsPurchaseDocumentCancelType();
    }

    /**
     * Create an instance of {@link ZfcsAddInfoType }
     * 
     */
    public ZfcsAddInfoType createZfcsAddInfoType() {
        return new ZfcsAddInfoType();
    }

    /**
     * Create an instance of {@link ZfcsAddInfoType.Contractor }
     * 
     */
    public ZfcsAddInfoType.Contractor createZfcsAddInfoTypeContractor() {
        return new ZfcsAddInfoType.Contractor();
    }

    /**
     * Create an instance of {@link ZfcsAddInfoType.Purchase }
     * 
     */
    public ZfcsAddInfoType.Purchase createZfcsAddInfoTypePurchase() {
        return new ZfcsAddInfoType.Purchase();
    }

    /**
     * Create an instance of {@link FcsPurchaseDocumentType }
     * 
     */
    public FcsPurchaseDocumentType createFcsPurchaseDocumentType() {
        return new FcsPurchaseDocumentType();
    }

    /**
     * Create an instance of {@link ZfcsCustomerReportSingleContractorType }
     * 
     */
    public ZfcsCustomerReportSingleContractorType createZfcsCustomerReportSingleContractorType() {
        return new ZfcsCustomerReportSingleContractorType();
    }

    /**
     * Create an instance of {@link ZfcsCustomerReportContractExecutionType }
     * 
     */
    public ZfcsCustomerReportContractExecutionType createZfcsCustomerReportContractExecutionType() {
        return new ZfcsCustomerReportContractExecutionType();
    }

    /**
     * Create an instance of {@link ZfcsOrganizationInfoType }
     * 
     */
    public ZfcsOrganizationInfoType createZfcsOrganizationInfoType() {
        return new ZfcsOrganizationInfoType();
    }

    /**
     * Create an instance of {@link ZfcsOrganizationInfoWithOgrnType }
     * 
     */
    public ZfcsOrganizationInfoWithOgrnType createZfcsOrganizationInfoWithOgrnType() {
        return new ZfcsOrganizationInfoWithOgrnType();
    }

    /**
     * Create an instance of {@link ZfcsCustomerReportType }
     * 
     */
    public ZfcsCustomerReportType createZfcsCustomerReportType() {
        return new ZfcsCustomerReportType();
    }

    /**
     * Create an instance of {@link ZfcsCustomerReportSmallScaleBusinessType.ReportingPeriod }
     * 
     */
    public ZfcsCustomerReportSmallScaleBusinessType.ReportingPeriod createZfcsCustomerReportSmallScaleBusinessTypeReportingPeriod() {
        return new ZfcsCustomerReportSmallScaleBusinessType.ReportingPeriod();
    }

    /**
     * Create an instance of {@link FcsPurchaseDocumentCancelType.PlacingWay }
     * 
     */
    public FcsPurchaseDocumentCancelType.PlacingWay createFcsPurchaseDocumentCancelTypePlacingWay() {
        return new FcsPurchaseDocumentCancelType.PlacingWay();
    }

    /**
     * Create an instance of {@link ZfcsAddInfoType.Contract }
     * 
     */
    public ZfcsAddInfoType.Contract createZfcsAddInfoTypeContract() {
        return new ZfcsAddInfoType.Contract();
    }

    /**
     * Create an instance of {@link ZfcsAddInfoType.Contractor.Person }
     * 
     */
    public ZfcsAddInfoType.Contractor.Person createZfcsAddInfoTypeContractorPerson() {
        return new ZfcsAddInfoType.Contractor.Person();
    }

    /**
     * Create an instance of {@link ZfcsAddInfoType.Purchase.PlacingWay }
     * 
     */
    public ZfcsAddInfoType.Purchase.PlacingWay createZfcsAddInfoTypePurchasePlacingWay() {
        return new ZfcsAddInfoType.Purchase.PlacingWay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationOKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationOK")
    public JAXBElement<ZfcsNotificationOKType> createFcsNotificationOK(ZfcsNotificationOKType value) {
        return new JAXBElement<ZfcsNotificationOKType>(_FcsNotificationOK_QNAME, ZfcsNotificationOKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsComplaintGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "complaintGroup")
    public JAXBElement<ZfcsComplaintGroupType> createComplaintGroup(ZfcsComplaintGroupType value) {
        return new JAXBElement<ZfcsComplaintGroupType>(_ComplaintGroup_QNAME, ZfcsComplaintGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsCheckResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "checkResult")
    public JAXBElement<ZfcsCheckResultType> createCheckResult(ZfcsCheckResultType value) {
        return new JAXBElement<ZfcsCheckResultType>(_CheckResult_QNAME, ZfcsCheckResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationISMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationISM")
    public JAXBElement<ZfcsNotificationISMType> createFcsNotificationISM(ZfcsNotificationISMType value) {
        return new JAXBElement<ZfcsNotificationISMType>(_FcsNotificationISM_QNAME, ZfcsNotificationISMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsBankGuaranteeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "bankGuarantee")
    public JAXBElement<ZfcsBankGuaranteeType> createBankGuarantee(ZfcsBankGuaranteeType value) {
        return new JAXBElement<ZfcsBankGuaranteeType>(_BankGuarantee_QNAME, ZfcsBankGuaranteeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationISOType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationISO")
    public JAXBElement<ZfcsNotificationISOType> createFcsNotificationISO(ZfcsNotificationISOType value) {
        return new JAXBElement<ZfcsNotificationISOType>(_FcsNotificationISO_QNAME, ZfcsNotificationISOType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZakKDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationZakKD")
    public JAXBElement<ZfcsNotificationZakKDType> createFcsNotificationZakKD(ZfcsNotificationZakKDType value) {
        return new JAXBElement<ZfcsNotificationZakKDType>(_FcsNotificationZakKD_QNAME, ZfcsNotificationZakKDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZakKOUType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationZakKOU")
    public JAXBElement<ZfcsNotificationZakKOUType> createFcsNotificationZakKOU(ZfcsNotificationZakKOUType value) {
        return new JAXBElement<ZfcsNotificationZakKOUType>(_FcsNotificationZakKOU_QNAME, ZfcsNotificationZakKOUType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsAddInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsAddInfo")
    public JAXBElement<ZfcsAddInfoType> createFcsAddInfo(ZfcsAddInfoType value) {
        return new JAXBElement<ZfcsAddInfoType>(_FcsAddInfo_QNAME, ZfcsAddInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsContractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "contract")
    public JAXBElement<ZfcsContractType> createContract(ZfcsContractType value) {
        return new JAXBElement<ZfcsContractType>(_Contract_QNAME, ZfcsContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationEPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationEP")
    public JAXBElement<ZfcsNotificationEPType> createFcsNotificationEP(ZfcsNotificationEPType value) {
        return new JAXBElement<ZfcsNotificationEPType>(_FcsNotificationEP_QNAME, ZfcsNotificationEPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationEFType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationEF")
    public JAXBElement<ZfcsNotificationEFType> createFcsNotificationEF(ZfcsNotificationEFType value) {
        return new JAXBElement<ZfcsNotificationEFType>(_FcsNotificationEF_QNAME, ZfcsNotificationEFType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FcsPurchaseDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsPurchaseDocument")
    public JAXBElement<FcsPurchaseDocumentType> createFcsPurchaseDocument(FcsPurchaseDocumentType value) {
        return new JAXBElement<FcsPurchaseDocumentType>(_FcsPurchaseDocument_QNAME, FcsPurchaseDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsTenderSuspensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "tenderSuspension")
    public JAXBElement<ZfcsTenderSuspensionType> createTenderSuspension(ZfcsTenderSuspensionType value) {
        return new JAXBElement<ZfcsTenderSuspensionType>(_TenderSuspension_QNAME, ZfcsTenderSuspensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsTenderPlanUnstructuredType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "tenderPlanUnstructured")
    public JAXBElement<ZfcsTenderPlanUnstructuredType> createTenderPlanUnstructured(ZfcsTenderPlanUnstructuredType value) {
        return new JAXBElement<ZfcsTenderPlanUnstructuredType>(_TenderPlanUnstructured_QNAME, ZfcsTenderPlanUnstructuredType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsSketchPlanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "sketchPlan")
    public JAXBElement<ZfcsSketchPlanType> createSketchPlan(ZfcsSketchPlanType value) {
        return new JAXBElement<ZfcsSketchPlanType>(_SketchPlan_QNAME, ZfcsSketchPlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FcsPurchaseDocumentCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsPurchaseDocumentCancel")
    public JAXBElement<FcsPurchaseDocumentCancelType> createFcsPurchaseDocumentCancel(FcsPurchaseDocumentCancelType value) {
        return new JAXBElement<FcsPurchaseDocumentCancelType>(_FcsPurchaseDocumentCancel_QNAME, FcsPurchaseDocumentCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsClarificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsClarification")
    public JAXBElement<ZfcsClarificationType> createFcsClarification(ZfcsClarificationType value) {
        return new JAXBElement<ZfcsClarificationType>(_FcsClarification_QNAME, ZfcsClarificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZKBIType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationZKBI")
    public JAXBElement<ZfcsNotificationZKBIType> createFcsNotificationZKBI(ZfcsNotificationZKBIType value) {
        return new JAXBElement<ZfcsNotificationZKBIType>(_FcsNotificationZKBI_QNAME, ZfcsNotificationZKBIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsCustomerReportSmallScaleBusinessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsCustomerReportSmallScaleBusiness")
    public JAXBElement<ZfcsCustomerReportSmallScaleBusinessType> createFcsCustomerReportSmallScaleBusiness(ZfcsCustomerReportSmallScaleBusinessType value) {
        return new JAXBElement<ZfcsCustomerReportSmallScaleBusinessType>(_FcsCustomerReportSmallScaleBusiness_QNAME, ZfcsCustomerReportSmallScaleBusinessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsContractProcedureCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "contractProcedureCancel")
    public JAXBElement<ZfcsContractProcedureCancelType> createContractProcedureCancel(ZfcsContractProcedureCancelType value) {
        return new JAXBElement<ZfcsContractProcedureCancelType>(_ContractProcedureCancel_QNAME, ZfcsContractProcedureCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsCheckPlanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "checkPlan")
    public JAXBElement<ZfcsCheckPlanType> createCheckPlan(ZfcsCheckPlanType value) {
        return new JAXBElement<ZfcsCheckPlanType>(_CheckPlan_QNAME, ZfcsCheckPlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationLotChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationLotChange")
    public JAXBElement<ZfcsNotificationLotChangeType> createFcsNotificationLotChange(ZfcsNotificationLotChangeType value) {
        return new JAXBElement<ZfcsNotificationLotChangeType>(_FcsNotificationLotChange_QNAME, ZfcsNotificationLotChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationOKDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationOKD")
    public JAXBElement<ZfcsNotificationOKDType> createFcsNotificationOKD(ZfcsNotificationOKDType value) {
        return new JAXBElement<ZfcsNotificationOKDType>(_FcsNotificationOKD_QNAME, ZfcsNotificationOKDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsUnplannedCheckType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "unplannedCheck")
    public JAXBElement<ZfcsUnplannedCheckType> createUnplannedCheck(ZfcsUnplannedCheckType value) {
        return new JAXBElement<ZfcsUnplannedCheckType>(_UnplannedCheck_QNAME, ZfcsUnplannedCheckType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsPurchaseProlongationOKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsPurchaseProlongationOK")
    public JAXBElement<ZfcsPurchaseProlongationOKType> createFcsPurchaseProlongationOK(ZfcsPurchaseProlongationOKType value) {
        return new JAXBElement<ZfcsPurchaseProlongationOKType>(_FcsPurchaseProlongationOK_QNAME, ZfcsPurchaseProlongationOKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationZP")
    public JAXBElement<ZfcsNotificationZPType> createFcsNotificationZP(ZfcsNotificationZPType value) {
        return new JAXBElement<ZfcsNotificationZPType>(_FcsNotificationZP_QNAME, ZfcsNotificationZPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsCheckResultCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "checkResultCancel")
    public JAXBElement<ZfcsCheckResultCancelType> createCheckResultCancel(ZfcsCheckResultCancelType value) {
        return new JAXBElement<ZfcsCheckResultCancelType>(_CheckResultCancel_QNAME, ZfcsCheckResultCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationZK")
    public JAXBElement<ZfcsNotificationZKType> createFcsNotificationZK(ZfcsNotificationZKType value) {
        return new JAXBElement<ZfcsNotificationZKType>(_FcsNotificationZK_QNAME, ZfcsNotificationZKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationCancel")
    public JAXBElement<ZfcsNotificationCancelType> createFcsNotificationCancel(ZfcsNotificationCancelType value) {
        return new JAXBElement<ZfcsNotificationCancelType>(_FcsNotificationCancel_QNAME, ZfcsNotificationCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsSketchPlanExecutionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "sketchPlanExecution")
    public JAXBElement<ZfcsSketchPlanExecutionType> createSketchPlanExecution(ZfcsSketchPlanExecutionType value) {
        return new JAXBElement<ZfcsSketchPlanExecutionType>(_SketchPlanExecution_QNAME, ZfcsSketchPlanExecutionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsTenderPlanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "tenderPlan")
    public JAXBElement<ZfcsTenderPlanType> createTenderPlan(ZfcsTenderPlanType value) {
        return new JAXBElement<ZfcsTenderPlanType>(_TenderPlan_QNAME, ZfcsTenderPlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsContractProcedureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "contractProcedure")
    public JAXBElement<ZfcsContractProcedureType> createContractProcedure(ZfcsContractProcedureType value) {
        return new JAXBElement<ZfcsContractProcedureType>(_ContractProcedure_QNAME, ZfcsContractProcedureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsComplaintCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "complaintCancel")
    public JAXBElement<ZfcsComplaintCancelType> createComplaintCancel(ZfcsComplaintCancelType value) {
        return new JAXBElement<ZfcsComplaintCancelType>(_ComplaintCancel_QNAME, ZfcsComplaintCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZakKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationZakK")
    public JAXBElement<ZfcsNotificationZakKType> createFcsNotificationZakK(ZfcsNotificationZakKType value) {
        return new JAXBElement<ZfcsNotificationZakKType>(_FcsNotificationZakK_QNAME, ZfcsNotificationZakKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsPurchaseProlongationZKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsPurchaseProlongationZK")
    public JAXBElement<ZfcsPurchaseProlongationZKType> createFcsPurchaseProlongationZK(ZfcsPurchaseProlongationZKType value) {
        return new JAXBElement<ZfcsPurchaseProlongationZKType>(_FcsPurchaseProlongationZK_QNAME, ZfcsPurchaseProlongationZKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationOKOUType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationOKOU")
    public JAXBElement<ZfcsNotificationOKOUType> createFcsNotificationOKOU(ZfcsNotificationOKOUType value) {
        return new JAXBElement<ZfcsNotificationOKOUType>(_FcsNotificationOKOU_QNAME, ZfcsNotificationOKOUType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationPOType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationPO")
    public JAXBElement<ZfcsNotificationPOType> createFcsNotificationPO(ZfcsNotificationPOType value) {
        return new JAXBElement<ZfcsNotificationPOType>(_FcsNotificationPO_QNAME, ZfcsNotificationPOType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsComplaintType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "complaint")
    public JAXBElement<ZfcsComplaintType> createComplaint(ZfcsComplaintType value) {
        return new JAXBElement<ZfcsComplaintType>(_Complaint_QNAME, ZfcsComplaintType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsCustomerReportSingleContractorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsCustomerReportSingleContractor")
    public JAXBElement<ZfcsCustomerReportSingleContractorType> createFcsCustomerReportSingleContractor(ZfcsCustomerReportSingleContractorType value) {
        return new JAXBElement<ZfcsCustomerReportSingleContractorType>(_FcsCustomerReportSingleContractor_QNAME, ZfcsCustomerReportSingleContractorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsCustomerReportContractExecutionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsCustomerReportContractExecution")
    public JAXBElement<ZfcsCustomerReportContractExecutionType> createFcsCustomerReportContractExecution(ZfcsCustomerReportContractExecutionType value) {
        return new JAXBElement<ZfcsCustomerReportContractExecutionType>(_FcsCustomerReportContractExecution_QNAME, ZfcsCustomerReportContractExecutionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsBankGuaranteeRefusalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "bankGuaranteeRefusal")
    public JAXBElement<ZfcsBankGuaranteeRefusalType> createBankGuaranteeRefusal(ZfcsBankGuaranteeRefusalType value) {
        return new JAXBElement<ZfcsBankGuaranteeRefusalType>(_BankGuaranteeRefusal_QNAME, ZfcsBankGuaranteeRefusalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationLotCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationLotCancel")
    public JAXBElement<ZfcsNotificationLotCancelType> createFcsNotificationLotCancel(ZfcsNotificationLotCancelType value) {
        return new JAXBElement<ZfcsNotificationLotCancelType>(_FcsNotificationLotCancel_QNAME, ZfcsNotificationLotCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsUnplannedCheckCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "unplannedCheckCancel")
    public JAXBElement<ZfcsUnplannedCheckCancelType> createUnplannedCheckCancel(ZfcsUnplannedCheckCancelType value) {
        return new JAXBElement<ZfcsUnplannedCheckCancelType>(_UnplannedCheckCancel_QNAME, ZfcsUnplannedCheckCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsPurchaseApprovalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsPurchaseApproval")
    public JAXBElement<ZfcsPurchaseApprovalType> createFcsPurchaseApproval(ZfcsPurchaseApprovalType value) {
        return new JAXBElement<ZfcsPurchaseApprovalType>(_FcsPurchaseApproval_QNAME, ZfcsPurchaseApprovalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZakAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/printform/1", name = "fcsNotificationZakA")
    public JAXBElement<ZfcsNotificationZakAType> createFcsNotificationZakA(ZfcsNotificationZakAType value) {
        return new JAXBElement<ZfcsNotificationZakAType>(_FcsNotificationZakA_QNAME, ZfcsNotificationZakAType.class, null, value);
    }

}

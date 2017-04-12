//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:53:38 AM MSK 
//


package ru.gov.zakupki.oos.extegration._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.gov.zakupki.oos.types._1.ClarificationType;
import ru.gov.zakupki.oos.types._1.NotificationCancelType;
import ru.gov.zakupki.oos.types._1.NotificationEFType;
import ru.gov.zakupki.oos.types._1.NotificationOKType;
import ru.gov.zakupki.oos.types._1.NotificationPOType;
import ru.gov.zakupki.oos.types._1.NotificationPlacerChangeType;
import ru.gov.zakupki.oos.types._1.NotificationSZType;
import ru.gov.zakupki.oos.types._1.NotificationZKType;
import ru.gov.zakupki.oos.types._1.PlacementResultType;
import ru.gov.zakupki.oos.types._1.ProtocolEvasionType;
import ru.gov.zakupki.oos.types._1.ProtocolOK1Type;
import ru.gov.zakupki.oos.types._1.ProtocolOK2Type;
import ru.gov.zakupki.oos.types._1.ProtocolOK3Type;
import ru.gov.zakupki.oos.types._1.ProtocolPO1Type;
import ru.gov.zakupki.oos.types._1.ProtocolZK1Type;
import ru.gov.zakupki.oos.types._1.ProtocolZK5Type;
import ru.gov.zakupki.oos.types._1.ZfcsBankGuaranteeRefusalType;
import ru.gov.zakupki.oos.types._1.ZfcsBankGuaranteeType;
import ru.gov.zakupki.oos.types._1.ZfcsClarificationType;
import ru.gov.zakupki.oos.types._1.ZfcsConfirmationType;
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
import ru.gov.zakupki.oos.types._1.ZfcsProtocolCancelType;
import ru.gov.zakupki.oos.types._1.ZfcsProtocolZKAfterProlongType;
import ru.gov.zakupki.oos.types._1.ZfcsProtocolZKType;
import ru.gov.zakupki.oos.types._1.ZfcsPurchaseDocumentCancelType;
import ru.gov.zakupki.oos.types._1.ZfcsPurchaseDocumentType;
import ru.gov.zakupki.oos.types._1.ZfcsPurchaseProlongationOKType;
import ru.gov.zakupki.oos.types._1.ZfcsPurchaseProlongationZKType;
import ru.gov.zakupki.oos.types._1.ZfcsSketchPlanExecutionType;
import ru.gov.zakupki.oos.types._1.ZfcsSketchPlanType;
import ru.gov.zakupki.oos.types._1.ZfcsTenderPlanChangeType;
import ru.gov.zakupki.oos.types._1.ZfcsTenderPlanType;
import ru.gov.zakupki.oos.types._1.ZfcsTenderPlanUnstructuredType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gov.zakupki.oos.extegration._1 package. 
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

    private final static QName _NotificationPO_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "notificationPO");
    private final static QName _FcsPurchaseProlongationZK_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsPurchaseProlongationZK");
    private final static QName _FcsNotificationZakK_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationZakK");
    private final static QName _FcsProtocolCancel_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsProtocolCancel");
    private final static QName _FcsNotificationPO_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationPO");
    private final static QName _FcsNotificationOKOU_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationOKOU");
    private final static QName _ProtocolPO1_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "protocolPO1");
    private final static QName _NotificationOK_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "notificationOK");
    private final static QName _FcsNotificationLotCancel_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationLotCancel");
    private final static QName _BankGuaranteeRefusal_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "bankGuaranteeRefusal");
    private final static QName _Clarification_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "clarification");
    private final static QName _NotificationCancel_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "notificationCancel");
    private final static QName _FcsNotificationZakA_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationZakA");
    private final static QName _ContractProcedureCancel_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "contractProcedureCancel");
    private final static QName _FcsProtocolZKAfterProlong_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsProtocolZKAfterProlong");
    private final static QName _FcsNotificationOKD_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationOKD");
    private final static QName _ProtocolEvasion_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "protocolEvasion");
    private final static QName _FcsNotificationLotChange_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationLotChange");
    private final static QName _FcsPurchaseProlongationOK_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsPurchaseProlongationOK");
    private final static QName _ProtocolOK3_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "protocolOK3");
    private final static QName _ProtocolOK2_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "protocolOK2");
    private final static QName _ProtocolOK1_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "protocolOK1");
    private final static QName _FcsNotificationCancel_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationCancel");
    private final static QName _SketchPlanExecution_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "sketchPlanExecution");
    private final static QName _FcsNotificationZK_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationZK");
    private final static QName _FcsNotificationZP_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationZP");
    private final static QName _ContractProcedure_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "contractProcedure");
    private final static QName _NotificationZK_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "notificationZK");
    private final static QName _TenderPlan_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "tenderPlan");
    private final static QName _FcsProtocolZK_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsProtocolZK");
    private final static QName _FcsPurchaseDocument_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsPurchaseDocument");
    private final static QName _TenderPlanChange_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "tenderPlanChange");
    private final static QName _PlacementResult_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "placementResult");
    private final static QName _NotificationPlacerChange_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "notificationPlacerChange");
    private final static QName _FcsPurchaseDocumentCancel_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsPurchaseDocumentCancel");
    private final static QName _TenderPlanUnstructured_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "tenderPlanUnstructured");
    private final static QName _SketchPlan_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "sketchPlan");
    private final static QName _FcsNotificationZKBI_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationZKBI");
    private final static QName _FcsClarification_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsClarification");
    private final static QName _NotificationSZ_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "notificationSZ");
    private final static QName _FcsNotificationOK_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationOK");
    private final static QName _ProtocolZK1_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "protocolZK1");
    private final static QName _ProtocolZK5_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "protocolZK5");
    private final static QName _FcsNotificationISO_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationISO");
    private final static QName _BankGuarantee_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "bankGuarantee");
    private final static QName _FcsNotificationISM_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationISM");
    private final static QName _FcsNotificationZakKOU_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationZakKOU");
    private final static QName _NotificationEF_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "notificationEF");
    private final static QName _FcsNotificationZakKD_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationZakKD");
    private final static QName _Contract_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "contract");
    private final static QName _FcsNotificationEP_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationEP");
    private final static QName _Confirmation_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "confirmation");
    private final static QName _FcsNotificationEF_QNAME = new QName("http://zakupki.gov.ru/oos/extegration/1", "fcsNotificationEF");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gov.zakupki.oos.extegration._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationPOType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "notificationPO")
    public JAXBElement<NotificationPOType> createNotificationPO(NotificationPOType value) {
        return new JAXBElement<NotificationPOType>(_NotificationPO_QNAME, NotificationPOType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsPurchaseProlongationZKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsPurchaseProlongationZK")
    public JAXBElement<ZfcsPurchaseProlongationZKType> createFcsPurchaseProlongationZK(ZfcsPurchaseProlongationZKType value) {
        return new JAXBElement<ZfcsPurchaseProlongationZKType>(_FcsPurchaseProlongationZK_QNAME, ZfcsPurchaseProlongationZKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZakKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationZakK")
    public JAXBElement<ZfcsNotificationZakKType> createFcsNotificationZakK(ZfcsNotificationZakKType value) {
        return new JAXBElement<ZfcsNotificationZakKType>(_FcsNotificationZakK_QNAME, ZfcsNotificationZakKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsProtocolCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsProtocolCancel")
    public JAXBElement<ZfcsProtocolCancelType> createFcsProtocolCancel(ZfcsProtocolCancelType value) {
        return new JAXBElement<ZfcsProtocolCancelType>(_FcsProtocolCancel_QNAME, ZfcsProtocolCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationPOType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationPO")
    public JAXBElement<ZfcsNotificationPOType> createFcsNotificationPO(ZfcsNotificationPOType value) {
        return new JAXBElement<ZfcsNotificationPOType>(_FcsNotificationPO_QNAME, ZfcsNotificationPOType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationOKOUType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationOKOU")
    public JAXBElement<ZfcsNotificationOKOUType> createFcsNotificationOKOU(ZfcsNotificationOKOUType value) {
        return new JAXBElement<ZfcsNotificationOKOUType>(_FcsNotificationOKOU_QNAME, ZfcsNotificationOKOUType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolPO1Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "protocolPO1")
    public JAXBElement<ProtocolPO1Type> createProtocolPO1(ProtocolPO1Type value) {
        return new JAXBElement<ProtocolPO1Type>(_ProtocolPO1_QNAME, ProtocolPO1Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationOKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "notificationOK")
    public JAXBElement<NotificationOKType> createNotificationOK(NotificationOKType value) {
        return new JAXBElement<NotificationOKType>(_NotificationOK_QNAME, NotificationOKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationLotCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationLotCancel")
    public JAXBElement<ZfcsNotificationLotCancelType> createFcsNotificationLotCancel(ZfcsNotificationLotCancelType value) {
        return new JAXBElement<ZfcsNotificationLotCancelType>(_FcsNotificationLotCancel_QNAME, ZfcsNotificationLotCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsBankGuaranteeRefusalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "bankGuaranteeRefusal")
    public JAXBElement<ZfcsBankGuaranteeRefusalType> createBankGuaranteeRefusal(ZfcsBankGuaranteeRefusalType value) {
        return new JAXBElement<ZfcsBankGuaranteeRefusalType>(_BankGuaranteeRefusal_QNAME, ZfcsBankGuaranteeRefusalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClarificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "clarification")
    public JAXBElement<ClarificationType> createClarification(ClarificationType value) {
        return new JAXBElement<ClarificationType>(_Clarification_QNAME, ClarificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "notificationCancel")
    public JAXBElement<NotificationCancelType> createNotificationCancel(NotificationCancelType value) {
        return new JAXBElement<NotificationCancelType>(_NotificationCancel_QNAME, NotificationCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZakAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationZakA")
    public JAXBElement<ZfcsNotificationZakAType> createFcsNotificationZakA(ZfcsNotificationZakAType value) {
        return new JAXBElement<ZfcsNotificationZakAType>(_FcsNotificationZakA_QNAME, ZfcsNotificationZakAType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsContractProcedureCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "contractProcedureCancel")
    public JAXBElement<ZfcsContractProcedureCancelType> createContractProcedureCancel(ZfcsContractProcedureCancelType value) {
        return new JAXBElement<ZfcsContractProcedureCancelType>(_ContractProcedureCancel_QNAME, ZfcsContractProcedureCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsProtocolZKAfterProlongType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsProtocolZKAfterProlong")
    public JAXBElement<ZfcsProtocolZKAfterProlongType> createFcsProtocolZKAfterProlong(ZfcsProtocolZKAfterProlongType value) {
        return new JAXBElement<ZfcsProtocolZKAfterProlongType>(_FcsProtocolZKAfterProlong_QNAME, ZfcsProtocolZKAfterProlongType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationOKDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationOKD")
    public JAXBElement<ZfcsNotificationOKDType> createFcsNotificationOKD(ZfcsNotificationOKDType value) {
        return new JAXBElement<ZfcsNotificationOKDType>(_FcsNotificationOKD_QNAME, ZfcsNotificationOKDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolEvasionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "protocolEvasion")
    public JAXBElement<ProtocolEvasionType> createProtocolEvasion(ProtocolEvasionType value) {
        return new JAXBElement<ProtocolEvasionType>(_ProtocolEvasion_QNAME, ProtocolEvasionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationLotChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationLotChange")
    public JAXBElement<ZfcsNotificationLotChangeType> createFcsNotificationLotChange(ZfcsNotificationLotChangeType value) {
        return new JAXBElement<ZfcsNotificationLotChangeType>(_FcsNotificationLotChange_QNAME, ZfcsNotificationLotChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsPurchaseProlongationOKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsPurchaseProlongationOK")
    public JAXBElement<ZfcsPurchaseProlongationOKType> createFcsPurchaseProlongationOK(ZfcsPurchaseProlongationOKType value) {
        return new JAXBElement<ZfcsPurchaseProlongationOKType>(_FcsPurchaseProlongationOK_QNAME, ZfcsPurchaseProlongationOKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolOK3Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "protocolOK3")
    public JAXBElement<ProtocolOK3Type> createProtocolOK3(ProtocolOK3Type value) {
        return new JAXBElement<ProtocolOK3Type>(_ProtocolOK3_QNAME, ProtocolOK3Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolOK2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "protocolOK2")
    public JAXBElement<ProtocolOK2Type> createProtocolOK2(ProtocolOK2Type value) {
        return new JAXBElement<ProtocolOK2Type>(_ProtocolOK2_QNAME, ProtocolOK2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolOK1Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "protocolOK1")
    public JAXBElement<ProtocolOK1Type> createProtocolOK1(ProtocolOK1Type value) {
        return new JAXBElement<ProtocolOK1Type>(_ProtocolOK1_QNAME, ProtocolOK1Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationCancel")
    public JAXBElement<ZfcsNotificationCancelType> createFcsNotificationCancel(ZfcsNotificationCancelType value) {
        return new JAXBElement<ZfcsNotificationCancelType>(_FcsNotificationCancel_QNAME, ZfcsNotificationCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsSketchPlanExecutionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "sketchPlanExecution")
    public JAXBElement<ZfcsSketchPlanExecutionType> createSketchPlanExecution(ZfcsSketchPlanExecutionType value) {
        return new JAXBElement<ZfcsSketchPlanExecutionType>(_SketchPlanExecution_QNAME, ZfcsSketchPlanExecutionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationZK")
    public JAXBElement<ZfcsNotificationZKType> createFcsNotificationZK(ZfcsNotificationZKType value) {
        return new JAXBElement<ZfcsNotificationZKType>(_FcsNotificationZK_QNAME, ZfcsNotificationZKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationZP")
    public JAXBElement<ZfcsNotificationZPType> createFcsNotificationZP(ZfcsNotificationZPType value) {
        return new JAXBElement<ZfcsNotificationZPType>(_FcsNotificationZP_QNAME, ZfcsNotificationZPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsContractProcedureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "contractProcedure")
    public JAXBElement<ZfcsContractProcedureType> createContractProcedure(ZfcsContractProcedureType value) {
        return new JAXBElement<ZfcsContractProcedureType>(_ContractProcedure_QNAME, ZfcsContractProcedureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationZKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "notificationZK")
    public JAXBElement<NotificationZKType> createNotificationZK(NotificationZKType value) {
        return new JAXBElement<NotificationZKType>(_NotificationZK_QNAME, NotificationZKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsTenderPlanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "tenderPlan")
    public JAXBElement<ZfcsTenderPlanType> createTenderPlan(ZfcsTenderPlanType value) {
        return new JAXBElement<ZfcsTenderPlanType>(_TenderPlan_QNAME, ZfcsTenderPlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsProtocolZKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsProtocolZK")
    public JAXBElement<ZfcsProtocolZKType> createFcsProtocolZK(ZfcsProtocolZKType value) {
        return new JAXBElement<ZfcsProtocolZKType>(_FcsProtocolZK_QNAME, ZfcsProtocolZKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsPurchaseDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsPurchaseDocument")
    public JAXBElement<ZfcsPurchaseDocumentType> createFcsPurchaseDocument(ZfcsPurchaseDocumentType value) {
        return new JAXBElement<ZfcsPurchaseDocumentType>(_FcsPurchaseDocument_QNAME, ZfcsPurchaseDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsTenderPlanChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "tenderPlanChange")
    public JAXBElement<ZfcsTenderPlanChangeType> createTenderPlanChange(ZfcsTenderPlanChangeType value) {
        return new JAXBElement<ZfcsTenderPlanChangeType>(_TenderPlanChange_QNAME, ZfcsTenderPlanChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacementResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "placementResult")
    public JAXBElement<PlacementResultType> createPlacementResult(PlacementResultType value) {
        return new JAXBElement<PlacementResultType>(_PlacementResult_QNAME, PlacementResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationPlacerChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "notificationPlacerChange")
    public JAXBElement<NotificationPlacerChangeType> createNotificationPlacerChange(NotificationPlacerChangeType value) {
        return new JAXBElement<NotificationPlacerChangeType>(_NotificationPlacerChange_QNAME, NotificationPlacerChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsPurchaseDocumentCancelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsPurchaseDocumentCancel")
    public JAXBElement<ZfcsPurchaseDocumentCancelType> createFcsPurchaseDocumentCancel(ZfcsPurchaseDocumentCancelType value) {
        return new JAXBElement<ZfcsPurchaseDocumentCancelType>(_FcsPurchaseDocumentCancel_QNAME, ZfcsPurchaseDocumentCancelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsTenderPlanUnstructuredType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "tenderPlanUnstructured")
    public JAXBElement<ZfcsTenderPlanUnstructuredType> createTenderPlanUnstructured(ZfcsTenderPlanUnstructuredType value) {
        return new JAXBElement<ZfcsTenderPlanUnstructuredType>(_TenderPlanUnstructured_QNAME, ZfcsTenderPlanUnstructuredType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsSketchPlanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "sketchPlan")
    public JAXBElement<ZfcsSketchPlanType> createSketchPlan(ZfcsSketchPlanType value) {
        return new JAXBElement<ZfcsSketchPlanType>(_SketchPlan_QNAME, ZfcsSketchPlanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZKBIType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationZKBI")
    public JAXBElement<ZfcsNotificationZKBIType> createFcsNotificationZKBI(ZfcsNotificationZKBIType value) {
        return new JAXBElement<ZfcsNotificationZKBIType>(_FcsNotificationZKBI_QNAME, ZfcsNotificationZKBIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsClarificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsClarification")
    public JAXBElement<ZfcsClarificationType> createFcsClarification(ZfcsClarificationType value) {
        return new JAXBElement<ZfcsClarificationType>(_FcsClarification_QNAME, ZfcsClarificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationSZType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "notificationSZ")
    public JAXBElement<NotificationSZType> createNotificationSZ(NotificationSZType value) {
        return new JAXBElement<NotificationSZType>(_NotificationSZ_QNAME, NotificationSZType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationOKType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationOK")
    public JAXBElement<ZfcsNotificationOKType> createFcsNotificationOK(ZfcsNotificationOKType value) {
        return new JAXBElement<ZfcsNotificationOKType>(_FcsNotificationOK_QNAME, ZfcsNotificationOKType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolZK1Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "protocolZK1")
    public JAXBElement<ProtocolZK1Type> createProtocolZK1(ProtocolZK1Type value) {
        return new JAXBElement<ProtocolZK1Type>(_ProtocolZK1_QNAME, ProtocolZK1Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolZK5Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "protocolZK5")
    public JAXBElement<ProtocolZK5Type> createProtocolZK5(ProtocolZK5Type value) {
        return new JAXBElement<ProtocolZK5Type>(_ProtocolZK5_QNAME, ProtocolZK5Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationISOType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationISO")
    public JAXBElement<ZfcsNotificationISOType> createFcsNotificationISO(ZfcsNotificationISOType value) {
        return new JAXBElement<ZfcsNotificationISOType>(_FcsNotificationISO_QNAME, ZfcsNotificationISOType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsBankGuaranteeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "bankGuarantee")
    public JAXBElement<ZfcsBankGuaranteeType> createBankGuarantee(ZfcsBankGuaranteeType value) {
        return new JAXBElement<ZfcsBankGuaranteeType>(_BankGuarantee_QNAME, ZfcsBankGuaranteeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationISMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationISM")
    public JAXBElement<ZfcsNotificationISMType> createFcsNotificationISM(ZfcsNotificationISMType value) {
        return new JAXBElement<ZfcsNotificationISMType>(_FcsNotificationISM_QNAME, ZfcsNotificationISMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZakKOUType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationZakKOU")
    public JAXBElement<ZfcsNotificationZakKOUType> createFcsNotificationZakKOU(ZfcsNotificationZakKOUType value) {
        return new JAXBElement<ZfcsNotificationZakKOUType>(_FcsNotificationZakKOU_QNAME, ZfcsNotificationZakKOUType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationEFType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "notificationEF")
    public JAXBElement<NotificationEFType> createNotificationEF(NotificationEFType value) {
        return new JAXBElement<NotificationEFType>(_NotificationEF_QNAME, NotificationEFType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationZakKDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationZakKD")
    public JAXBElement<ZfcsNotificationZakKDType> createFcsNotificationZakKD(ZfcsNotificationZakKDType value) {
        return new JAXBElement<ZfcsNotificationZakKDType>(_FcsNotificationZakKD_QNAME, ZfcsNotificationZakKDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsContractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "contract")
    public JAXBElement<ZfcsContractType> createContract(ZfcsContractType value) {
        return new JAXBElement<ZfcsContractType>(_Contract_QNAME, ZfcsContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationEPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationEP")
    public JAXBElement<ZfcsNotificationEPType> createFcsNotificationEP(ZfcsNotificationEPType value) {
        return new JAXBElement<ZfcsNotificationEPType>(_FcsNotificationEP_QNAME, ZfcsNotificationEPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsConfirmationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "confirmation")
    public JAXBElement<ZfcsConfirmationType> createConfirmation(ZfcsConfirmationType value) {
        return new JAXBElement<ZfcsConfirmationType>(_Confirmation_QNAME, ZfcsConfirmationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZfcsNotificationEFType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zakupki.gov.ru/oos/extegration/1", name = "fcsNotificationEF")
    public JAXBElement<ZfcsNotificationEFType> createFcsNotificationEF(ZfcsNotificationEFType value) {
        return new JAXBElement<ZfcsNotificationEFType>(_FcsNotificationEF_QNAME, ZfcsNotificationEFType.class, null, value);
    }

}

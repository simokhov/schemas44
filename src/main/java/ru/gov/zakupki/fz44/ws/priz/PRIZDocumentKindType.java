//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.fz44.ws.priz;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRIZDocumentKindType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PRIZDocumentKindType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fcsNotificationEF"/>
 *     &lt;enumeration value="fcsProtocolEF1"/>
 *     &lt;enumeration value="fcsProtocolEF2"/>
 *     &lt;enumeration value="fcsProtocolEF3"/>
 *     &lt;enumeration value="fcsProtocolEFSingleApp"/>
 *     &lt;enumeration value="fcsProtocolEFSinglePart"/>
 *     &lt;enumeration value="fcsProtocolEFInvalidation"/>
 *     &lt;enumeration value="fcsNotificationEP"/>
 *     &lt;enumeration value="fcsNotificationOK"/>
 *     &lt;enumeration value="fcsNotification111"/>
 *     &lt;enumeration value="fcsPurchaseProlongationOK"/>
 *     &lt;enumeration value="fcsProtocolOK1"/>
 *     &lt;enumeration value="fcsProtocolOK2"/>
 *     &lt;enumeration value="fcsProtocolOKSingleApp"/>
 *     &lt;enumeration value="fcsNotificationOKD"/>
 *     &lt;enumeration value="fcsProtocolOKD1"/>
 *     &lt;enumeration value="fcsProtocolOKD2"/>
 *     &lt;enumeration value="fcsProtocolOKD3"/>
 *     &lt;enumeration value="fcsProtocolOKD4"/>
 *     &lt;enumeration value="fcsProtocolOKD5"/>
 *     &lt;enumeration value="fcsProtocolOKDSingleApp"/>
 *     &lt;enumeration value="fcsNotificationOKOU"/>
 *     &lt;enumeration value="fcsProtocolOKOU1"/>
 *     &lt;enumeration value="fcsProtocolOKOU2"/>
 *     &lt;enumeration value="fcsProtocolOKOU3"/>
 *     &lt;enumeration value="fcsProtocolOKOUSingleApp"/>
 *     &lt;enumeration value="fcsNotificationPO"/>
 *     &lt;enumeration value="fcsProtocolPO"/>
 *     &lt;enumeration value="fcsNotificationZakA"/>
 *     &lt;enumeration value="fcsNotificationZakK"/>
 *     &lt;enumeration value="fcsNotificationZakKD"/>
 *     &lt;enumeration value="fcsNotificationZakKOU"/>
 *     &lt;enumeration value="fcsNotificationZKBI"/>
 *     &lt;enumeration value="fcsNotificationZK"/>
 *     &lt;enumeration value="fcsPurchaseProlongationZK"/>
 *     &lt;enumeration value="fcsProtocolZK"/>
 *     &lt;enumeration value="fcsProtocolZKAfterProlong"/>
 *     &lt;enumeration value="fcsNotificationZP"/>
 *     &lt;enumeration value="fcsProtocolZPExtract"/>
 *     &lt;enumeration value="fcsProtocolZP"/>
 *     &lt;enumeration value="fcsProtocolZPFinal"/>
 *     &lt;enumeration value="fcsProtocolCancel"/>
 *     &lt;enumeration value="fcsNotificationLotCancel"/>
 *     &lt;enumeration value="fcsNotificationCancel"/>
 *     &lt;enumeration value="fcsNotificationCancelFailure"/>
 *     &lt;enumeration value="fcsNotificationOrgChange"/>
 *     &lt;enumeration value="fcsProtocolEvasion"/>
 *     &lt;enumeration value="fcsProtocolDeviation"/>
 *     &lt;enumeration value="fcsNotificationEFDateChange"/>
 *     &lt;enumeration value="fcsClarification"/>
 *     &lt;enumeration value="fcsClarificationRequest"/>
 *     &lt;enumeration value="fcsContractSign"/>
 *     &lt;enumeration value="fcsPurchaseDocument"/>
 *     &lt;enumeration value="fcsPurchaseDocumentCancel"/>
 *     &lt;enumeration value="control99BeginMessage"/>
 *     &lt;enumeration value="control99RefusalMessage"/>
 *     &lt;enumeration value="control99NoticeCompliance"/>
 *     &lt;enumeration value="control99ProtocolMismatch"/>
 *     &lt;enumeration value="control99ProtocolMismatchReductFunds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PRIZDocumentKindType")
@XmlEnum
public enum PRIZDocumentKindType {


    /**
     * Извещение о проведении ЭА (электронный аукцион)
     * 
     */
    @XmlEnumValue("fcsNotificationEF")
    FCS_NOTIFICATION_EF("fcsNotificationEF"),

    /**
     * Протокол рассмотрения заявок на участие в электронном аукционе
     * 
     */
    @XmlEnumValue("fcsProtocolEF1")
    FCS_PROTOCOL_EF_1("fcsProtocolEF1"),

    /**
     * Протокол проведения электронного аукциона
     * 
     */
    @XmlEnumValue("fcsProtocolEF2")
    FCS_PROTOCOL_EF_2("fcsProtocolEF2"),

    /**
     * Протокол подведения итогов электронного аукциона
     * 
     */
    @XmlEnumValue("fcsProtocolEF3")
    FCS_PROTOCOL_EF_3("fcsProtocolEF3"),

    /**
     * Протокол рассмотрения единственной заявки на участие в электронном аукционе
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolEFSingleApp")
    FCS_PROTOCOL_EF_SINGLE_APP("fcsProtocolEFSingleApp"),

    /**
     * Протокол рассмотрения заявки единственного участника электронного аукциона
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolEFSinglePart")
    FCS_PROTOCOL_EF_SINGLE_PART("fcsProtocolEFSinglePart"),

    /**
     * Протокол о признании электронного аукциона несостоявшимся
     * 
     */
    @XmlEnumValue("fcsProtocolEFInvalidation")
    FCS_PROTOCOL_EF_INVALIDATION("fcsProtocolEFInvalidation"),

    /**
     * Извещение о проведении закупки у ЕП (единственного поставщика)
     * 
     */
    @XmlEnumValue("fcsNotificationEP")
    FCS_NOTIFICATION_EP("fcsNotificationEP"),

    /**
     * Извещение о проведении OK (открытый конкурс)
     * 
     */
    @XmlEnumValue("fcsNotificationOK")
    FCS_NOTIFICATION_OK("fcsNotificationOK"),

    /**
     * Извещение о проведении закупки способом определения поставщика (подрядчика, исполнителя), 
     * установленным Правительством Российской Федерации в соответствии со ст. 111 Федерального закона № 44-ФЗ
     * 
     */
    @XmlEnumValue("fcsNotification111")
    FCS_NOTIFICATION_111("fcsNotification111"),

    /**
     * Уведомление о продлении срока рассмотрения и оценки заявок ОК
     * 
     */
    @XmlEnumValue("fcsPurchaseProlongationOK")
    FCS_PURCHASE_PROLONGATION_OK("fcsPurchaseProlongationOK"),

    /**
     * Протокол вскрытия конвертов и открытия доступа к электронным документам заявок
     *                         участников в ОК
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolOK1")
    FCS_PROTOCOL_OK_1("fcsProtocolOK1"),

    /**
     * Протокол рассмотрения и оценки заявок на участие в конкурсе в ОК
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolOK2")
    FCS_PROTOCOL_OK_2("fcsProtocolOK2"),

    /**
     * Протокол рассмотрения единственной заявки в ОК
     * 
     */
    @XmlEnumValue("fcsProtocolOKSingleApp")
    FCS_PROTOCOL_OK_SINGLE_APP("fcsProtocolOKSingleApp"),

    /**
     * Извещение о проведении OK-Д (двухэтапный конкурс)
     * 
     */
    @XmlEnumValue("fcsNotificationOKD")
    FCS_NOTIFICATION_OKD("fcsNotificationOKD"),

    /**
     * Протокол вскрытия конвертов и открытия доступа к электронным документам
     *                         первоначальных заявок в ОК-Д
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolOKD1")
    FCS_PROTOCOL_OKD_1("fcsProtocolOKD1"),

    /**
     * Протокол предквалификационного отбора в ОК-Д
     * 
     */
    @XmlEnumValue("fcsProtocolOKD2")
    FCS_PROTOCOL_OKD_2("fcsProtocolOKD2"),

    /**
     * Протокол первого этапа в ОК-Д
     * 
     */
    @XmlEnumValue("fcsProtocolOKD3")
    FCS_PROTOCOL_OKD_3("fcsProtocolOKD3"),

    /**
     * Протокол вскрытия конвертов и открытия доступа к электронным документам
     *                         окончательных заявок в ОК-Д
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolOKD4")
    FCS_PROTOCOL_OKD_4("fcsProtocolOKD4"),

    /**
     * Протокол рассмотрения и оценки заявок на участие в конкурсе в ОК-Д
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolOKD5")
    FCS_PROTOCOL_OKD_5("fcsProtocolOKD5"),

    /**
     * Протокол рассмотрения единственной заявки в ОК-Д
     * 
     */
    @XmlEnumValue("fcsProtocolOKDSingleApp")
    FCS_PROTOCOL_OKD_SINGLE_APP("fcsProtocolOKDSingleApp"),

    /**
     * Извещение о проведении OK-ОУ (конкурс с ограниченным участием)
     * 
     */
    @XmlEnumValue("fcsNotificationOKOU")
    FCS_NOTIFICATION_OKOU("fcsNotificationOKOU"),

    /**
     * Протокол вскрытия конвертов и открытия доступа к электронным документам заявок
     *                         участников в ОК-ОУ
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolOKOU1")
    FCS_PROTOCOL_OKOU_1("fcsProtocolOKOU1"),

    /**
     * Протокол предквалификационного отбора в ОК-ОУ
     * 
     */
    @XmlEnumValue("fcsProtocolOKOU2")
    FCS_PROTOCOL_OKOU_2("fcsProtocolOKOU2"),

    /**
     * Протокол рассмотрения и оценки заявок на участие в конкурсе в ОК-ОУ
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolOKOU3")
    FCS_PROTOCOL_OKOU_3("fcsProtocolOKOU3"),

    /**
     * Протокол рассмотрения единственной заявки в ОК-ОУ
     * 
     */
    @XmlEnumValue("fcsProtocolOKOUSingleApp")
    FCS_PROTOCOL_OKOU_SINGLE_APP("fcsProtocolOKOUSingleApp"),

    /**
     * Извещение о проведении ПО (предварительный отбор)
     * 
     */
    @XmlEnumValue("fcsNotificationPO")
    FCS_NOTIFICATION_PO("fcsNotificationPO"),

    /**
     * Протокол предварительного отбора в ПО
     * 
     */
    @XmlEnumValue("fcsProtocolPO")
    FCS_PROTOCOL_PO("fcsProtocolPO"),

    /**
     * Извещение о проведении ЗакА (закрытый аукцион)
     * 
     */
    @XmlEnumValue("fcsNotificationZakA")
    FCS_NOTIFICATION_ZAK_A("fcsNotificationZakA"),

    /**
     * Извещение о проведении ЗакK (закрытый конкурс)
     * 
     */
    @XmlEnumValue("fcsNotificationZakK")
    FCS_NOTIFICATION_ZAK_K("fcsNotificationZakK"),

    /**
     * Извещение о проведении ЗакK-Д (закрытый двухэтапный конкурс)
     * 
     */
    @XmlEnumValue("fcsNotificationZakKD")
    FCS_NOTIFICATION_ZAK_KD("fcsNotificationZakKD"),

    /**
     * Извещение о проведении ЗакK-ОУ (закрытый конкурс с ограниченным участием)
     *                     
     * 
     */
    @XmlEnumValue("fcsNotificationZakKOU")
    FCS_NOTIFICATION_ZAK_KOU("fcsNotificationZakKOU"),

    /**
     * Общая информация об объекте закупки и протокол рассмотрения и оценки заявок на
     *                         участие в ЗК-БИ (запрос котировок без извещения)
     *                     
     * 
     */
    @XmlEnumValue("fcsNotificationZKBI")
    FCS_NOTIFICATION_ZKBI("fcsNotificationZKBI"),

    /**
     * Извещение о проведении ЗK (запрос котировок)
     * 
     */
    @XmlEnumValue("fcsNotificationZK")
    FCS_NOTIFICATION_ZK("fcsNotificationZK"),

    /**
     * Извещение о продлении срока подачи котировочных заявок в ЗК
     * 
     */
    @XmlEnumValue("fcsPurchaseProlongationZK")
    FCS_PURCHASE_PROLONGATION_ZK("fcsPurchaseProlongationZK"),

    /**
     * Протокол рассмотрения и оценки заявок в ЗК
     * 
     */
    @XmlEnumValue("fcsProtocolZK")
    FCS_PROTOCOL_ZK("fcsProtocolZK"),

    /**
     * Протокол рассмотрения и оценки заявок по результатам продления срока подачи заявок
     *                         в ЗК
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolZKAfterProlong")
    FCS_PROTOCOL_ZK_AFTER_PROLONG("fcsProtocolZKAfterProlong"),

    /**
     * Извещение о проведении ЗП (запроса предложений)
     * 
     */
    @XmlEnumValue("fcsNotificationZP")
    FCS_NOTIFICATION_ZP("fcsNotificationZP"),

    /**
     * ППротокол выписки из протокола проведения запроса предложений в ЗП
     *                     
     * 
     */
    @XmlEnumValue("fcsProtocolZPExtract")
    FCS_PROTOCOL_ZP_EXTRACT("fcsProtocolZPExtract"),

    /**
     * Протокол проведения запроса предложений в ЗП
     * 
     */
    @XmlEnumValue("fcsProtocolZP")
    FCS_PROTOCOL_ZP("fcsProtocolZP"),

    /**
     * Итоговый протокол в ЗП
     * 
     */
    @XmlEnumValue("fcsProtocolZPFinal")
    FCS_PROTOCOL_ZP_FINAL("fcsProtocolZPFinal"),

    /**
     * Информация об отмене протокола
     * 
     */
    @XmlEnumValue("fcsProtocolCancel")
    FCS_PROTOCOL_CANCEL("fcsProtocolCancel"),

    /**
     * Извещение об отмене определения поставщика (подрядчика, исполнителя) в части
     *                         лота
     *                     
     * 
     */
    @XmlEnumValue("fcsNotificationLotCancel")
    FCS_NOTIFICATION_LOT_CANCEL("fcsNotificationLotCancel"),

    /**
     * Извещение об отмене определения поставщика (подрядчика, исполнителя)
     *                     
     * 
     */
    @XmlEnumValue("fcsNotificationCancel")
    FCS_NOTIFICATION_CANCEL("fcsNotificationCancel"),

    /**
     * Отмена извещения об отмене определения поставщика (подрядчика, исполнителя) (в
     *                         части лота)
     *                     
     * 
     */
    @XmlEnumValue("fcsNotificationCancelFailure")
    FCS_NOTIFICATION_CANCEL_FAILURE("fcsNotificationCancelFailure"),

    /**
     * Уведомление об изменении организации, осуществляющей закупку
     * 
     */
    @XmlEnumValue("fcsNotificationOrgChange")
    FCS_NOTIFICATION_ORG_CHANGE("fcsNotificationOrgChange"),

    /**
     * Протокол отказа от заключения контракта
     * 
     */
    @XmlEnumValue("fcsProtocolEvasion")
    FCS_PROTOCOL_EVASION("fcsProtocolEvasion"),

    /**
     * Протокол признания участника уклонившимся от заключения контракта
     * 
     */
    @XmlEnumValue("fcsProtocolDeviation")
    FCS_PROTOCOL_DEVIATION("fcsProtocolDeviation"),

    /**
     * Уведомление об изменении даты и времени проведения электронного аукциона
     *                     
     * 
     */
    @XmlEnumValue("fcsNotificationEFDateChange")
    FCS_NOTIFICATION_EF_DATE_CHANGE("fcsNotificationEFDateChange"),

    /**
     * Разъяснения положений документации
     * 
     */
    @XmlEnumValue("fcsClarification")
    FCS_CLARIFICATION("fcsClarification"),

    /**
     * Запрос на разъяснения положений документации
     * 
     */
    @XmlEnumValue("fcsClarificationRequest")
    FCS_CLARIFICATION_REQUEST("fcsClarificationRequest"),

    /**
     * Информация о подписании контракта на электронной площадке
     * 
     */
    @XmlEnumValue("fcsContractSign")
    FCS_CONTRACT_SIGN("fcsContractSign"),

    /**
     * Информация о документе закупки
     * 
     */
    @XmlEnumValue("fcsPurchaseDocument")
    FCS_PURCHASE_DOCUMENT("fcsPurchaseDocument"),

    /**
     * Информация об отмене документа закупки
     * 
     */
    @XmlEnumValue("fcsPurchaseDocumentCancel")
    FCS_PURCHASE_DOCUMENT_CANCEL("fcsPurchaseDocumentCancel"),

    /**
     * Сообщение о начале контроля по 99 статье
     * 
     */
    @XmlEnumValue("control99BeginMessage")
    CONTROL_99_BEGIN_MESSAGE("control99BeginMessage"),

    /**
     * Сообщение об отказе в принятии на контроль по 99 статье
     * 
     */
    @XmlEnumValue("control99RefusalMessage")
    CONTROL_99_REFUSAL_MESSAGE("control99RefusalMessage"),

    /**
     * Уведомление о соответствии контролируемой информации
     * 
     */
    @XmlEnumValue("control99NoticeCompliance")
    CONTROL_99_NOTICE_COMPLIANCE("control99NoticeCompliance"),

    /**
     * Протокол о несоответствии контролируемой информации
     * 
     */
    @XmlEnumValue("control99ProtocolMismatch")
    CONTROL_99_PROTOCOL_MISMATCH("control99ProtocolMismatch"),

    /**
     * Протокол о несоответствии контролируемой информации  в связи с уменьшением средств
     * 
     */
    @XmlEnumValue("control99ProtocolMismatchReductFunds")
    CONTROL_99_PROTOCOL_MISMATCH_REDUCT_FUNDS("control99ProtocolMismatchReductFunds");
    private final String value;

    PRIZDocumentKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PRIZDocumentKindType fromValue(String v) {
        for (PRIZDocumentKindType c: PRIZDocumentKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

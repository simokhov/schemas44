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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Информация о внеплановой проверке в результате контроля
 * 
 * <p>Java class for zfcs_checkResultUnplannedCheckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkResultUnplannedCheckType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unplannedCheckNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckNumberType" minOccurs="0"/>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_controlRegistersRegNumberType" minOccurs="0"/>
 *         &lt;element name="checkSubjects" type="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckSubjectPlanType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/oos/types/1}zfcs_attachmentListType" minOccurs="0"/>
 *         &lt;element name="orders" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
 *                   &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
 *                   &lt;element name="singleCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="act" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultActType"/>
 *           &lt;element name="actPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="decision" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultDecisionType"/>
 *           &lt;element name="decisionPrescription" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResultPrescriptionType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="checkResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkResult.checkResultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_checkResultUnplannedCheckType", propOrder = {
    "unplannedCheckNumber",
    "regNumber",
    "checkSubjects",
    "info",
    "attachments",
    "orders",
    "objectOtherInfo",
    "act",
    "actPrescription",
    "decision",
    "decisionPrescription",
    "checkResult"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsEventResultCancelType.Base.UnplannedCheck.class,
    ru.gov.zakupki.oos.types._1.ZfcsEventResultCancelType.Base.UnplannedSurvey.class,
    ru.gov.zakupki.oos.types._1.ZfcsEventResultType.Base.UnplannedCheck.class,
    ru.gov.zakupki.oos.types._1.ZfcsEventResultType.Base.UnplannedSurvey.class
})
public class ZfcsCheckResultUnplannedCheckType {

    protected String unplannedCheckNumber;
    protected String regNumber;
    protected List<ZfcsUnplannedCheckSubjectPlanType> checkSubjects;
    protected String info;
    protected ZfcsAttachmentListType attachments;
    protected List<ZfcsCheckResultUnplannedCheckType.Orders> orders;
    protected String objectOtherInfo;
    protected ZfcsCheckResultActType act;
    protected ZfcsCheckResultPrescriptionType actPrescription;
    protected ZfcsCheckResultDecisionType decision;
    protected ZfcsCheckResultPrescriptionType decisionPrescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsCheckResultCheckResultType checkResult;

    /**
     * Gets the value of the unplannedCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnplannedCheckNumber() {
        return unplannedCheckNumber;
    }

    /**
     * Sets the value of the unplannedCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnplannedCheckNumber(String value) {
        this.unplannedCheckNumber = value;
    }

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the checkSubjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkSubjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckSubjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsUnplannedCheckSubjectPlanType }
     * 
     * 
     */
    public List<ZfcsUnplannedCheckSubjectPlanType> getCheckSubjects() {
        if (checkSubjects == null) {
            checkSubjects = new ArrayList<ZfcsUnplannedCheckSubjectPlanType>();
        }
        return this.checkSubjects;
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
     * Gets the value of the orders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZfcsCheckResultUnplannedCheckType.Orders }
     * 
     * 
     */
    public List<ZfcsCheckResultUnplannedCheckType.Orders> getOrders() {
        if (orders == null) {
            orders = new ArrayList<ZfcsCheckResultUnplannedCheckType.Orders>();
        }
        return this.orders;
    }

    /**
     * Gets the value of the objectOtherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectOtherInfo() {
        return objectOtherInfo;
    }

    /**
     * Sets the value of the objectOtherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectOtherInfo(String value) {
        this.objectOtherInfo = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultActType }
     *     
     */
    public ZfcsCheckResultActType getAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultActType }
     *     
     */
    public void setAct(ZfcsCheckResultActType value) {
        this.act = value;
    }

    /**
     * Gets the value of the actPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultPrescriptionType }
     *     
     */
    public ZfcsCheckResultPrescriptionType getActPrescription() {
        return actPrescription;
    }

    /**
     * Sets the value of the actPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultPrescriptionType }
     *     
     */
    public void setActPrescription(ZfcsCheckResultPrescriptionType value) {
        this.actPrescription = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultDecisionType }
     *     
     */
    public ZfcsCheckResultDecisionType getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultDecisionType }
     *     
     */
    public void setDecision(ZfcsCheckResultDecisionType value) {
        this.decision = value;
    }

    /**
     * Gets the value of the decisionPrescription property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultPrescriptionType }
     *     
     */
    public ZfcsCheckResultPrescriptionType getDecisionPrescription() {
        return decisionPrescription;
    }

    /**
     * Sets the value of the decisionPrescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultPrescriptionType }
     *     
     */
    public void setDecisionPrescription(ZfcsCheckResultPrescriptionType value) {
        this.decisionPrescription = value;
    }

    /**
     * Gets the value of the checkResult property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckResultCheckResultType }
     *     
     */
    public ZfcsCheckResultCheckResultType getCheckResult() {
        return checkResult;
    }

    /**
     * Sets the value of the checkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckResultCheckResultType }
     *     
     */
    public void setCheckResult(ZfcsCheckResultCheckResultType value) {
        this.checkResult = value;
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
     *         &lt;element name="purchase" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintPurchaseType"/>
     *         &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_complaintOrderType"/>
     *         &lt;element name="singleCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "purchase",
        "order",
        "singleCustomer"
    })
    public static class Orders {

        protected ZfcsComplaintPurchaseType purchase;
        protected ZfcsComplaintOrderType order;
        protected Boolean singleCustomer;

        /**
         * Gets the value of the purchase property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintPurchaseType }
         *     
         */
        public ZfcsComplaintPurchaseType getPurchase() {
            return purchase;
        }

        /**
         * Sets the value of the purchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintPurchaseType }
         *     
         */
        public void setPurchase(ZfcsComplaintPurchaseType value) {
            this.purchase = value;
        }

        /**
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsComplaintOrderType }
         *     
         */
        public ZfcsComplaintOrderType getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsComplaintOrderType }
         *     
         */
        public void setOrder(ZfcsComplaintOrderType value) {
            this.order = value;
        }

        /**
         * Gets the value of the singleCustomer property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSingleCustomer() {
            return singleCustomer;
        }

        /**
         * Sets the value of the singleCustomer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSingleCustomer(Boolean value) {
            this.singleCustomer = value;
        }

    }

}

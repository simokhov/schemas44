//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:02:32 PM MSK 
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Информация о плановой проверке в результате контроля
 * 
 * <p>Java class for zfcs_checkResultPlannedCheckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkResultPlannedCheckType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkNumberType" minOccurs="0"/>
 *         &lt;element name="regNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkSubjectPlanType" minOccurs="0"/>
 *         &lt;element name="orders" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckObjectType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                   &lt;element name="purchasePlacingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="objectOtherInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
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
@XmlType(name = "zfcs_checkResultPlannedCheckType", propOrder = {
    "checkNumber",
    "regNumber",
    "checkSubject",
    "orders",
    "objectOtherInfo",
    "info",
    "act",
    "actPrescription",
    "decision",
    "decisionPrescription",
    "checkResult"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsEventResultCancelType.Base.PlannedCheck.class,
    ru.gov.zakupki.oos.types._1.ZfcsEventResultCancelType.Base.PlannedSurvey.class,
    ru.gov.zakupki.oos.types._1.ZfcsEventResultType.Base.PlannedCheck.class,
    ru.gov.zakupki.oos.types._1.ZfcsEventResultType.Base.PlannedSurvey.class
})
public class ZfcsCheckResultPlannedCheckType {

    protected String checkNumber;
    protected String regNumber;
    protected ZfcsCheckSubjectPlanType checkSubject;
    protected List<ZfcsCheckResultPlannedCheckType.Orders> orders;
    protected String objectOtherInfo;
    @XmlElement(required = true)
    protected String info;
    protected ZfcsCheckResultActType act;
    protected ZfcsCheckResultPrescriptionType actPrescription;
    protected ZfcsCheckResultDecisionType decision;
    protected ZfcsCheckResultPrescriptionType decisionPrescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZfcsCheckResultCheckResultType checkResult;

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
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
     * Gets the value of the checkSubject property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckSubjectPlanType }
     *     
     */
    public ZfcsCheckSubjectPlanType getCheckSubject() {
        return checkSubject;
    }

    /**
     * Sets the value of the checkSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckSubjectPlanType }
     *     
     */
    public void setCheckSubject(ZfcsCheckSubjectPlanType value) {
        this.checkSubject = value;
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
     * {@link ZfcsCheckResultPlannedCheckType.Orders }
     * 
     * 
     */
    public List<ZfcsCheckResultPlannedCheckType.Orders> getOrders() {
        if (orders == null) {
            orders = new ArrayList<ZfcsCheckResultPlannedCheckType.Orders>();
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
     *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_unplannedCheckObjectType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="info" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
     *         &lt;element name="purchasePlacingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "info",
        "purchasePlacingDate"
    })
    public static class Orders
        extends ZfcsUnplannedCheckObjectType
    {

        protected String info;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar purchasePlacingDate;

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
         * Gets the value of the purchasePlacingDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPurchasePlacingDate() {
            return purchasePlacingDate;
        }

        /**
         * Sets the value of the purchasePlacingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPurchasePlacingDate(XMLGregorianCalendar value) {
            this.purchasePlacingDate = value;
        }

    }

}

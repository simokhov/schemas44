//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 11:02:43 AM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.PurchasePlan;
import ru.gov.zakupki.oos.signincoming._1.PurchasePlanChange;
import ru.gov.zakupki.oos.signincoming._1.PurchasePlanExecution;
import ru.gov.zakupki.oos.signincoming._1.PurchasePlanWithControl99NoticeCompliance;
import ru.gov.zakupki.oos.signincoming._1.SketchPlan;
import ru.gov.zakupki.oos.signincoming._1.SketchPlanExecution;


/**
 * <p>Java class for receiveRpzRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRpzRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="sketchPlan" type="{http://zakupki.gov.ru/oos/signIncoming/1}sketchPlan"/>
 *         &lt;element name="sketchPlanExecution" type="{http://zakupki.gov.ru/oos/signIncoming/1}sketchPlanExecution"/>
 *         &lt;element name="purchasePlan" type="{http://zakupki.gov.ru/oos/signIncoming/1}purchasePlan"/>
 *         &lt;element name="purchasePlanWithControl99NoticeCompliance" type="{http://zakupki.gov.ru/oos/signIncoming/1}purchasePlanWithControl99NoticeCompliance"/>
 *         &lt;element name="purchasePlanExecution" type="{http://zakupki.gov.ru/oos/signIncoming/1}purchasePlanExecution"/>
 *         &lt;element name="purchasePlanChange" type="{http://zakupki.gov.ru/oos/signIncoming/1}purchasePlanChange"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRpzRequestType", propOrder = {
    "sketchPlan",
    "sketchPlanExecution",
    "purchasePlan",
    "purchasePlanWithControl99NoticeCompliance",
    "purchasePlanExecution",
    "purchasePlanChange"
})
public class ReceiveRpzRequestType {

    protected SketchPlan sketchPlan;
    protected SketchPlanExecution sketchPlanExecution;
    protected PurchasePlan purchasePlan;
    protected PurchasePlanWithControl99NoticeCompliance purchasePlanWithControl99NoticeCompliance;
    protected PurchasePlanExecution purchasePlanExecution;
    protected PurchasePlanChange purchasePlanChange;

    /**
     * Gets the value of the sketchPlan property.
     * 
     * @return
     *     possible object is
     *     {@link SketchPlan }
     *     
     */
    public SketchPlan getSketchPlan() {
        return sketchPlan;
    }

    /**
     * Sets the value of the sketchPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link SketchPlan }
     *     
     */
    public void setSketchPlan(SketchPlan value) {
        this.sketchPlan = value;
    }

    /**
     * Gets the value of the sketchPlanExecution property.
     * 
     * @return
     *     possible object is
     *     {@link SketchPlanExecution }
     *     
     */
    public SketchPlanExecution getSketchPlanExecution() {
        return sketchPlanExecution;
    }

    /**
     * Sets the value of the sketchPlanExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SketchPlanExecution }
     *     
     */
    public void setSketchPlanExecution(SketchPlanExecution value) {
        this.sketchPlanExecution = value;
    }

    /**
     * Gets the value of the purchasePlan property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlan }
     *     
     */
    public PurchasePlan getPurchasePlan() {
        return purchasePlan;
    }

    /**
     * Sets the value of the purchasePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlan }
     *     
     */
    public void setPurchasePlan(PurchasePlan value) {
        this.purchasePlan = value;
    }

    /**
     * Gets the value of the purchasePlanWithControl99NoticeCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanWithControl99NoticeCompliance }
     *     
     */
    public PurchasePlanWithControl99NoticeCompliance getPurchasePlanWithControl99NoticeCompliance() {
        return purchasePlanWithControl99NoticeCompliance;
    }

    /**
     * Sets the value of the purchasePlanWithControl99NoticeCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanWithControl99NoticeCompliance }
     *     
     */
    public void setPurchasePlanWithControl99NoticeCompliance(PurchasePlanWithControl99NoticeCompliance value) {
        this.purchasePlanWithControl99NoticeCompliance = value;
    }

    /**
     * Gets the value of the purchasePlanExecution property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanExecution }
     *     
     */
    public PurchasePlanExecution getPurchasePlanExecution() {
        return purchasePlanExecution;
    }

    /**
     * Sets the value of the purchasePlanExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanExecution }
     *     
     */
    public void setPurchasePlanExecution(PurchasePlanExecution value) {
        this.purchasePlanExecution = value;
    }

    /**
     * Gets the value of the purchasePlanChange property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanChange }
     *     
     */
    public PurchasePlanChange getPurchasePlanChange() {
        return purchasePlanChange;
    }

    /**
     * Sets the value of the purchasePlanChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanChange }
     *     
     */
    public void setPurchasePlanChange(PurchasePlanChange value) {
        this.purchasePlanChange = value;
    }

}

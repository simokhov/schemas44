//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.TenderPlan;
import ru.gov.zakupki.oos.signincoming._1.TenderPlan2017;
import ru.gov.zakupki.oos.signincoming._1.TenderPlan2017WithControl99NoticeCompliance;
import ru.gov.zakupki.oos.signincoming._1.TenderPlanCancel;
import ru.gov.zakupki.oos.signincoming._1.TenderPlanChange;
import ru.gov.zakupki.oos.signincoming._1.TenderPlanChange2017;


/**
 * <p>Java class for receiveRpgRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receiveRpgRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="tenderPlan" type="{http://zakupki.gov.ru/oos/signIncoming/1}tenderPlan"/>
 *         &lt;element name="tenderPlan2017" type="{http://zakupki.gov.ru/oos/signIncoming/1}tenderPlan2017"/>
 *         &lt;element name="tenderPlanChange" type="{http://zakupki.gov.ru/oos/signIncoming/1}tenderPlanChange"/>
 *         &lt;element name="tenderPlanChange2017" type="{http://zakupki.gov.ru/oos/signIncoming/1}tenderPlanChange2017"/>
 *         &lt;element name="tenderPlanCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}tenderPlanCancel"/>
 *         &lt;element name="tenderPlan2017WithControl99NoticeCompliance" type="{http://zakupki.gov.ru/oos/signIncoming/1}tenderPlan2017WithControl99NoticeCompliance"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receiveRpgRequestType", propOrder = {
    "tenderPlan",
    "tenderPlan2017",
    "tenderPlanChange",
    "tenderPlanChange2017",
    "tenderPlanCancel",
    "tenderPlan2017WithControl99NoticeCompliance"
})
public class ReceiveRpgRequestType {

    protected TenderPlan tenderPlan;
    protected TenderPlan2017 tenderPlan2017;
    protected TenderPlanChange tenderPlanChange;
    protected TenderPlanChange2017 tenderPlanChange2017;
    protected TenderPlanCancel tenderPlanCancel;
    protected TenderPlan2017WithControl99NoticeCompliance tenderPlan2017WithControl99NoticeCompliance;

    /**
     * Gets the value of the tenderPlan property.
     * 
     * @return
     *     possible object is
     *     {@link TenderPlan }
     *     
     */
    public TenderPlan getTenderPlan() {
        return tenderPlan;
    }

    /**
     * Sets the value of the tenderPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderPlan }
     *     
     */
    public void setTenderPlan(TenderPlan value) {
        this.tenderPlan = value;
    }

    /**
     * Gets the value of the tenderPlan2017 property.
     * 
     * @return
     *     possible object is
     *     {@link TenderPlan2017 }
     *     
     */
    public TenderPlan2017 getTenderPlan2017() {
        return tenderPlan2017;
    }

    /**
     * Sets the value of the tenderPlan2017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderPlan2017 }
     *     
     */
    public void setTenderPlan2017(TenderPlan2017 value) {
        this.tenderPlan2017 = value;
    }

    /**
     * Gets the value of the tenderPlanChange property.
     * 
     * @return
     *     possible object is
     *     {@link TenderPlanChange }
     *     
     */
    public TenderPlanChange getTenderPlanChange() {
        return tenderPlanChange;
    }

    /**
     * Sets the value of the tenderPlanChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderPlanChange }
     *     
     */
    public void setTenderPlanChange(TenderPlanChange value) {
        this.tenderPlanChange = value;
    }

    /**
     * Gets the value of the tenderPlanChange2017 property.
     * 
     * @return
     *     possible object is
     *     {@link TenderPlanChange2017 }
     *     
     */
    public TenderPlanChange2017 getTenderPlanChange2017() {
        return tenderPlanChange2017;
    }

    /**
     * Sets the value of the tenderPlanChange2017 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderPlanChange2017 }
     *     
     */
    public void setTenderPlanChange2017(TenderPlanChange2017 value) {
        this.tenderPlanChange2017 = value;
    }

    /**
     * Gets the value of the tenderPlanCancel property.
     * 
     * @return
     *     possible object is
     *     {@link TenderPlanCancel }
     *     
     */
    public TenderPlanCancel getTenderPlanCancel() {
        return tenderPlanCancel;
    }

    /**
     * Sets the value of the tenderPlanCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderPlanCancel }
     *     
     */
    public void setTenderPlanCancel(TenderPlanCancel value) {
        this.tenderPlanCancel = value;
    }

    /**
     * Gets the value of the tenderPlan2017WithControl99NoticeCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link TenderPlan2017WithControl99NoticeCompliance }
     *     
     */
    public TenderPlan2017WithControl99NoticeCompliance getTenderPlan2017WithControl99NoticeCompliance() {
        return tenderPlan2017WithControl99NoticeCompliance;
    }

    /**
     * Sets the value of the tenderPlan2017WithControl99NoticeCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderPlan2017WithControl99NoticeCompliance }
     *     
     */
    public void setTenderPlan2017WithControl99NoticeCompliance(TenderPlan2017WithControl99NoticeCompliance value) {
        this.tenderPlan2017WithControl99NoticeCompliance = value;
    }

}

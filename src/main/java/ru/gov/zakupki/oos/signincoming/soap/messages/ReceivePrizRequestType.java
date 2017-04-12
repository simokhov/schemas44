//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:02:32 PM MSK 
//


package ru.gov.zakupki.oos.signincoming.soap.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.signincoming._1.Clarification;
import ru.gov.zakupki.oos.signincoming._1.NotificationCancel;
import ru.gov.zakupki.oos.signincoming._1.NotificationCancelFailure;
import ru.gov.zakupki.oos.signincoming._1.NotificationEF;
import ru.gov.zakupki.oos.signincoming._1.NotificationEFDateChange;
import ru.gov.zakupki.oos.signincoming._1.NotificationEP;
import ru.gov.zakupki.oos.signincoming._1.NotificationLotCancel;
import ru.gov.zakupki.oos.signincoming._1.NotificationLotChange;
import ru.gov.zakupki.oos.signincoming._1.NotificationOK;
import ru.gov.zakupki.oos.signincoming._1.NotificationOKD;
import ru.gov.zakupki.oos.signincoming._1.NotificationOKOU;
import ru.gov.zakupki.oos.signincoming._1.NotificationOrgChange;
import ru.gov.zakupki.oos.signincoming._1.NotificationPO;
import ru.gov.zakupki.oos.signincoming._1.NotificationZK;
import ru.gov.zakupki.oos.signincoming._1.NotificationZP;
import ru.gov.zakupki.oos.signincoming._1.NotificationZakA;
import ru.gov.zakupki.oos.signincoming._1.NotificationZakK;
import ru.gov.zakupki.oos.signincoming._1.NotificationZakKD;
import ru.gov.zakupki.oos.signincoming._1.NotificationZakKOU;
import ru.gov.zakupki.oos.signincoming._1.ProtocolCancel;
import ru.gov.zakupki.oos.signincoming._1.ProtocolDeviation;
import ru.gov.zakupki.oos.signincoming._1.ProtocolEvasion;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOK1;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOK2;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKD1;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKD2;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKD3;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKD4;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKD5;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKDSingleApp;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKOU1;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKOU2;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKOU3;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKOUSingleApp;
import ru.gov.zakupki.oos.signincoming._1.ProtocolOKSingleApp;
import ru.gov.zakupki.oos.signincoming._1.ProtocolPO;
import ru.gov.zakupki.oos.signincoming._1.ProtocolZK;
import ru.gov.zakupki.oos.signincoming._1.ProtocolZKAfterProlong;
import ru.gov.zakupki.oos.signincoming._1.ProtocolZKBI;
import ru.gov.zakupki.oos.signincoming._1.ProtocolZP;
import ru.gov.zakupki.oos.signincoming._1.ProtocolZPExtract;
import ru.gov.zakupki.oos.signincoming._1.ProtocolZPFinal;
import ru.gov.zakupki.oos.signincoming._1.PurchaseProlongationOK;
import ru.gov.zakupki.oos.signincoming._1.PurchaseProlongationZK;


/**
 * <p>Java class for receivePrizRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivePrizRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="protocolZK" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolZK"/>
 *         &lt;element name="protocolZPExtract" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolZPExtract"/>
 *         &lt;element name="protocolZPFinal" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolZPFinal"/>
 *         &lt;element name="purchaseProlongationOK" type="{http://zakupki.gov.ru/oos/signIncoming/1}purchaseProlongationOK"/>
 *         &lt;element name="protocolZP" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolZP"/>
 *         &lt;element name="notificationCancelFailure" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationCancelFailure"/>
 *         &lt;element name="notificationZP" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationZP"/>
 *         &lt;element name="notificationEFDateChange" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationEFDateChange"/>
 *         &lt;element name="notificationZK" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationZK"/>
 *         &lt;element name="notificationOKOU" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationOKOU"/>
 *         &lt;element name="purchaseProlongationZK" type="{http://zakupki.gov.ru/oos/signIncoming/1}purchaseProlongationZK"/>
 *         &lt;element name="notificationPO" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationPO"/>
 *         &lt;element name="protocolPO" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolPO"/>
 *         &lt;element name="notificationOKD" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationOKD"/>
 *         &lt;element name="notificationZakA" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationZakA"/>
 *         &lt;element name="notificationZakK" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationZakK"/>
 *         &lt;element name="notificationOK" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationOK"/>
 *         &lt;element name="protocolOK2" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOK2"/>
 *         &lt;element name="protocolOK1" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOK1"/>
 *         &lt;element name="protocolOKOU3" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKOU3"/>
 *         &lt;element name="protocolOKOU2" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKOU2"/>
 *         &lt;element name="protocolOKOU1" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKOU1"/>
 *         &lt;element name="protocolOKD1" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKD1"/>
 *         &lt;element name="protocolOKD2" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKD2"/>
 *         &lt;element name="protocolOKD3" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKD3"/>
 *         &lt;element name="protocolOKD4" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKD4"/>
 *         &lt;element name="protocolOKD5" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKD5"/>
 *         &lt;element name="notificationOrgChange" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationOrgChange"/>
 *         &lt;element name="notificationCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationCancel"/>
 *         &lt;element name="protocolZKBI" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolZKBI"/>
 *         &lt;element name="protocolDeviation" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolDeviation"/>
 *         &lt;element name="notificationLotChange" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationLotChange"/>
 *         &lt;element name="clarification" type="{http://zakupki.gov.ru/oos/signIncoming/1}clarification"/>
 *         &lt;element name="protocolEvasion" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolEvasion"/>
 *         &lt;element name="protocolCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolCancel"/>
 *         &lt;element name="notificationZakKOU" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationZakKOU"/>
 *         &lt;element name="protocolOKOUSingleApp" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKOUSingleApp"/>
 *         &lt;element name="notificationEF" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationEF"/>
 *         &lt;element name="notificationZakKD" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationZakKD"/>
 *         &lt;element name="notificationEP" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationEP"/>
 *         &lt;element name="protocolOKDSingleApp" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKDSingleApp"/>
 *         &lt;element name="notificationLotCancel" type="{http://zakupki.gov.ru/oos/signIncoming/1}notificationLotCancel"/>
 *         &lt;element name="protocolZKAfterProlong" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolZKAfterProlong"/>
 *         &lt;element name="protocolOKSingleApp" type="{http://zakupki.gov.ru/oos/signIncoming/1}protocolOKSingleApp"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivePrizRequestType", propOrder = {
    "protocolZK",
    "protocolZPExtract",
    "protocolZPFinal",
    "purchaseProlongationOK",
    "protocolZP",
    "notificationCancelFailure",
    "notificationZP",
    "notificationEFDateChange",
    "notificationZK",
    "notificationOKOU",
    "purchaseProlongationZK",
    "notificationPO",
    "protocolPO",
    "notificationOKD",
    "notificationZakA",
    "notificationZakK",
    "notificationOK",
    "protocolOK2",
    "protocolOK1",
    "protocolOKOU3",
    "protocolOKOU2",
    "protocolOKOU1",
    "protocolOKD1",
    "protocolOKD2",
    "protocolOKD3",
    "protocolOKD4",
    "protocolOKD5",
    "notificationOrgChange",
    "notificationCancel",
    "protocolZKBI",
    "protocolDeviation",
    "notificationLotChange",
    "clarification",
    "protocolEvasion",
    "protocolCancel",
    "notificationZakKOU",
    "protocolOKOUSingleApp",
    "notificationEF",
    "notificationZakKD",
    "notificationEP",
    "protocolOKDSingleApp",
    "notificationLotCancel",
    "protocolZKAfterProlong",
    "protocolOKSingleApp"
})
public class ReceivePrizRequestType {

    protected ProtocolZK protocolZK;
    protected ProtocolZPExtract protocolZPExtract;
    protected ProtocolZPFinal protocolZPFinal;
    protected PurchaseProlongationOK purchaseProlongationOK;
    protected ProtocolZP protocolZP;
    protected NotificationCancelFailure notificationCancelFailure;
    protected NotificationZP notificationZP;
    protected NotificationEFDateChange notificationEFDateChange;
    protected NotificationZK notificationZK;
    protected NotificationOKOU notificationOKOU;
    protected PurchaseProlongationZK purchaseProlongationZK;
    protected NotificationPO notificationPO;
    protected ProtocolPO protocolPO;
    protected NotificationOKD notificationOKD;
    protected NotificationZakA notificationZakA;
    protected NotificationZakK notificationZakK;
    protected NotificationOK notificationOK;
    protected ProtocolOK2 protocolOK2;
    protected ProtocolOK1 protocolOK1;
    protected ProtocolOKOU3 protocolOKOU3;
    protected ProtocolOKOU2 protocolOKOU2;
    protected ProtocolOKOU1 protocolOKOU1;
    protected ProtocolOKD1 protocolOKD1;
    protected ProtocolOKD2 protocolOKD2;
    protected ProtocolOKD3 protocolOKD3;
    protected ProtocolOKD4 protocolOKD4;
    protected ProtocolOKD5 protocolOKD5;
    protected NotificationOrgChange notificationOrgChange;
    protected NotificationCancel notificationCancel;
    protected ProtocolZKBI protocolZKBI;
    protected ProtocolDeviation protocolDeviation;
    protected NotificationLotChange notificationLotChange;
    protected Clarification clarification;
    protected ProtocolEvasion protocolEvasion;
    protected ProtocolCancel protocolCancel;
    protected NotificationZakKOU notificationZakKOU;
    protected ProtocolOKOUSingleApp protocolOKOUSingleApp;
    protected NotificationEF notificationEF;
    protected NotificationZakKD notificationZakKD;
    protected NotificationEP notificationEP;
    protected ProtocolOKDSingleApp protocolOKDSingleApp;
    protected NotificationLotCancel notificationLotCancel;
    protected ProtocolZKAfterProlong protocolZKAfterProlong;
    protected ProtocolOKSingleApp protocolOKSingleApp;

    /**
     * Gets the value of the protocolZK property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolZK }
     *     
     */
    public ProtocolZK getProtocolZK() {
        return protocolZK;
    }

    /**
     * Sets the value of the protocolZK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolZK }
     *     
     */
    public void setProtocolZK(ProtocolZK value) {
        this.protocolZK = value;
    }

    /**
     * Gets the value of the protocolZPExtract property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolZPExtract }
     *     
     */
    public ProtocolZPExtract getProtocolZPExtract() {
        return protocolZPExtract;
    }

    /**
     * Sets the value of the protocolZPExtract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolZPExtract }
     *     
     */
    public void setProtocolZPExtract(ProtocolZPExtract value) {
        this.protocolZPExtract = value;
    }

    /**
     * Gets the value of the protocolZPFinal property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolZPFinal }
     *     
     */
    public ProtocolZPFinal getProtocolZPFinal() {
        return protocolZPFinal;
    }

    /**
     * Sets the value of the protocolZPFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolZPFinal }
     *     
     */
    public void setProtocolZPFinal(ProtocolZPFinal value) {
        this.protocolZPFinal = value;
    }

    /**
     * Gets the value of the purchaseProlongationOK property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProlongationOK }
     *     
     */
    public PurchaseProlongationOK getPurchaseProlongationOK() {
        return purchaseProlongationOK;
    }

    /**
     * Sets the value of the purchaseProlongationOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProlongationOK }
     *     
     */
    public void setPurchaseProlongationOK(PurchaseProlongationOK value) {
        this.purchaseProlongationOK = value;
    }

    /**
     * Gets the value of the protocolZP property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolZP }
     *     
     */
    public ProtocolZP getProtocolZP() {
        return protocolZP;
    }

    /**
     * Sets the value of the protocolZP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolZP }
     *     
     */
    public void setProtocolZP(ProtocolZP value) {
        this.protocolZP = value;
    }

    /**
     * Gets the value of the notificationCancelFailure property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancelFailure }
     *     
     */
    public NotificationCancelFailure getNotificationCancelFailure() {
        return notificationCancelFailure;
    }

    /**
     * Sets the value of the notificationCancelFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancelFailure }
     *     
     */
    public void setNotificationCancelFailure(NotificationCancelFailure value) {
        this.notificationCancelFailure = value;
    }

    /**
     * Gets the value of the notificationZP property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationZP }
     *     
     */
    public NotificationZP getNotificationZP() {
        return notificationZP;
    }

    /**
     * Sets the value of the notificationZP property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationZP }
     *     
     */
    public void setNotificationZP(NotificationZP value) {
        this.notificationZP = value;
    }

    /**
     * Gets the value of the notificationEFDateChange property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEFDateChange }
     *     
     */
    public NotificationEFDateChange getNotificationEFDateChange() {
        return notificationEFDateChange;
    }

    /**
     * Sets the value of the notificationEFDateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEFDateChange }
     *     
     */
    public void setNotificationEFDateChange(NotificationEFDateChange value) {
        this.notificationEFDateChange = value;
    }

    /**
     * Gets the value of the notificationZK property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationZK }
     *     
     */
    public NotificationZK getNotificationZK() {
        return notificationZK;
    }

    /**
     * Sets the value of the notificationZK property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationZK }
     *     
     */
    public void setNotificationZK(NotificationZK value) {
        this.notificationZK = value;
    }

    /**
     * Gets the value of the notificationOKOU property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationOKOU }
     *     
     */
    public NotificationOKOU getNotificationOKOU() {
        return notificationOKOU;
    }

    /**
     * Sets the value of the notificationOKOU property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOKOU }
     *     
     */
    public void setNotificationOKOU(NotificationOKOU value) {
        this.notificationOKOU = value;
    }

    /**
     * Gets the value of the purchaseProlongationZK property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProlongationZK }
     *     
     */
    public PurchaseProlongationZK getPurchaseProlongationZK() {
        return purchaseProlongationZK;
    }

    /**
     * Sets the value of the purchaseProlongationZK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProlongationZK }
     *     
     */
    public void setPurchaseProlongationZK(PurchaseProlongationZK value) {
        this.purchaseProlongationZK = value;
    }

    /**
     * Gets the value of the notificationPO property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPO }
     *     
     */
    public NotificationPO getNotificationPO() {
        return notificationPO;
    }

    /**
     * Sets the value of the notificationPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPO }
     *     
     */
    public void setNotificationPO(NotificationPO value) {
        this.notificationPO = value;
    }

    /**
     * Gets the value of the protocolPO property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolPO }
     *     
     */
    public ProtocolPO getProtocolPO() {
        return protocolPO;
    }

    /**
     * Sets the value of the protocolPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolPO }
     *     
     */
    public void setProtocolPO(ProtocolPO value) {
        this.protocolPO = value;
    }

    /**
     * Gets the value of the notificationOKD property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationOKD }
     *     
     */
    public NotificationOKD getNotificationOKD() {
        return notificationOKD;
    }

    /**
     * Sets the value of the notificationOKD property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOKD }
     *     
     */
    public void setNotificationOKD(NotificationOKD value) {
        this.notificationOKD = value;
    }

    /**
     * Gets the value of the notificationZakA property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationZakA }
     *     
     */
    public NotificationZakA getNotificationZakA() {
        return notificationZakA;
    }

    /**
     * Sets the value of the notificationZakA property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationZakA }
     *     
     */
    public void setNotificationZakA(NotificationZakA value) {
        this.notificationZakA = value;
    }

    /**
     * Gets the value of the notificationZakK property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationZakK }
     *     
     */
    public NotificationZakK getNotificationZakK() {
        return notificationZakK;
    }

    /**
     * Sets the value of the notificationZakK property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationZakK }
     *     
     */
    public void setNotificationZakK(NotificationZakK value) {
        this.notificationZakK = value;
    }

    /**
     * Gets the value of the notificationOK property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationOK }
     *     
     */
    public NotificationOK getNotificationOK() {
        return notificationOK;
    }

    /**
     * Sets the value of the notificationOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOK }
     *     
     */
    public void setNotificationOK(NotificationOK value) {
        this.notificationOK = value;
    }

    /**
     * Gets the value of the protocolOK2 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOK2 }
     *     
     */
    public ProtocolOK2 getProtocolOK2() {
        return protocolOK2;
    }

    /**
     * Sets the value of the protocolOK2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOK2 }
     *     
     */
    public void setProtocolOK2(ProtocolOK2 value) {
        this.protocolOK2 = value;
    }

    /**
     * Gets the value of the protocolOK1 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOK1 }
     *     
     */
    public ProtocolOK1 getProtocolOK1() {
        return protocolOK1;
    }

    /**
     * Sets the value of the protocolOK1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOK1 }
     *     
     */
    public void setProtocolOK1(ProtocolOK1 value) {
        this.protocolOK1 = value;
    }

    /**
     * Gets the value of the protocolOKOU3 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKOU3 }
     *     
     */
    public ProtocolOKOU3 getProtocolOKOU3() {
        return protocolOKOU3;
    }

    /**
     * Sets the value of the protocolOKOU3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKOU3 }
     *     
     */
    public void setProtocolOKOU3(ProtocolOKOU3 value) {
        this.protocolOKOU3 = value;
    }

    /**
     * Gets the value of the protocolOKOU2 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKOU2 }
     *     
     */
    public ProtocolOKOU2 getProtocolOKOU2() {
        return protocolOKOU2;
    }

    /**
     * Sets the value of the protocolOKOU2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKOU2 }
     *     
     */
    public void setProtocolOKOU2(ProtocolOKOU2 value) {
        this.protocolOKOU2 = value;
    }

    /**
     * Gets the value of the protocolOKOU1 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKOU1 }
     *     
     */
    public ProtocolOKOU1 getProtocolOKOU1() {
        return protocolOKOU1;
    }

    /**
     * Sets the value of the protocolOKOU1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKOU1 }
     *     
     */
    public void setProtocolOKOU1(ProtocolOKOU1 value) {
        this.protocolOKOU1 = value;
    }

    /**
     * Gets the value of the protocolOKD1 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKD1 }
     *     
     */
    public ProtocolOKD1 getProtocolOKD1() {
        return protocolOKD1;
    }

    /**
     * Sets the value of the protocolOKD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKD1 }
     *     
     */
    public void setProtocolOKD1(ProtocolOKD1 value) {
        this.protocolOKD1 = value;
    }

    /**
     * Gets the value of the protocolOKD2 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKD2 }
     *     
     */
    public ProtocolOKD2 getProtocolOKD2() {
        return protocolOKD2;
    }

    /**
     * Sets the value of the protocolOKD2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKD2 }
     *     
     */
    public void setProtocolOKD2(ProtocolOKD2 value) {
        this.protocolOKD2 = value;
    }

    /**
     * Gets the value of the protocolOKD3 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKD3 }
     *     
     */
    public ProtocolOKD3 getProtocolOKD3() {
        return protocolOKD3;
    }

    /**
     * Sets the value of the protocolOKD3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKD3 }
     *     
     */
    public void setProtocolOKD3(ProtocolOKD3 value) {
        this.protocolOKD3 = value;
    }

    /**
     * Gets the value of the protocolOKD4 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKD4 }
     *     
     */
    public ProtocolOKD4 getProtocolOKD4() {
        return protocolOKD4;
    }

    /**
     * Sets the value of the protocolOKD4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKD4 }
     *     
     */
    public void setProtocolOKD4(ProtocolOKD4 value) {
        this.protocolOKD4 = value;
    }

    /**
     * Gets the value of the protocolOKD5 property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKD5 }
     *     
     */
    public ProtocolOKD5 getProtocolOKD5() {
        return protocolOKD5;
    }

    /**
     * Sets the value of the protocolOKD5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKD5 }
     *     
     */
    public void setProtocolOKD5(ProtocolOKD5 value) {
        this.protocolOKD5 = value;
    }

    /**
     * Gets the value of the notificationOrgChange property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationOrgChange }
     *     
     */
    public NotificationOrgChange getNotificationOrgChange() {
        return notificationOrgChange;
    }

    /**
     * Sets the value of the notificationOrgChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOrgChange }
     *     
     */
    public void setNotificationOrgChange(NotificationOrgChange value) {
        this.notificationOrgChange = value;
    }

    /**
     * Gets the value of the notificationCancel property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancel }
     *     
     */
    public NotificationCancel getNotificationCancel() {
        return notificationCancel;
    }

    /**
     * Sets the value of the notificationCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancel }
     *     
     */
    public void setNotificationCancel(NotificationCancel value) {
        this.notificationCancel = value;
    }

    /**
     * Gets the value of the protocolZKBI property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolZKBI }
     *     
     */
    public ProtocolZKBI getProtocolZKBI() {
        return protocolZKBI;
    }

    /**
     * Sets the value of the protocolZKBI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolZKBI }
     *     
     */
    public void setProtocolZKBI(ProtocolZKBI value) {
        this.protocolZKBI = value;
    }

    /**
     * Gets the value of the protocolDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolDeviation }
     *     
     */
    public ProtocolDeviation getProtocolDeviation() {
        return protocolDeviation;
    }

    /**
     * Sets the value of the protocolDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolDeviation }
     *     
     */
    public void setProtocolDeviation(ProtocolDeviation value) {
        this.protocolDeviation = value;
    }

    /**
     * Gets the value of the notificationLotChange property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationLotChange }
     *     
     */
    public NotificationLotChange getNotificationLotChange() {
        return notificationLotChange;
    }

    /**
     * Sets the value of the notificationLotChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationLotChange }
     *     
     */
    public void setNotificationLotChange(NotificationLotChange value) {
        this.notificationLotChange = value;
    }

    /**
     * Gets the value of the clarification property.
     * 
     * @return
     *     possible object is
     *     {@link Clarification }
     *     
     */
    public Clarification getClarification() {
        return clarification;
    }

    /**
     * Sets the value of the clarification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clarification }
     *     
     */
    public void setClarification(Clarification value) {
        this.clarification = value;
    }

    /**
     * Gets the value of the protocolEvasion property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEvasion }
     *     
     */
    public ProtocolEvasion getProtocolEvasion() {
        return protocolEvasion;
    }

    /**
     * Sets the value of the protocolEvasion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEvasion }
     *     
     */
    public void setProtocolEvasion(ProtocolEvasion value) {
        this.protocolEvasion = value;
    }

    /**
     * Gets the value of the protocolCancel property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolCancel }
     *     
     */
    public ProtocolCancel getProtocolCancel() {
        return protocolCancel;
    }

    /**
     * Sets the value of the protocolCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolCancel }
     *     
     */
    public void setProtocolCancel(ProtocolCancel value) {
        this.protocolCancel = value;
    }

    /**
     * Gets the value of the notificationZakKOU property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationZakKOU }
     *     
     */
    public NotificationZakKOU getNotificationZakKOU() {
        return notificationZakKOU;
    }

    /**
     * Sets the value of the notificationZakKOU property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationZakKOU }
     *     
     */
    public void setNotificationZakKOU(NotificationZakKOU value) {
        this.notificationZakKOU = value;
    }

    /**
     * Gets the value of the protocolOKOUSingleApp property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKOUSingleApp }
     *     
     */
    public ProtocolOKOUSingleApp getProtocolOKOUSingleApp() {
        return protocolOKOUSingleApp;
    }

    /**
     * Sets the value of the protocolOKOUSingleApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKOUSingleApp }
     *     
     */
    public void setProtocolOKOUSingleApp(ProtocolOKOUSingleApp value) {
        this.protocolOKOUSingleApp = value;
    }

    /**
     * Gets the value of the notificationEF property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEF }
     *     
     */
    public NotificationEF getNotificationEF() {
        return notificationEF;
    }

    /**
     * Sets the value of the notificationEF property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEF }
     *     
     */
    public void setNotificationEF(NotificationEF value) {
        this.notificationEF = value;
    }

    /**
     * Gets the value of the notificationZakKD property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationZakKD }
     *     
     */
    public NotificationZakKD getNotificationZakKD() {
        return notificationZakKD;
    }

    /**
     * Sets the value of the notificationZakKD property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationZakKD }
     *     
     */
    public void setNotificationZakKD(NotificationZakKD value) {
        this.notificationZakKD = value;
    }

    /**
     * Gets the value of the notificationEP property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEP }
     *     
     */
    public NotificationEP getNotificationEP() {
        return notificationEP;
    }

    /**
     * Sets the value of the notificationEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEP }
     *     
     */
    public void setNotificationEP(NotificationEP value) {
        this.notificationEP = value;
    }

    /**
     * Gets the value of the protocolOKDSingleApp property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKDSingleApp }
     *     
     */
    public ProtocolOKDSingleApp getProtocolOKDSingleApp() {
        return protocolOKDSingleApp;
    }

    /**
     * Sets the value of the protocolOKDSingleApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKDSingleApp }
     *     
     */
    public void setProtocolOKDSingleApp(ProtocolOKDSingleApp value) {
        this.protocolOKDSingleApp = value;
    }

    /**
     * Gets the value of the notificationLotCancel property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationLotCancel }
     *     
     */
    public NotificationLotCancel getNotificationLotCancel() {
        return notificationLotCancel;
    }

    /**
     * Sets the value of the notificationLotCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationLotCancel }
     *     
     */
    public void setNotificationLotCancel(NotificationLotCancel value) {
        this.notificationLotCancel = value;
    }

    /**
     * Gets the value of the protocolZKAfterProlong property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolZKAfterProlong }
     *     
     */
    public ProtocolZKAfterProlong getProtocolZKAfterProlong() {
        return protocolZKAfterProlong;
    }

    /**
     * Sets the value of the protocolZKAfterProlong property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolZKAfterProlong }
     *     
     */
    public void setProtocolZKAfterProlong(ProtocolZKAfterProlong value) {
        this.protocolZKAfterProlong = value;
    }

    /**
     * Gets the value of the protocolOKSingleApp property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolOKSingleApp }
     *     
     */
    public ProtocolOKSingleApp getProtocolOKSingleApp() {
        return protocolOKSingleApp;
    }

    /**
     * Sets the value of the protocolOKSingleApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolOKSingleApp }
     *     
     */
    public void setProtocolOKSingleApp(ProtocolOKSingleApp value) {
        this.protocolOKSingleApp = value;
    }

}

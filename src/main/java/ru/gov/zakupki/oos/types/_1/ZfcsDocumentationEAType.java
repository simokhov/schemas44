//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.ExtPrintFormType;
import ru.gov.zakupki.oos.common._1.PrintFormType;


/**
 * Тип: Структурированная документация в рамках проведения аукционов в электронной форме
 * 
 * <p>Java class for zfcs_documentationEAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_documentationEAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseObjectsCh9St37" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="clarificationInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_clarificationProcedureInfoType"/>
 *         &lt;element name="onesideRejectionCh9St95" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/common/1}printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/oos/common/1}extPrintFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_documentationEAType", propOrder = {
    "purchaseObjectsCh9St37",
    "modifiable",
    "clarificationInfo",
    "onesideRejectionCh9St95",
    "printFormInfo",
    "extPrintFormInfo"
})
public class ZfcsDocumentationEAType {

    protected boolean purchaseObjectsCh9St37;
    protected boolean modifiable;
    @XmlElement(required = true)
    protected ZfcsClarificationProcedureInfoType clarificationInfo;
    protected boolean onesideRejectionCh9St95;
    protected PrintFormType printFormInfo;
    protected ExtPrintFormType extPrintFormInfo;

    /**
     * Gets the value of the purchaseObjectsCh9St37 property.
     * 
     */
    public boolean isPurchaseObjectsCh9St37() {
        return purchaseObjectsCh9St37;
    }

    /**
     * Sets the value of the purchaseObjectsCh9St37 property.
     * 
     */
    public void setPurchaseObjectsCh9St37(boolean value) {
        this.purchaseObjectsCh9St37 = value;
    }

    /**
     * Gets the value of the modifiable property.
     * 
     */
    public boolean isModifiable() {
        return modifiable;
    }

    /**
     * Sets the value of the modifiable property.
     * 
     */
    public void setModifiable(boolean value) {
        this.modifiable = value;
    }

    /**
     * Gets the value of the clarificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsClarificationProcedureInfoType }
     *     
     */
    public ZfcsClarificationProcedureInfoType getClarificationInfo() {
        return clarificationInfo;
    }

    /**
     * Sets the value of the clarificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsClarificationProcedureInfoType }
     *     
     */
    public void setClarificationInfo(ZfcsClarificationProcedureInfoType value) {
        this.clarificationInfo = value;
    }

    /**
     * Gets the value of the onesideRejectionCh9St95 property.
     * 
     */
    public boolean isOnesideRejectionCh9St95() {
        return onesideRejectionCh9St95;
    }

    /**
     * Sets the value of the onesideRejectionCh9St95 property.
     * 
     */
    public void setOnesideRejectionCh9St95(boolean value) {
        this.onesideRejectionCh9St95 = value;
    }

    /**
     * Gets the value of the printFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrintFormType }
     *     
     */
    public PrintFormType getPrintFormInfo() {
        return printFormInfo;
    }

    /**
     * Sets the value of the printFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintFormType }
     *     
     */
    public void setPrintFormInfo(PrintFormType value) {
        this.printFormInfo = value;
    }

    /**
     * Gets the value of the extPrintFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtPrintFormType }
     *     
     */
    public ExtPrintFormType getExtPrintFormInfo() {
        return extPrintFormInfo;
    }

    /**
     * Sets the value of the extPrintFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtPrintFormType }
     *     
     */
    public void setExtPrintFormInfo(ExtPrintFormType value) {
        this.extPrintFormInfo = value;
    }

}

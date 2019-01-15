//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Запись плана исполнения контракта за счет бюджетных средств
 * 
 * <p>Java class for BOBudgetFinancingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOBudgetFinancingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KBKCode" type="{http://zakupki.gov.ru/oos/base/1}kbkType"/>
 *         &lt;element name="KBKYearsInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}financeResourcesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOBudgetFinancingType", propOrder = {
    "kbkCode",
    "kbkYearsInfo"
})
public class BOBudgetFinancingType {

    @XmlElement(name = "KBKCode", required = true)
    protected String kbkCode;
    @XmlElement(name = "KBKYearsInfo", required = true)
    protected FinanceResourcesType kbkYearsInfo;

    /**
     * Gets the value of the kbkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBKCode() {
        return kbkCode;
    }

    /**
     * Sets the value of the kbkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBKCode(String value) {
        this.kbkCode = value;
    }

    /**
     * Gets the value of the kbkYearsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FinanceResourcesType }
     *     
     */
    public FinanceResourcesType getKBKYearsInfo() {
        return kbkYearsInfo;
    }

    /**
     * Sets the value of the kbkYearsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinanceResourcesType }
     *     
     */
    public void setKBKYearsInfo(FinanceResourcesType value) {
        this.kbkYearsInfo = value;
    }

}

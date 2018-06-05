//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: План оплаты исполнения контракта
 * 
 * <p>Java class for BOBudgetFinancingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOBudgetFinancingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentYear" type="{http://zakupki.gov.ru/oos/base/1}yearType"/>
 *         &lt;element name="budgetFinancing" type="{http://zakupki.gov.ru/oos/EPtypes/1}BOBudgetFinancingType" maxOccurs="unbounded"/>
 *         &lt;element name="totalSum" type="{http://zakupki.gov.ru/oos/base/1}moneyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOBudgetFinancingsType", propOrder = {
    "currentYear",
    "budgetFinancing",
    "totalSum"
})
public class BOBudgetFinancingsType {

    protected int currentYear;
    @XmlElement(required = true)
    protected List<BOBudgetFinancingType> budgetFinancing;
    protected String totalSum;

    /**
     * Gets the value of the currentYear property.
     * 
     */
    public int getCurrentYear() {
        return currentYear;
    }

    /**
     * Sets the value of the currentYear property.
     * 
     */
    public void setCurrentYear(int value) {
        this.currentYear = value;
    }

    /**
     * Gets the value of the budgetFinancing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetFinancing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetFinancing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOBudgetFinancingType }
     * 
     * 
     */
    public List<BOBudgetFinancingType> getBudgetFinancing() {
        if (budgetFinancing == null) {
            budgetFinancing = new ArrayList<BOBudgetFinancingType>();
        }
        return this.budgetFinancing;
    }

    /**
     * Gets the value of the totalSum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalSum() {
        return totalSum;
    }

    /**
     * Sets the value of the totalSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalSum(String value) {
        this.totalSum = value;
    }

}

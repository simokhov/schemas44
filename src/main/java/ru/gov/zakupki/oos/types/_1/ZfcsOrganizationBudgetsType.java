//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 12:05:13 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Бюджеты организации
 * 
 * <p>Java class for zfcs_organizationBudgetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_organizationBudgetsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_spzNumType"/>
 *         &lt;element name="budgets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="budget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBudgetType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_organizationBudgetsType", propOrder = {
    "regNumber",
    "budgets"
})
public class ZfcsOrganizationBudgetsType {

    @XmlElement(required = true)
    protected String regNumber;
    protected ZfcsOrganizationBudgetsType.Budgets budgets;

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
     * Gets the value of the budgets property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationBudgetsType.Budgets }
     *     
     */
    public ZfcsOrganizationBudgetsType.Budgets getBudgets() {
        return budgets;
    }

    /**
     * Sets the value of the budgets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationBudgetsType.Budgets }
     *     
     */
    public void setBudgets(ZfcsOrganizationBudgetsType.Budgets value) {
        this.budgets = value;
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
     *       &lt;sequence>
     *         &lt;element name="budget" type="{http://zakupki.gov.ru/oos/types/1}zfcs_nsiBudgetType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "budget"
    })
    public static class Budgets {

        @XmlElement(required = true)
        protected List<ZfcsNsiBudgetType> budget;

        /**
         * Gets the value of the budget property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the budget property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBudget().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsNsiBudgetType }
         * 
         * 
         */
        public List<ZfcsNsiBudgetType> getBudget() {
            if (budget == null) {
                budget = new ArrayList<ZfcsNsiBudgetType>();
            }
            return this.budget;
        }

    }

}

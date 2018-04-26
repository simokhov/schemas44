//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:51:46 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Месяц, год финансирования контракта
 * 
 * <p>Java class for zfcs_subStageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_subStageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType">
 *       &lt;sequence>
 *         &lt;element name="substageMonth" type="{http://zakupki.gov.ru/oos/types/1}zfcs_monthType"/>
 *         &lt;element name="substageYear" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_subStageType", propOrder = {
    "substageMonth",
    "substageYear"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsContractType.Finances.Budgetary.class,
    ru.gov.zakupki.oos.types._1.ZfcsContractType.Finances.Extrabudgetary.class
})
public class ZfcsSubStageType
    extends ZfcsStageType
{

    protected byte substageMonth;
    protected int substageYear;

    /**
     * Gets the value of the substageMonth property.
     * 
     */
    public byte getSubstageMonth() {
        return substageMonth;
    }

    /**
     * Sets the value of the substageMonth property.
     * 
     */
    public void setSubstageMonth(byte value) {
        this.substageMonth = value;
    }

    /**
     * Gets the value of the substageYear property.
     * 
     */
    public int getSubstageYear() {
        return substageYear;
    }

    /**
     * Sets the value of the substageYear property.
     * 
     */
    public void setSubstageYear(int value) {
        this.substageYear = value;
    }

}

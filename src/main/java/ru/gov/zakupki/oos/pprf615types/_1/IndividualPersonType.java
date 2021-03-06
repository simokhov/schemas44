//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Индивидуальный предприниматель
 * 
 * <p>Java class for individualPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="individualPersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nameInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}personType"/>
 *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/base/1}innType"/>
 *         &lt;element name="factAddress" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "individualPersonType", propOrder = {
    "nameInfo",
    "inn",
    "factAddress"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.pprf615types._1.ProtocolPOInfoType.Applications.Application.AppParticipantInfo.IndividualPersonInfo.class,
    ru.gov.zakupki.oos.pprf615types._1.PurchaseContractorInfoType.IndividualPersonInfo.class,
    ru.gov.zakupki.oos.pprf615types._1.QualifiedContractorType.ContractorInfo.IndividualPersonInfo.class
})
public class IndividualPersonType {

    @XmlElement(required = true)
    protected PersonType nameInfo;
    @XmlElement(name = "INN", required = true)
    protected String inn;
    protected String factAddress;

    /**
     * Gets the value of the nameInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getNameInfo() {
        return nameInfo;
    }

    /**
     * Sets the value of the nameInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setNameInfo(PersonType value) {
        this.nameInfo = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the factAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactAddress() {
        return factAddress;
    }

    /**
     * Sets the value of the factAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactAddress(String value) {
        this.factAddress = value;
    }

}

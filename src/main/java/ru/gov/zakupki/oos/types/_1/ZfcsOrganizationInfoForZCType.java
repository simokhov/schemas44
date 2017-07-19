//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.19 at 11:02:43 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об организации для документов Запроса цен
 * 
 * <p>Java class for zfcs_organizationInfoForZCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_organizationInfoForZCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationRef">
 *       &lt;sequence>
 *         &lt;element name="shortName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="250"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INN" type="{http://zakupki.gov.ru/oos/types/1}zfcs_innType" minOccurs="0"/>
 *         &lt;element name="KPP" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kppType" minOccurs="0"/>
 *         &lt;element name="OGRN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/oos/types/1}zfcs_ogrnType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="responsibleRole">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="CU"/>
 *               &lt;enumeration value="CS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_organizationInfoForZCType", propOrder = {
    "shortName",
    "inn",
    "kpp",
    "ogrn",
    "responsibleRole"
})
public class ZfcsOrganizationInfoForZCType
    extends ZfcsOrganizationRef
{

    protected String shortName;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "KPP")
    protected String kpp;
    @XmlElement(name = "OGRN")
    protected String ogrn;
    @XmlElement(required = true)
    protected String responsibleRole;

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
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
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the responsibleRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleRole() {
        return responsibleRole;
    }

    /**
     * Sets the value of the responsibleRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleRole(String value) {
        this.responsibleRole = value;
    }

}

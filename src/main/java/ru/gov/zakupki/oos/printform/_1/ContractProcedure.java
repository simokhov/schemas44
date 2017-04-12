//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:57:13 AM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.gov.zakupki.oos.types._1.ZfcsContractProcedure2015Type;
import ru.gov.zakupki.oos.types._1.ZfcsPurchaseOrganizationType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_contractProcedure2015Type">
 *       &lt;sequence>
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contractSignDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="contractNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_contract.NumberType" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseOrganizationType" minOccurs="0"/>
 *         &lt;element name="fullNameSigner" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "docDate",
    "contractSignDate",
    "contractNumber",
    "customer",
    "fullNameSigner"
})
@XmlRootElement(name = "contractProcedure")
public class ContractProcedure
    extends ZfcsContractProcedure2015Type
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractSignDate;
    protected String contractNumber;
    protected ZfcsPurchaseOrganizationType customer;
    protected String fullNameSigner;

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the contractSignDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractSignDate() {
        return contractSignDate;
    }

    /**
     * Sets the value of the contractSignDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractSignDate(XMLGregorianCalendar value) {
        this.contractSignDate = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseOrganizationType }
     *     
     */
    public ZfcsPurchaseOrganizationType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseOrganizationType }
     *     
     */
    public void setCustomer(ZfcsPurchaseOrganizationType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the fullNameSigner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameSigner() {
        return fullNameSigner;
    }

    /**
     * Sets the value of the fullNameSigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameSigner(String value) {
        this.fullNameSigner = value;
    }

}

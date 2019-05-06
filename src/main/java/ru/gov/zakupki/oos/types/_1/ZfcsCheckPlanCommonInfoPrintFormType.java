//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Общая информация по плана проверок (для печатной формы)
 * 
 * <p>Java class for zfcs_checkPlanCommonInfoPrintFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkPlanCommonInfoPrintFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createOrganization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType" minOccurs="0"/>
 *         &lt;element name="createUser" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="editDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="editOrganization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType" minOccurs="0"/>
 *         &lt;element name="editUser" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *         &lt;element name="publishOrganization" type="{http://zakupki.gov.ru/oos/types/1}zfcs_organizationInfoType" minOccurs="0"/>
 *         &lt;element name="publishUser" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_checkPlanCommonInfoPrintFormType", propOrder = {
    "createOrganization",
    "createUser",
    "editDate",
    "editOrganization",
    "editUser",
    "publishOrganization",
    "publishUser"
})
public class ZfcsCheckPlanCommonInfoPrintFormType {

    protected ZfcsOrganizationInfoType createOrganization;
    protected String createUser;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar editDate;
    protected ZfcsOrganizationInfoType editOrganization;
    protected String editUser;
    protected ZfcsOrganizationInfoType publishOrganization;
    protected String publishUser;

    /**
     * Gets the value of the createOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public ZfcsOrganizationInfoType getCreateOrganization() {
        return createOrganization;
    }

    /**
     * Sets the value of the createOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public void setCreateOrganization(ZfcsOrganizationInfoType value) {
        this.createOrganization = value;
    }

    /**
     * Gets the value of the createUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Sets the value of the createUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUser(String value) {
        this.createUser = value;
    }

    /**
     * Gets the value of the editDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEditDate() {
        return editDate;
    }

    /**
     * Sets the value of the editDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEditDate(XMLGregorianCalendar value) {
        this.editDate = value;
    }

    /**
     * Gets the value of the editOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public ZfcsOrganizationInfoType getEditOrganization() {
        return editOrganization;
    }

    /**
     * Sets the value of the editOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public void setEditOrganization(ZfcsOrganizationInfoType value) {
        this.editOrganization = value;
    }

    /**
     * Gets the value of the editUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditUser() {
        return editUser;
    }

    /**
     * Sets the value of the editUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditUser(String value) {
        this.editUser = value;
    }

    /**
     * Gets the value of the publishOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public ZfcsOrganizationInfoType getPublishOrganization() {
        return publishOrganization;
    }

    /**
     * Sets the value of the publishOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public void setPublishOrganization(ZfcsOrganizationInfoType value) {
        this.publishOrganization = value;
    }

    /**
     * Gets the value of the publishUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishUser() {
        return publishUser;
    }

    /**
     * Sets the value of the publishUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishUser(String value) {
        this.publishUser = value;
    }

}

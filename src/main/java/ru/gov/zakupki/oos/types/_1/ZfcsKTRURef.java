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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Ссылка на КТРУ
 * 
 * <p>Java class for zfcs_KTRURef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_KTRURef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://zakupki.gov.ru/oos/base/1}ktruCodeType"/>
 *         &lt;element name="name" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *         &lt;element name="versionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_KTRURef", propOrder = {
    "code",
    "name",
    "versionId"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsTenderPlan2017ProductType.KTRU.class,
    ru.gov.zakupki.oos.types._1.ZfcsNotificationZPType.Lot.PurchaseObjects.PurchaseObject.KTRU.class,
    ru.gov.zakupki.oos.types._1.ZfcsNotificationEFType.Lot.PurchaseObjects.PurchaseObject.KTRU.class,
    ru.gov.zakupki.oos.types._1.ZfcsLotOKType.PurchaseObjects.PurchaseObject.KTRU.class,
    ru.gov.zakupki.oos.types._1.ZfcsNotificationPOType.Lot.PurchaseObjects.PurchaseObject.KTRU.class,
    ru.gov.zakupki.oos.types._1.ZfcsLotI111Type.KTRU.class,
    ru.gov.zakupki.oos.types._1.ZfcsLotZKType.PurchaseObjects.PurchaseObject.KTRU.class,
    ru.gov.zakupki.oos.types._1.ZfcsNotificationEPType.Lot.PurchaseObjects.PurchaseObject.KTRU.class,
    ru.gov.zakupki.oos.types._1.ZfcsProtocolZKBIType.Lot.PurchaseObjects.PurchaseObject.KTRU.class,
    ru.gov.zakupki.oos.types._1.ZfcsRequestForQuotationType.Products.Product.KTRU.class,
    ru.gov.zakupki.oos.types._1.ZfcsRequestForQuotationCancelType.Products.Product.KTRU.class
})
public class ZfcsKTRURef {

    @XmlElement(required = true)
    protected String code;
    protected String name;
    protected Long versionId;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the versionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * Sets the value of the versionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersionId(Long value) {
        this.versionId = value;
    }

}

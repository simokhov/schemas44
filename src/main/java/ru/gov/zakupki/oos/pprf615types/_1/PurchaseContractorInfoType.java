//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.QualifiedContractorRef;


/**
 * Тип: Сведения о подрядной организации
 * 
 * <p>Java class for purchaseContractorInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseContractorInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="legalEntityRFInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}legalEntityRFType">
 *                 &lt;sequence>
 *                   &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType"/>
 *                   &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
 *                   &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="legalEntityForeignStateInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}legalEntityForeignStateType">
 *                 &lt;sequence>
 *                   &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType"/>
 *                   &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
 *                   &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="individualPersonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}individualPersonType">
 *                 &lt;sequence>
 *                   &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType"/>
 *                   &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
 *                   &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseContractorInfoType", propOrder = {
    "legalEntityRFInfo",
    "legalEntityForeignStateInfo",
    "individualPersonInfo"
})
public class PurchaseContractorInfoType {

    protected PurchaseContractorInfoType.LegalEntityRFInfo legalEntityRFInfo;
    protected PurchaseContractorInfoType.LegalEntityForeignStateInfo legalEntityForeignStateInfo;
    protected PurchaseContractorInfoType.IndividualPersonInfo individualPersonInfo;

    /**
     * Gets the value of the legalEntityRFInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseContractorInfoType.LegalEntityRFInfo }
     *     
     */
    public PurchaseContractorInfoType.LegalEntityRFInfo getLegalEntityRFInfo() {
        return legalEntityRFInfo;
    }

    /**
     * Sets the value of the legalEntityRFInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseContractorInfoType.LegalEntityRFInfo }
     *     
     */
    public void setLegalEntityRFInfo(PurchaseContractorInfoType.LegalEntityRFInfo value) {
        this.legalEntityRFInfo = value;
    }

    /**
     * Gets the value of the legalEntityForeignStateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseContractorInfoType.LegalEntityForeignStateInfo }
     *     
     */
    public PurchaseContractorInfoType.LegalEntityForeignStateInfo getLegalEntityForeignStateInfo() {
        return legalEntityForeignStateInfo;
    }

    /**
     * Sets the value of the legalEntityForeignStateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseContractorInfoType.LegalEntityForeignStateInfo }
     *     
     */
    public void setLegalEntityForeignStateInfo(PurchaseContractorInfoType.LegalEntityForeignStateInfo value) {
        this.legalEntityForeignStateInfo = value;
    }

    /**
     * Gets the value of the individualPersonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseContractorInfoType.IndividualPersonInfo }
     *     
     */
    public PurchaseContractorInfoType.IndividualPersonInfo getIndividualPersonInfo() {
        return individualPersonInfo;
    }

    /**
     * Sets the value of the individualPersonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseContractorInfoType.IndividualPersonInfo }
     *     
     */
    public void setIndividualPersonInfo(PurchaseContractorInfoType.IndividualPersonInfo value) {
        this.individualPersonInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}individualPersonType">
     *       &lt;sequence>
     *         &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType"/>
     *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
     *         &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
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
        "eMail",
        "phone",
        "qualifiedContractorInfo"
    })
    public static class IndividualPersonInfo
        extends IndividualPersonType
    {

        @XmlElement(required = true)
        protected String eMail;
        protected String phone;
        protected QualifiedContractorRef qualifiedContractorInfo;

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the qualifiedContractorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public QualifiedContractorRef getQualifiedContractorInfo() {
            return qualifiedContractorInfo;
        }

        /**
         * Sets the value of the qualifiedContractorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public void setQualifiedContractorInfo(QualifiedContractorRef value) {
            this.qualifiedContractorInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}legalEntityForeignStateType">
     *       &lt;sequence>
     *         &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType"/>
     *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
     *         &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
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
        "eMail",
        "phone",
        "qualifiedContractorInfo"
    })
    public static class LegalEntityForeignStateInfo
        extends LegalEntityForeignStateType
    {

        @XmlElement(required = true)
        protected String eMail;
        protected String phone;
        protected QualifiedContractorRef qualifiedContractorInfo;

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the qualifiedContractorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public QualifiedContractorRef getQualifiedContractorInfo() {
            return qualifiedContractorInfo;
        }

        /**
         * Sets the value of the qualifiedContractorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public void setQualifiedContractorInfo(QualifiedContractorRef value) {
            this.qualifiedContractorInfo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}legalEntityRFType">
     *       &lt;sequence>
     *         &lt;element name="eMail" type="{http://zakupki.gov.ru/oos/base/1}eMailType"/>
     *         &lt;element name="phone" type="{http://zakupki.gov.ru/oos/base/1}phoneType" minOccurs="0"/>
     *         &lt;element name="qualifiedContractorInfo" type="{http://zakupki.gov.ru/oos/base/1}qualifiedContractorRef" minOccurs="0"/>
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
        "eMail",
        "phone",
        "qualifiedContractorInfo"
    })
    public static class LegalEntityRFInfo
        extends LegalEntityRFType
    {

        @XmlElement(required = true)
        protected String eMail;
        protected String phone;
        protected QualifiedContractorRef qualifiedContractorInfo;

        /**
         * Gets the value of the eMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMail() {
            return eMail;
        }

        /**
         * Sets the value of the eMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMail(String value) {
            this.eMail = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the qualifiedContractorInfo property.
         * 
         * @return
         *     possible object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public QualifiedContractorRef getQualifiedContractorInfo() {
            return qualifiedContractorInfo;
        }

        /**
         * Sets the value of the qualifiedContractorInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifiedContractorRef }
         *     
         */
        public void setQualifiedContractorInfo(QualifiedContractorRef value) {
            this.qualifiedContractorInfo = value;
        }

    }

}

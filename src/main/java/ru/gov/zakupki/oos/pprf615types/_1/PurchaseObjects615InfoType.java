//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:16:24 AM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.base._1.ServiceWorkSt166Ref;


/**
 * Тип: Виды услуг и (или) работ по ПП РФ № 615
 * 
 * <p>Java class for purchaseObjects615InfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseObjects615InfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servicesWorksKindCh1St166Info" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceWorkKindCh1St166Info" type="{http://zakupki.gov.ru/oos/base/1}serviceWorkSt166Ref" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="servicesWorksKindNPAInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NPA" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                   &lt;element name="servicesWorksKindCh2St166Info" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="serviceWorkKindCh2St166Info" type="{http://zakupki.gov.ru/oos/base/1}serviceWorkSt166Ref" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="servicesWorksKindSubjectRFNPAInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="serviceWorkKindSubjectRFNPA" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "purchaseObjects615InfoType", propOrder = {
    "servicesWorksKindCh1St166Info",
    "servicesWorksKindNPAInfo"
})
public class PurchaseObjects615InfoType {

    protected PurchaseObjects615InfoType.ServicesWorksKindCh1St166Info servicesWorksKindCh1St166Info;
    protected PurchaseObjects615InfoType.ServicesWorksKindNPAInfo servicesWorksKindNPAInfo;

    /**
     * Gets the value of the servicesWorksKindCh1St166Info property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseObjects615InfoType.ServicesWorksKindCh1St166Info }
     *     
     */
    public PurchaseObjects615InfoType.ServicesWorksKindCh1St166Info getServicesWorksKindCh1St166Info() {
        return servicesWorksKindCh1St166Info;
    }

    /**
     * Sets the value of the servicesWorksKindCh1St166Info property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseObjects615InfoType.ServicesWorksKindCh1St166Info }
     *     
     */
    public void setServicesWorksKindCh1St166Info(PurchaseObjects615InfoType.ServicesWorksKindCh1St166Info value) {
        this.servicesWorksKindCh1St166Info = value;
    }

    /**
     * Gets the value of the servicesWorksKindNPAInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseObjects615InfoType.ServicesWorksKindNPAInfo }
     *     
     */
    public PurchaseObjects615InfoType.ServicesWorksKindNPAInfo getServicesWorksKindNPAInfo() {
        return servicesWorksKindNPAInfo;
    }

    /**
     * Sets the value of the servicesWorksKindNPAInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseObjects615InfoType.ServicesWorksKindNPAInfo }
     *     
     */
    public void setServicesWorksKindNPAInfo(PurchaseObjects615InfoType.ServicesWorksKindNPAInfo value) {
        this.servicesWorksKindNPAInfo = value;
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
     *         &lt;element name="serviceWorkKindCh1St166Info" type="{http://zakupki.gov.ru/oos/base/1}serviceWorkSt166Ref" maxOccurs="unbounded"/>
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
        "serviceWorkKindCh1St166Info"
    })
    public static class ServicesWorksKindCh1St166Info {

        @XmlElement(required = true)
        protected List<ServiceWorkSt166Ref> serviceWorkKindCh1St166Info;

        /**
         * Gets the value of the serviceWorkKindCh1St166Info property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceWorkKindCh1St166Info property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceWorkKindCh1St166Info().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceWorkSt166Ref }
         * 
         * 
         */
        public List<ServiceWorkSt166Ref> getServiceWorkKindCh1St166Info() {
            if (serviceWorkKindCh1St166Info == null) {
                serviceWorkKindCh1St166Info = new ArrayList<ServiceWorkSt166Ref>();
            }
            return this.serviceWorkKindCh1St166Info;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NPA" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *         &lt;element name="servicesWorksKindCh2St166Info" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="serviceWorkKindCh2St166Info" type="{http://zakupki.gov.ru/oos/base/1}serviceWorkSt166Ref" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="servicesWorksKindSubjectRFNPAInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="serviceWorkKindSubjectRFNPA" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" maxOccurs="unbounded"/>
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
    @XmlType(name = "", propOrder = {
        "npa",
        "servicesWorksKindCh2St166Info",
        "servicesWorksKindSubjectRFNPAInfo"
    })
    public static class ServicesWorksKindNPAInfo {

        @XmlElement(name = "NPA")
        protected String npa;
        protected PurchaseObjects615InfoType.ServicesWorksKindNPAInfo.ServicesWorksKindCh2St166Info servicesWorksKindCh2St166Info;
        protected PurchaseObjects615InfoType.ServicesWorksKindNPAInfo.ServicesWorksKindSubjectRFNPAInfo servicesWorksKindSubjectRFNPAInfo;

        /**
         * Gets the value of the npa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNPA() {
            return npa;
        }

        /**
         * Sets the value of the npa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNPA(String value) {
            this.npa = value;
        }

        /**
         * Gets the value of the servicesWorksKindCh2St166Info property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseObjects615InfoType.ServicesWorksKindNPAInfo.ServicesWorksKindCh2St166Info }
         *     
         */
        public PurchaseObjects615InfoType.ServicesWorksKindNPAInfo.ServicesWorksKindCh2St166Info getServicesWorksKindCh2St166Info() {
            return servicesWorksKindCh2St166Info;
        }

        /**
         * Sets the value of the servicesWorksKindCh2St166Info property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseObjects615InfoType.ServicesWorksKindNPAInfo.ServicesWorksKindCh2St166Info }
         *     
         */
        public void setServicesWorksKindCh2St166Info(PurchaseObjects615InfoType.ServicesWorksKindNPAInfo.ServicesWorksKindCh2St166Info value) {
            this.servicesWorksKindCh2St166Info = value;
        }

        /**
         * Gets the value of the servicesWorksKindSubjectRFNPAInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PurchaseObjects615InfoType.ServicesWorksKindNPAInfo.ServicesWorksKindSubjectRFNPAInfo }
         *     
         */
        public PurchaseObjects615InfoType.ServicesWorksKindNPAInfo.ServicesWorksKindSubjectRFNPAInfo getServicesWorksKindSubjectRFNPAInfo() {
            return servicesWorksKindSubjectRFNPAInfo;
        }

        /**
         * Sets the value of the servicesWorksKindSubjectRFNPAInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchaseObjects615InfoType.ServicesWorksKindNPAInfo.ServicesWorksKindSubjectRFNPAInfo }
         *     
         */
        public void setServicesWorksKindSubjectRFNPAInfo(PurchaseObjects615InfoType.ServicesWorksKindNPAInfo.ServicesWorksKindSubjectRFNPAInfo value) {
            this.servicesWorksKindSubjectRFNPAInfo = value;
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
         *         &lt;element name="serviceWorkKindCh2St166Info" type="{http://zakupki.gov.ru/oos/base/1}serviceWorkSt166Ref" maxOccurs="unbounded"/>
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
            "serviceWorkKindCh2St166Info"
        })
        public static class ServicesWorksKindCh2St166Info {

            @XmlElement(required = true)
            protected List<ServiceWorkSt166Ref> serviceWorkKindCh2St166Info;

            /**
             * Gets the value of the serviceWorkKindCh2St166Info property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceWorkKindCh2St166Info property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceWorkKindCh2St166Info().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ServiceWorkSt166Ref }
             * 
             * 
             */
            public List<ServiceWorkSt166Ref> getServiceWorkKindCh2St166Info() {
                if (serviceWorkKindCh2St166Info == null) {
                    serviceWorkKindCh2St166Info = new ArrayList<ServiceWorkSt166Ref>();
                }
                return this.serviceWorkKindCh2St166Info;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="serviceWorkKindSubjectRFNPA" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" maxOccurs="unbounded"/>
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
            "serviceWorkKindSubjectRFNPA"
        })
        public static class ServicesWorksKindSubjectRFNPAInfo {

            @XmlElement(required = true)
            protected List<String> serviceWorkKindSubjectRFNPA;

            /**
             * Gets the value of the serviceWorkKindSubjectRFNPA property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceWorkKindSubjectRFNPA property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceWorkKindSubjectRFNPA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getServiceWorkKindSubjectRFNPA() {
                if (serviceWorkKindSubjectRFNPA == null) {
                    serviceWorkKindSubjectRFNPA = new ArrayList<String>();
                }
                return this.serviceWorkKindSubjectRFNPA;
            }

        }

    }

}

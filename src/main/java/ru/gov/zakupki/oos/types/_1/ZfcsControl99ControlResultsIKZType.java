//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.26 at 09:44:23 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип: Сведения о результатах контроля в разбивке по ИКЗ в протоколе о несоответствии контролируемой информации контроля по 99 статье
 * 
 * <p>Java class for zfcs_control99ControlResultsIKZType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_control99ControlResultsIKZType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlResultsIKZ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="controlResultIKZ" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
 *                             &lt;element name="controlResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlResultType"/>
 *                             &lt;element name="commentText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
 *         &lt;element name="controlResult1084point14B" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="controlResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlResultType"/>
 *                   &lt;element name="commentText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="discrepanciesText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="12000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "zfcs_control99ControlResultsIKZType", propOrder = {
    "controlResultsIKZ",
    "controlResult1084Point14B",
    "discrepanciesText"
})
public class ZfcsControl99ControlResultsIKZType {

    protected ZfcsControl99ControlResultsIKZType.ControlResultsIKZ controlResultsIKZ;
    @XmlElement(name = "controlResult1084point14B")
    protected ZfcsControl99ControlResultsIKZType.ControlResult1084Point14B controlResult1084Point14B;
    protected String discrepanciesText;

    /**
     * Gets the value of the controlResultsIKZ property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99ControlResultsIKZType.ControlResultsIKZ }
     *     
     */
    public ZfcsControl99ControlResultsIKZType.ControlResultsIKZ getControlResultsIKZ() {
        return controlResultsIKZ;
    }

    /**
     * Sets the value of the controlResultsIKZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99ControlResultsIKZType.ControlResultsIKZ }
     *     
     */
    public void setControlResultsIKZ(ZfcsControl99ControlResultsIKZType.ControlResultsIKZ value) {
        this.controlResultsIKZ = value;
    }

    /**
     * Gets the value of the controlResult1084Point14B property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsControl99ControlResultsIKZType.ControlResult1084Point14B }
     *     
     */
    public ZfcsControl99ControlResultsIKZType.ControlResult1084Point14B getControlResult1084Point14B() {
        return controlResult1084Point14B;
    }

    /**
     * Sets the value of the controlResult1084Point14B property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsControl99ControlResultsIKZType.ControlResult1084Point14B }
     *     
     */
    public void setControlResult1084Point14B(ZfcsControl99ControlResultsIKZType.ControlResult1084Point14B value) {
        this.controlResult1084Point14B = value;
    }

    /**
     * Gets the value of the discrepanciesText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscrepanciesText() {
        return discrepanciesText;
    }

    /**
     * Sets the value of the discrepanciesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscrepanciesText(String value) {
        this.discrepanciesText = value;
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
     *         &lt;element name="controlResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlResultType"/>
     *         &lt;element name="commentText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "controlResult",
        "commentText"
    })
    public static class ControlResult1084Point14B {

        @XmlElement(required = true)
        protected ZfcsControl99ControlResultType controlResult;
        protected String commentText;

        /**
         * Gets the value of the controlResult property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsControl99ControlResultType }
         *     
         */
        public ZfcsControl99ControlResultType getControlResult() {
            return controlResult;
        }

        /**
         * Sets the value of the controlResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsControl99ControlResultType }
         *     
         */
        public void setControlResult(ZfcsControl99ControlResultType value) {
            this.controlResult = value;
        }

        /**
         * Gets the value of the commentText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommentText() {
            return commentText;
        }

        /**
         * Sets the value of the commentText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommentText(String value) {
            this.commentText = value;
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
     *         &lt;element name="controlResultIKZ" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
     *                   &lt;element name="controlResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlResultType"/>
     *                   &lt;element name="commentText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
        "controlResultIKZ"
    })
    public static class ControlResultsIKZ {

        @XmlElement(required = true)
        protected List<ZfcsControl99ControlResultsIKZType.ControlResultsIKZ.ControlResultIKZ> controlResultIKZ;

        /**
         * Gets the value of the controlResultIKZ property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the controlResultIKZ property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getControlResultIKZ().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZfcsControl99ControlResultsIKZType.ControlResultsIKZ.ControlResultIKZ }
         * 
         * 
         */
        public List<ZfcsControl99ControlResultsIKZType.ControlResultsIKZ.ControlResultIKZ> getControlResultIKZ() {
            if (controlResultIKZ == null) {
                controlResultIKZ = new ArrayList<ZfcsControl99ControlResultsIKZType.ControlResultsIKZ.ControlResultIKZ>();
            }
            return this.controlResultIKZ;
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
         *         &lt;element name="IKZ" type="{http://zakupki.gov.ru/oos/types/1}zfcs_IKZCodeType" minOccurs="0"/>
         *         &lt;element name="controlResult" type="{http://zakupki.gov.ru/oos/types/1}zfcs_control99ControlResultType"/>
         *         &lt;element name="commentText" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextMinType" minOccurs="0"/>
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
            "ikz",
            "controlResult",
            "commentText"
        })
        public static class ControlResultIKZ {

            @XmlElement(name = "IKZ")
            protected String ikz;
            @XmlElement(required = true)
            protected ZfcsControl99ControlResultType controlResult;
            protected String commentText;

            /**
             * Gets the value of the ikz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIKZ() {
                return ikz;
            }

            /**
             * Sets the value of the ikz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIKZ(String value) {
                this.ikz = value;
            }

            /**
             * Gets the value of the controlResult property.
             * 
             * @return
             *     possible object is
             *     {@link ZfcsControl99ControlResultType }
             *     
             */
            public ZfcsControl99ControlResultType getControlResult() {
                return controlResult;
            }

            /**
             * Sets the value of the controlResult property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZfcsControl99ControlResultType }
             *     
             */
            public void setControlResult(ZfcsControl99ControlResultType value) {
                this.controlResult = value;
            }

            /**
             * Gets the value of the commentText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommentText() {
                return commentText;
            }

            /**
             * Sets the value of the commentText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommentText(String value) {
                this.commentText = value;
            }

        }

    }

}

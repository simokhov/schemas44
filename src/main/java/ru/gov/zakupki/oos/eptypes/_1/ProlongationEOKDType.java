//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.eptypes._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Извещение о продлении срока подачи заявок на участие в ЭOKД (двухэтапный конкурс в электронной форме)
 * 
 * <p>Java class for prolongationEOKDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prolongationEOKDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/EPtypes/1}purchaseDocumentType">
 *       &lt;sequence>
 *         &lt;element name="prolongationInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="firstStageInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="collectingEndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="newCollectingEndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="scoringDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="secondStageInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="collectingInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="startDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="endDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="scoringInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}procedureScoringType"/>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prolongationEOKDType", propOrder = {
    "prolongationInfo"
})
public class ProlongationEOKDType
    extends PurchaseDocumentType
{

    @XmlElement(required = true)
    protected ProlongationEOKDType.ProlongationInfo prolongationInfo;

    /**
     * Gets the value of the prolongationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProlongationEOKDType.ProlongationInfo }
     *     
     */
    public ProlongationEOKDType.ProlongationInfo getProlongationInfo() {
        return prolongationInfo;
    }

    /**
     * Sets the value of the prolongationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProlongationEOKDType.ProlongationInfo }
     *     
     */
    public void setProlongationInfo(ProlongationEOKDType.ProlongationInfo value) {
        this.prolongationInfo = value;
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
     *         &lt;element name="firstStageInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="collectingEndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="newCollectingEndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="scoringDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="secondStageInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="collectingInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="startDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="endDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="scoringInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}procedureScoringType"/>
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
        "firstStageInfo",
        "secondStageInfo"
    })
    public static class ProlongationInfo {

        @XmlElement(required = true)
        protected ProlongationEOKDType.ProlongationInfo.FirstStageInfo firstStageInfo;
        @XmlElement(required = true)
        protected ProlongationEOKDType.ProlongationInfo.SecondStageInfo secondStageInfo;

        /**
         * Gets the value of the firstStageInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProlongationEOKDType.ProlongationInfo.FirstStageInfo }
         *     
         */
        public ProlongationEOKDType.ProlongationInfo.FirstStageInfo getFirstStageInfo() {
            return firstStageInfo;
        }

        /**
         * Sets the value of the firstStageInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProlongationEOKDType.ProlongationInfo.FirstStageInfo }
         *     
         */
        public void setFirstStageInfo(ProlongationEOKDType.ProlongationInfo.FirstStageInfo value) {
            this.firstStageInfo = value;
        }

        /**
         * Gets the value of the secondStageInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ProlongationEOKDType.ProlongationInfo.SecondStageInfo }
         *     
         */
        public ProlongationEOKDType.ProlongationInfo.SecondStageInfo getSecondStageInfo() {
            return secondStageInfo;
        }

        /**
         * Sets the value of the secondStageInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProlongationEOKDType.ProlongationInfo.SecondStageInfo }
         *     
         */
        public void setSecondStageInfo(ProlongationEOKDType.ProlongationInfo.SecondStageInfo value) {
            this.secondStageInfo = value;
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
         *         &lt;element name="collectingEndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="newCollectingEndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="scoringDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
            "collectingEndDT",
            "newCollectingEndDT",
            "scoringDT"
        })
        public static class FirstStageInfo {

            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar collectingEndDT;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar newCollectingEndDT;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar scoringDT;

            /**
             * Gets the value of the collectingEndDT property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCollectingEndDT() {
                return collectingEndDT;
            }

            /**
             * Sets the value of the collectingEndDT property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCollectingEndDT(XMLGregorianCalendar value) {
                this.collectingEndDT = value;
            }

            /**
             * Gets the value of the newCollectingEndDT property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getNewCollectingEndDT() {
                return newCollectingEndDT;
            }

            /**
             * Sets the value of the newCollectingEndDT property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setNewCollectingEndDT(XMLGregorianCalendar value) {
                this.newCollectingEndDT = value;
            }

            /**
             * Gets the value of the scoringDT property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getScoringDT() {
                return scoringDT;
            }

            /**
             * Sets the value of the scoringDT property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setScoringDT(XMLGregorianCalendar value) {
                this.scoringDT = value;
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
         *         &lt;element name="collectingInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="startDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="endDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="scoringInfo" type="{http://zakupki.gov.ru/oos/EPtypes/1}procedureScoringType"/>
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
            "collectingInfo",
            "scoringInfo"
        })
        public static class SecondStageInfo {

            @XmlElement(required = true)
            protected ProlongationEOKDType.ProlongationInfo.SecondStageInfo.CollectingInfo collectingInfo;
            @XmlElement(required = true)
            protected ProcedureScoringType scoringInfo;

            /**
             * Gets the value of the collectingInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProlongationEOKDType.ProlongationInfo.SecondStageInfo.CollectingInfo }
             *     
             */
            public ProlongationEOKDType.ProlongationInfo.SecondStageInfo.CollectingInfo getCollectingInfo() {
                return collectingInfo;
            }

            /**
             * Sets the value of the collectingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProlongationEOKDType.ProlongationInfo.SecondStageInfo.CollectingInfo }
             *     
             */
            public void setCollectingInfo(ProlongationEOKDType.ProlongationInfo.SecondStageInfo.CollectingInfo value) {
                this.collectingInfo = value;
            }

            /**
             * Gets the value of the scoringInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProcedureScoringType }
             *     
             */
            public ProcedureScoringType getScoringInfo() {
                return scoringInfo;
            }

            /**
             * Sets the value of the scoringInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProcedureScoringType }
             *     
             */
            public void setScoringInfo(ProcedureScoringType value) {
                this.scoringInfo = value;
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
             *         &lt;element name="startDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="endDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
                "startDT",
                "endDT"
            })
            public static class CollectingInfo {

                @XmlElement(required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar startDT;
                @XmlElement(required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar endDT;

                /**
                 * Gets the value of the startDT property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getStartDT() {
                    return startDT;
                }

                /**
                 * Sets the value of the startDT property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setStartDT(XMLGregorianCalendar value) {
                    this.startDT = value;
                }

                /**
                 * Gets the value of the endDT property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEndDT() {
                    return endDT;
                }

                /**
                 * Sets the value of the endDT property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setEndDT(XMLGregorianCalendar value) {
                    this.endDT = value;
                }

            }

        }

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 11:58:14 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Уведомление о продлении срока рассмотрения и оценки заявок
 * 
 * <p>Java class for zfcs_purchaseProlongationOKType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_purchaseProlongationOKType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/oos/types/1}zfcs_purchaseProlongationCommonType">
 *       &lt;sequence>
 *         &lt;element name="lot" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="lotObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="scoringDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="scoringProlongationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_purchaseProlongationOKType", propOrder = {
    "lot",
    "scoringDate",
    "scoringProlongationDate"
})
public class ZfcsPurchaseProlongationOKType
    extends ZfcsPurchaseProlongationCommonType
{

    protected ZfcsPurchaseProlongationOKType.Lot lot;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scoringDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scoringProlongationDate;

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPurchaseProlongationOKType.Lot }
     *     
     */
    public ZfcsPurchaseProlongationOKType.Lot getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPurchaseProlongationOKType.Lot }
     *     
     */
    public void setLot(ZfcsPurchaseProlongationOKType.Lot value) {
        this.lot = value;
    }

    /**
     * Gets the value of the scoringDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScoringDate() {
        return scoringDate;
    }

    /**
     * Sets the value of the scoringDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScoringDate(XMLGregorianCalendar value) {
        this.scoringDate = value;
    }

    /**
     * Gets the value of the scoringProlongationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScoringProlongationDate() {
        return scoringProlongationDate;
    }

    /**
     * Sets the value of the scoringProlongationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScoringProlongationDate(XMLGregorianCalendar value) {
        this.scoringProlongationDate = value;
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
     *         &lt;element name="lotNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="lotObjectInfo" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType" minOccurs="0"/>
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
        "lotNumber",
        "lotObjectInfo"
    })
    public static class Lot {

        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger lotNumber;
        protected String lotObjectInfo;

        /**
         * Gets the value of the lotNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLotNumber() {
            return lotNumber;
        }

        /**
         * Sets the value of the lotNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLotNumber(BigInteger value) {
            this.lotNumber = value;
        }

        /**
         * Gets the value of the lotObjectInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLotObjectInfo() {
            return lotObjectInfo;
        }

        /**
         * Sets the value of the lotObjectInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLotObjectInfo(String value) {
            this.lotObjectInfo = value;
        }

    }

}

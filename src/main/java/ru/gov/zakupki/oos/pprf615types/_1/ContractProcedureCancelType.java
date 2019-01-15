//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.gov.zakupki.oos.common._1.DocPropertyType;


/**
 * Отмена информации об исполнении/расторжении договора о проведении капитального ремонта по ПП РФ № 615
 * 
 * <p>Java class for contractProcedureCancelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractProcedureCancelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://zakupki.gov.ru/oos/base/1}externalIdType" minOccurs="0"/>
 *         &lt;element name="commonInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}contractDocCommonInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="cancelDocType" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
 *                   &lt;element name="canceledDocNumber" type="{http://zakupki.gov.ru/oos/base/1}contractDocRegNum615Type"/>
 *                   &lt;element name="stageInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}stageType" minOccurs="0"/>
 *                   &lt;element name="cancelReason" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
 *                   &lt;element name="prescriptionProperty" type="{http://zakupki.gov.ru/oos/common/1}docPropertyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printFormInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}printFormType" minOccurs="0"/>
 *         &lt;element name="extPrintFormInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}extPrintFormType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractProcedureCancelType", propOrder = {
    "id",
    "externalId",
    "commonInfo",
    "printFormInfo",
    "extPrintFormInfo"
})
public class ContractProcedureCancelType {

    protected Long id;
    protected String externalId;
    @XmlElement(required = true)
    protected ContractProcedureCancelType.CommonInfo commonInfo;
    protected PrintFormType printFormInfo;
    protected ExtPrintFormType extPrintFormInfo;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the commonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractProcedureCancelType.CommonInfo }
     *     
     */
    public ContractProcedureCancelType.CommonInfo getCommonInfo() {
        return commonInfo;
    }

    /**
     * Sets the value of the commonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractProcedureCancelType.CommonInfo }
     *     
     */
    public void setCommonInfo(ContractProcedureCancelType.CommonInfo value) {
        this.commonInfo = value;
    }

    /**
     * Gets the value of the printFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrintFormType }
     *     
     */
    public PrintFormType getPrintFormInfo() {
        return printFormInfo;
    }

    /**
     * Sets the value of the printFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintFormType }
     *     
     */
    public void setPrintFormInfo(PrintFormType value) {
        this.printFormInfo = value;
    }

    /**
     * Gets the value of the extPrintFormInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtPrintFormType }
     *     
     */
    public ExtPrintFormType getExtPrintFormInfo() {
        return extPrintFormInfo;
    }

    /**
     * Sets the value of the extPrintFormInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtPrintFormType }
     *     
     */
    public void setExtPrintFormInfo(ExtPrintFormType value) {
        this.extPrintFormInfo = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeVersion(String value) {
        this.schemeVersion = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/oos/pprf615types/1}contractDocCommonInfoType">
     *       &lt;sequence>
     *         &lt;element name="cancelDocType" type="{http://zakupki.gov.ru/oos/base/1}text2000Type" minOccurs="0"/>
     *         &lt;element name="canceledDocNumber" type="{http://zakupki.gov.ru/oos/base/1}contractDocRegNum615Type"/>
     *         &lt;element name="stageInfo" type="{http://zakupki.gov.ru/oos/pprf615types/1}stageType" minOccurs="0"/>
     *         &lt;element name="cancelReason" type="{http://zakupki.gov.ru/oos/base/1}text2000Type"/>
     *         &lt;element name="prescriptionProperty" type="{http://zakupki.gov.ru/oos/common/1}docPropertyType" minOccurs="0"/>
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
        "cancelDocType",
        "canceledDocNumber",
        "stageInfo",
        "cancelReason",
        "prescriptionProperty"
    })
    public static class CommonInfo
        extends ContractDocCommonInfoType
    {

        protected String cancelDocType;
        @XmlElement(required = true)
        protected String canceledDocNumber;
        protected StageType stageInfo;
        @XmlElement(required = true)
        protected String cancelReason;
        protected DocPropertyType prescriptionProperty;

        /**
         * Gets the value of the cancelDocType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelDocType() {
            return cancelDocType;
        }

        /**
         * Sets the value of the cancelDocType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelDocType(String value) {
            this.cancelDocType = value;
        }

        /**
         * Gets the value of the canceledDocNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCanceledDocNumber() {
            return canceledDocNumber;
        }

        /**
         * Sets the value of the canceledDocNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCanceledDocNumber(String value) {
            this.canceledDocNumber = value;
        }

        /**
         * Gets the value of the stageInfo property.
         * 
         * @return
         *     possible object is
         *     {@link StageType }
         *     
         */
        public StageType getStageInfo() {
            return stageInfo;
        }

        /**
         * Sets the value of the stageInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link StageType }
         *     
         */
        public void setStageInfo(StageType value) {
            this.stageInfo = value;
        }

        /**
         * Gets the value of the cancelReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelReason() {
            return cancelReason;
        }

        /**
         * Sets the value of the cancelReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelReason(String value) {
            this.cancelReason = value;
        }

        /**
         * Gets the value of the prescriptionProperty property.
         * 
         * @return
         *     possible object is
         *     {@link DocPropertyType }
         *     
         */
        public DocPropertyType getPrescriptionProperty() {
            return prescriptionProperty;
        }

        /**
         * Sets the value of the prescriptionProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocPropertyType }
         *     
         */
        public void setPrescriptionProperty(DocPropertyType value) {
            this.prescriptionProperty = value;
        }

    }

}

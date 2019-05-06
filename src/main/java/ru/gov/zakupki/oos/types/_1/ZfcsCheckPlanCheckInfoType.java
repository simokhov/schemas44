//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 10:14:47 AM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип: Информация по проверке плана проверок
 * 
 * <p>Java class for zfcs_checkPlanCheckInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_checkPlanCheckInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkNumber" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkNumberType" minOccurs="0"/>
 *         &lt;element name="regNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="checkSubject" type="{http://zakupki.gov.ru/oos/types/1}zfcs_checkSubjectPlanType"/>
 *         &lt;element name="checkStartStage" type="{http://zakupki.gov.ru/oos/types/1}zfcs_stageType"/>
 *         &lt;element name="checkPublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="base" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *         &lt;element name="period" type="{http://zakupki.gov.ru/oos/types/1}zfcs_periodType" minOccurs="0"/>
 *         &lt;element name="notice" type="{http://zakupki.gov.ru/oos/types/1}zfcs_noticeDetailsType" minOccurs="0"/>
 *         &lt;element name="order" type="{http://zakupki.gov.ru/oos/types/1}zfcs_orderDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zfcs_checkPlanCheckInfoType", propOrder = {
    "checkNumber",
    "regNumber",
    "checkSubject",
    "checkStartStage",
    "checkPublishDate",
    "base",
    "period",
    "notice",
    "order"
})
@XmlSeeAlso({
    ru.gov.zakupki.oos.types._1.ZfcsEventPlanType.CheckList.CheckInfo.class
})
public class ZfcsCheckPlanCheckInfoType {

    protected String checkNumber;
    protected String regNumber;
    @XmlElement(required = true)
    protected ZfcsCheckSubjectPlanType checkSubject;
    @XmlElement(required = true)
    protected ZfcsStageType checkStartStage;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkPublishDate;
    @XmlElement(required = true)
    protected String base;
    protected ZfcsPeriodType period;
    protected ZfcsNoticeDetailsType notice;
    protected ZfcsOrderDetailsType order;

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the checkSubject property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsCheckSubjectPlanType }
     *     
     */
    public ZfcsCheckSubjectPlanType getCheckSubject() {
        return checkSubject;
    }

    /**
     * Sets the value of the checkSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsCheckSubjectPlanType }
     *     
     */
    public void setCheckSubject(ZfcsCheckSubjectPlanType value) {
        this.checkSubject = value;
    }

    /**
     * Gets the value of the checkStartStage property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsStageType }
     *     
     */
    public ZfcsStageType getCheckStartStage() {
        return checkStartStage;
    }

    /**
     * Sets the value of the checkStartStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsStageType }
     *     
     */
    public void setCheckStartStage(ZfcsStageType value) {
        this.checkStartStage = value;
    }

    /**
     * Gets the value of the checkPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckPublishDate() {
        return checkPublishDate;
    }

    /**
     * Sets the value of the checkPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckPublishDate(XMLGregorianCalendar value) {
        this.checkPublishDate = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsPeriodType }
     *     
     */
    public ZfcsPeriodType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsPeriodType }
     *     
     */
    public void setPeriod(ZfcsPeriodType value) {
        this.period = value;
    }

    /**
     * Gets the value of the notice property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsNoticeDetailsType }
     *     
     */
    public ZfcsNoticeDetailsType getNotice() {
        return notice;
    }

    /**
     * Sets the value of the notice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsNoticeDetailsType }
     *     
     */
    public void setNotice(ZfcsNoticeDetailsType value) {
        this.notice = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrderDetailsType }
     *     
     */
    public ZfcsOrderDetailsType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrderDetailsType }
     *     
     */
    public void setOrder(ZfcsOrderDetailsType value) {
        this.order = value;
    }

}

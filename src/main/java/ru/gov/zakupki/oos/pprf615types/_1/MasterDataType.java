//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.pprf615types._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Набор элементов справочников и классификаторов по ПП РФ № 615
 * 
 * <p>Java class for masterDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="masterDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="pprf615NsiFundingSource" type="{http://zakupki.gov.ru/oos/pprf615types/1}nsiFundingSourcesType"/>
 *         &lt;element name="pprf615NsiExclusionReason" type="{http://zakupki.gov.ru/oos/pprf615types/1}nsiExclusionReasonType"/>
 *         &lt;element name="pprf615NsiPurchaseSubject" type="{http://zakupki.gov.ru/oos/pprf615types/1}nsiPurchaseSubjectType"/>
 *         &lt;element name="pprf615NsiTerminationGround" type="{http://zakupki.gov.ru/oos/pprf615types/1}nsiTerminationGroundType"/>
 *         &lt;element name="pprf615NsiTerminationReason" type="{http://zakupki.gov.ru/oos/pprf615types/1}nsiTerminationReasonType"/>
 *       &lt;/choice>
 *       &lt;attribute name="schemeVersion" use="required" type="{http://zakupki.gov.ru/oos/base/1}schemeVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "masterDataType", propOrder = {
    "pprf615NsiFundingSourceOrPprf615NsiExclusionReasonOrPprf615NsiPurchaseSubject"
})
public class MasterDataType {

    @XmlElements({
        @XmlElement(name = "pprf615NsiFundingSource", type = NsiFundingSourcesType.class),
        @XmlElement(name = "pprf615NsiExclusionReason", type = NsiExclusionReasonType.class),
        @XmlElement(name = "pprf615NsiPurchaseSubject", type = NsiPurchaseSubjectType.class),
        @XmlElement(name = "pprf615NsiTerminationGround", type = NsiTerminationGroundType.class),
        @XmlElement(name = "pprf615NsiTerminationReason", type = NsiTerminationReasonType.class)
    })
    protected List<Object> pprf615NsiFundingSourceOrPprf615NsiExclusionReasonOrPprf615NsiPurchaseSubject;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the pprf615NsiFundingSourceOrPprf615NsiExclusionReasonOrPprf615NsiPurchaseSubject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pprf615NsiFundingSourceOrPprf615NsiExclusionReasonOrPprf615NsiPurchaseSubject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPprf615NsiFundingSourceOrPprf615NsiExclusionReasonOrPprf615NsiPurchaseSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiFundingSourcesType }
     * {@link NsiExclusionReasonType }
     * {@link NsiPurchaseSubjectType }
     * {@link NsiTerminationGroundType }
     * {@link NsiTerminationReasonType }
     * 
     * 
     */
    public List<Object> getPprf615NsiFundingSourceOrPprf615NsiExclusionReasonOrPprf615NsiPurchaseSubject() {
        if (pprf615NsiFundingSourceOrPprf615NsiExclusionReasonOrPprf615NsiPurchaseSubject == null) {
            pprf615NsiFundingSourceOrPprf615NsiExclusionReasonOrPprf615NsiPurchaseSubject = new ArrayList<Object>();
        }
        return this.pprf615NsiFundingSourceOrPprf615NsiExclusionReasonOrPprf615NsiPurchaseSubject;
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

}

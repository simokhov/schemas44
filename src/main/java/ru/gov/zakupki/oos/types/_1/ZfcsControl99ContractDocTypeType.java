//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.02 at 03:35:23 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_control99ContractDocTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_control99ContractDocTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="scanDoc"/>
 *     &lt;enumeration value="modificationDoc"/>
 *     &lt;enumeration value="singleSupplierDoc"/>
 *     &lt;enumeration value="medicalDoc"/>
 *     &lt;enumeration value="executionDoc"/>
 *     &lt;enumeration value="payDoc"/>
 *     &lt;enumeration value="otherDoc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_control99ContractDocTypeType")
@XmlEnum
public enum ZfcsControl99ContractDocTypeType {

    @XmlEnumValue("scanDoc")
    SCAN_DOC("scanDoc"),
    @XmlEnumValue("modificationDoc")
    MODIFICATION_DOC("modificationDoc"),
    @XmlEnumValue("singleSupplierDoc")
    SINGLE_SUPPLIER_DOC("singleSupplierDoc"),
    @XmlEnumValue("medicalDoc")
    MEDICAL_DOC("medicalDoc"),
    @XmlEnumValue("executionDoc")
    EXECUTION_DOC("executionDoc"),
    @XmlEnumValue("payDoc")
    PAY_DOC("payDoc"),
    @XmlEnumValue("otherDoc")
    OTHER_DOC("otherDoc");
    private final String value;

    ZfcsControl99ContractDocTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsControl99ContractDocTypeType fromValue(String v) {
        for (ZfcsControl99ContractDocTypeType c: ZfcsControl99ContractDocTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:22:52 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_customerReportContractTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_customerReportContractTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMP"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="S30"/>
 *     &lt;enumeration value="CRD"/>
 *     &lt;enumeration value="SGL"/>
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="ZK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_customerReportContractTypeEnum")
@XmlEnum
public enum ZfcsCustomerReportContractTypeEnum {

    SMP("SMP"),
    CON("CON"),
    @XmlEnumValue("S30")
    S_30("S30"),
    CRD("CRD"),
    SGL("SGL"),
    ATM("ATM"),
    ZK("ZK");
    private final String value;

    ZfcsCustomerReportContractTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsCustomerReportContractTypeEnum fromValue(String v) {
        for (ZfcsCustomerReportContractTypeEnum c: ZfcsCustomerReportContractTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

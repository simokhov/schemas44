//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:24:25 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_abandonedReasonTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_abandonedReasonTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OR"/>
 *     &lt;enumeration value="NR"/>
 *     &lt;enumeration value="OV"/>
 *     &lt;enumeration value="NV"/>
 *     &lt;enumeration value="OV2"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="NS"/>
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="OO"/>
 *     &lt;enumeration value="OV3"/>
 *     &lt;enumeration value="OP"/>
 *     &lt;enumeration value="OV4"/>
 *     &lt;enumeration value="NV4"/>
 *     &lt;enumeration value="NV3"/>
 *     &lt;enumeration value="NV2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_abandonedReasonTypeEnum")
@XmlEnum
public enum ZfcsAbandonedReasonTypeEnum {

    OR("OR"),
    NR("NR"),
    OV("OV"),
    NV("NV"),
    @XmlEnumValue("OV2")
    OV_2("OV2"),
    O("O"),
    NS("NS"),
    ON("ON"),
    OO("OO"),
    @XmlEnumValue("OV3")
    OV_3("OV3"),
    OP("OP"),
    @XmlEnumValue("OV4")
    OV_4("OV4"),
    @XmlEnumValue("NV4")
    NV_4("NV4"),
    @XmlEnumValue("NV3")
    NV_3("NV3"),
    @XmlEnumValue("NV2")
    NV_2("NV2");
    private final String value;

    ZfcsAbandonedReasonTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsAbandonedReasonTypeEnum fromValue(String v) {
        for (ZfcsAbandonedReasonTypeEnum c: ZfcsAbandonedReasonTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.signincoming._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indexObjectTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="indexObjectTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TP"/>
 *     &lt;enumeration value="PP"/>
 *     &lt;enumeration value="EF"/>
 *     &lt;enumeration value="EP"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="OKD"/>
 *     &lt;enumeration value="OKOU"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="ZAKA"/>
 *     &lt;enumeration value="ZAKK"/>
 *     &lt;enumeration value="ZAKKD"/>
 *     &lt;enumeration value="ZAKKOU"/>
 *     &lt;enumeration value="ZKBI"/>
 *     &lt;enumeration value="ZK"/>
 *     &lt;enumeration value="ZP"/>
 *     &lt;enumeration value="ST111"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="OOKZ"/>
 *     &lt;enumeration value="OZ"/>
 *     &lt;enumeration value="DIZK"/>
 *     &lt;enumeration value="ZC"/>
 *     &lt;enumeration value="RA"/>
 *     &lt;enumeration value="PPM"/>
 *     &lt;enumeration value="PRK"/>
 *     &lt;enumeration value="PVKM"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="UC"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="DD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "indexObjectTypeEnum")
@XmlEnum
public enum IndexObjectTypeEnum {

    TP("TP"),
    PP("PP"),
    EF("EF"),
    EP("EP"),
    OK("OK"),
    OKD("OKD"),
    OKOU("OKOU"),
    PO("PO"),
    ZAKA("ZAKA"),
    ZAKK("ZAKK"),
    ZAKKD("ZAKKD"),
    ZAKKOU("ZAKKOU"),
    ZKBI("ZKBI"),
    ZK("ZK"),
    ZP("ZP"),
    @XmlEnumValue("ST111")
    ST_111("ST111"),
    CT("CT"),
    BG("BG"),
    OOKZ("OOKZ"),
    OZ("OZ"),
    DIZK("DIZK"),
    ZC("ZC"),
    RA("RA"),
    PPM("PPM"),
    PRK("PRK"),
    PVKM("PVKM"),
    BC("BC"),
    CM("CM"),
    CR("CR"),
    UC("UC"),
    PC("PC"),
    DD("DD");
    private final String value;

    IndexObjectTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndexObjectTypeEnum fromValue(String v) {
        for (IndexObjectTypeEnum c: IndexObjectTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

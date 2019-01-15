//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.15 at 02:09:44 PM MSK 
//


package ru.gov.zakupki.oos.types._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zfcs_control99ProtocolTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zfcs_control99ProtocolTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fcsProtocolOK2"/>
 *     &lt;enumeration value="fcsProtocolOKSingleApp"/>
 *     &lt;enumeration value="fcsProtocolOKOU3"/>
 *     &lt;enumeration value="fcsProtocolOKOUSingleApp"/>
 *     &lt;enumeration value="fcsProtocolOKD5"/>
 *     &lt;enumeration value="fcsProtocolOKDSingleApp"/>
 *     &lt;enumeration value="fcsProtocolZK"/>
 *     &lt;enumeration value="fcsProtocolZKAfterProlong"/>
 *     &lt;enumeration value="fcsProtocolZKBI"/>
 *     &lt;enumeration value="fcsProtocolEF3"/>
 *     &lt;enumeration value="fcsProtocolEFSingleApp"/>
 *     &lt;enumeration value="fcsProtocolEFSinglePart"/>
 *     &lt;enumeration value="fcsProtocolZP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zfcs_control99ProtocolTypeType")
@XmlEnum
public enum ZfcsControl99ProtocolTypeType {

    @XmlEnumValue("fcsProtocolOK2")
    FCS_PROTOCOL_OK_2("fcsProtocolOK2"),
    @XmlEnumValue("fcsProtocolOKSingleApp")
    FCS_PROTOCOL_OK_SINGLE_APP("fcsProtocolOKSingleApp"),
    @XmlEnumValue("fcsProtocolOKOU3")
    FCS_PROTOCOL_OKOU_3("fcsProtocolOKOU3"),
    @XmlEnumValue("fcsProtocolOKOUSingleApp")
    FCS_PROTOCOL_OKOU_SINGLE_APP("fcsProtocolOKOUSingleApp"),
    @XmlEnumValue("fcsProtocolOKD5")
    FCS_PROTOCOL_OKD_5("fcsProtocolOKD5"),
    @XmlEnumValue("fcsProtocolOKDSingleApp")
    FCS_PROTOCOL_OKD_SINGLE_APP("fcsProtocolOKDSingleApp"),
    @XmlEnumValue("fcsProtocolZK")
    FCS_PROTOCOL_ZK("fcsProtocolZK"),
    @XmlEnumValue("fcsProtocolZKAfterProlong")
    FCS_PROTOCOL_ZK_AFTER_PROLONG("fcsProtocolZKAfterProlong"),
    @XmlEnumValue("fcsProtocolZKBI")
    FCS_PROTOCOL_ZKBI("fcsProtocolZKBI"),
    @XmlEnumValue("fcsProtocolEF3")
    FCS_PROTOCOL_EF_3("fcsProtocolEF3"),
    @XmlEnumValue("fcsProtocolEFSingleApp")
    FCS_PROTOCOL_EF_SINGLE_APP("fcsProtocolEFSingleApp"),
    @XmlEnumValue("fcsProtocolEFSinglePart")
    FCS_PROTOCOL_EF_SINGLE_PART("fcsProtocolEFSinglePart"),
    @XmlEnumValue("fcsProtocolZP")
    FCS_PROTOCOL_ZP("fcsProtocolZP");
    private final String value;

    ZfcsControl99ProtocolTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZfcsControl99ProtocolTypeType fromValue(String v) {
        for (ZfcsControl99ProtocolTypeType c: ZfcsControl99ProtocolTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.05 at 04:42:29 PM MSK 
//


package ru.gov.zakupki.oos.printform._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения для проверки на соотвествие ЛБО
 * 
 * <p>Java class for zfcs_limitsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zfcs_limitsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protocolDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_organizationInfoType"/>
 *         &lt;choice>
 *           &lt;element name="error" type="{http://zakupki.gov.ru/oos/types/1}zfcs_longTextType"/>
 *           &lt;sequence>
 *             &lt;element name="balanceInformation">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   &lt;maxLength value="2000"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="accounts">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="account" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_accountNumType"/>
 *                       &lt;element name="limitsControl">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="limitControl" maxOccurs="unbounded">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="kbkCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
 *                                           &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
 *                                           &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
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
@XmlType(name = "zfcs_limitsRequestType", propOrder = {
    "protocolDate",
    "customer",
    "error",
    "balanceInformation",
    "accounts"
})
public class ZfcsLimitsRequestType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar protocolDate;
    @XmlElement(required = true)
    protected ZfcsOrganizationInfoType customer;
    protected String error;
    protected String balanceInformation;
    protected ZfcsLimitsRequestType.Accounts accounts;
    @XmlAttribute(name = "schemeVersion", required = true)
    protected String schemeVersion;

    /**
     * Gets the value of the protocolDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtocolDate() {
        return protocolDate;
    }

    /**
     * Sets the value of the protocolDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtocolDate(XMLGregorianCalendar value) {
        this.protocolDate = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public ZfcsOrganizationInfoType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsOrganizationInfoType }
     *     
     */
    public void setCustomer(ZfcsOrganizationInfoType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the balanceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceInformation() {
        return balanceInformation;
    }

    /**
     * Sets the value of the balanceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceInformation(String value) {
        this.balanceInformation = value;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link ZfcsLimitsRequestType.Accounts }
     *     
     */
    public ZfcsLimitsRequestType.Accounts getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZfcsLimitsRequestType.Accounts }
     *     
     */
    public void setAccounts(ZfcsLimitsRequestType.Accounts value) {
        this.accounts = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="account" type="{http://zakupki.gov.ru/oos/printform/1}zfcs_accountNumType"/>
     *         &lt;element name="limitsControl">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="limitControl" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="kbkCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
     *                             &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
     *                             &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "account",
        "limitsControl"
    })
    public static class Accounts {

        @XmlElement(required = true)
        protected String account;
        @XmlElement(required = true)
        protected ZfcsLimitsRequestType.Accounts.LimitsControl limitsControl;

        /**
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccount() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccount(String value) {
            this.account = value;
        }

        /**
         * Gets the value of the limitsControl property.
         * 
         * @return
         *     possible object is
         *     {@link ZfcsLimitsRequestType.Accounts.LimitsControl }
         *     
         */
        public ZfcsLimitsRequestType.Accounts.LimitsControl getLimitsControl() {
            return limitsControl;
        }

        /**
         * Sets the value of the limitsControl property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZfcsLimitsRequestType.Accounts.LimitsControl }
         *     
         */
        public void setLimitsControl(ZfcsLimitsRequestType.Accounts.LimitsControl value) {
            this.limitsControl = value;
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
         *         &lt;element name="limitControl" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="kbkCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
         *                   &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
         *                   &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
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
            "limitControl"
        })
        public static class LimitsControl {

            @XmlElement(required = true)
            protected List<ZfcsLimitsRequestType.Accounts.LimitsControl.LimitControl> limitControl;

            /**
             * Gets the value of the limitControl property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the limitControl property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLimitControl().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ZfcsLimitsRequestType.Accounts.LimitsControl.LimitControl }
             * 
             * 
             */
            public List<ZfcsLimitsRequestType.Accounts.LimitsControl.LimitControl> getLimitControl() {
                if (limitControl == null) {
                    limitControl = new ArrayList<ZfcsLimitsRequestType.Accounts.LimitsControl.LimitControl>();
                }
                return this.limitControl;
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
             *         &lt;element name="kbkCode" type="{http://zakupki.gov.ru/oos/types/1}zfcs_kbkType"/>
             *         &lt;element name="year" type="{http://zakupki.gov.ru/oos/types/1}zfcs_yearType"/>
             *         &lt;element name="sum" type="{http://zakupki.gov.ru/oos/types/1}zfcs_moneyType"/>
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
                "kbkCode",
                "year",
                "sum"
            })
            public static class LimitControl {

                @XmlElement(required = true)
                protected String kbkCode;
                protected int year;
                @XmlElement(required = true)
                protected String sum;

                /**
                 * Gets the value of the kbkCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKbkCode() {
                    return kbkCode;
                }

                /**
                 * Sets the value of the kbkCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKbkCode(String value) {
                    this.kbkCode = value;
                }

                /**
                 * Gets the value of the year property.
                 * 
                 */
                public int getYear() {
                    return year;
                }

                /**
                 * Sets the value of the year property.
                 * 
                 */
                public void setYear(int value) {
                    this.year = value;
                }

                /**
                 * Gets the value of the sum property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSum() {
                    return sum;
                }

                /**
                 * Sets the value of the sum property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSum(String value) {
                    this.sum = value;
                }

            }

        }

    }

}

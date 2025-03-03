//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.22 at 06:00:08 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentMethodsTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentMethodsTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="AmericanExpress"/>
 *     &lt;enumeration value="DinersClub"/>
 *     &lt;enumeration value="JCB"/>
 *     &lt;enumeration value="EnRoute"/>
 *     &lt;enumeration value="Echeck"/>
 *     &lt;enumeration value="Paypal"/>
 *     &lt;enumeration value="VisaCheckout"/>
 *     &lt;enumeration value="ApplePay"/>
 *     &lt;enumeration value="AndroidPay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentMethodsTypeEnum")
@XmlEnum
public enum PaymentMethodsTypeEnum {

    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("AmericanExpress")
    AMERICAN_EXPRESS("AmericanExpress"),
    @XmlEnumValue("DinersClub")
    DINERS_CLUB("DinersClub"),
    JCB("JCB"),
    @XmlEnumValue("EnRoute")
    EN_ROUTE("EnRoute"),
    @XmlEnumValue("Echeck")
    ECHECK("Echeck"),
    @XmlEnumValue("Paypal")
    PAYPAL("Paypal"),
    @XmlEnumValue("VisaCheckout")
    VISA_CHECKOUT("VisaCheckout"),
    @XmlEnumValue("ApplePay")
    APPLE_PAY("ApplePay"),
    @XmlEnumValue("AndroidPay")
    ANDROID_PAY("AndroidPay");
    private final String value;

    PaymentMethodsTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodsTypeEnum fromValue(String v) {
        for (PaymentMethodsTypeEnum c: PaymentMethodsTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

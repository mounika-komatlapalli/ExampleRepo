
package org.opentravel.ota._2003._05.aircommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Account code, net reporting code, nonendorsable and nonrefundable indicators, penalty restriction indicator, pricing system, statistical code and tour code.
 * 
 * <p>Java class for ET_FareInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ET_FareInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Waiver" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to19" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="ExchangedReissued"/>
 *                       &lt;enumeration value="FareComponent"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RuleIndicator" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RuleCode" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to3" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="NetReportingCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to3" />
 *       &lt;attribute name="StatisticalCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to3" />
 *       &lt;attribute name="TourCode" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}StringLength1to16" />
 *       &lt;attribute name="CountryCodeOfIssue" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}ISO3166" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ET_FareInfo", propOrder = {
    "waiver",
    "ruleIndicator"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.aircommontypes.EMDType.FareInfo.class
})
public class ETFareInfo {

    @XmlElement(name = "Waiver")
    protected List<ETFareInfo.Waiver> waiver;
    @XmlElement(name = "RuleIndicator")
    protected List<ETFareInfo.RuleIndicator> ruleIndicator;
    @XmlAttribute(name = "NetReportingCode")
    protected String netReportingCode;
    @XmlAttribute(name = "StatisticalCode")
    protected String statisticalCode;
    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    @XmlAttribute(name = "CountryCodeOfIssue")
    protected String countryCodeOfIssue;

    /**
     * Gets the value of the waiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETFareInfo.Waiver }
     * 
     * 
     */
    public List<ETFareInfo.Waiver> getWaiver() {
        if (waiver == null) {
            waiver = new ArrayList<ETFareInfo.Waiver>();
        }
        return this.waiver;
    }

    /**
     * Gets the value of the ruleIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETFareInfo.RuleIndicator }
     * 
     * 
     */
    public List<ETFareInfo.RuleIndicator> getRuleIndicator() {
        if (ruleIndicator == null) {
            ruleIndicator = new ArrayList<ETFareInfo.RuleIndicator>();
        }
        return this.ruleIndicator;
    }

    /**
     * Gets the value of the netReportingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetReportingCode() {
        return netReportingCode;
    }

    /**
     * Sets the value of the netReportingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetReportingCode(String value) {
        this.netReportingCode = value;
    }

    /**
     * Gets the value of the statisticalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticalCode() {
        return statisticalCode;
    }

    /**
     * Sets the value of the statisticalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticalCode(String value) {
        this.statisticalCode = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the countryCodeOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeOfIssue() {
        return countryCodeOfIssue;
    }

    /**
     * Sets the value of the countryCodeOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeOfIssue(String value) {
        this.countryCodeOfIssue = value;
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
     *       &lt;attribute name="RuleCode" use="required" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}NumericStringLength1to3" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RuleIndicator {

        @XmlAttribute(name = "RuleCode", required = true)
        protected String ruleCode;

        /**
         * Gets the value of the ruleCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleCode() {
            return ruleCode;
        }

        /**
         * Sets the value of the ruleCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleCode(String value) {
            this.ruleCode = value;
        }

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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05/SimpleTypes}AlphaNumericStringLength1to19" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="ExchangedReissued"/>
     *             &lt;enumeration value="FareComponent"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Waiver {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Type")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}

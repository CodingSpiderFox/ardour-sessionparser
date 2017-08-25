//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.25 at 11:42:00 PM CEST 
//


package org.codingspiderfox.ardoursessionparser.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ControllableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControllableType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="flags" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="self-solo" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="soloed-by-upstream" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="soloed-by-downstream" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="solo-isolated" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="solo-safe" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="phase-invert" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="monitoring" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parameter" type="{http://www.w3.org/2001/XMLSchema}short" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControllableType", propOrder = {
    "value"
})
public class ControllableType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "id")
    protected Short id;
    @XmlAttribute(name = "flags")
    protected String flags;
    @XmlAttribute(name = "value")
    protected Float valueAttribute;
    @XmlAttribute(name = "self-solo")
    protected Byte selfSolo;
    @XmlAttribute(name = "soloed-by-upstream")
    protected Byte soloedByUpstream;
    @XmlAttribute(name = "soloed-by-downstream")
    protected Byte soloedByDownstream;
    @XmlAttribute(name = "solo-isolated")
    protected Byte soloIsolated;
    @XmlAttribute(name = "solo-safe")
    protected Byte soloSafe;
    @XmlAttribute(name = "phase-invert")
    protected String phaseInvert;
    @XmlAttribute(name = "monitoring")
    protected String monitoring;
    @XmlAttribute(name = "parameter")
    protected Short parameter;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setId(Short value) {
        this.id = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlags(String value) {
        this.flags = value;
    }

    /**
     * Gets the value of the valueAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValueAttribute() {
        return valueAttribute;
    }

    /**
     * Sets the value of the valueAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValueAttribute(Float value) {
        this.valueAttribute = value;
    }

    /**
     * Gets the value of the selfSolo property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSelfSolo() {
        return selfSolo;
    }

    /**
     * Sets the value of the selfSolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSelfSolo(Byte value) {
        this.selfSolo = value;
    }

    /**
     * Gets the value of the soloedByUpstream property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSoloedByUpstream() {
        return soloedByUpstream;
    }

    /**
     * Sets the value of the soloedByUpstream property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSoloedByUpstream(Byte value) {
        this.soloedByUpstream = value;
    }

    /**
     * Gets the value of the soloedByDownstream property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSoloedByDownstream() {
        return soloedByDownstream;
    }

    /**
     * Sets the value of the soloedByDownstream property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSoloedByDownstream(Byte value) {
        this.soloedByDownstream = value;
    }

    /**
     * Gets the value of the soloIsolated property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSoloIsolated() {
        return soloIsolated;
    }

    /**
     * Sets the value of the soloIsolated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSoloIsolated(Byte value) {
        this.soloIsolated = value;
    }

    /**
     * Gets the value of the soloSafe property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSoloSafe() {
        return soloSafe;
    }

    /**
     * Sets the value of the soloSafe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSoloSafe(Byte value) {
        this.soloSafe = value;
    }

    /**
     * Gets the value of the phaseInvert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseInvert() {
        return phaseInvert;
    }

    /**
     * Sets the value of the phaseInvert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseInvert(String value) {
        this.phaseInvert = value;
    }

    /**
     * Gets the value of the monitoring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitoring() {
        return monitoring;
    }

    /**
     * Sets the value of the monitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoring(String value) {
        this.monitoring = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setParameter(Short value) {
        this.parameter = value;
    }

}

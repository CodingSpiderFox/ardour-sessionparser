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


/**
 * <p>Java class for windows-vstType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="windows-vstType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameters" type="{}parametersType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="last-preset-uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="last-preset-label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parameter-changed-since-last-preset" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "windows-vstType", propOrder = {
    "chunk",
    "parameters"
})
public class WindowsVstType {

    protected String chunk;
    protected ParametersType parameters;
    @XmlAttribute(name = "last-preset-uri")
    protected String lastPresetUri;
    @XmlAttribute(name = "last-preset-label")
    protected String lastPresetLabel;
    @XmlAttribute(name = "parameter-changed-since-last-preset")
    protected Byte parameterChangedSinceLastPreset;

    /**
     * Gets the value of the chunk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChunk() {
        return chunk;
    }

    /**
     * Sets the value of the chunk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChunk(String value) {
        this.chunk = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersType }
     *     
     */
    public ParametersType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersType }
     *     
     */
    public void setParameters(ParametersType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the lastPresetUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPresetUri() {
        return lastPresetUri;
    }

    /**
     * Sets the value of the lastPresetUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPresetUri(String value) {
        this.lastPresetUri = value;
    }

    /**
     * Gets the value of the lastPresetLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPresetLabel() {
        return lastPresetLabel;
    }

    /**
     * Sets the value of the lastPresetLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPresetLabel(String value) {
        this.lastPresetLabel = value;
    }

    /**
     * Gets the value of the parameterChangedSinceLastPreset property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getParameterChangedSinceLastPreset() {
        return parameterChangedSinceLastPreset;
    }

    /**
     * Sets the value of the parameterChangedSinceLastPreset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setParameterChangedSinceLastPreset(Byte value) {
        this.parameterChangedSinceLastPreset = value;
    }

}
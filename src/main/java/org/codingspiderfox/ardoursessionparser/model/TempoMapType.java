//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.25 at 11:42:00 PM CEST 
//


package org.codingspiderfox.ardoursessionparser.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TempoMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TempoMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tempo" type="{}TempoType"/>
 *         &lt;element name="Meter" type="{}MeterType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TempoMapType", propOrder = {
    "tempo",
    "meter"
})
public class TempoMapType {

    @XmlElement(name = "Tempo", required = true)
    protected TempoType tempo;
    @XmlElement(name = "Meter")
    protected List<MeterType> meter;

    /**
     * Gets the value of the tempo property.
     * 
     * @return
     *     possible object is
     *     {@link TempoType }
     *     
     */
    public TempoType getTempo() {
        return tempo;
    }

    /**
     * Sets the value of the tempo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TempoType }
     *     
     */
    public void setTempo(TempoType value) {
        this.tempo = value;
    }

    /**
     * Gets the value of the meter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterType }
     * 
     * 
     */
    public List<MeterType> getMeter() {
        if (meter == null) {
            meter = new ArrayList<MeterType>();
        }
        return this.meter;
    }

}

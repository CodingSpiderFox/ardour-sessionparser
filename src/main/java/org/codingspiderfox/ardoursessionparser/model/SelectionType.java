//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.25 at 11:42:00 PM CEST 
//


package org.codingspiderfox.ardoursessionparser.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StripableAutomationControl" type="{}StripableAutomationControlType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionType", propOrder = {
    "stripableAutomationControl"
})
public class SelectionType {

    @XmlElement(name = "StripableAutomationControl", required = true)
    protected StripableAutomationControlType stripableAutomationControl;

    /**
     * Gets the value of the stripableAutomationControl property.
     * 
     * @return
     *     possible object is
     *     {@link StripableAutomationControlType }
     *     
     */
    public StripableAutomationControlType getStripableAutomationControl() {
        return stripableAutomationControl;
    }

    /**
     * Sets the value of the stripableAutomationControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StripableAutomationControlType }
     *     
     */
    public void setStripableAutomationControl(StripableAutomationControlType value) {
        this.stripableAutomationControl = value;
    }

}
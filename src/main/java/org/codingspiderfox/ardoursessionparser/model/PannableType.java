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
 * <p>Java class for PannableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PannableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Controllable" type="{}ControllableType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Automation" type="{}AutomationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PannableType", propOrder = {
    "controllable",
    "automation"
})
public class PannableType {

    @XmlElement(name = "Controllable")
    protected List<ControllableType> controllable;
    @XmlElement(name = "Automation", required = true)
    protected AutomationType automation;

    /**
     * Gets the value of the controllable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controllable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControllable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControllableType }
     * 
     * 
     */
    public List<ControllableType> getControllable() {
        if (controllable == null) {
            controllable = new ArrayList<ControllableType>();
        }
        return this.controllable;
    }

    /**
     * Gets the value of the automation property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationType }
     *     
     */
    public AutomationType getAutomation() {
        return automation;
    }

    /**
     * Sets the value of the automation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationType }
     *     
     */
    public void setAutomation(AutomationType value) {
        this.automation = value;
    }

}

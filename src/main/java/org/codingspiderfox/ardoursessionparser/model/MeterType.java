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
 * <p>Java class for MeterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="pulse" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="frame" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="movable" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="lock-style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bbt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="beat" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="note-type" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="divisions-per-bar" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterType", propOrder = {
    "value"
})
public class MeterType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "pulse")
    protected Byte pulse;
    @XmlAttribute(name = "frame")
    protected Integer frame;
    @XmlAttribute(name = "movable")
    protected Byte movable;
    @XmlAttribute(name = "lock-style")
    protected String lockStyle;
    @XmlAttribute(name = "bbt")
    protected String bbt;
    @XmlAttribute(name = "beat")
    protected Short beat;
    @XmlAttribute(name = "note-type")
    protected Byte noteType;
    @XmlAttribute(name = "divisions-per-bar")
    protected Byte divisionsPerBar;

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
     * Gets the value of the pulse property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPulse() {
        return pulse;
    }

    /**
     * Sets the value of the pulse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPulse(Byte value) {
        this.pulse = value;
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrame(Integer value) {
        this.frame = value;
    }

    /**
     * Gets the value of the movable property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getMovable() {
        return movable;
    }

    /**
     * Sets the value of the movable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setMovable(Byte value) {
        this.movable = value;
    }

    /**
     * Gets the value of the lockStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockStyle() {
        return lockStyle;
    }

    /**
     * Sets the value of the lockStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockStyle(String value) {
        this.lockStyle = value;
    }

    /**
     * Gets the value of the bbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbt() {
        return bbt;
    }

    /**
     * Sets the value of the bbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbt(String value) {
        this.bbt = value;
    }

    /**
     * Gets the value of the beat property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBeat() {
        return beat;
    }

    /**
     * Sets the value of the beat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBeat(Short value) {
        this.beat = value;
    }

    /**
     * Gets the value of the noteType property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getNoteType() {
        return noteType;
    }

    /**
     * Sets the value of the noteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setNoteType(Byte value) {
        this.noteType = value;
    }

    /**
     * Gets the value of the divisionsPerBar property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getDivisionsPerBar() {
        return divisionsPerBar;
    }

    /**
     * Sets the value of the divisionsPerBar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setDivisionsPerBar(Byte value) {
        this.divisionsPerBar = value;
    }

}
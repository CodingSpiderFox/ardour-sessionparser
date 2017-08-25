//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.25 at 11:42:00 PM CEST 
//


package org.codingspiderfox.ardoursessionparser.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Envelope" type="{}EnvelopeType" minOccurs="0"/>
 *         &lt;element name="FadeIn" type="{}FadeInType" minOccurs="0"/>
 *         &lt;element name="InverseFadeIn" type="{}InverseFadeInType" minOccurs="0"/>
 *         &lt;element name="FadeOut" type="{}FadeOutType" minOccurs="0"/>
 *         &lt;element name="InverseFadeOut" type="{}InverseFadeOutType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="muted" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="opaque" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="video-locked" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="automatic" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="whole-file" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="import" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="external" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="sync-marked" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="left-of-split" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="right-of-split" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="position-locked" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="valid-transients" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="beat" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="sync-position" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="ancestral-start" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="ancestral-length" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="stretch" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="shift" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="positional-lock-style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="layering-index" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="envelope-active" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="default-fade-in" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="default-fade-out" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="fade-in-active" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="fade-out-active" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="scale-amplitude" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="first-edit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source-0" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="master-source-0" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="channels" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="start-beats" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="length-beats" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionType", propOrder = {
    "content"
})
public class RegionType {

    @XmlElementRefs({
        @XmlElementRef(name = "FadeIn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Envelope", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InverseFadeIn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FadeOut", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InverseFadeOut", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "muted")
    protected Byte muted;
    @XmlAttribute(name = "opaque")
    protected Byte opaque;
    @XmlAttribute(name = "locked")
    protected Byte locked;
    @XmlAttribute(name = "video-locked")
    protected Byte videoLocked;
    @XmlAttribute(name = "automatic")
    protected Byte automatic;
    @XmlAttribute(name = "whole-file")
    protected Byte wholeFile;
    @XmlAttribute(name = "import")
    protected Byte _import;
    @XmlAttribute(name = "external")
    protected Byte external;
    @XmlAttribute(name = "sync-marked")
    protected Byte syncMarked;
    @XmlAttribute(name = "left-of-split")
    protected Byte leftOfSplit;
    @XmlAttribute(name = "right-of-split")
    protected Byte rightOfSplit;
    @XmlAttribute(name = "hidden")
    protected Byte hidden;
    @XmlAttribute(name = "position-locked")
    protected Byte positionLocked;
    @XmlAttribute(name = "valid-transients")
    protected Byte validTransients;
    @XmlAttribute(name = "start")
    protected Byte start;
    @XmlAttribute(name = "length")
    protected Integer length;
    @XmlAttribute(name = "position")
    protected Integer position;
    @XmlAttribute(name = "beat")
    protected Float beat;
    @XmlAttribute(name = "sync-position")
    protected Byte syncPosition;
    @XmlAttribute(name = "ancestral-start")
    protected Byte ancestralStart;
    @XmlAttribute(name = "ancestral-length")
    protected Byte ancestralLength;
    @XmlAttribute(name = "stretch")
    protected Byte stretch;
    @XmlAttribute(name = "shift")
    protected Byte shift;
    @XmlAttribute(name = "positional-lock-style")
    protected String positionalLockStyle;
    @XmlAttribute(name = "layering-index")
    protected Byte layeringIndex;
    @XmlAttribute(name = "envelope-active")
    protected Byte envelopeActive;
    @XmlAttribute(name = "default-fade-in")
    protected Byte defaultFadeIn;
    @XmlAttribute(name = "default-fade-out")
    protected Byte defaultFadeOut;
    @XmlAttribute(name = "fade-in-active")
    protected Byte fadeInActive;
    @XmlAttribute(name = "fade-out-active")
    protected Byte fadeOutActive;
    @XmlAttribute(name = "scale-amplitude")
    protected Byte scaleAmplitude;
    @XmlAttribute(name = "id")
    protected Short id;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "first-edit")
    protected String firstEdit;
    @XmlAttribute(name = "source-0")
    protected Short source0;
    @XmlAttribute(name = "master-source-0")
    protected Short masterSource0;
    @XmlAttribute(name = "channels")
    protected Byte channels;
    @XmlAttribute(name = "start-beats")
    protected Byte startBeats;
    @XmlAttribute(name = "length-beats")
    protected Float lengthBeats;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FadeInType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link InverseFadeInType }{@code >}
     * {@link JAXBElement }{@code <}{@link FadeOutType }{@code >}
     * {@link JAXBElement }{@code <}{@link InverseFadeOutType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
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
     * Gets the value of the muted property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getMuted() {
        return muted;
    }

    /**
     * Sets the value of the muted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setMuted(Byte value) {
        this.muted = value;
    }

    /**
     * Gets the value of the opaque property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getOpaque() {
        return opaque;
    }

    /**
     * Sets the value of the opaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setOpaque(Byte value) {
        this.opaque = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setLocked(Byte value) {
        this.locked = value;
    }

    /**
     * Gets the value of the videoLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getVideoLocked() {
        return videoLocked;
    }

    /**
     * Sets the value of the videoLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setVideoLocked(Byte value) {
        this.videoLocked = value;
    }

    /**
     * Gets the value of the automatic property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getAutomatic() {
        return automatic;
    }

    /**
     * Sets the value of the automatic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setAutomatic(Byte value) {
        this.automatic = value;
    }

    /**
     * Gets the value of the wholeFile property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getWholeFile() {
        return wholeFile;
    }

    /**
     * Sets the value of the wholeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setWholeFile(Byte value) {
        this.wholeFile = value;
    }

    /**
     * Gets the value of the import property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getImport() {
        return _import;
    }

    /**
     * Sets the value of the import property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setImport(Byte value) {
        this._import = value;
    }

    /**
     * Gets the value of the external property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setExternal(Byte value) {
        this.external = value;
    }

    /**
     * Gets the value of the syncMarked property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSyncMarked() {
        return syncMarked;
    }

    /**
     * Sets the value of the syncMarked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSyncMarked(Byte value) {
        this.syncMarked = value;
    }

    /**
     * Gets the value of the leftOfSplit property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getLeftOfSplit() {
        return leftOfSplit;
    }

    /**
     * Sets the value of the leftOfSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setLeftOfSplit(Byte value) {
        this.leftOfSplit = value;
    }

    /**
     * Gets the value of the rightOfSplit property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRightOfSplit() {
        return rightOfSplit;
    }

    /**
     * Sets the value of the rightOfSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRightOfSplit(Byte value) {
        this.rightOfSplit = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setHidden(Byte value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the positionLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPositionLocked() {
        return positionLocked;
    }

    /**
     * Sets the value of the positionLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPositionLocked(Byte value) {
        this.positionLocked = value;
    }

    /**
     * Gets the value of the validTransients property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getValidTransients() {
        return validTransients;
    }

    /**
     * Sets the value of the validTransients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setValidTransients(Byte value) {
        this.validTransients = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setStart(Byte value) {
        this.start = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Gets the value of the beat property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBeat() {
        return beat;
    }

    /**
     * Sets the value of the beat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBeat(Float value) {
        this.beat = value;
    }

    /**
     * Gets the value of the syncPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getSyncPosition() {
        return syncPosition;
    }

    /**
     * Sets the value of the syncPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setSyncPosition(Byte value) {
        this.syncPosition = value;
    }

    /**
     * Gets the value of the ancestralStart property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getAncestralStart() {
        return ancestralStart;
    }

    /**
     * Sets the value of the ancestralStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setAncestralStart(Byte value) {
        this.ancestralStart = value;
    }

    /**
     * Gets the value of the ancestralLength property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getAncestralLength() {
        return ancestralLength;
    }

    /**
     * Sets the value of the ancestralLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setAncestralLength(Byte value) {
        this.ancestralLength = value;
    }

    /**
     * Gets the value of the stretch property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getStretch() {
        return stretch;
    }

    /**
     * Sets the value of the stretch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setStretch(Byte value) {
        this.stretch = value;
    }

    /**
     * Gets the value of the shift property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getShift() {
        return shift;
    }

    /**
     * Sets the value of the shift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setShift(Byte value) {
        this.shift = value;
    }

    /**
     * Gets the value of the positionalLockStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionalLockStyle() {
        return positionalLockStyle;
    }

    /**
     * Sets the value of the positionalLockStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionalLockStyle(String value) {
        this.positionalLockStyle = value;
    }

    /**
     * Gets the value of the layeringIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getLayeringIndex() {
        return layeringIndex;
    }

    /**
     * Sets the value of the layeringIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setLayeringIndex(Byte value) {
        this.layeringIndex = value;
    }

    /**
     * Gets the value of the envelopeActive property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getEnvelopeActive() {
        return envelopeActive;
    }

    /**
     * Sets the value of the envelopeActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setEnvelopeActive(Byte value) {
        this.envelopeActive = value;
    }

    /**
     * Gets the value of the defaultFadeIn property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getDefaultFadeIn() {
        return defaultFadeIn;
    }

    /**
     * Sets the value of the defaultFadeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setDefaultFadeIn(Byte value) {
        this.defaultFadeIn = value;
    }

    /**
     * Gets the value of the defaultFadeOut property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getDefaultFadeOut() {
        return defaultFadeOut;
    }

    /**
     * Sets the value of the defaultFadeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setDefaultFadeOut(Byte value) {
        this.defaultFadeOut = value;
    }

    /**
     * Gets the value of the fadeInActive property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getFadeInActive() {
        return fadeInActive;
    }

    /**
     * Sets the value of the fadeInActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setFadeInActive(Byte value) {
        this.fadeInActive = value;
    }

    /**
     * Gets the value of the fadeOutActive property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getFadeOutActive() {
        return fadeOutActive;
    }

    /**
     * Sets the value of the fadeOutActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setFadeOutActive(Byte value) {
        this.fadeOutActive = value;
    }

    /**
     * Gets the value of the scaleAmplitude property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getScaleAmplitude() {
        return scaleAmplitude;
    }

    /**
     * Sets the value of the scaleAmplitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setScaleAmplitude(Byte value) {
        this.scaleAmplitude = value;
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

    /**
     * Gets the value of the firstEdit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstEdit() {
        return firstEdit;
    }

    /**
     * Sets the value of the firstEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstEdit(String value) {
        this.firstEdit = value;
    }

    /**
     * Gets the value of the source0 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSource0() {
        return source0;
    }

    /**
     * Sets the value of the source0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSource0(Short value) {
        this.source0 = value;
    }

    /**
     * Gets the value of the masterSource0 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMasterSource0() {
        return masterSource0;
    }

    /**
     * Sets the value of the masterSource0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMasterSource0(Short value) {
        this.masterSource0 = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setChannels(Byte value) {
        this.channels = value;
    }

    /**
     * Gets the value of the startBeats property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getStartBeats() {
        return startBeats;
    }

    /**
     * Sets the value of the startBeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setStartBeats(Byte value) {
        this.startBeats = value;
    }

    /**
     * Gets the value of the lengthBeats property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLengthBeats() {
        return lengthBeats;
    }

    /**
     * Sets the value of the lengthBeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLengthBeats(Float value) {
        this.lengthBeats = value;
    }

}

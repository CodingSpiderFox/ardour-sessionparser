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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProgramVersion" type="{}ProgramVersionType"/>
 *         &lt;element name="MIDIPorts" type="{}MIDIPortsType"/>
 *         &lt;element name="Config" type="{}ConfigType"/>
 *         &lt;element name="Metadata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sources" type="{}SourcesType"/>
 *         &lt;element name="Regions" type="{}RegionsType"/>
 *         &lt;element name="Selection" type="{}SelectionType"/>
 *         &lt;element name="Locations" type="{}LocationsType"/>
 *         &lt;element name="Bundles" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VCAManager" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Routes" type="{}RoutesType"/>
 *         &lt;element name="Playlists" type="{}PlaylistsType"/>
 *         &lt;element name="UnusedPlaylists" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RouteGroups" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Click" type="{}ClickType"/>
 *         &lt;element name="LTC-In" type="{}LTC-InType"/>
 *         &lt;element name="LTC-Out" type="{}LTC-OutType"/>
 *         &lt;element name="Speakers" type="{}SpeakersType"/>
 *         &lt;element name="TempoMap" type="{}TempoMapType"/>
 *         &lt;element name="ControlProtocols" type="{}ControlProtocolsType"/>
 *         &lt;element name="Extra" type="{}ExtraType"/>
 *         &lt;element name="Script" type="{}ScriptType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sample-rate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="end-is-free" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="id-counter" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="name-counter" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="event-counter" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="vca-counter" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionType", propOrder = {
    "programVersion",
    "midiPorts",
    "config",
    "metadata",
    "sources",
    "regions",
    "selection",
    "locations",
    "bundles",
    "vcaManager",
    "routes",
    "playlists",
    "unusedPlaylists",
    "routeGroups",
    "click",
    "ltcIn",
    "ltcOut",
    "speakers",
    "tempoMap",
    "controlProtocols",
    "extra",
    "script"
})
public class SessionType {

    @XmlElement(name = "ProgramVersion", required = true)
    protected ProgramVersionType programVersion;
    @XmlElement(name = "MIDIPorts", required = true)
    protected MIDIPortsType midiPorts;
    @XmlElement(name = "Config", required = true)
    protected ConfigType config;
    @XmlElement(name = "Metadata", required = true)
    protected String metadata;
    @XmlElement(name = "Sources", required = true)
    protected SourcesType sources;
    @XmlElement(name = "Regions", required = true)
    protected RegionsType regions;
    @XmlElement(name = "Selection", required = true)
    protected SelectionType selection;
    @XmlElement(name = "Locations", required = true)
    protected LocationsType locations;
    @XmlElement(name = "Bundles", required = true)
    protected String bundles;
    @XmlElement(name = "VCAManager", required = true)
    protected String vcaManager;
    @XmlElement(name = "Routes", required = true)
    protected RoutesType routes;
    @XmlElement(name = "Playlists", required = true)
    protected PlaylistsType playlists;
    @XmlElement(name = "UnusedPlaylists", required = true)
    protected String unusedPlaylists;
    @XmlElement(name = "RouteGroups", required = true)
    protected String routeGroups;
    @XmlElement(name = "Click", required = true)
    protected ClickType click;
    @XmlElement(name = "LTC-In", required = true)
    protected LTCInType ltcIn;
    @XmlElement(name = "LTC-Out", required = true)
    protected LTCOutType ltcOut;
    @XmlElement(name = "Speakers", required = true)
    protected SpeakersType speakers;
    @XmlElement(name = "TempoMap", required = true)
    protected TempoMapType tempoMap;
    @XmlElement(name = "ControlProtocols", required = true)
    protected ControlProtocolsType controlProtocols;
    @XmlElement(name = "Extra", required = true)
    protected ExtraType extra;
    @XmlElement(name = "Script", required = true)
    protected ScriptType script;
    @XmlAttribute(name = "version")
    protected Short version;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "sample-rate")
    protected Integer sampleRate;
    @XmlAttribute(name = "end-is-free")
    protected Byte endIsFree;
    @XmlAttribute(name = "id-counter")
    protected Short idCounter;
    @XmlAttribute(name = "name-counter")
    protected Byte nameCounter;
    @XmlAttribute(name = "event-counter")
    protected Short eventCounter;
    @XmlAttribute(name = "vca-counter")
    protected Byte vcaCounter;

    /**
     * Gets the value of the programVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramVersionType }
     *     
     */
    public ProgramVersionType getProgramVersion() {
        return programVersion;
    }

    /**
     * Sets the value of the programVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramVersionType }
     *     
     */
    public void setProgramVersion(ProgramVersionType value) {
        this.programVersion = value;
    }

    /**
     * Gets the value of the midiPorts property.
     * 
     * @return
     *     possible object is
     *     {@link MIDIPortsType }
     *     
     */
    public MIDIPortsType getMIDIPorts() {
        return midiPorts;
    }

    /**
     * Sets the value of the midiPorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIDIPortsType }
     *     
     */
    public void setMIDIPorts(MIDIPortsType value) {
        this.midiPorts = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigType }
     *     
     */
    public ConfigType getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigType }
     *     
     */
    public void setConfig(ConfigType value) {
        this.config = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata(String value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the sources property.
     * 
     * @return
     *     possible object is
     *     {@link SourcesType }
     *     
     */
    public SourcesType getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourcesType }
     *     
     */
    public void setSources(SourcesType value) {
        this.sources = value;
    }

    /**
     * Gets the value of the regions property.
     * 
     * @return
     *     possible object is
     *     {@link RegionsType }
     *     
     */
    public RegionsType getRegions() {
        return regions;
    }

    /**
     * Sets the value of the regions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionsType }
     *     
     */
    public void setRegions(RegionsType value) {
        this.regions = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionType }
     *     
     */
    public SelectionType getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionType }
     *     
     */
    public void setSelection(SelectionType value) {
        this.selection = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link LocationsType }
     *     
     */
    public LocationsType getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationsType }
     *     
     */
    public void setLocations(LocationsType value) {
        this.locations = value;
    }

    /**
     * Gets the value of the bundles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundles() {
        return bundles;
    }

    /**
     * Sets the value of the bundles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundles(String value) {
        this.bundles = value;
    }

    /**
     * Gets the value of the vcaManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCAManager() {
        return vcaManager;
    }

    /**
     * Sets the value of the vcaManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCAManager(String value) {
        this.vcaManager = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link RoutesType }
     *     
     */
    public RoutesType getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutesType }
     *     
     */
    public void setRoutes(RoutesType value) {
        this.routes = value;
    }

    /**
     * Gets the value of the playlists property.
     * 
     * @return
     *     possible object is
     *     {@link PlaylistsType }
     *     
     */
    public PlaylistsType getPlaylists() {
        return playlists;
    }

    /**
     * Sets the value of the playlists property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaylistsType }
     *     
     */
    public void setPlaylists(PlaylistsType value) {
        this.playlists = value;
    }

    /**
     * Gets the value of the unusedPlaylists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnusedPlaylists() {
        return unusedPlaylists;
    }

    /**
     * Sets the value of the unusedPlaylists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnusedPlaylists(String value) {
        this.unusedPlaylists = value;
    }

    /**
     * Gets the value of the routeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteGroups() {
        return routeGroups;
    }

    /**
     * Sets the value of the routeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteGroups(String value) {
        this.routeGroups = value;
    }

    /**
     * Gets the value of the click property.
     * 
     * @return
     *     possible object is
     *     {@link ClickType }
     *     
     */
    public ClickType getClick() {
        return click;
    }

    /**
     * Sets the value of the click property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClickType }
     *     
     */
    public void setClick(ClickType value) {
        this.click = value;
    }

    /**
     * Gets the value of the ltcIn property.
     * 
     * @return
     *     possible object is
     *     {@link LTCInType }
     *     
     */
    public LTCInType getLTCIn() {
        return ltcIn;
    }

    /**
     * Sets the value of the ltcIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LTCInType }
     *     
     */
    public void setLTCIn(LTCInType value) {
        this.ltcIn = value;
    }

    /**
     * Gets the value of the ltcOut property.
     * 
     * @return
     *     possible object is
     *     {@link LTCOutType }
     *     
     */
    public LTCOutType getLTCOut() {
        return ltcOut;
    }

    /**
     * Sets the value of the ltcOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link LTCOutType }
     *     
     */
    public void setLTCOut(LTCOutType value) {
        this.ltcOut = value;
    }

    /**
     * Gets the value of the speakers property.
     * 
     * @return
     *     possible object is
     *     {@link SpeakersType }
     *     
     */
    public SpeakersType getSpeakers() {
        return speakers;
    }

    /**
     * Sets the value of the speakers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeakersType }
     *     
     */
    public void setSpeakers(SpeakersType value) {
        this.speakers = value;
    }

    /**
     * Gets the value of the tempoMap property.
     * 
     * @return
     *     possible object is
     *     {@link TempoMapType }
     *     
     */
    public TempoMapType getTempoMap() {
        return tempoMap;
    }

    /**
     * Sets the value of the tempoMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link TempoMapType }
     *     
     */
    public void setTempoMap(TempoMapType value) {
        this.tempoMap = value;
    }

    /**
     * Gets the value of the controlProtocols property.
     * 
     * @return
     *     possible object is
     *     {@link ControlProtocolsType }
     *     
     */
    public ControlProtocolsType getControlProtocols() {
        return controlProtocols;
    }

    /**
     * Sets the value of the controlProtocols property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlProtocolsType }
     *     
     */
    public void setControlProtocols(ControlProtocolsType value) {
        this.controlProtocols = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraType }
     *     
     */
    public ExtraType getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraType }
     *     
     */
    public void setExtra(ExtraType value) {
        this.extra = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link ScriptType }
     *     
     */
    public ScriptType getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptType }
     *     
     */
    public void setScript(ScriptType value) {
        this.script = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVersion(Short value) {
        this.version = value;
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
     * Gets the value of the sampleRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets the value of the sampleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSampleRate(Integer value) {
        this.sampleRate = value;
    }

    /**
     * Gets the value of the endIsFree property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getEndIsFree() {
        return endIsFree;
    }

    /**
     * Sets the value of the endIsFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setEndIsFree(Byte value) {
        this.endIsFree = value;
    }

    /**
     * Gets the value of the idCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIdCounter() {
        return idCounter;
    }

    /**
     * Sets the value of the idCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIdCounter(Short value) {
        this.idCounter = value;
    }

    /**
     * Gets the value of the nameCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getNameCounter() {
        return nameCounter;
    }

    /**
     * Sets the value of the nameCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setNameCounter(Byte value) {
        this.nameCounter = value;
    }

    /**
     * Gets the value of the eventCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEventCounter() {
        return eventCounter;
    }

    /**
     * Sets the value of the eventCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEventCounter(Short value) {
        this.eventCounter = value;
    }

    /**
     * Gets the value of the vcaCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getVcaCounter() {
        return vcaCounter;
    }

    /**
     * Sets the value of the vcaCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setVcaCounter(Byte value) {
        this.vcaCounter = value;
    }

}

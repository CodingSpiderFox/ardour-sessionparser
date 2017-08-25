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
 * <p>Java class for StemExportProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StemExportProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExportTimespan" type="{}ExportTimespanType"/>
 *         &lt;element name="ExportChannelConfiguration" type="{}ExportChannelConfigurationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExportFormat" type="{}ExportFormatType"/>
 *         &lt;element name="ExportFilename" type="{}ExportFilenameType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StemExportProfileType", propOrder = {
    "exportTimespan",
    "exportChannelConfiguration",
    "exportFormat",
    "exportFilename"
})
public class StemExportProfileType {

    @XmlElement(name = "ExportTimespan", required = true)
    protected ExportTimespanType exportTimespan;
    @XmlElement(name = "ExportChannelConfiguration")
    protected List<ExportChannelConfigurationType> exportChannelConfiguration;
    @XmlElement(name = "ExportFormat", required = true)
    protected ExportFormatType exportFormat;
    @XmlElement(name = "ExportFilename", required = true)
    protected ExportFilenameType exportFilename;

    /**
     * Gets the value of the exportTimespan property.
     * 
     * @return
     *     possible object is
     *     {@link ExportTimespanType }
     *     
     */
    public ExportTimespanType getExportTimespan() {
        return exportTimespan;
    }

    /**
     * Sets the value of the exportTimespan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportTimespanType }
     *     
     */
    public void setExportTimespan(ExportTimespanType value) {
        this.exportTimespan = value;
    }

    /**
     * Gets the value of the exportChannelConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportChannelConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportChannelConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportChannelConfigurationType }
     * 
     * 
     */
    public List<ExportChannelConfigurationType> getExportChannelConfiguration() {
        if (exportChannelConfiguration == null) {
            exportChannelConfiguration = new ArrayList<ExportChannelConfigurationType>();
        }
        return this.exportChannelConfiguration;
    }

    /**
     * Gets the value of the exportFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ExportFormatType }
     *     
     */
    public ExportFormatType getExportFormat() {
        return exportFormat;
    }

    /**
     * Sets the value of the exportFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportFormatType }
     *     
     */
    public void setExportFormat(ExportFormatType value) {
        this.exportFormat = value;
    }

    /**
     * Gets the value of the exportFilename property.
     * 
     * @return
     *     possible object is
     *     {@link ExportFilenameType }
     *     
     */
    public ExportFilenameType getExportFilename() {
        return exportFilename;
    }

    /**
     * Sets the value of the exportFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportFilenameType }
     *     
     */
    public void setExportFilename(ExportFilenameType value) {
        this.exportFilename = value;
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package uk.gov.legislation.namespaces.metadata;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="IdURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="DocumentURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Note")
public class Note {

    @XmlAttribute(name = "IdURI")
    @XmlSchemaType(name = "anyURI")
    protected String idURI;
    @XmlAttribute(name = "DocumentURI")
    @XmlSchemaType(name = "anyURI")
    protected String documentURI;

    /**
     * Gets the value of the idURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdURI() {
        return idURI;
    }

    /**
     * Sets the value of the idURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdURI(String value) {
        this.idURI = value;
    }

    /**
     * Gets the value of the documentURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentURI() {
        return documentURI;
    }

    /**
     * Sets the value of the documentURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentURI(String value) {
        this.documentURI = value;
    }

}

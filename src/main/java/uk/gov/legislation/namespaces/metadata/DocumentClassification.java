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
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentCategory"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Value" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="primary"/&gt;
 *                       &lt;enumeration value="secondary"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.legislation.gov.uk/namespaces/metadata}DocumentMainType"/&gt;
 *         &lt;element name="DocumentStatus"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Value" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="draft"/&gt;
 *                       &lt;enumeration value="final"/&gt;
 *                       &lt;enumeration value="revised"/&gt;
 *                       &lt;enumeration value="proposed"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DocumentMinorType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Value" use="required"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="order"/&gt;
 *                       &lt;enumeration value="regulation"/&gt;
 *                       &lt;enumeration value="rule"/&gt;
 *                       &lt;enumeration value="scheme"/&gt;
 *                       &lt;enumeration value="resolution"/&gt;
 *                       &lt;enumeration value="unknown"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentCategory",
    "documentMainType",
    "documentStatus",
    "documentMinorType"
})
@XmlRootElement(name = "DocumentClassification")
public class DocumentClassification {

    @XmlElement(name = "DocumentCategory", required = true)
    protected DocumentClassification.DocumentCategory documentCategory;
    @XmlElement(name = "DocumentMainType", required = true)
    protected DocumentMainType documentMainType;
    @XmlElement(name = "DocumentStatus", required = true)
    protected DocumentClassification.DocumentStatus documentStatus;
    @XmlElement(name = "DocumentMinorType")
    protected DocumentClassification.DocumentMinorType documentMinorType;

    /**
     * Gets the value of the documentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentClassification.DocumentCategory }
     *     
     */
    public DocumentClassification.DocumentCategory getDocumentCategory() {
        return documentCategory;
    }

    /**
     * Sets the value of the documentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentClassification.DocumentCategory }
     *     
     */
    public void setDocumentCategory(DocumentClassification.DocumentCategory value) {
        this.documentCategory = value;
    }

    /**
     * Gets the value of the documentMainType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentMainType }
     *     
     */
    public DocumentMainType getDocumentMainType() {
        return documentMainType;
    }

    /**
     * Sets the value of the documentMainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMainType }
     *     
     */
    public void setDocumentMainType(DocumentMainType value) {
        this.documentMainType = value;
    }

    /**
     * Gets the value of the documentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentClassification.DocumentStatus }
     *     
     */
    public DocumentClassification.DocumentStatus getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Sets the value of the documentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentClassification.DocumentStatus }
     *     
     */
    public void setDocumentStatus(DocumentClassification.DocumentStatus value) {
        this.documentStatus = value;
    }

    /**
     * Gets the value of the documentMinorType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentClassification.DocumentMinorType }
     *     
     */
    public DocumentClassification.DocumentMinorType getDocumentMinorType() {
        return documentMinorType;
    }

    /**
     * Sets the value of the documentMinorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentClassification.DocumentMinorType }
     *     
     */
    public void setDocumentMinorType(DocumentClassification.DocumentMinorType value) {
        this.documentMinorType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Value" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="primary"/&gt;
     *             &lt;enumeration value="secondary"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DocumentCategory {

        @XmlAttribute(name = "Value", required = true)
        protected String value;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Value" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="order"/&gt;
     *             &lt;enumeration value="regulation"/&gt;
     *             &lt;enumeration value="rule"/&gt;
     *             &lt;enumeration value="scheme"/&gt;
     *             &lt;enumeration value="resolution"/&gt;
     *             &lt;enumeration value="unknown"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DocumentMinorType {

        @XmlAttribute(name = "Value", required = true)
        protected String value;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Value" use="required"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="draft"/&gt;
     *             &lt;enumeration value="final"/&gt;
     *             &lt;enumeration value="revised"/&gt;
     *             &lt;enumeration value="proposed"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DocumentStatus {

        @XmlAttribute(name = "Value", required = true)
        protected String value;

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

    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.07 at 06:17:52 PM CEST 
//


package org.w3._1999.xhtml;

import org.w3._1999.xsl.format.TableBorderStyleType;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}TableAlignmentAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}TableBorderLeftAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}TableBorderAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}TableBorderTopAttributes"/&gt;
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}TableBackgroundColorAttributes"/&gt;
 *       &lt;attribute name="char"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="span" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" default="1" /&gt;
 *       &lt;attribute name="width" type="{http://www.w3.org/1999/xhtml}TableWidthType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "col")
public class Col {

    @XmlAttribute(name = "char")
    protected String _char;
    @XmlAttribute(name = "span")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger span;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "valign")
    protected String valign;
    @XmlAttribute(name = "align")
    protected String align;
    @XmlAttribute(name = "border-left-style", namespace = "http://www.w3.org/1999/XSL/Format")
    protected TableBorderStyleType borderLeftStyle;
    @XmlAttribute(name = "border-left-color", namespace = "http://www.w3.org/1999/XSL/Format")
    protected String borderLeftColor;
    @XmlAttribute(name = "border-left-width", namespace = "http://www.w3.org/1999/XSL/Format")
    protected String borderLeftWidth;
    @XmlAttribute(name = "border-right-style", namespace = "http://www.w3.org/1999/XSL/Format")
    protected TableBorderStyleType borderRightStyle;
    @XmlAttribute(name = "border-bottom-style", namespace = "http://www.w3.org/1999/XSL/Format")
    protected TableBorderStyleType borderBottomStyle;
    @XmlAttribute(name = "border-right-color", namespace = "http://www.w3.org/1999/XSL/Format")
    protected String borderRightColor;
    @XmlAttribute(name = "border-bottom-color", namespace = "http://www.w3.org/1999/XSL/Format")
    protected String borderBottomColor;
    @XmlAttribute(name = "border-right-width", namespace = "http://www.w3.org/1999/XSL/Format")
    protected String borderRightWidth;
    @XmlAttribute(name = "border-bottom-width", namespace = "http://www.w3.org/1999/XSL/Format")
    protected String borderBottomWidth;
    @XmlAttribute(name = "border-top-style", namespace = "http://www.w3.org/1999/XSL/Format")
    protected TableBorderStyleType borderTopStyle;
    @XmlAttribute(name = "border-top-color", namespace = "http://www.w3.org/1999/XSL/Format")
    protected String borderTopColor;
    @XmlAttribute(name = "border-top-width", namespace = "http://www.w3.org/1999/XSL/Format")
    protected String borderTopWidth;
    @XmlAttribute(name = "background-color", namespace = "http://www.w3.org/1999/XSL/Format")
    protected String backgroundColor;

    /**
     * Gets the value of the char property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChar() {
        return _char;
    }

    /**
     * Sets the value of the char property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChar(String value) {
        this._char = value;
    }

    /**
     * Gets the value of the span property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpan() {
        if (span == null) {
            return new BigInteger("1");
        } else {
            return span;
        }
    }

    /**
     * Sets the value of the span property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpan(BigInteger value) {
        this.span = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the valign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValign() {
        return valign;
    }

    /**
     * Sets the value of the valign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValign(String value) {
        this.valign = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        if (align == null) {
            return "inherit";
        } else {
            return align;
        }
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the borderLeftStyle property.
     * 
     * @return
     *     possible object is
     *     {@link TableBorderStyleType }
     *     
     */
    public TableBorderStyleType getBorderLeftStyle() {
        if (borderLeftStyle == null) {
            return TableBorderStyleType.INHERIT;
        } else {
            return borderLeftStyle;
        }
    }

    /**
     * Sets the value of the borderLeftStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBorderStyleType }
     *     
     */
    public void setBorderLeftStyle(TableBorderStyleType value) {
        this.borderLeftStyle = value;
    }

    /**
     * Gets the value of the borderLeftColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderLeftColor() {
        if (borderLeftColor == null) {
            return "inherit";
        } else {
            return borderLeftColor;
        }
    }

    /**
     * Sets the value of the borderLeftColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderLeftColor(String value) {
        this.borderLeftColor = value;
    }

    /**
     * Gets the value of the borderLeftWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderLeftWidth() {
        if (borderLeftWidth == null) {
            return "inherit";
        } else {
            return borderLeftWidth;
        }
    }

    /**
     * Sets the value of the borderLeftWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderLeftWidth(String value) {
        this.borderLeftWidth = value;
    }

    /**
     * Gets the value of the borderRightStyle property.
     * 
     * @return
     *     possible object is
     *     {@link TableBorderStyleType }
     *     
     */
    public TableBorderStyleType getBorderRightStyle() {
        if (borderRightStyle == null) {
            return TableBorderStyleType.INHERIT;
        } else {
            return borderRightStyle;
        }
    }

    /**
     * Sets the value of the borderRightStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBorderStyleType }
     *     
     */
    public void setBorderRightStyle(TableBorderStyleType value) {
        this.borderRightStyle = value;
    }

    /**
     * Gets the value of the borderBottomStyle property.
     * 
     * @return
     *     possible object is
     *     {@link TableBorderStyleType }
     *     
     */
    public TableBorderStyleType getBorderBottomStyle() {
        if (borderBottomStyle == null) {
            return TableBorderStyleType.INHERIT;
        } else {
            return borderBottomStyle;
        }
    }

    /**
     * Sets the value of the borderBottomStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBorderStyleType }
     *     
     */
    public void setBorderBottomStyle(TableBorderStyleType value) {
        this.borderBottomStyle = value;
    }

    /**
     * Gets the value of the borderRightColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRightColor() {
        if (borderRightColor == null) {
            return "inherit";
        } else {
            return borderRightColor;
        }
    }

    /**
     * Sets the value of the borderRightColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRightColor(String value) {
        this.borderRightColor = value;
    }

    /**
     * Gets the value of the borderBottomColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBottomColor() {
        if (borderBottomColor == null) {
            return "inherit";
        } else {
            return borderBottomColor;
        }
    }

    /**
     * Sets the value of the borderBottomColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBottomColor(String value) {
        this.borderBottomColor = value;
    }

    /**
     * Gets the value of the borderRightWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRightWidth() {
        if (borderRightWidth == null) {
            return "inherit";
        } else {
            return borderRightWidth;
        }
    }

    /**
     * Sets the value of the borderRightWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRightWidth(String value) {
        this.borderRightWidth = value;
    }

    /**
     * Gets the value of the borderBottomWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBottomWidth() {
        if (borderBottomWidth == null) {
            return "inherit";
        } else {
            return borderBottomWidth;
        }
    }

    /**
     * Sets the value of the borderBottomWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBottomWidth(String value) {
        this.borderBottomWidth = value;
    }

    /**
     * Gets the value of the borderTopStyle property.
     * 
     * @return
     *     possible object is
     *     {@link TableBorderStyleType }
     *     
     */
    public TableBorderStyleType getBorderTopStyle() {
        if (borderTopStyle == null) {
            return TableBorderStyleType.INHERIT;
        } else {
            return borderTopStyle;
        }
    }

    /**
     * Sets the value of the borderTopStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBorderStyleType }
     *     
     */
    public void setBorderTopStyle(TableBorderStyleType value) {
        this.borderTopStyle = value;
    }

    /**
     * Gets the value of the borderTopColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderTopColor() {
        if (borderTopColor == null) {
            return "inherit";
        } else {
            return borderTopColor;
        }
    }

    /**
     * Sets the value of the borderTopColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderTopColor(String value) {
        this.borderTopColor = value;
    }

    /**
     * Gets the value of the borderTopWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderTopWidth() {
        if (borderTopWidth == null) {
            return "inherit";
        } else {
            return borderTopWidth;
        }
    }

    /**
     * Sets the value of the borderTopWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderTopWidth(String value) {
        this.borderTopWidth = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

}

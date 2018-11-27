
package assignment.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Rendeles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rendeles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Leiras">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Utanvetel"/>
 *               &lt;enumeration value="Szemelyes"/>
 *               &lt;enumeration value="Eloreutalás"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Rszam" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VevoId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TermekId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rendeles", propOrder = {
    "datum",
    "leiras"
})
public class Rendeles {

    @XmlElement(name = "Datum", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "Leiras", required = true)
    protected String leiras;
    @XmlAttribute(name = "Rszam", required = true)
    protected String rszam;
    @XmlAttribute(name = "VevoId", required = true)
    protected String vevoId;
    @XmlAttribute(name = "TermekId", required = true)
    protected String termekId;

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the leiras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeiras() {
        return leiras;
    }

    /**
     * Sets the value of the leiras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeiras(String value) {
        this.leiras = value;
    }

    /**
     * Gets the value of the rszam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRszam() {
        return rszam;
    }

    /**
     * Sets the value of the rszam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRszam(String value) {
        this.rszam = value;
    }

    /**
     * Gets the value of the vevoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVevoId() {
        return vevoId;
    }

    /**
     * Sets the value of the vevoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVevoId(String value) {
        this.vevoId = value;
    }

    /**
     * Gets the value of the termekId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermekId() {
        return termekId;
    }

    /**
     * Sets the value of the termekId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermekId(String value) {
        this.termekId = value;
    }

}

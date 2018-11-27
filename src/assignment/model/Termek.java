
package assignment.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Termek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Termek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Megnevezes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Leiras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Tid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Termek", propOrder = {
    "megnevezes",
    "leiras",
    "ar"
})
public class Termek {

    @XmlElement(name = "Megnevezes", required = true)
    protected String megnevezes;
    @XmlElement(name = "Leiras", required = true)
    protected String leiras;
    @XmlElement(name = "Ar", required = true)
    protected String ar;
    @XmlAttribute(name = "Tid", required = true)
    protected String tid;

    /**
     * Gets the value of the megnevezes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMegnevezes() {
        return megnevezes;
    }

    /**
     * Sets the value of the megnevezes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMegnevezes(String value) {
        this.megnevezes = value;
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
     * Gets the value of the ar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAr() {
        return ar;
    }

    /**
     * Sets the value of the ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAr(String value) {
        this.ar = value;
    }

    /**
     * Gets the value of the tid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTid(String value) {
        this.tid = value;
    }

}

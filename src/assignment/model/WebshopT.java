
package assignment.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Webshop_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Webshop_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vevo_adatok" type="{}Vevo" maxOccurs="unbounded"/>
 *         &lt;element name="Termek_adatok" type="{}Termek" maxOccurs="unbounded"/>
 *         &lt;element name="Rendeles_adatok" type="{}Rendeles" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "webshop_t")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Webshop_t", propOrder = {
    "vevoAdatok",
    "termekAdatok",
    "rendelesAdatok"
})
public class WebshopT {


    @XmlElement(name = "Vevo_adatok", required = true)
    protected List<Vevo> vevoAdatok;
    @XmlElement(name = "Termek_adatok", required = true)
    protected List<Termek> termekAdatok;
    @XmlElement(name = "Rendeles_adatok", required = true)
    protected List<Rendeles> rendelesAdatok;

    /**
     * Gets the value of the vevoAdatok property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vevoAdatok property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVevoAdatok().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vevo }
     * 
     * 
     */
    public List<Vevo> getVevoAdatok() {
        if (vevoAdatok == null) {
            vevoAdatok = new ArrayList<Vevo>();
        }
        return this.vevoAdatok;
    }

    /**
     * Gets the value of the termekAdatok property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termekAdatok property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermekAdatok().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Termek }
     * 
     * 
     */
    public List<Termek> getTermekAdatok() {
        if (termekAdatok == null) {
            termekAdatok = new ArrayList<Termek>();
        }
        return this.termekAdatok;
    }

    /**
     * Gets the value of the rendelesAdatok property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rendelesAdatok property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRendelesAdatok().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rendeles }
     * 
     *
     */
    public List<Rendeles> getRendelesAdatok() {
        if (rendelesAdatok == null) {
            rendelesAdatok = new ArrayList<Rendeles>();
        }
        return this.rendelesAdatok;
    }

    public void setVevoAdatok(List<Vevo> vevoAdatok) {
        this.vevoAdatok = vevoAdatok;
    }

    public void setTermekAdatok(List<Termek> termekAdatok) {
        this.termekAdatok = termekAdatok;
    }

    public void setRendelesAdatok(List<Rendeles> rendelesAdatok) {
        this.rendelesAdatok = rendelesAdatok;
    }
}

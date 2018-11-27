
package assignment.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vevo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vevo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Nev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cim">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Irsz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Varos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Utca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Hsz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Kor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="18"/>
 *               &lt;maxInclusive value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *       &lt;attribute name="Vid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vevo", propOrder = {

})
public class Vevo {

    @XmlElement(name = "Nev", required = true)
    protected String nev;
    @XmlElement(name = "Cim", required = true)
    protected Vevo.Cim cim;
    @XmlElement(name = "Kor")
    protected int kor;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Tel", required = true)
    protected String tel;
    @XmlAttribute(name = "Vid", required = true)
    protected String vid;

    /**
     * Gets the value of the nev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNev() {
        return nev;
    }

    /**
     * Sets the value of the nev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNev(String value) {
        this.nev = value;
    }

    /**
     * Gets the value of the cim property.
     * 
     * @return
     *     possible object is
     *     {@link Vevo.Cim }
     *     
     */
    public Vevo.Cim getCim() {
        return cim;
    }

    /**
     * Sets the value of the cim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vevo.Cim }
     *     
     */
    public void setCim(Vevo.Cim value) {
        this.cim = value;
    }

    /**
     * Gets the value of the kor property.
     * 
     */
    public int getKor() {
        return kor;
    }

    /**
     * Sets the value of the kor property.
     * 
     */
    public void setKor(int value) {
        this.kor = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the vid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVid() {
        return vid;
    }

    /**
     * Sets the value of the vid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVid(String value) {
        this.vid = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Irsz" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Varos" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Utca" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Hsz" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "irsz",
        "varos",
        "utca",
        "hsz"
    })
    public static class Cim {

        @XmlElement(name = "Irsz", required = true)
        protected String irsz;
        @XmlElement(name = "Varos", required = true)
        protected String varos;
        @XmlElement(name = "Utca", required = true)
        protected String utca;
        @XmlElement(name = "Hsz", required = true)
        protected String hsz;

        /**
         * Gets the value of the irsz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIrsz() {
            return irsz;
        }

        /**
         * Sets the value of the irsz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIrsz(String value) {
            this.irsz = value;
        }

        /**
         * Gets the value of the varos property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVaros() {
            return varos;
        }

        /**
         * Sets the value of the varos property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVaros(String value) {
            this.varos = value;
        }

        /**
         * Gets the value of the utca property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUtca() {
            return utca;
        }

        /**
         * Sets the value of the utca property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUtca(String value) {
            this.utca = value;
        }

        /**
         * Gets the value of the hsz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHsz() {
            return hsz;
        }

        /**
         * Sets the value of the hsz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHsz(String value) {
            this.hsz = value;
        }

    }

}

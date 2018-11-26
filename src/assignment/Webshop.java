package assignment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "webshop")
@XmlAccessorType(XmlAccessType.FIELD)
public class Webshop {
    @XmlElement(name = "vevoAdatok")
    private List<Vevo_adatok> webshop = null;

    public List<Vevo_adatok> getWebshop() {
        return webshop;
    }

    public void setWebshop(List<Vevo_adatok> webshop) {
        this.webshop = webshop;
    }
}

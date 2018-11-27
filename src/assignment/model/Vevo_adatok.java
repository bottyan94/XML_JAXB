package assignment.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vevoAdatok")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vevo_adatok {
    private Integer Vid;
    private String Név;
    private String Cím;
    private Integer Kor;
    private String Email;
    private String Tel;
    private Boolean isDeleted;

    public Integer getVid() {        return Vid;    }

    public void setVid(Integer vid) {        Vid = vid;
    }

    public String getNév() {        return Név;    }
    public void setNév(String név) {        Név = név;    }

    public String getCím() {
        return Cím;
    }

    public void setCím(String cím) {
        Cím = cím;
    }

    public Integer getKor() {        return Kor;    }
    public void setKor(Integer kor) {        Kor = kor;    }
    public String getEmail() {        return Email;    }
    public void setEmail(String email) {        Email = email;    }
    public String getTel() {   return Tel;    }
    public void setTel(String tel) {        Tel = tel;    }
    public Boolean getDeleted() {        return isDeleted;    }
    public void setDeleted(Boolean deleted) {        isDeleted = deleted;    }



}

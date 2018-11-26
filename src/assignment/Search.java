package assignment;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Search {
    private static String XML_PATH ="src/assignment/Webshop.xml";

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Webshop.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Webshop webshop = (Webshop) jaxbUnmarshaller.unmarshal(new File(XML_PATH));

            System.out.println("-------------------------- ");
            System.out.println("Id alapján szűrés: ");
            for (Vevo_adatok vevo_adatok : webshop.getWebshop()) {
                if (vevo_adatok.getVid() == 3 && !vevo_adatok.getDeleted()) {
                    System.out.println("Id :"+vevo_adatok.getVid());
                    System.out.println("Név :"+vevo_adatok.getNév());
                    System.out.println("Cím :"+vevo_adatok.getCím());
                    System.out.println("Kor :"+vevo_adatok.getKor());
                    System.out.println("Email :"+vevo_adatok.getEmail());
                    System.out.println("Telefonszám :"+vevo_adatok.getTel());
                }
            }






        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

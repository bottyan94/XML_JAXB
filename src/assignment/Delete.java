package assignment;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Delete {
    private static String XML_PATH ="src/assignment/Webshop.xml";

    public static void main(String[] args) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Webshop.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Webshop webshop = (Webshop) jaxbUnmarshaller.unmarshal(new File(XML_PATH));

            System.out.println("-------------------------- ");
            System.out.println("Id alapján törlés: ");
            for (Vevo_adatok vevo_adatok : webshop.getWebshop()) {
                if (vevo_adatok.getVid()==3){
                    vevo_adatok.setDeleted(true);
                }
            }
            System.out.println("Listázás: ");
            for (Vevo_adatok vevo_adatok : webshop.getWebshop()) {
                if(!vevo_adatok.getDeleted()) {
                    System.out.println("-------- ");
                    System.out.println("Adat: ");
                    System.out.println("Id :"+vevo_adatok.getVid());
                    System.out.println("Név :"+vevo_adatok.getNév());
                    System.out.println("Cím :"+vevo_adatok.getCím());
                    System.out.println("Kor :"+vevo_adatok.getKor());
                    System.out.println("Email :"+vevo_adatok.getEmail());
                    System.out.println("Telefonszám :"+vevo_adatok.getTel());
                }
            }



            jaxbContext = JAXBContext.newInstance(Webshop.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


            // Marshal the webshop list in file
            jaxbMarshaller.marshal(webshop, new File(XML_PATH));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

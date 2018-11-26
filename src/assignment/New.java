package assignment;



import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class New {
    private static String XML_PATH = "src/assignment/Webshop.xml";

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Webshop.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            // We had written this file in marshalling example
            Webshop webshop = (Webshop) jaxbUnmarshaller.unmarshal(new File(XML_PATH));

            Vevo_adatok vevo_adatok = new Vevo_adatok();
            vevo_adatok.setVid(3);
            vevo_adatok.setNév("Név TESZT");
            vevo_adatok.setCím("ABC");
            vevo_adatok.setKor(24);
            vevo_adatok.setEmail("bottyan94@gmail.com");
            vevo_adatok.setTel("+36308990872");
            vevo_adatok.setDeleted(false);


            webshop.getWebshop().add(vevo_adatok);

            System.out.println("-------------------------- ");
            System.out.println("Új elem: ");
            System.out.println("Id :"+vevo_adatok.getVid());
            System.out.println("Név :"+vevo_adatok.getNév());
            System.out.println("Cím :"+vevo_adatok.getCím());
            System.out.println("Kor :"+vevo_adatok.getKor());
            System.out.println("Email :"+vevo_adatok.getEmail());
            System.out.println("Telefonszám :"+vevo_adatok.getTel());


            jaxbContext = JAXBContext.newInstance(Webshop.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


            // Marshal the employees list in file
            jaxbMarshaller.marshal(webshop, new File(XML_PATH));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

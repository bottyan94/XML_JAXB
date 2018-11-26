package assignment;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Update {
    private static String XML_PATH = "src/assignment/Webshop.xml";

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Webshop.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            // We had written this file in marshalling example
            Webshop webshop = (Webshop) jaxbUnmarshaller.unmarshal(new File(XML_PATH));


            for (Vevo_adatok vevo_adatok : webshop.getWebshop()) {
                if (vevo_adatok.getVid() == 3) {
                    Vevo_adatok vevo_adatok1 =vevo_adatok;
                    System.out.println("Mit: "+vevo_adatok1.getVid());
                    vevo_adatok1.setVid(3);
                    System.out.println("Mire: "+vevo_adatok1.getVid());
                    System.out.println("Mit: "+vevo_adatok1.getNév());
                    vevo_adatok1.setNév("Teszt átírás");
                    System.out.println("Mire: "+vevo_adatok1.getNév());
                    System.out.println("Mit: "+vevo_adatok1.getCím());
                    vevo_adatok1.setCím("1111 Valahol");
                    System.out.println("Mire: "+vevo_adatok1.getCím());
                    System.out.println("Mit: "+vevo_adatok1.getKor());
                    vevo_adatok1.setKor(20);
                    System.out.println("Mire: "+vevo_adatok1.getKor());
                    System.out.println("Mit: "+vevo_adatok1.getEmail());
                    vevo_adatok1.setEmail("valami@valami.hu");
                    System.out.println("Mire: "+vevo_adatok1.getEmail());
                    System.out.println("Mit: "+vevo_adatok1.getTel());
                    vevo_adatok1.setTel("111111");
                    System.out.println("Mire: "+vevo_adatok1.getTel());
                    vevo_adatok1.setDeleted(false);

                }
            }

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

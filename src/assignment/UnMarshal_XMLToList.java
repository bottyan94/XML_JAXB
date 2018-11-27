package assignment;



import assignment.model.Vevo_adatok;
import assignment.model.Webshop;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class UnMarshal_XMLToList {
    private static String XML_PATH = "src/assignment/Webshop.xml";

    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Webshop.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            //We had written this file in marshalling example
            Webshop webshop = (Webshop) jaxbUnmarshaller.unmarshal(new File(XML_PATH));
            System.out.println("-------------------------- ");
            System.out.println("Lista: ");
            for (Vevo_adatok vevo_adatok : webshop.getWebshop()) {

                System.out.println("Id: "+vevo_adatok.getVid());
                System.out.println("Név: "+vevo_adatok.getNév());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

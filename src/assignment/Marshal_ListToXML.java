package assignment;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

//https://howtodoinjava.com/jaxb/jaxb-exmaple-marshalling-and-unmarshalling-list-or-set-of-objects/
public class Marshal_ListToXML {
    //Initialize the employees list
    private static String XML_PATH = "src/assignment/Webshop.xml";

    private static void marshalingExample() throws JAXBException {

        Webshop webshop = new Webshop();

        webshop.setWebshop(new ArrayList<Vevo_adatok>());
        //Create two employees
        Vevo_adatok vevo_adatok = new Vevo_adatok();
        vevo_adatok.setVid(1);
        vevo_adatok.setNév("Bottyán Tamás");
        vevo_adatok.setCím("3780, Edelény, Katona József út 74.");
        vevo_adatok.setKor(24);
        vevo_adatok.setEmail("bottyan94@gmail.com");
        vevo_adatok.setTel("+36308990872");
        vevo_adatok.setDeleted(false);


        //Add the vevo_adatok in list
        webshop.getWebshop().add(vevo_adatok);



        JAXBContext jaxbContext = JAXBContext.newInstance(Webshop.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the employees list in console
        jaxbMarshaller.marshal(webshop, System.out);

        //Marshal the employees list in file
        jaxbMarshaller.marshal(webshop, new File(XML_PATH));
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            marshalingExample();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

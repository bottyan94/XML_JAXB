package assignment;



import assignment.model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class UnMarshal_XMLToList {
    private static String XML_PATH = "src/assignment/Webshop.xml";

    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(WebshopT.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            WebshopT webshopT = (WebshopT) jaxbUnmarshaller.unmarshal(new File(XML_PATH));

            System.out.println("-------------------------- ");
            System.out.println("Terméklista: ");

            for (Termek termek : webshopT.getTermekAdatok()) {

                System.out.println("Id: "+termek.getMegnevezes());
                System.out.println("Név: "+termek.getAr());
            }
            System.out.println("-------------------------- ");
            System.out.println("Vásárlók: ");

            for (Vevo vevo : webshopT.getVevoAdatok()) {

                System.out.println("Id: "+vevo.getNev());
                System.out.println("Név: "+vevo.getCim());
            }
            System.out.println("-------------------------- ");
            System.out.println("Terméklista: ");

            for (Rendeles rendeles : webshopT.getRendelesAdatok()) {

                System.out.println("Leírás: "+rendeles.getLeiras());
                System.out.println("Termék id: "+rendeles.getTermekId());
                System.out.println("Vevő id: "+rendeles.getVevoId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

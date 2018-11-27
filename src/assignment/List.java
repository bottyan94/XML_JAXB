
package assignment;


import assignment.model.Rendeles;
import assignment.model.Termek;
import assignment.model.Vevo;
import assignment.model.WebshopT;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class List {
    private static String XML_PATH = "src/assignment/Webshop.xml";

    public static void main(String[] args) {
        WebshopT webshopT = new WebshopT();
        try {

            //UnMarshal
            webshopT = UnMarshal_XMLToList.XMLToList();


            System.out.println("-------------------------- ");
            System.out.println("Terméklista: ");

            for (Termek termek : webshopT.getTermekAdatok()) {

                System.out.println("-- ");
                System.out.println("Id: " + termek.getMegnevezes());
                System.out.println("Név: " + termek.getAr());
            }
            System.out.println("-------------------------- ");
            System.out.println("Vásárlók: ");

            for (Vevo vevo : webshopT.getVevoAdatok()) {
                System.out.println("-- ");
                System.out.println("Id: " + vevo.getNev());
                System.out.println("Név: " + vevo.getCim());
            }
            System.out.println("-------------------------- ");
            System.out.println("Terméklista: ");

            for (Rendeles rendeles : webshopT.getRendelesAdatok()) {
                System.out.println("-- ");
                System.out.println("Leírás: " + rendeles.getLeiras());
                System.out.println("Termék id: " + rendeles.getTermekId());
                System.out.println("Vevő id: " + rendeles.getVevoId());


            } }catch(Exception e){
                e.printStackTrace();
            }

        }


    }

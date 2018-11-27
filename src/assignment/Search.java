
package assignment;



import assignment.model.Rendeles;
import assignment.model.Termek;
import assignment.model.Vevo;
import assignment.model.WebshopT;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Search {
    private static String XML_PATH = "src/assignment/Webshop.xml";

    public static void main(String[] args) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(WebshopT.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            WebshopT webshopT=(WebshopT) jaxbUnmarshaller.unmarshal(new File(XML_PATH));
            System.out.println("-------------------------- ");
            System.out.println("Id alapján szűrés: ");
            for (Rendeles rendeles : webshopT.getRendelesAdatok()) {
                if (rendeles.getRszam().equals("1")){
                System.out.println("A rendelés: "+ rendeles.getLeiras()+" TermékID: "+rendeles.getTermekId()+" VevoID: "+rendeles.getVevoId());
                for (Termek termek:webshopT.getTermekAdatok()){
                    if (termek.getTid().equals(rendeles.getTermekId())){
                        System.out.println("A hozzá tartozó termék: "+termek.getMegnevezes()+" ,az ára: "+termek.getAr());
                    }
                }
                for (Vevo vevo : webshopT.getVevoAdatok()){
                    if(vevo.getVid().equals(rendeles.getVevoId())){
                        System.out.println("A vásráló pedig: "+vevo.getNev()+" ,kora: "+vevo.getKor());
                    }
                }
                }


            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

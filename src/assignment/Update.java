
package assignment;


import assignment.model.Vevo;
import assignment.model.WebshopT;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Update {
    private static String XML_PATH = "src/assignment/Webshop.xml";

    public static void main(String[] args) {
        WebshopT webshopT =new WebshopT();
        try {
            webshopT=UnMarshal_XMLToList.XMLToList();

            for (Vevo vevo : webshopT.getVevoAdatok()) {
                if (vevo.getVid().equals("1")) {
                    Vevo vevo1 =vevo;


                    System.out.println("Mit: "+vevo1.getVid());
                    vevo1.setVid("3");
                    System.out.println("Mire: "+vevo1.getVid());
                    System.out.println("Mit: "+vevo1.getNev());
                    vevo1.setNev("Teszt átírás");
                    System.out.println("Mire: "+vevo1.getNev());
                    System.out.println("Mit: "+vevo1.getCim());
                    vevo1.setCim(null);
                    System.out.println("Mire: "+vevo1.getCim());
                    System.out.println("Mit: "+vevo1.getKor());
                    vevo1.setKor(20);
                    System.out.println("Mire: "+vevo1.getKor());
                    System.out.println("Mit: "+vevo1.getEmail());
                    vevo1.setEmail("valami@valami.hu");
                    System.out.println("Mire: "+vevo1.getEmail());
                    System.out.println("Mit: "+vevo1.getTel());
                    vevo1.setTel("111111");
                    System.out.println("Mire: "+vevo1.getTel());


                }
            }

            Marshal_ListToXML.marshalingListToXML(webshopT);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


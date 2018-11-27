
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

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(WebshopT.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            // We had written this file in marshalling example
            WebshopT webshopT = (WebshopT) jaxbUnmarshaller.unmarshal(new File(XML_PATH));


            for (Vevo vevo : webshopT.getVevoAdatok()) {
                if (vevo.getVid().equals("3")) {
                    Vevo vevo1 =vevo;
                    System.out.println("Mit: "+vevo1.getVid());
                    vevo1.setVid("0");
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

            jaxbContext = JAXBContext.newInstance(WebshopT.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


            // Marshal the webshop list in file
            jaxbMarshaller.marshal(webshopT, new File(XML_PATH));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


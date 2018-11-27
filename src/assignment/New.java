package assignment;



import assignment.model.Rendeles;
import assignment.model.Termek;
import assignment.model.Vevo;
import assignment.model.WebshopT;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class New {
    private static String XML_PATH = "src/assignment/Webshop.xml";

    public static void main(String[] args) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(WebshopT.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            // We had written this file in marshalling example
            WebshopT webshopT = (WebshopT) jaxbUnmarshaller.unmarshal(new File(XML_PATH));

            Vevo vevo = new Vevo();
            vevo.setNev("Teszt Hozzáadás");
            vevo.setKor(1);
            vevo.setTel("123");
            vevo.setEmail("asd@asddsadsa.com");
            vevo.setCim(null);
            vevo.setVid("0");
            webshopT.getVevoAdatok().add(vevo);

            Termek termek = new Termek();
            termek.setLeiras("Csoki");
            termek.setMegnevezes("Csokito rondade finom");
            termek.setAr("250");
            termek.setTid("3");
            webshopT.getTermekAdatok().add(termek);

            Rendeles rendeles = new Rendeles();
            rendeles.setLeiras("Csoki vétel");
            rendeles.setVevoId(vevo.getVid());
            rendeles.setTermekId(termek.getTid());
            rendeles.setDatum(null);
            rendeles.setRszam("11");
            webshopT.getRendelesAdatok().add(rendeles);


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

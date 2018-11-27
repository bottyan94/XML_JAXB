package assignment;

import assignment.model.*;
import com.sun.org.apache.xerces.internal.impl.xs.XMLSchemaException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;


public class Marshal_ListToXML {

    private static String XML_PATH = "src/assignment/Webshop.xml";

    private static void marshalingExample() throws JAXBException, XMLSchemaException {


        WebshopT webshopT = new WebshopT();

        webshopT.setRendelesAdatok(new ArrayList<Rendeles>());
        Rendeles rendeles = new Rendeles();
        rendeles.setRszam("1");
        rendeles.setDatum(null);
        rendeles.setLeiras("Teszt");
        rendeles.setTermekId("1");
        rendeles.setVevoId("1");
        webshopT.getRendelesAdatok().add(rendeles);
        System.out.println(rendeles.getLeiras());

        webshopT.setTermekAdatok(new ArrayList<Termek>());
        Termek termek = new Termek();
        termek.setTid("1");
        termek.setMegnevezes("Hell");
        termek.setLeiras("Energiaital");
        termek.setAr("200");
        webshopT.getTermekAdatok().add(termek);
        System.out.println(termek.getMegnevezes());

        webshopT.setVevoAdatok(new ArrayList<Vevo>());
        Vevo vevo = new Vevo();
        vevo.setVid("1");
        vevo.setNev("Bottyán Tamás");
        vevo.setKor(24);
        vevo.setCim(null);
        vevo.setEmail("asd@asd.com");
        vevo.setTel("12345567890");
        webshopT.getVevoAdatok().add(vevo);

        System.out.println(vevo.getNev());

        JAXBContext jaxbContext = JAXBContext.newInstance(WebshopT.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the webshop list in console
        jaxbMarshaller.marshal(webshopT, System.out);

        //Marshal the webshop list in file
        jaxbMarshaller.marshal(webshopT, new File(XML_PATH));
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            marshalingExample();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (XMLSchemaException x){
            x.printStackTrace();
        }
    }

}

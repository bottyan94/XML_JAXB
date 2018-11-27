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

    public static void marshalingListToXML(WebshopT webshopT) throws JAXBException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(WebshopT.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //Marshal the webshop list in console
            jaxbMarshaller.marshal(webshopT, System.out);

            //Marshal the webshop list in file
            jaxbMarshaller.marshal(webshopT, new File(XML_PATH));
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}

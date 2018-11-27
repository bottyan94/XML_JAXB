package assignment;


import assignment.model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class UnMarshal_XMLToList {
    private static String XML_PATH = "src/assignment/Webshop.xml";

    public static WebshopT XMLToList() {
        WebshopT webshopT = new WebshopT();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(WebshopT.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            webshopT = (WebshopT) jaxbUnmarshaller.unmarshal(new File(XML_PATH));


        } catch (Exception e) {
            e.printStackTrace();
        }
        return webshopT;

    }
}
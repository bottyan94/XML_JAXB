package assignment;


import assignment.model.Rendeles;
import assignment.model.Termek;
import assignment.model.Vevo;
import assignment.model.WebshopT;


import java.util.ArrayList;

public class New {
    public static void main(String[] args) {
        WebshopT webshopT = new WebshopT();
        try {

            webshopT = UnMarshal_XMLToList.XMLToList();

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

            Vevo vevo1 = new Vevo();
            System.out.println(vevo.getNev());
            vevo1.setNev("Teszt Hozzáadás");
            vevo1.setKor(1);
            vevo1.setTel("123");
            vevo1.setEmail("asd@asddsadsa.com");
            vevo1.setCim(null);
            vevo1.setVid("0");
            webshopT.getVevoAdatok().add(vevo1);

            Termek termek1 = new Termek();
            termek1.setLeiras("Csoki");
            termek1.setMegnevezes("Csokito rondade finom");
            termek1.setAr("250");
            termek1.setTid("3");
            webshopT.getTermekAdatok().add(termek1);

            Rendeles rendeles1 = new Rendeles();
            rendeles1.setLeiras("Csoki vétel");
            rendeles1.setVevoId(vevo.getVid());
            rendeles1.setTermekId(termek.getTid());
            rendeles1.setDatum(null);
            rendeles1.setRszam("11");
            webshopT.getRendelesAdatok().add(rendeles1);


            Marshal_ListToXML.marshalingListToXML(webshopT);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

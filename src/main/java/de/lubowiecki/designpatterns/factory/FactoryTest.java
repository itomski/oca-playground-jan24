package de.lubowiecki.designpatterns.factory;

public class FactoryTest {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug();
        f1.setMarke("VW");
        f1.setTyp("Polo");
        f1.setLeistung(65);
        f1.setAntrieb(Antrieb.BENZIN);
        f1.setFarbe(Farbe.GRAU);

        System.out.println(f1);

        System.out.println();

        Fahrzeug f2 = VwFactory.createGolf(Antrieb.BENZIN, Farbe.GELB);
        System.out.println(f2);

        System.out.println();

        Fahrzeug f3 = VwFactory.createPolo(Antrieb.ELEKTRO, Farbe.ROT);
        System.out.println(f3);


        System.out.println();

        GenericFahrzeugFactory factory = new GenericFahrzeugFactory("Ford", "Mustang", 200, Antrieb.BENZIN, Farbe.ROT);
        Fahrzeug f4 = factory.create();
        System.out.println(f4);

        System.out.println();

        factory.setAntrieb(Antrieb.DIESEL);
        Fahrzeug f5 = factory.create();
        System.out.println(f5);

    }
}

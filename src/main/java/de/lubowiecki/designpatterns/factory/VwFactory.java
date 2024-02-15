package de.lubowiecki.designpatterns.factory;

public class VwFactory {

    private static final String BRAND = "VW";

    public static Fahrzeug createGolf(Antrieb antrieb, Farbe farbe) {
        Fahrzeug f = createPrototype(antrieb, farbe);
        f.setTyp("Golf");
        f.setLeistung(100);
        return f;
    }

    public static Fahrzeug createPolo(Antrieb antrieb, Farbe farbe) {
        Fahrzeug f = createPrototype(antrieb, farbe);
        f.setTyp("Polo");
        f.setLeistung(65);
        return f;
    }

    private static Fahrzeug createPrototype(Antrieb antrieb, Farbe farbe) {
        Fahrzeug f = new Fahrzeug();
        f.setMarke(BRAND);
        f.setAntrieb(antrieb);
        f.setFarbe(farbe);
        return f;
    }
}

package de.lubowiecki.designpatterns.factory;

public class GenericFahrzeugFactory {

    private String marke = "Unbekannt";
    private String typ = "Unbekannt";
    private int leistung;
    private Antrieb antrieb = Antrieb.BENZIN;
    private Farbe farbe = Farbe.GELB;

    public GenericFahrzeugFactory(String marke, String typ, int leistung, Antrieb antrieb, Farbe farbe) {
        this.marke = marke;
        this.typ = typ;
        this.leistung = leistung;
        this.antrieb = antrieb;
        this.farbe = farbe;
    }

    public Fahrzeug create() {
        Fahrzeug f = new Fahrzeug();
        f.setMarke(marke);
        f.setTyp(typ);
        f.setLeistung(leistung);
        f.setAntrieb(antrieb);
        f.setFarbe(farbe);
        return f;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public void setAntrieb(Antrieb antrieb) {
        this.antrieb = antrieb;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }
}

package de.lubowiecki.designpatterns.factory;

public class Fahrzeug {

    private String marke;
    private String typ;
    private int leistung;
    private Antrieb antrieb;
    private Farbe farbe;

    public Fahrzeug() {
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public Antrieb getAntrieb() {
        return antrieb;
    }

    public void setAntrieb(Antrieb antrieb) {
        this.antrieb = antrieb;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("marke='").append(marke).append('\'');
        sb.append(", typ='").append(typ).append('\'');
        sb.append(", leistung=").append(leistung);
        sb.append(", antrieb=").append(antrieb);
        sb.append(", farbe=").append(farbe);
        sb.append('}');
        return sb.toString();
    }
}

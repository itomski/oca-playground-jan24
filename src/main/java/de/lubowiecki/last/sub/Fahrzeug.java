package de.lubowiecki.last.sub;

public class Fahrzeug {

    public String marke = "Renault";

    // protected ist innerhalb des gleichen Package wie public
    protected int leistung = 100;

    protected int getLeistung() {
        return leistung;
    }
}

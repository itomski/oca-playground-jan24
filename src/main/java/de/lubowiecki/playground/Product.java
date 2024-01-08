package de.lubowiecki.playground;

import java.time.LocalDate;

public class Product {

    private static int count = 0;
    private int id;
    private String name;
    private String beschreibung;
    private int anzahl;

    private double preis;
    private LocalDate imBestandSeit;

    public Product(String name, String beschreibung, int anzahl, double preis) {
        this.id = ++count;
        this.name = name;
        this.beschreibung = beschreibung;
        this.anzahl = anzahl;
        this.preis = preis;
        this.imBestandSeit = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public LocalDate getImBestandSeit() {
        return imBestandSeit;
    }

    public void setImBestandSeit(LocalDate imBestandSeit) {
        this.imBestandSeit = imBestandSeit;
    }

    // TODO: toString richtig implementieren!

    @Override
    public String toString() { // Konvertiert das Objekt in einen String
        // return super.toString(); // super ist Object
        // return name + ", " + beschreibung + ", " + anzahl + ", " + preis; // Erzeugt 7 String-Objekte

        // StringBuffer sb = new StringBuffer(); // Thread-Save (aber langsam)

        StringBuilder sb = new StringBuilder(); // Veränderbarer String - Nicht Thread-Save (schnell)
        sb.append(name) // liefert das geänderte StringBuilder-Objekt zurück
            .append(", ")
            .append(beschreibung)
            .append(", ")
            .append(anzahl)
            .append(", ")
            .append(preis);

        return sb.toString();
    }

    /*
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", beschreibung='").append(beschreibung).append('\'');
        sb.append(", anzahl=").append(anzahl);
        sb.append(", preis=").append(preis);
        sb.append(", imBestandSeit=").append(imBestandSeit);
        sb.append('}');
        return sb.toString();
    }
    */
}

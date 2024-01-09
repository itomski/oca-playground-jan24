package de.lubowiecki.uebung4;

import java.time.LocalDateTime;
import java.util.Objects;

public class Produkt {

    private String name;

    private String beschreibung;

    private int menge;

    private double preis;

    private LocalDateTime imBestandSeit;

    public Produkt() {
    }

    public Produkt(String name, String beschreibung, int menge, double preis) {
        this(name, beschreibung, menge, preis, LocalDateTime.now()); // Wird mit der aktuellen Datum/Zeit belegt
    }

    public Produkt(String name, String beschreibung, int menge, double preis, LocalDateTime imBestandSeit) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.menge = menge;
        this.preis = preis;
        this.imBestandSeit = imBestandSeit;
    }

    public String getName() {
        return name;
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

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public LocalDateTime getImBestandSeit() {
        return imBestandSeit;
    }

    public void setImBestandSeit(LocalDateTime imBestandSeit) {
        this.imBestandSeit = imBestandSeit;
    }

    /*
    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        } else {
            if (other instanceof Produkt) { // ist es vom gleichen Typ
                // Eigenschaften vergleichen
                Produkt p = (Produkt) other;
                if (this.name.equals(p.name)) {
                    if (this.beschreibung.equals(p.beschreibung)) {
                        if (this.menge == p.menge) {
                            if(this.preis == p.preis) {
                                if (this.imBestandSeit.equals(p.imBestandSeit)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, beschreibung, menge, preis, imBestandSeit);
    }
    */

    @Override
    public boolean equals(Object o) {
        // System.out.println("E");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Objects.equals(name, produkt.name) && Objects.equals(beschreibung, produkt.beschreibung);
    }

    @Override
    public int hashCode() {
        // System.out.println("H");
        return Objects.hash(name, beschreibung);
    }
}

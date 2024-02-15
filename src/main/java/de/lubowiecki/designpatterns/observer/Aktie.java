package de.lubowiecki.designpatterns.observer;

public class Aktie {

    private final String name;

    private double preis;

    public Aktie(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public void changePreis(double prozent) {
        this.preis = preis + (preis * prozent);
        System.out.printf("%s: Neuer Preis %.4f € \n", name, preis);
    }
}

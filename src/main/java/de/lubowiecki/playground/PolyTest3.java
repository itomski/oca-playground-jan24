package de.lubowiecki.playground;

public class PolyTest3 {

    public static void main(String[] args) {

        // Referenztyp: Machbar
        // Objekttyp: Backen

        // Instanzmethoden werden auf dem Objekttyp ausgeführt
        // Klassenmethoden und Eigenschaften werden auf dem Refernztyp ausgeführt

        Machbar m = new Backen();
        m.doIt(); // wenn Instanzmethoden variablen nutzen, suchen sie diese im gleiche Objekt
        m.checkErg();
        System.out.println(m.zahl);

        m = new Kochen();
        m.doIt();
        System.out.println(m.zahl);

    }
}

abstract class Machbar {

    public int zahl = 10;

    abstract void doIt();

    static void checkErg() {
        System.out.println("Checke ob machbar?");
    }
}

class Backen extends Machbar {

    public int zahl = 20;

    public void doIt() {
        System.out.println("Backe Kuchen: " + zahl);
    }

    static void checkErg() {
        System.out.println("Checke ob backbar?");
    }
}

class Kochen extends Machbar {

    public int zahl = 30;

    public void doIt() {
        System.out.println("Koche Mittagessen: " + zahl);
    }

    static void checkErg() {
        System.out.println("Checke ob essbar?");
    }
}
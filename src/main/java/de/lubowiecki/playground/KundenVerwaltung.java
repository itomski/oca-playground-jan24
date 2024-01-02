package de.lubowiecki.playground;

import java.time.LocalDate;

public class KundenVerwaltung {

    // PascalCase = Beginnt mit Großbuchstaben. Jedes Wort beginnt wieder groß
    // camelCase = Beginnt mit Kleinbuchstaben. Jedes Wort beginnt wieder groß
    // snake_case = Enthält nur Kleinbuchstaben. Wörter werden mit _ getrennt
    // SCREAMING_SNAKE_CASE = Enthält nur Großbuchstaben. Wörter werden mit _ getrennt

    // PascalCase: für Klassen, Interfaces und Enums
    // camelCase: für Methoden und Eigenschaften(Variablen)
        // kleineZahl : Variable
        // machWas() : Methode
    // snake_case : wird in Java NICHT verwendet!!!!!
    // SCREAMING_SNAKE_CASE : wird für Konstanten benutzt (Variablen, die sich nicht mehr ändern)

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(Math.PI); // Math ist die Klasse, PI ist eine Konstante der Klasse
        System.out.println(Math.pow(2,2)); // Math ist die Klasse, pow ist eine Methode
        System.out.println(Integer.MIN_VALUE);

        int[] zahlen = {1,2,3,4}; /* Mein Text */
        System.out.println(zahlen.length); // zahlen ist ein Array-Objekt, length ist eine Eigenschaft

        System.out.println(); // Zeilenumbruch

        // Instanzierung
        Kunde k1 = new Kunde(); // Aus dem Bauplan wird ein neues Objekt gebaut
        //k1 = null;

        //System.out.println(k1.vorname);
        //k1.vorname = "1234"; // public Variablen können unkontrolliert geändert werden
        System.out.println(k1.getVorname()); // Lesen
        k1.setVorname("Peter"); // Schreiben

        //System.out.println(k1.nachname); // ist privat
        //k1.vorname = "XYZ"; // ist privat
        System.out.println(k1.getNachname()); // Lesen
        k1.setNachname("Parker"); // Schreiben

        // Wenn ein Objekt ausgegeben werden soll, muss es in ein String konvertiert werden
        // das erfolgt durch toString() aus Kunde, wenn dort nicht vorhanden dann aus Object
        System.out.println(k1); // Komplettes Objekt ausgeben
        //System.out.println(k1.toString());

        Kunde k2 = new Kunde(); // Verwendet den parameterlosen Konstruktor
        k2.setVorname("Bruce");
        k2.setNachname("Banner");
        k2.setGeburtsDatum(LocalDate.of(1978, 11, 15));
        k2.setAktiv(true);
        System.out.println(k2);

        // Verwendet den Konstruktor mit 4 Parametern
        Kunde k3 = new Kunde("Tony", "Stark", LocalDate.now(), false);
        System.out.println(k3);

        System.out.println();

        k1.sagHallo();
        k2.sagHallo();
        k3.sagHallo();

        System.out.println(k3.getHallo().toUpperCase());

    }

    public static void machWas() {
        machWasAnderes();
    }

    public static void machWasAnderes() {
        System.out.println("XYZ");
    }

}

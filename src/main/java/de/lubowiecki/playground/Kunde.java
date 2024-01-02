package de.lubowiecki.playground;

import java.time.LocalDate;

// Klassen aus java.lang sind automatisch verfügbar und müssen nicht importiert werden

// Alle Klassen sind in Java von der Klasse Object abgeleitet
public class Kunde {

    // Instanzvariablen / Eigenschaften
    private String vorname; // Deklaration

    private String nachname = "Unbekannt"; // Deklaration und Initialisierung

    // komplexe Datentypen = Basieren auf einer Klasse
    private LocalDate geburtsDatum;

    // boolean ist ein primitiver Datentyp
    // primitive Datentypen werden klein geschrieben
    private boolean aktiv = false;

    // Überladen von Konstruktoren heißt
    // es gibt verschiedene Konstruktoren, die sich durch die Parameterliste unterscheiden
    public Kunde() {
    }

    // Konstruktor
    public Kunde(String vn, String nachname, LocalDate geburtsDatum, boolean aktiv) {
        // vorname ist eine lokale Variable: ist bis zum Ende der Methode verfügbar
        // this.vorname ist die Instanzvariable: ist verfügbar, solange das Objekt da ist
        vorname = vn;
        this.nachname = nachname; // this muss nur benutzt werden, wenn es zum Namenskonflikt kommt
        this.geburtsDatum = geburtsDatum;
        this.aktiv = aktiv;
    }

    // Methoden / Fähigkeiten
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public String getNachname() { // Erlaubt das Lesen
        return nachname;
    }

    // Erlaubt ein kontrolliertes Schreiben
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public boolean isAktiv() { // Getter für boolean beginnen mit is...
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public void sagHallo() {
        System.out.println("Hallo. Mein Name ist " + vorname + " " + nachname + ".");
    }

    public String getHallo() {
        String hallo = "Hallo. Mein Name ist " + vorname + " " + nachname + ".";
        return hallo;
    }

    // Beschreibt, wie ein Kundenobjet zu einem String konvertiert wird
    @Override
    public String toString() {
        return vorname + ',' +
                nachname + ',' +
                geburtsDatum + ',' +
                aktiv;
    }
}

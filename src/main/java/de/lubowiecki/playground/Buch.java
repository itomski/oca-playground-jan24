package de.lubowiecki.playground;

public class Buch {

    /* Jede Klasse hat einen Default-Konstruktor, solange kein eigener Konstruktor deklariert wurde
    public Buch() {
        super(); // Springt zum Konstruktor der Elternklasse, hier Object
    }
    */

    private int seiten;
    private String titel;
    private String autor;

    public Buch() {
        // super() ist automatisch drin
    }

    public Buch(int seiten) {
        this("titel", "", seiten); // Verweis auf den Konstruktor mit 3 Parametern
    }

    public Buch(String titel, int seiten) {
        // Wenn this() benutzt wird, wird super() nicht verwendet!
        this(titel, "", seiten);
    }

    public Buch(String titel, String autor, int seiten) {
        // super(); // automatisch
        this.titel = titel; // Lokale Variable titel wird auf die Instanzvariable titel zugewiesen
        this.autor = autor;
        this.seiten = seiten;
    }
}

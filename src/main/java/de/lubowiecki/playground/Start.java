package de.lubowiecki.playground;

public class Start { // Klasse

    // Einstiegspunkt
    public static void main(String[] args) { // Methode

        // x = 10;
        // x = "ABC";
        //var x = "ABC"; // Kompiler ermittelt automatisch den Typ, Ab Java 1.9 erlaubt
        // x = 10; // x ist ein String

        // int : Datentyp (Ganzzahl)
        // i : Name der Variable
        // = 10 : Der Variable i wird der Wert 10 zugewisen
        int i = 10; // Lokale Variable
        int j = 20; // Deklaration: Vorstellung einer Variable
        // j = "20"; // Kompilererror

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // sout
        System.out.println("Hallo Zeile"); // Schreibt eine Zeile auf die Konsole
        System.out.println("SUM: " + (i + j));
        System.out.println("Salute");

        j = 50; // Variable bekommt einen neuen Wert
        System.out.println("SUM: " + (i + j));

        // EVA - Eingabe - Verarbeitung - Ausgabe

        byte zahl = 126; // kleine Ganzzahl
        zahl++; // Increment d.h. Wert wird um 1 hochgezählt : 127
        zahl++; // -128: Überlauf
        zahl++; // -127
        System.out.println(zahl);
        // zahl = 128; // Error: 128 ist zu groß für einen Byte


    } // Am Ende dieser Methode endet das Programm
}
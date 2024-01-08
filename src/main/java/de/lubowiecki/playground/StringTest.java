package de.lubowiecki.playground;

public class StringTest {

    public static void main(String[] args) {

        String s = "Hallo"; // Landet im Pool (String-Literal-Pool)
        s = new String("Hallo"); // Landet NICHT im Pool
        // Strings die durch Methoden erzeugt werden landen ebenfalls NICHT im Pool

        //s + " Welt"; // Error
        //s += " Welt";
        s.concat(" Welt"); // Manipulation produziert ein neues String-Objekt
        s = s.concat(" Welt"); // Referenz muss auf das neue Objekt zeigen
        s = s.toLowerCase();
        // Alle Methoden von String die einen String zurückliefern produzieren ein neues Objekt
        System.out.println(s + " Welt"); // Das Objekt hiter s wird NICHT verändert

        String[] namen = {"Peter", "Carol", "Bruce", "Scott", "Natasha", "Tony"};
        // namen = new String[]{}; // Leeres Array
        String erg = String.join(", ", namen);
        System.out.println(erg);

        erg = String.join(", ", "A", "B", "C", "XYZ");
        //erg = String.join(", "); // Keine VarArg-Parameter
        System.out.println(erg);

        // Instanzmethoden verwenden den Inhalt des Strings um ein neues Objekt zu erzeugen
        // Klassenmethoden verwenden Parameter ein String-Objekt zu erzeugen

        final String ROW = "| %-14s | %-14s | %-8.2f | \n";

        erg = String.format(ROW, "Peter", "Parker", 182.5); // Liefert einen neuen formatierten String zurück
        System.out.print(erg);
        //System.out.printf(ROW, "Peter", "Parker", 182.5); // Gibt einen formatierten String aus
        System.out.printf(ROW, "Bruce", "Banner", 195.0);
        System.out.printf(ROW, "Carol", "Danvers", 176.8);

    }
}

package de.lubowiecki.playground;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class KonstruktorTest {

    public static void main(String[] args) {

        String s1 = "ABC"; // String-Literal
        String s2 = new String("Abc"); // Konstruktor

        char[] zeichen = {'a', 'b', 'c'}; // char ist primitiver datentyp für ein Unicode-Zeichen
        String s3 = new String(zeichen); // Konstruktor

        // Erzeugt einen String aus der Zahl
        String s4 = String.valueOf(10.5);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4 + 5); // + bei Strings führt zu Verkettung

        Buch b1 = new Buch();
        Buch b2 = new Buch(200);
        // Buch b3 = new Buch(200, 500); // Es gibt keinen Konstruktor für zwei ints
        Buch b4 = new Buch("Kochen ohne Fett", 200);

        // Da Buch keine eigene hashCode-Methode hat, wird die von Object verwendet
        System.out.println(b1.hashCode());

        //Arrays arr = new Arrays(); // hat einen privaten Konstruktor
        //Arrays.fill();
        //LocalDate ld = new LocalDate(2000, 11, 10);
        LocalDate ld = LocalDate.of(2000, 11, 10);

    }
}

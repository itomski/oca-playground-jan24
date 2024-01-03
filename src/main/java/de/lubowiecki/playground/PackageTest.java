package de.lubowiecki.playground;

//import java.time.LocalDate;
import java.time.*; // Importiert alle Klasse aus dem Package
// SubPackeges werden durch * NICHT importiert
import java.util.Date;

public class PackageTest {

    public static void main(String[] args) {

        // Durch den import ist die Klasse bekannt und kann direkt verwendet werden
        LocalDate heute = LocalDate.now();

        java.time.LocalTime jetzt = java.time.LocalTime.now();

        Date d1 = new Date();
        // Verwende ich zwei unterschiedliche Klassen mit gleichen Namen
        // wird eine importiert und die andere fully qualified verwendet
        java.sql.Date d2 = new java.sql.Date(100l);

    }
}

package de.lubowiecki.time;

import java.time.*;
import java.time.temporal.*;

public class UnitFiledTest {

    public static void main(String[] args) {

        TemporalUnit unit; // Interface
        ChronoUnit cUnit; // Enum, das TemporalUnit implementiert
        TemporalField field; // Interface
        ChronoField chronoField; // Enum, das TemporalField implementiert

        Temporal temporal; // Interface
        // Implementierungen
        LocalDate date = LocalDate.now(); // Datum, Jahr, Monat, Tag
        LocalTime zeit = LocalTime.now(); // Zeit, Stunden, Minuten, Sekunden,... Nanosekunden
        Instant jetzt = Instant.now(); // Maschinenzeit in Nanosakunden

        TemporalAmount amount; // Interface
        // Implementierung
        Duration duration; // Abstand in Std,Min,Sek etc
        Period period; // Abstand in Tage, Jahre, Monate

        // Einheiten
        unit = ChronoUnit.HOURS;
        unit = ChronoUnit.DAYS;
        unit = ChronoUnit.HALF_DAYS;
        unit = ChronoUnit.YEARS;

        // Eine bestimmte Information
        field = ChronoField.DAY_OF_MONTH;
        field = ChronoField.YEAR;

        System.out.println(date);
        date = date.plus(10, ChronoUnit.DAYS); // LocalDate und LocalTime sind immutable

        if(date.isSupported(ChronoUnit.MINUTES)) // Prüft, ob eine bestimmte Einheit unterstützt wird
            date = date.plus(10, ChronoUnit.MINUTES); // LocalDate kann keine Minuten verarbeiten

        System.out.println(date);

        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        if(date.isSupported(ChronoField.HOUR_OF_DAY)) // Prüft, ob eine bestimmte Information enthalten ist
            System.out.println(date.get(ChronoField.HOUR_OF_DAY));


        Period p = Period.of(2, 5, 1);
        date = date.plus(p); // Rechnet den Zeitabstand auf das Datum rauf
        System.out.println(date);

        // LocalDate
        // LocalTime
        // LocalDateTime
        // Instant
        // Period
        // ChronoUnit
        // ChronoField
        // DateTimeFormatter
    }
}

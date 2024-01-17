package de.lubowiecki.time;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TimeTest {

    public static void main(String[] args) {

        Date d1 = new Date();
        d1 = new Date(2000, 10, 15);
        d1 = new Date(System.currentTimeMillis());
        System.out.println(d1);

        System.out.println();

        LocalDate ld = LocalDate.now();
        ld = LocalDate.of(2000, 10, 15);
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        lt = LocalTime.of(15, 22, 30, 100);
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        ldt = LocalDateTime.of(ld, lt);
        ldt = LocalDateTime.of(2000, 10, 15, 13, 15);
        System.out.println(ldt);

        System.out.println();

        System.out.println(ld.getMonth()); // Monat als Enum
        System.out.println(ld.getMonthValue()); // Monat als Zahl
        System.out.println(ld.getYear());
        //System.out.println(ld.getLong(ChronoField.HOUR_OF_DAY)); // Datum enthält keine Zeit
        System.out.println(ld.getLong(ChronoField.DAY_OF_YEAR));

        // ChronoField: Steht für bestimmte Informationen der Zeitangabe
        // ChronoUnit: Steht für bestimmte Einheiten der Zeitangabe

        System.out.println(ldt.toLocalTime());
        System.out.println(ldt.toLocalDate());

        // LocalDate, LocalTime und LocalDateTime sind immutable

        // LocalDate plusYears, plusMonths, plusDays
        // LocalTime plusHours, plusMinutes, etc.
        ld.plusDays(10); // return ist das neue Objekt. Das alte wird nicht geändert
        ld = ld.plusDays(10); // Neues Objekt wird auf die alte Referenz zugewiesen
        ld = ld.plus(100, ChronoUnit.DAYS);
        ld = ld.minus(10, ChronoUnit.MONTHS);

        ld = LocalDate.of(2024, 1, 30); // 30.01.2024

        // bei plusMonths: ist der Tag im Monat nicht verfügbar,
        // bleibt das Datum beim letzten des Monats stehen
        ld = ld.plusMonths(1); // 29.02.2024

        System.out.println();
        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);

        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        //final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.UK);
        System.out.println(ld.format(DATE_FMT));

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Datum: ");
        String datum = scanner.nextLine();
        //ld = LocalDate.parse(datum); // Verwendet per default ISO - 2000-12-02, yyyy-MM-dd
        ld = LocalDate.parse(datum, DATE_FMT); // Verwendet das Muster

        // Für die Prüfung relevant
        // y, u Jahr
        // M Monat
        // m Minuten
        // H Stunden
        // d Monatstag, D Jahrestag
        // s Sekunden

        System.out.println();

        Locale.setDefault(Locale.JAPAN); // Standard Sprache/Land ändern
        final DateTimeFormatter DATE_FMT2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(ld.format(DATE_FMT2));

        System.out.println();

        final DateTimeFormatter TIME_FMT = DateTimeFormatter.ofPattern("HH:mm");

        while(true) {
            try {
                System.out.print("Zeit [HH:mm]: ");
                String zeit = scanner.nextLine();
                lt = LocalTime.parse(zeit, TIME_FMT);
                break;
            }
            catch (DateTimeException e) {
                System.out.println("Falsches Format");
            }
        }
    }
}

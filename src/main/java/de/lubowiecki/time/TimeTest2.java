package de.lubowiecki.time;

import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimeTest2 {

    public static void main(String[] args) {

        Instant start = Instant.now();

        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
        System.out.println();
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.of(10, 15);
        LocalDateTime ldt = ld.atTime(lt);

        Year y = Year.now();
        YearMonth ym = y.atMonth(12);
        LocalDate date = ym.atDay(10);
        date = ym.atEndOfMonth();

        System.out.println();

        ld = LocalDate.now();

        LocalDate ld2 = LocalDate.of(2010, 12,10);
        System.out.println(ld2.isBefore(ld));
        System.out.println(ld2.isAfter(ld));

        Instant end = Instant.now();

        // Duration: Abstand zwischen zwei Zeitangaben
        // Period: Abstand zwischen zwei Datumsangaben
        // Instant: Maschinenzeit in Nanos
        System.out.println(Duration.between(start, end).toNanos() + "ns");

        ld = LocalDate.of(2015, 10,25);
        ld2 = LocalDate.now();

        Period p1 = Period.between(ld, ld2);
        System.out.println(p1);
        System.out.println(p1.getYears());
        System.out.println(p1.getMonths());
        System.out.println(p1.getDays());

        p1 = p1.withMonths(5);
        System.out.println(p1);

        System.out.println(ld2.plus(p1)); // Addiert den Abstand zum Datum

        System.out.println();

        Period p2 = Period.of(10, 32, 105);
        System.out.println(p2);
        System.out.println(p2.normalized()); // Tage können nicht automatisch auf Monate hochgerechnet werden

        System.out.println();

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2017, 11, 22));
        dates.add(LocalDate.of(2010, 1, 1));
        dates.add(LocalDate.of(2019, 7, 12));
        dates.add(LocalDate.of(2024, 8, 29));
        dates.add(LocalDate.of(2001, 5, 1));

        System.out.println(dates);
        // Arrays.sort(); // Für Arrays
        Collections.sort(dates); // Für andere Sammlungen (Collections)
        System.out.println(dates);

        //dates.sort() // Verlangt einen Comparator


    }
}

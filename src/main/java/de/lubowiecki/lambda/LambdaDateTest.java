package de.lubowiecki.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LambdaDateTest {

    public static void main(String[] args) {

        FormatDate fmtUK = (d) -> d.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        FormatDate fmtDE = (d) -> d.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        FormatDate fmtDESpecial = d -> d.format(DateTimeFormatter.ofPattern("EEEE d. MMMM yyyy"));
        // FormatDate fmtDEVerySpecial = d -> 123; // RückgabeTyp ist nicht String

        LocalDate jetzt = LocalDate.now();
        System.out.println(fmtDE.fmt(jetzt));
        System.out.println(fmtUK.fmt(jetzt));
        System.out.println(fmtDESpecial.fmt(jetzt));
        //System.out.println(fmtDESpecial.fmt(1000)); // EingangsTyp ist nicht LocalDate

    }
}

@FunctionalInterface
interface FormatDate {

    public String fmt(LocalDate date);

}

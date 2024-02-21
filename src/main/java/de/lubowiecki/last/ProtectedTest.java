package de.lubowiecki.last;

import de.lubowiecki.last.sub.Fahrzeug;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ProtectedTest {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug();
        System.out.println(f1.marke); // sichtbar, da public
        // System.out.println(f1.leistung); // Error: protected, nur im gleichen Package und erbende Klassen sichtbar

        NextFahrzeug f2 = new NextFahrzeug();
        //System.out.println(f2.leistung); // Error: ProtectedTest.main erbt nicht von Fahrzeug
        System.out.println(f2.getLeistung()); // OK

        //int i = 1 + 0 (* 0 / 2);

        Integer i = 10;
        Double d = 10.0;
        System.out.println(i.equals(d)); // Wertevergleich, ohne Widening
        //System.out.println(i == d); //Referenzvergleich, Error - nicht der gleiche Datentyp

        int ii = 10;
        double dd = 10.0;
        System.out.println(ii == dd); // Wertevergleich mit primitiv Widening


        Integer z1 = 100;
        Integer z2 = 200;
        Double z3 = 100.0;

        // Wrapper werden zum Rechnen ausgepackt. Danach kann primitiv widening erfolgen
        // Das Ergebnis wird NICHT automatisch wider geboxt, sondern bleibt primitiv
        System.out.println(z1 + z2 - z3);

        System.out.println(Integer.decode("0xABC"));
        System.out.println(Integer.parseInt("0123"));

        String s1 = "10", s2;

        //LocalDate ld = LocalDate.now();
        // Der Objektzustand of(...) wird bei now() nicht beachtet, da now statisch ist
        LocalDate ld = LocalDate.of(2015, 10, 12).now();
        System.out.println(ld);

        LocalDateTime ldt = ld.atTime(LocalTime.NOON);
        System.out.println(ldt);

        LocalTime lt = LocalTime.of(15, 22);
        ldt = lt.atDate(ld);
        System.out.println(ldt);
    }
}

class NextFahrzeug extends Fahrzeug {

    // Erbende Klasse kann protected Inventar verwenden

    @Override
    public int getLeistung() {
        return super.getLeistung(); // Erlaubt, da NextFahrzeug von Fahrzeug erbt
    }
}

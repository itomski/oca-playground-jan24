package de.lubowiecki.last;

import de.lubowiecki.last.sub.Fahrzeug;

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


    }
}

class NextFahrzeug extends Fahrzeug {

    // Erbende Klasse kann protected Inventar verwenden

    @Override
    public int getLeistung() {
        return super.getLeistung(); // Erlaubt, da NextFahrzeug von Fahrzeug erbt
    }
}

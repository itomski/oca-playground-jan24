package de.lubowiecki.lambda;

import java.util.function.Predicate;

public class FunctionalTest {

    public static void main(String[] args) {

        Predicate p1; // Auf Object parametrisiert
        Predicate<String> p2; // Auf String parametrisiert
        Predicate<Integer> p3; // Auf Integer parametrisiert

        // boolean test(Object o)
        p1 = (o) -> o.hashCode() != 0;
        // boolean test(Stringt s)

        // Der Einzeilige-Ausdruck im Lambda produziert AUTOMATISCH ein return
        // Schlüsselwort return NICHT erlaubt!
        p2 = str -> str.length() > 0; // Bei einem Parameter kann die Parameter-Klammer weggelassen werden


        // boolean test(Integer i)
        // Bei Mehrzeiligen Lambdas muss ein return expliziet angegeben werden,
        // wenn das Interface ein returntyp festlegt
        p3 = (Integer x) -> { // Datentyp MUSS gleich dem generischen sein. Hier Integer!
            int a = 100;
            return x < a;
        };

        int c = 100;

        Abc abc = (x, y) -> x + 10 + y + 25 + c; // Kann auch instanz, klassen und lokale Variablen verwenden
        // Lokale Variablen, die im Lambda verwendet werden MÜSSEN final oder effektiv final sein
        // effektiv final = Variable ändert sich nicht
        // c = 200; // c wäre nicht mehr efferktiv final

        System.out.println(abc.add(10, 15));

    }
}

interface Abc {
    int add(int a, int b);
}
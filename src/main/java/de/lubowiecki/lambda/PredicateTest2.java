package de.lubowiecki.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest2 {

    public static void main(String[] args) {

        // boolean test(T t);
        Predicate<String> checkLength = (s) -> s.length() >= 20;

        System.out.println(checkLength.test("Hi"));
        System.out.println(checkLength.test("Das ist das Haus von Nikigraus!"));

        checkLength = (s) -> s.length() > 0;

        String input = "";

        if(checkLength.test(input))
            System.out.println(input);
        else
            System.out.println("Unbekannt");


        Predicate<String> checkChar = s -> s.indexOf('A') > -1;

        BiPredicate<String, Character> checkChar2 = (s, c) -> s.indexOf(c) > -1;

        System.out.println(checkChar.test("Hiiiiiiiiiii"));
        System.out.println(checkChar2.test("Hiiiiiiiiiii", 'i'));

        System.out.println();

        // and verbindet zwei Predicates zu einem
        System.out.println(checkLength.and(checkChar).test("HAllo"));

        // negate dreht die Prüfung um
        System.out.println(checkChar.negate().test("Hallo"));

        System.out.println();

        List<Integer> zahlen = new ArrayList<>(List.of(100, 50, 22, 17, 1, 19, 2000, 1972));

        zahlen.removeIf(i -> i > 150); // Wird entfernt bei TRUE

        // Gleiche Ausführung
        //Predicate<Integer> pred = i -> i > 150;
        //zahlen.removeIf(pred);

        System.out.println(zahlen);

        System.out.println();

        // Streams werden bei Verwendung verbraucht
        Stream.of(2,100,17,22,18,100,-250,99,16,2,1,-15,18)
                .filter(i -> i > 0) // Predicate: Wird entfernt bei FALSE
                .filter(i -> i < 75) // Predicate
                .map(i -> i * 10) // Function: Verändert den Wert oder Typ
                .distinct()
                .sorted()
                .forEach(i -> System.out.print(i + ", ")); // Consumer


        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Natasha");
        namen.addAll(Arrays.asList("Steve", "Tony", "Bruce", "Scott", "Adam"));

        System.out.println();

        namen.stream()
                .filter(s -> !s.equalsIgnoreCase("tony"))
                .sorted()
                .forEach(s -> System.out.println(s));

    }
}

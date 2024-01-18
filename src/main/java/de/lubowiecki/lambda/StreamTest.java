package de.lubowiecki.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class StreamTest {

    public static void main(String[] args) {

        // Fabrik für Werte
        final IntSupplier W6 = () -> (int)(Math.random() * 6) + 1;
        /*
        System.out.println(W6.getAsInt());
        System.out.println(W6.getAsInt());
        System.out.println(W6.getAsInt());
        */

        IntStream.generate(W6) // Generiert unendlich werte nach der Supplier Vorgabe
                .limit(10)
                .forEach(i -> System.out.println(i));


        Function<String, Integer> toInt = s -> {
            try {
                return Integer.parseInt(s);
            }
            catch(NumberFormatException e) {
                return 0;
            }
        };

        int zahl = toInt.apply("100");

        System.out.println();

        List<String> namen = new ArrayList<>(List.of("Carol", "Peter", "Natasha", "Scott", "Tony"));
        namen.stream()
                .map(s -> s.length())
                .forEach(i -> System.out.println(i));

        System.out.println();

        Predicate<Integer> pred1 = w -> w > 100 && w < 500;
        List<Integer> zahlen = new ArrayList<>(List.of(15, 22, 100, 700, 250, 99, 62, 325));
        zahlen.removeIf(pred1); // Werte bei denen das Predicate true ergibt werden entfernt
        System.out.println(zahlen);

        System.out.println();

        zahlen = new ArrayList<>(List.of(15, 22, 100, 700, 250, 99, 62, 325));
        zahlen.parallelStream()
                .filter(pred1) // wert wird behalten, wenn es true ist
                .forEach(i -> System.out.println(i));


    }
}

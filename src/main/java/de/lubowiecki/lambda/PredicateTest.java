package de.lubowiecki.lambda;

import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        // boolean test(T t);
        Predicate<String> pr = s -> s.length() > 5;
        pr = s -> s.charAt(0) == 'A';

        System.out.println(pr.test("Max"));
        System.out.println(pr.test("Das ist Max Mustermann."));
    }
}

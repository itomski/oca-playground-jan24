package de.lubowiecki.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Consumer;

public class RandomNumberLambdaTest {

    public static void main(String[] args) {

        RandGenerator w6 = () -> (int) (Math.random() * 6) + 1;
        RandGenerator w10 = () -> (int) (Math.random() * 10) + 1;

        System.out.println(w6.generate());
        System.out.println(w6.generate());
        System.out.println();
        System.out.println(w10.generate());
        System.out.println(w10.generate());
        System.out.println(w10.generate());

        System.out.println();

        SpecialRandGenerator<Integer> sw6 = () -> new Random().nextInt();
        System.out.println(sw6.generate());

        System.out.println();

        SpecialRandGenerator<String> sws = () -> UUID.randomUUID().toString();
        System.out.println(sws.generate());

        System.out.println();
        // double run(double a, double b);
        // a und b können auch anders benannt werden
        MathOp op1 = (a, b) -> a % b;

        System.out.println(op1.run(10.5, 15.7));
        System.out.println(op1.run(10, 3));
        System.out.println(op1.run(5, 10));
        System.out.println(op1.run(-15, 4));

        Output o = s -> "Das ist der Wert: " + s;
        o = s -> String.format("Das ist der Wert: %10s", s);

        System.out.println(o.run("Peter"));

        System.out.println();

        List<String> namen = Arrays.asList("Bruce", "Natasha", "Carol", "Tony", "Steve");


        //printNameList(namen, o);
        //printNameList(namen, s -> String.format(" | %-20s | ", s));
        printNameList(namen, s -> String.format(" | %-10s | %d | ", s, s.length()));

        System.out.println();

        printNameListWithConsumer(namen, s -> System.out.printf(" | %-10s | %d | \n", s, s.length()));

    }

    static void printNameList(List<String> namens, Output out) {

        for (String s : namens) {
            System.out.println(out.run(s));
        }
    }

    static void printNameListWithConsumer(List<String> namens, Consumer<String> c) {

        for (String s : namens) {
            c.accept(s);
        }
    }
}

interface RandGenerator {

    int generate();

}

interface SpecialRandGenerator<R> {

    R generate();

}

interface MathOp {

    double run(double a, double b);

}

interface Output {

    String run(String s);

}
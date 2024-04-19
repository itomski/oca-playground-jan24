package de.lubowiecki.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class LambdaTest6 {
    public static void main(String[] args) {

        // int machWas(int a, int b)
        Operation add = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;

        System.out.println(add.exec(10, 15)); // Ausführung
        System.out.println(sub.exec(10, 15)); // Ausführung

        runAction(add, 15, 22);
        runAction(sub, 15, 22);
        runAction((x, y) -> x * x * y , 15, 22);

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Carol");
        namen.add("Natasha");
        namen.add("Steve");
        namen.add("Bob");

        Consumer<String> cons1 = (str) -> System.out.println(str);
        cons1.accept("Das ist das Haus von Nikigraus");

        System.out.println();

        System.out.println();
        namen.forEach(cons1);

        System.out.println();
        namen.forEach((a) -> System.out.println(a.charAt(0)));

        cons1 = (str) -> System.out.printf("Das ist mein Satz: %s \n", str.toLowerCase());
        cons1.accept("Das ist das Haus von Nikigraus");

        System.out.println();
        namen.forEach(cons1);

        System.out.println("---------------");

        // boolean test(T t);
        Predicate<String> pred1 = a -> true;
        pred1 = a -> a.length() > 4;
        System.out.println(pred1.test("Hallo Welt"));

        System.out.println();
        System.out.println(namen);
        //namen.removeIf(a -> a.length() < 4);
        namen.removeIf(a -> a.startsWith("C"));
        System.out.println(namen);

        System.out.println("---------------");

        // Supplier
        IntStream.generate(() -> (int)(Math.random() * 10) + 1)
                .limit(100)
                .filter(w -> w != 7)
                .forEach(w -> System.out.println(w));


        System.out.println();

        // sequenziell
        namen.forEach(n -> System.out.println(Thread.currentThread().getName() + ":" + n));

        System.out.println();

        // parallel
        namen.parallelStream().forEach(n -> System.out.println(Thread.currentThread().getName() + ":" + n));

        // int exec(int a, int b);
        Operation op1 = (int a, int b) -> 100; // Bei mehreren Parametern muss die Klammer geschrieben werden
        op1 = (a, b) -> 100;

        // T change(T wert);
        Manipulator<String> m1 = (String s) -> s + "..."; // Bei Angabe der Datentypen muss die Klammer geschrieben werden
        m1 = (s) -> s + "...";
        m1 = s -> s + "...";

        Supplier<String> sup = () -> "Hallo"; // Bei 0 Params muss die Klammer geschrieben werden

        m1 = s -> "Hi"; // Der Ausdruck im Lambda hat automatisch ein return
        m1 = s -> { // Bei Mehrzeiligen Lambdas (Verwendung {...}) muss ein return verwendet werden
            int a = 10;
            int b = 25;
            return "Erg ist " + (a + b);
        };
    }

    static void runAction(Operation op, int a, int b) {
        System.out.println(op.exec(a, b)); // Ausführung
    }

}

@FunctionalInterface // optional. Überprfüft die Regeln für das SAM
interface Operation {

    int exec(int a, int b);

    // double machWas(double a, double b);

}

@FunctionalInterface
interface Manipulator<T> {

    T change(T wert);

}
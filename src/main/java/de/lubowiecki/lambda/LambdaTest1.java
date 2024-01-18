package de.lubowiecki.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class LambdaTest1 {

    public static void main(String[] args) {

        // Basis für ein Lambda ist ein Interface (FunctionalInterface)
        // FunctionalInterface hat nur eine einzige abstrake Methode (SAM - Single Abstract Method)

        // void machWas();
        Machbar m1 = () -> System.out.println("Dies und das!");

        /* Passt nicht zum FunctionalInterface
        Machbar m2 = (a, b) -> {
            return a + b;
        };
        */

        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;

        // Parameter-Datentypen sind optional
        MathOperation multi = (double a, double b) -> a * b;

        System.out.println(add.run(100, 50));
        System.out.println(sub.run(100, 50));

        // add ist eine Methode, die als Parameter weiter gegeben wird
        System.out.println(runOperation(200, 500, add));

        // Build-In-FunctionalInterface von Java
        BinaryOperator<Integer> add2 = (op1, op2) -> op1 + op2;
        add2 = (op1, op2) -> {
            return op1 + op2;
        };
        System.out.println(add2.apply(100, 500));

        //List<String> list = new ArrayList<String>();
        List<String> list = new ArrayList<>(); // Ab Java 1.7

        // Auf Klammern kann bei einem Parameter verzichtet werden
        NichtMachbar nm1 = a -> System.out.println(a + " wird NICHT ausgeführt");

        // Kommt der Datentyp zum Parameter dazu, muss die Klammer gesetzt werden
        NichtMachbar nm2 = (String a) -> System.out.println(a + " wird NICHT ausgeführt");

        nm1.machNicht("Abwaschen");
    }

    static double runOperation(double x, double y, MathOperation op) {
        return op.run(x, y);
    }
}

interface Machbar {
    void machWas();
}

interface NichtMachbar {
    void machNicht(String aufgabe);
}

@FunctionalInterface
interface MathOperation {
    double run(double a, double b);
}

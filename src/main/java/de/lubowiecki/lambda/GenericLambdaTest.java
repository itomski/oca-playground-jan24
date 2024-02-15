package de.lubowiecki.lambda;

import java.time.LocalDate;

public class GenericLambdaTest {

    public static void main(String[] args) {

        GenerateString<Integer> gs1 = v -> "Wert ist " + v;
        System.out.println(gs1.generate(100));

        GenerateString<Double> gs2 = v -> "Wert ist " + v;
        System.out.println(gs2.generate(100.95));

        GenerateString<LocalDate> gs3 = v -> "Wert ist " + v;
        System.out.println(gs3.generate(LocalDate.now()));

    }
}

interface GenerateString<T> {

    String generate(T t);

}

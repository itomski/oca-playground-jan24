package de.lubowiecki.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTest4 {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>(List.of("Carol", "Peter", "Natasha", "Scott", "Tony"));

        // int compare(T o1, T o2);
        Comparator<String> nachStrLaenge = (s1, s2) -> s1.length() - s2.length();
        Comparator<String> nachInhalt = (s1, s2) -> s1.compareTo(s2);
        //comp = comp.reversed();

        //namen.sort(nachInhalt);
        namen.sort(nachStrLaenge.thenComparing(nachInhalt)); // Nach Länge und dann nach Inhalt
        System.out.println(namen);

    }
}

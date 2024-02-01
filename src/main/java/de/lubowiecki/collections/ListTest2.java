package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTest2 {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(); // Standard Größe des inneren Arrays ist 10
        zahlen.add(10); // Wird an die nächste freie Stelle positioniert
        zahlen.addAll(Arrays.asList(5,7,99,18,12,11)); // Fügt alle Elemente hinzu
        zahlen.addAll(List.of(5,7,99,18,12,11)); // Ab Java 1.9

        zahlen.add(2, 720); // Fügt an index 2 eine neue Zahl ein

        zahlen = new LinkedList<>(zahlen); // Wechsel von ArrayList auf LinkedList
        zahlen.add(2, 17);
        zahlen.add(1, 100);
        zahlen.add(7, 18);

        System.out.println(zahlen.get(10));
        zahlen = new ArrayList<>(zahlen); // Wechsel von LinkedList auf ArrayList

        // Nur Listen können sortiert werden!

        System.out.println(zahlen.size());
        // Letzer vorhandener Index ist zahlen.size() - 1
        try {
            zahlen.add(20, 1000); // Hinzufügen nur am vorhandenen oder nächsten Index möglich
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(zahlen);

    }
}

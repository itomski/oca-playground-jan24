package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        // List hat einen Index
        // Kann null und Duplikate enthalten
        // ist geordnet - Einfügereihenfolge
        // erlaubt einen wahlfreien Zugriff

        // Erzeugen eine Liste mit fester Größe
        Arrays.asList(2,3,5,8,22,1100,10,17);
        List.of(2,3,5,8,22,1100,10,17); // Seit Java 1.9

        // Inhalt der Fixed-Size-List wird in eine erweiterbare ArrayList eingesetzt
        List<Integer> zahlen = new ArrayList<>(List.of(2,3,5,8,22,1100,10,17));
        // zahlen.addAll(List.of(2,3,5,8,22,1100,10,17)); // Nachträglich mit mehreren Werten befüllen

        zahlen.add(15);
        //zahlen.add(null);
        //zahlen.add(null);
        zahlen.add(28);
        zahlen.add(17);
        zahlen.add(-17);

        // Wahlfreier Zugriff
        System.out.println(zahlen.get(6));

        System.out.println(zahlen); // toString wird benutzt

        System.out.println();

        for (Integer i: zahlen) {
            System.out.println(i);
        }

        System.out.println();

        //zahlen.sort(); // Verlangt einen Comparator
        Collections.sort(zahlen); // Liste wird nach Wert sortiert
        Collections.reverse(zahlen); // Wird umgekehrt sortiert
        System.out.println(zahlen);

        System.out.println();

        for (int i = 0; i < zahlen.size(); i++) {
            System.out.println(zahlen.get(i));
        }

        System.out.println();

        for (int i = zahlen.size() - 1; i > -1; i--) {
            System.out.println(zahlen.get(i));
        }
    }
}

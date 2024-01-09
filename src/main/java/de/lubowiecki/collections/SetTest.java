package de.lubowiecki.collections;

import de.lubowiecki.uebung4.Produkt;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        /*
        Iterable // Interface
        Collection // Interface
        AbstractCollection // Klasse - TeilImplementierung
        List / Set / Queue // Interface
        AbstractList / AbstractSet / AbstractQueue // Klasse - TeilImplementierung
        ArrayList / LinkedList / ... / ... // Klasse - Konkret - Alles muss implementiert sein
        */

        // Set ist eine Menge
        // Set hat keinen Index
        // Kann keine Duplikate enthalten
        // ist sortiert...
        // erlaubt keinen wahlfreien Zugriff
        // Suche nach Elementen ist extrem schnell

        Set<Integer> zahlen = new HashSet<>();
        System.out.println(zahlen.add(10));
        System.out.println(zahlen.add(22));
        System.out.println(zahlen.add(18));
        System.out.println(zahlen.add(1100));
        System.out.println(zahlen.add(50));
        System.out.println(zahlen.add(18));

        System.out.println(zahlen);

        System.out.println();

        Set<Produkt> produkte = new HashSet<>();
        // Beim Einfügen wird der HashCode geprüft
        // Ist er gleich, wird weiter mit Equals geprüft
        // Ist er nicht gleich, dann ist es kein Duplikat

        LocalDateTime jetzt = LocalDateTime.now();

        System.out.println(produkte.add(new Produkt("Tasse, rot", "100% Keramik", 16, 5.99, jetzt)));
        System.out.println(produkte.add(new Produkt("Tasse, rot", "100% Keramik", 16, 5.99, jetzt)));
        System.out.println(produkte.add(new Produkt("Tasse, rot", "100% Keramik", 16, 5.99, jetzt)));
        System.out.println(produkte.add(new Produkt("Tasse, rot", "100% Keramik", 16, 5.99, jetzt)));
        //System.out.println(produkte.add(new Produkt("Tasse, blau", "100% Keramik", 20, 3.99)));
        //System.out.println(produkte.add(new Produkt("Tasse, grün", "70% Keramik", 10, 2.99)));
        //System.out.println(produkte.add(new Produkt("Tasse, blau", "100% Keramik", 20, 7.99)));

        System.out.println(produkte.size());
    }
}

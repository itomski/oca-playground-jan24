package de.lubowiecki.collections;

import de.lubowiecki.uebung4.Produkt;

import java.time.LocalDateTime;

public class EqualsTest {

    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println();

        String s1 = new String("Hallo");
        String s2 = new String("Hallo");
        System.out.println(s1 == s2); // false : s1 und s2 sind zwei unterschiedliche Objekte auf dem Heap
        System.out.println(s1.equals(s2)); // true : s1 und s2 haben den gleichen Wert
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println();

        LocalDateTime jetzt = LocalDateTime.now();

        Produkt p1 = new Produkt("Tasse, rot", "100% Keramik", 16, 5.99);
        Produkt p2 = new Produkt("Tasse, rot", "100% Keramik", 20, 7.99);
        System.out.println(p1 == p2); // Referenzvergleich
        System.out.println(p1.equals(p2)); // Wertevergleich
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

    }
}

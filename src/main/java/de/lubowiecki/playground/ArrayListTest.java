package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(); // Unsave, List von Objekten

        // Generischer Typ ist String
        ArrayList<String> list2 = new ArrayList<>(); // ArrayList von Strings

        List<String> list3 = new ArrayList<>(); // Referenz vom Typ List und Objekt vom Typ ArrayList

        // Alle Collections nehmen NUR Objekte auf
        list1.add(1); // Autoboxing von int auf Integer
        list1.add(1.5); // Autoboxing von double auf Double
        list1.add("Hallo"); // String
        list1.add(new Product("Handschuhe", "100% Wolle", 20, 15.99)); // Product

        for (Object o : list1) {
            System.out.println(o); // toString wird verwendet
        }

        System.out.println("-----------------");

        // Die Liste ist auf String spezialisiert

        list2.add("Peter");
        list2.add("Bruce");
        list2.add("Carol");

        for (String n : list2) {
            System.out.println(n.toUpperCase());
        }

        System.out.println("-----------------");

        // ArrayList basiert intern auf einem Array
        // Default-Größe liegt bei 10

        list3 = new LinkedList<>(list3); // Konvertiert die ArrayList in eine Linkedlist
        list3 = new ArrayList<>(list3); // Konvertiert die Linkedlist in eine ArrayList
    }
}

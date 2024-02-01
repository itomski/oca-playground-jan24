package de.lubowiecki.collections;

import java.util.*;

public class SetTest1 {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        System.out.println(c1);

        Customer c2 = new Customer("Peter", "Parker");
        System.out.println(c2);

        System.out.println("--------------");

        Set<Customer> customers = new HashSet<>(); // Reihenfolge nicht bestimmbar
        customers.add(c1);
        customers.add(c2);
        customers.add(new Customer("Carol", "Danvers"));

        for (Customer c : customers) {
            System.out.println(c);
        }

        System.out.println();

        customers.forEach(c -> System.out.println(c));
        System.out.println();

        UUID uuid = UUID.randomUUID();
        Customer c3 = new Customer(uuid, "Tony", "Stark");
        Customer c4 = new Customer(uuid, "Tony", "Stark");

        // equals wird nur verwendet, wenn zwei HashCodes gleich sind
        // Zwei Objekte sind gleich, wenn HashCodes gleich sind und equals true ergibt
        customers.add(c3);
        customers.add(c4);

        customers.forEach(c -> System.out.println(c));

        System.out.println();

        // Behält die Einfügereihenfolge bei
        Set<Customer> linkedCustomers = new LinkedHashSet<>();
        linkedCustomers.add(c2);
        linkedCustomers.add(new Customer("Carol", "Danvers"));
        linkedCustomers.add(c3);
        linkedCustomers.add(c4);

        linkedCustomers.forEach(c -> System.out.println(c));

        System.out.println();

        // Objekte müssen sortierbar sein d.h. sie müssen Comparable implementieren
        // Alternativ kann dem TreeSet ein Vergleichs-Weise als Comparator vorgegeben werden

        Comparator<Customer> byFirstname = (a, b) -> a.getFirstname().compareTo(b.getFirstname());
        Comparator<Customer> byLastname = (a, b) -> a.getLastname().compareTo(b.getLastname());
        Comparator<Customer> byId = (a, b) -> a.getId().compareTo(b.getId());

        //Set<Customer> treeCustomers = new TreeSet<>(byId);
        //Set<Customer> treeCustomers = new TreeSet<>(); // sortiert nach der natürlichen Reihenfolge
        Set<Customer> treeCustomers = new TreeSet<>(byFirstname.thenComparing(byLastname));
        treeCustomers.add(c2);
        treeCustomers.add(new Customer("Carol", "Zoolander"));
        treeCustomers.add(new Customer("Anna", "Hansen"));
        treeCustomers.add(new Customer("Anna", "Zimmermann"));
        treeCustomers.add(new Customer("Anna", "Backer"));
        treeCustomers.add(new Customer("Tom", "Hansen"));
        treeCustomers.add(c3);

        treeCustomers.forEach(c -> System.out.println(c));


    }
}

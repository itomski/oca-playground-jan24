package de.lubowiecki.tests;

import static java.lang.Math.*; // Importiert das statische Inventar von Math
//import static java.lang.System.out; // Importiert das out aus der System Klasse
import static java.lang.System.*; // Importiert alle statischen Methoden und Eigenschaften aus der System Klasse

public class Test1b {

    public static void main(String[] args) {

        System.out.println("Hallo");
        System.out.println(Math.PI);
        System.out.println(Math.pow(10,10));

        System.out.println(PI); // verfügbar wegen dem statischen import
        System.out.println(pow(5,5)); // verfügbar wegen dem statischen import

        out.println("hi"); // verfügbar wegen dem statischen import
        err.println("problem"); // verfügbar wegen dem statischen import
    }
}

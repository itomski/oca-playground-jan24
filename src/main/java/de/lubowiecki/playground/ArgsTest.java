package de.lubowiecki.playground;

import java.util.Arrays;

// Top-Level-Klasse
public class ArgsTest {

    // String[] args enthält Werte die beim Start des Programms übergeben wurden
    // args enthält immer nur Strings
    public static void main(String[] args) {

        // args ist ein Array. Array ist eine Sammlung von Werten gleichen Typs

        // Arrays.toString liefert einen String mit dem Inhalt des Arrays
        System.out.println(Arrays.toString(args));

        System.out.println("Hallo " + args[0]); // die erste Position des Arrays ist 0

    }

    // Innere Klasse
    class Abc {

    }
}

// Zweite Top-Level-Klasse
// Erlaubt aber nicht schön!
class Xyz {

}

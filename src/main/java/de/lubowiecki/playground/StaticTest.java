package de.lubowiecki.playground;

import java.util.Random;

public class StaticTest {

    // Klassenvariablen
    public static int zahl = 100;
    public static String wort = "Hallo!";

    // Klassenmethode
    public static int getZufallszahl() {
        Random rand = new Random();
        return rand.nextInt(100); // Liefert eine Zufallszahl zwischen 0 und 99
        // return (int)(Math.random() * 100) + 1;
    }
}

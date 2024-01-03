package de.lubowiecki.playground;

import java.util.Random;

public class InstanceTest {

    // Instanzvariable
    public int zahl = 100;
    public String wort = "Hallo!";

    // Instanzmethode
    public int getZufallszahl() {
        Random rand = new Random();
        return rand.nextInt(100); // Liefert eine Zufallszahl zwischen 0 und 99
        // return (int)(Math.random() * 100) + 1;
    }
}

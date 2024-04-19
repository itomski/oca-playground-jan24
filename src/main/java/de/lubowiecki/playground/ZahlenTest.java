package de.lubowiecki.playground;

public class ZahlenTest {

    public static void main(String[] args) {

        long l1 = 10; // int - primitive widening zu long
        byte b1 = 120; // byte und short können mit einem Ganzzahlen-Literal in passener Größe direkt belegt werden

        int i1 = 10;
        Integer i2 = 10; // Autoboxing von int zu Integer

        byte b3 = 10;
        Byte b2 = 10; // Autoboxing von byte zu Byte
        b3 = b2; // Auto-Unboxing
        long l3 = b2; // Auto-Unboxing und dann primitive Widening
        Long l4 = (long)100;

        // i2.longValue(); Konvertierung durch Methodenaufruf des Wrappers

        // Autoboxing immer zum eigenen Wrapper
        // int zu Integer
        // byte zu Byte
        // double zu Double
        // char zu Character
        // etc.

        Long l2 = 10 + 0l; // Autoboxing von int zu Integer, komplex widening

        // primitive widening: byte < short < int < long < float < double
        // komplex widening: Integer < Number < Object
        // Integer, Long, Double etc. sind Geschwisterelemente und zu einender nicht kompatibel

        // Object > Number > (Integer, Byte, Short, Double etc.)

        byte b4 = 7;
        // 1. int - primitive widening zu long - erg 25 long
        // 2. byte - primitive widening zu long - erg 32 long
        // 3. long - primitive widening zu double - erg 42.0 double
        double sum = 10 + 15l + b4 + 10.0;

    }
}

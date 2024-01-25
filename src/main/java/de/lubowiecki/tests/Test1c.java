package de.lubowiecki.tests;

public class Test1c {

    static int x  = 50;

    int a = b;
    static int b;

    static {
        b = 500;
    }

    public static void main(String[] args) {

        int x, y = 100;
        // x = y = 100; // beide mit dem belegen
        // System.out.println(x); // Error: x ist nicht initialisiert
        // System.out.println(Test1c.x);

        System.out.println(100.0/0.0);

        Xyz xyz = new Xyz(); // Verwendet den default Konstruktor
        xyz.Xyz();

    }
}

class Xyz {

    void Xyz() { // Das ist KEIN Konstruktor sondern eine Instanzmethode
        System.out.println("...");
    }
}

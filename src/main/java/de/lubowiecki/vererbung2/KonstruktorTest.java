package de.lubowiecki.vererbung2;

public class KonstruktorTest {

    public static void main(String[] args) {
        new B();
    }
}

class A {

    /*
    // Defaultkonstruktor
    public A() {
        super();
    }
    */

    // Ein eigener Konstruktor bedeutet, dass der Defultkonstruktor nicht mehr bereitgestellt wird
    public A(int i) {
        System.out.println("AC");
    }
}

class B extends A {

    /*
    // Defaultkonstruktor
    public B() {
        super();
    }
    */

    public B() {
        super(0);
        System.out.println("BC");
    }
}

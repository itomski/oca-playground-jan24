package de.lubowiecki.tests;

import java.io.IOException;

public class Test2b {

    public static void main(String[] args) {

        Child c1 = new Child();
        //c1 = new NextChild(); // Error: Sind Geschwisterelemente

        // Links: Referenztyp - Parent
        // Rechts: Objekttyp - Parent, Child oder NextChild
        // Instanzmethoden werden IMMER auf dem Objekttyp ausgeführt
        Parent p = new Parent();
        p = new Child();
        //p = new NextChild();
        p.hi();
        //p.move(); // Parent entscheidet, welche Methoden sichtbar sind

        //Number n = new Integer(10);
        Number n = Integer.valueOf(10);
        short s = ((Integer)n).shortValue();

        // Abstrakte Klassen dürfen nicht direkt instanziert werden
        //NextParent np = new NextParent();

        // Als anonyme Klasse
        NextParent np = new NextParent(){
            @Override
            public void nextHi() {
                System.out.println("yo!");
            }
        };

        np.hi();
        np.nextHi();

        System.out.println(0x99ffCl);
        long l = 0x99ffCl;
        Long l1 = 0x99ffCl;
        l1 = null;

        byte b = 0b10;
        b = 020;

        Integer i = 10;
        Double d = 15.5;
        double sum = i + d; // zum Rechnen werden Wrapper-Typen in primitive Typen ausgepackt

        double d2 = 100; // int -> primitive Widening zu double
        //Double d3 = 100; // int -> Autoboxing zu Integer -> komplex Widening

        System.out.println();

        char c = 'A';
        c += 10; // c = (char)(c + 10);
        c++; // c = (char)(c + 1);
        System.out.println(c); // Zeichen
        System.out.println((int)c); // Zahlenwert

        System.out.println(Double.BYTES);// 8
        System.out.println(Double.SIZE);// 64
        // 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        System.out.println(Long.BYTES);// 8
        System.out.println(Long.SIZE);// 64
        // 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        System.out.println(Integer.BYTES);// 4
        System.out.println(Integer.SIZE);// 32
        // 00000000 00000000 00000000 00000000

        System.out.println(Byte.BYTES);// 1
        System.out.println(Byte.SIZE);// 8
        // 00000000

        int j = 0;
        //j = new Integer(0); // Integer.valueOf(0);

    }
}

class Parent {
    public void hi() {
        System.out.println("Hi from Parent");
    }
}

class Child extends Parent {
    public void hi() {
        System.out.println("Hi from Child");
    }

    public void move() {
        System.out.println("Child go to ...");
    }
}

class NextChild extends Parent {
    public void hi() throws NullPointerException {
        System.out.println("Hi from NextChild");
    }
}

// abstract und final können nicht zusammen verwendet werden
abstract class NextParent {

    public abstract void nextHi();

    public void hi() {
        System.out.println("Hi from NextParent");
    }
}

// interfaces sind per default abstract
interface NextInterface {

    void nextHi(); // automatisch public und abstract

    public default void hi() {
        System.out.println("Hi from NextParent");
    }

    /*
    // hashCode, equals und toString dürfen nicht als default überschrieben werden
    public default String toString() {
        return "Hi from NextParent";
    }
    */
}

// default ist nur in Interfaces erlaubt - seit Java 1.8
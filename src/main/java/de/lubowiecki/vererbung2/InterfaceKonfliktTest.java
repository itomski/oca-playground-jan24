package de.lubowiecki.vererbung2;

import java.util.Collection;

public class InterfaceKonfliktTest {

    public static void main(String[] args) {
    }

}

abstract class C2 {

    // enthält eine Klasse eine abstrakte Methode, MUSS sie als abstrakt deklariert werden

    // In einer abstrakten Klasse müssen abstrakte Methoden expliziet als solche deklariert werden
    abstract void doSomething();

}


interface I1 {

    // In einem Interface sind Methoden impliziet abstrakt
    void doSomething();

    default void doSomethingElse() {
        System.out.println("I1");
    }
}

interface I2 {

    void doSomething();

    default void doSomethingElse() {
        System.out.println("I2");
    }
}

class C1 implements  I1, I2 {

    @Override
    public void doSomething() {
    }

    // C1 muss seine eigene doSomethingElse implementieren, da der Kompiler nicht automatisch
    // entscheiden kann, aus welchem Interface die Methode verwendet werden soll

    @Override
    public void doSomethingElse() {
        // I2.super.doSomethingElse();
    }
}

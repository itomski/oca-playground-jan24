package de.lubowiecki.playground;

public class PolyInterfaceTest {

    public static void main(String[] args) {

        Erbe e1 = new Erbe();
        e1.machDies();
        e1.machDas();

    }
}

interface Abc {

    default void machDies() {
        System.out.println("Abc: machDies");
    }

    default void machJenes() {
        System.out.println("Abc: machJenes");
    }

}

interface Cde {

    default void machDas() {
        System.out.println("Cde: machDas");
    }

    default void machJenes() {
        System.out.println("Cde: machJenes");
    }
}

class Erbe implements Abc, Cde {


    @Override
    // Wenn zwei oder mehr Interfaces eine gleiche default-Methode vererben
    // MUSS die erbende Klasse die Methode selbst implementieren um das Konflikt zu lösen
    public void machJenes() {
        System.out.println("Erbe: machJenes");
    }
}

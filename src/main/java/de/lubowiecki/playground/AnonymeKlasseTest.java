package de.lubowiecki.playground;

public class AnonymeKlasseTest {

    public static void main(String[] args) {

        // Anonyme Klasse produziert ein Einweg-Objekt

        // Eine neue Klasse ohne Namen wird deklariert.
        // Sie erbt von Basis u nd wird sofort instanziert
        Basis b1 = new Basis() {
            // Hier können Methoden überschrieben werden

            @Override
            public void doSomething() {
                System.out.println("Anonym1");
            }
        };

        Basis b2 = new Basis();


        b1.doSomething();
        b1.doSomethingElse();

        System.out.println();

        b2.doSomething();
        b2.doSomethingElse();

        System.out.println();

        // eine anonyme Klasse wird deklariert, die das interface implementiert
        // und diese Klasse wird sofort instanziert
        Fahrbar f1 = new Fahrbar() {

            @Override
            public void vorwaerts(int strecke) {
                System.out.println("Fahre " + strecke + "km vorwärts");
            }

            @Override
            public void rueckwaerts(int strecke) {
                System.out.println("Fahre " + strecke + "km rückwärts");
            }
        };

        f1.rueckwaerts(10);
        f1.vorwaerts(20);

    }
}

// Kann ein Interface, abstrakte Klasse oder konkrete Klasse sein
class Basis {

    public void doSomething() {
        System.out.println("Basis1");
    }

    public void doSomethingElse() {
        System.out.println("Basis2");
    }
}

interface Fahrbar {

    void vorwaerts(int strecke);

    void rueckwaerts(int strecke);

}

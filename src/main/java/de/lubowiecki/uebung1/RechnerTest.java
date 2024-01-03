package de.lubowiecki.uebung1;

public class RechnerTest {

    public static void main(String[] args) {

        Rechner rechner = new Rechner(); // Klasse wird instanziert

        // Methode wird auf der Referenz ausgeführt
        double sum = rechner.add(10.5, 15);
        System.out.println(sum);

    }
}

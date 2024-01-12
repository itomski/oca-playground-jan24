package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.List;

public class Uni {

    public static void main(String[] args) {

        //Lebewesen l1 = new Mensch();
        Lebewesen l1 = new Student2();
        Lebewesen l2 = l1; // l2 ist eine zweite Referenz auf Mensch
        l1 = new Hund(); // Hund ist auch ein Lebewesen

        // Instanzmethoden werden auf dem Objekttyp ausgeführt
        l1.nahrungAufnahmen();
        l1.fortbewegung();

        System.out.println();

        List<Lebewesen> lebewesenList = new ArrayList<>();
        //lebewesenList.add(new Mensch()); // Instanzen können nicht aus abstrakten Klassen gebildet werden
        lebewesenList.add(new Student2());
        lebewesenList.add(new Student2());
        lebewesenList.add(new Fisch());
        lebewesenList.add(new Fisch());
        lebewesenList.add(new Hund());
        lebewesenList.add(new Hund());

        for (Lebewesen l : lebewesenList) {
            l.nahrungAufnahmen();
        }

    }
}

interface Lebewesen {

    void nahrungAufnahmen();

    void fortbewegung();

}

abstract class Mensch2 implements Lebewesen {


    @Override
    public void nahrungAufnahmen() {
        System.out.println("Isst Brot");
    }

    // void fortbewegung(); // Diese Methode fehlt

    abstract void sagHallo();
}

class Student2 extends Mensch2  {

    @Override
    public void fortbewegung() {
        System.out.println("Läuft auf über den Campus.");
    }

    @Override
    void sagHallo() {
        System.out.println("Ich bin ein Student");
    }
}

class Hund implements Lebewesen {

    @Override
    public void nahrungAufnahmen() {
        System.out.println("Frisst Fleisch");
    }

    @Override
    public void fortbewegung() {
        System.out.println("Läuft auf allen 4 Pfoten");
    }
}

class Fisch implements Lebewesen {

    @Override
    public void nahrungAufnahmen() {
        System.out.println("Frisst Zeug");
    }

    @Override
    public void fortbewegung() {
        System.out.println("Schwimmt davon");
    }
}

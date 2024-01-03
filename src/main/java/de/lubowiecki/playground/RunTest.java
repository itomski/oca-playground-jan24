package de.lubowiecki.playground;

import static java.lang.Math.*; // Importiert das statische Inventar der Klasse Math
import static de.lubowiecki.playground.Wochentag.*;

public class RunTest {

    public static void main(String[] args) {

        InstanceTest t1 = new InstanceTest();
        // Zuerst muss eine Instanz gebildet werden, bevor Eigenschaften oder Methoden verwendet werden
        System.out.println(t1.zahl);
        System.out.println(t1.getZufallszahl());

        // jede Instanz hat eigene Eigenschaften

        // Klasseneigenschaften und Methoden werden direkt auf der Klasse verwendet
        // eine Instanz wird nicht benötigt
        System.out.println(StaticTest.wort);
        System.out.println(StaticTest.getZufallszahl());

        // alle Instanzen teilen sich die gleichen statischen Eigenschaften

        // Methoden sollten Instanzmethoden sein, wenn sie den Zustand des Objektes verwenden
        // Zustand eines Objekts wird durch seine Instanzeigenschaften beschrieben

        // Klassenmethoden dürfen nur Klasseneigenschaften verwenden
        // Intenzmethoden dürfen nur Klasseneigenschaften und Instanzeigenschaften verwenden

        System.out.println(Math.PI);
        System.out.println(Math.E);

        // durch den tatischen Import stehen in dieser Klasse alle statischen
        // Methoden und Eigenschaften von Math zur Verfügung
        System.out.println(PI);
        System.out.println(pow(10, 10));

        System.out.println(Wochentag.MO);
        System.out.println(MO); // Möglich durch den statischen import
    }
}

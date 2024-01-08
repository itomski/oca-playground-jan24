package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest2 {

    public static void main(String[] args) {

        /*
        Referenztyp kann eine konkrete Klasse, abstrakte Klasse oder ein Interface sein
        Objekttyp muss eine konkrete Klasse sein

        Konkrete Klassen sind vollständig ausprogrammiert
        Abstrakte Klassen sind Klassen, die nicht vollständig ausprogrammiert sind
        Interfaces sind Anforderungen ohne eine konkrete Implementierung
         */

        // Referenztyp         // Objekttyp
        List<Integer> zahlen = new ArrayList<>();

        zahlen.add(10); // Fügt ein Element an die nächste freie Stelle ein
        zahlen.add(20);

        List<Integer> andereZahlen = Arrays.asList(10,15,22,17,1,8,22,9); // Erzeugt eine befüllte liste
        zahlen.addAll(andereZahlen); // Fügt alle Elemente aus andereZahlen in zahlen ein

        System.out.println(zahlen);
        zahlen.add(2, 200); // An Index 2 wird 200 eingefügt. Altes und Folgeelemente rücken nach rechts
        System.out.println(zahlen);
        int old = zahlen.set(5, 500); // Ersetzt das Element an Index 5 mit 500, gibt das alte Element zurück
        System.out.println(zahlen);

        System.out.println(zahlen.size()); // Aktuelle Größe
        zahlen.add(11, 1000); // Index muss vorhanden oder der nächste freie sein
        System.out.println(zahlen);
        zahlen.set(11, 1); // Index muss vorhanden sein
        System.out.println(zahlen);

        zahlen.remove(1); // Entfernt ein Elment am gewünschter Position
        Integer i = Integer.valueOf(1);
        zahlen.remove(i); // Entfernt ein Element

        // Aufgabe: Blatt 4
        // Umsetzung mit einer ArrayList
        // Inkl. Löschen von Elementen


    }
}

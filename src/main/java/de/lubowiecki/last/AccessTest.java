package de.lubowiecki.last;

import de.lubowiecki.last.sub.Person;
//import de.lubowiecki.last.sub.NextPerson; // Klasse ist hier nicht sichtbar
import de.lubowiecki.last.sub.*; // Es werden nur publich Klassen importiert

public class AccessTest {

    public static void main(String[] args) {

        // private: nur für die Klasse selbst sichtbar
        // package-private: nur im gleichen Package
        // protected: nur im gleichen Package und bei erbenden Klassen außerhalb des Package
        // public ist überall sichtbar

        Person p1 = new Person();
        //SubPerson p2 = new SubPerson(); // Da package-private, hier nicht verwendbar

        // Jede Eigenschaft und Methode entscheidet mit dem Access-Modifier, ob sie sichtbar ist oder nicht
        System.out.println(p1.active); // Nur public Inventar sichtbar
        //System.out.println(p1.lastname); // package-private: hier nicht sichtbar, da anderes Package
        //System.out.println(p1.birthdate); // protected: hier nicht sichtbar, da anderes Package


    }
}

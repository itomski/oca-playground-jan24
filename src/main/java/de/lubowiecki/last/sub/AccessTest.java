package de.lubowiecki.last.sub;

public class AccessTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        SubPerson p2 = new SubPerson(); // Auch sichtbar, da im gleich Package

        System.out.println(p1.active); // public: überall sichtbar
        System.out.println(p1.lastname); // package-private: sichtbar, da im gleichen Package
        System.out.println(p1.birthdate); // protected: sichtbar, da im gleichen Package
        // System.out.println(p1.firstname); // private: Nicht sichtbar - nur in der Klasse selbst

        // public Getter und Setter erlauben Zugriff auf alle Eigenschaften egal mit welchem Access-Modifier


    }
}

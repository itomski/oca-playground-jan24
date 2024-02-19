package de.lubowiecki.last.sub;

import java.time.LocalDate;

// Top-Level-Klassen können nur public oder package-private sein
// bei package-private kann die Klasse nur von anderen Klassen im gleichen Package genutzt werden

// privates Inventar ist nur für die Klasse selbst sichtbar
// Getter und Setter können private Eigenschaften für andere Klassen sichrtbar machen
public class Person { // Top-Level-Klasse

    private String firstname;
    String lastname;
    protected LocalDate birthdate;
    public boolean active;

}

// Außerhalb des Package ist die Klasse NICHT SICHTBAR
class SubPerson { // Top-Level-Klasse

    private String firstname;
    String lastname;
    protected LocalDate birthdate;
    public boolean active;

    class Sub { // Innere Klasse können public, package-private, protected oder private sein
    }
}

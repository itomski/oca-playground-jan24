package de.lubowiecki.vererbung;

public interface Movable {

    // alle Eigenschaften und Methoden im Interface sind public
    // alle Eigenschaften sind public static final

    int i = 10;
    final int j = 20;

    void moveForward(); // Abstrakte Methode. Automatisch public

}

package de.lubowiecki.playground;

public class VariablenTest {

    // jedes Objekt hat seine eigene. Ist da, solange das Objekt da ist
    int i = 100; // Instanzvariable

    // alle Objekt teilen sich eine gemeinsam. Ist da, sobald die Klasse geladen ist
    // Verfügbar bis zum Ende des Programms
    static int j = 200; // Klassenvariable

    public static void main(String[] args) {
        int k = 300; // Lokale Variable
        // Wird nur bei der Ausführung der Methode verwendet
        // Ist die Methode beendet, wird diese Variable vom Speicher entfernt

        {
            int o = 400; // Lokale Variable
            // Wird am Ende des Blocks, in dem sie erzeugt wurde aus dem Speicher entfernt
        }

        // int i = 0;
        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    }
}

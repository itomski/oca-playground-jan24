package de.lubowiecki.playground;

public class DefaultWerteTest {

    // Instanz und Klassenvariablen bekommen Standardwerte
    static int i; // Standard 0
    static double d; // Standard 0.0

    String wort; // Standard null

    public static void main(String[] args) {
        // Klassenmethode kann nur auf Klassenvariablen zugreifen
        new DefaultWerteTest().start();

    }

    private void start() {
        // Instanzmethode kann auf Instanz- und Klassenvariablen zugreifen
        System.out.println(i);
        System.out.println(d);
        System.out.println(wort);

        // Lokale Variablen bekommen KEINE Standardwerte
        int z; // muss vor der Verwendung einen Wert bekommen
        // System.out.println(z); // Error: z ist nicht initialisiert

        if(i > 10) {
            z = 10;
        }
        else {
            z = 20;
        }

        boolean aktiv = false;
        if(aktiv = true) {

        }
        System.out.println(z); // Es muss sicher sein, dass z einen Wert hat! Sonst Error!!!!!
    }
}

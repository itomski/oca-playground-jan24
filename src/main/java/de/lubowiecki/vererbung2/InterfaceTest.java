package de.lubowiecki.vererbung2;

public class InterfaceTest {

    public static void main(String[] args) {

        // Machbar m1 = new Machbar(); // Von Interfaces können keine Instanzen gebildet werden

        Machbar m1 = null; // Referenzen können vm Typ des Interfaces sein
        m1 = new KaffeeKochen();

        // Statische Methoden eines Interface
        Machbar.printJob();

        m1.machWas(); // Überschriebene Methode
        m1.printDefaultJob(); // Verwendet das default aus dem Interface
    }
}

// Interfaces dürfen NICHT final sein
interface Machbar {

    // automatisch public static final
    int zahl = 100;

    // Abstrakte Methoden dürfen NICHT final sein!!!!
    boolean machWas(); // Kein Methoden-Body

    // Statische Methode
    static void printJob() { // seit Java 1.7
        System.out.println("Machbar");
    }

    // Instanz Methode
    default void printDefaultJob() { // seit Java 1.8
        System.out.println("Default Job");
    }
}

interface StappelArbeit extends Machbar {

    // Implementiert jemand StappelArbeit üssen alle Methoden von Machbar und Stappelarbeit eingebaut werden

    boolean machMehrereSachen(); // Kein Methoden-Body

}


// Eine Klasse, die ein Interface implementiert MUSS alle abstrakten Methoden implementieren
// oder selbst als abstrakt deklariert werden

class KaffeeKochen implements Machbar {

    @Override
    public boolean machWas() {
        // printJob(); // Statische Methoden des Interfaces werden nicht vererbt
        Machbar.printJob(); // Müssen immer direkt über das Interface verwendet werden

        // Statische Eigenschaften der Interfaces werden vererbt
        System.out.println(zahl);

        return false;
    }

    // default Methoden können eingebaut werden - müssen aber nicht
    // Wird eine default Methode nicht eingebaut, erbt die Klasse die Implementierung aus dem Interface

    @Override
    public void printDefaultJob() {
        Machbar.super.printDefaultJob();
    }
}

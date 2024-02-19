package de.lubowiecki.last;

public class VererbungTest {

    public static void main(String[] args) {

        Next n1 = new Next();
        System.out.println(n1.zahl); // zahl ist public
        // System.out.println(n1.zahl2); // VererbungTest und Parent sind im gleichen Package
        System.out.println(n1.getZahl());

        System.out.println();

        // Bei Eigenschaften entschidet der Referenztyp, wo sie gesucht werden
        // Instanzmethoden werden IMMER auf dem Objekttyp ausgeführt
        Parent n2 = new Next();
        System.out.println(n2.zahl);
        System.out.println(n2.getZahl());


    }

}

class Parent {

    public int zahl = 10;
    int zahl2 = 20; // automatisch package-private

    public int getZahl() {
        return zahl;
    }
}

class Next extends Parent {

    // hidding
    public int zahl = 50; // Variable aus Parent wird überlagert

    @Override
    public int getZahl() { // Methode aus Parent wird überschrieben
        // Die Methode sucht die Variable zuerst in der gleichen Klasse
        // Erst, wenn diese hier nicht verfügbar ist, wird die Elternklasse geprüft
        return zahl;
    }
}
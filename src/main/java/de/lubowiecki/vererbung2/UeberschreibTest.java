package de.lubowiecki.vererbung2;

public class UeberschreibTest {

    public static void main(String[] args) {

        C c1 = new D();
        System.out.println(c1.getZahl());

    }
}

class C {

    int getZahl() {
        return 10;
    }

    boolean checkZahl(int wert) {
        return wert > 10;
    }

    boolean checkZahl(Number wert) {
        return wert.intValue() > 10;
    }

    Number getAndereZahl() {
        return 100;
    }
}

class D extends C {

    // Bei primitiven Rückgabetypen gibt es keine Kovarianz
    // privates Inventar der Elternklasse wird nicht an Kindklassen vererbt

    @Override // Annotation. Prüft, ob in der Elternklasse eine Methode mit gleicher Signatur verfügbar ist
    protected int getZahl() {
        return 20;
    }

    // Bei komplexen Rückgabetypen kann auch ein Objekt der Kindklasse zurückgegeben werden

    @Override
    public Double getAndereZahl() {
        return 10.0;
    }

    /*
    @Override
    boolean checkZahl(int a) {
        // Für das Überschreiben ist der Typ des Parameters entscheidend, nicht der Name
        return a > 20;
    }
    */

    @Override
    boolean checkZahl(int a) {
        // Für das Überschreiben ist der Typ des Parameters entscheidend, nicht der Name
        // Typ muss gleich sein
        return a > 20;
    }

    // Bei Parametern gibt es keine Covarianz

    /*
    @Override
    boolean checkZahl(Double wert) {
        return super.checkZahl(wert);
    }
    */
}
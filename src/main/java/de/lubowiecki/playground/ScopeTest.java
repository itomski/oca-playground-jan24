package de.lubowiecki.playground;

public class ScopeTest {

    static int x = 200;
    int y = 100;
    int z = 20;

    public static void main(String[] args) {

        int i = 10;

        if(true) {
            //int i = 20; // i ist noch sichtbar - redeklaration nicht erlaubt
            int j = 100;
        }

        int j = 20; // Erlaubt, da j aus dem if out-of-scope ist

        new ScopeTest().go();
    }

    private void go() {

        double x = 99.99; // Lokale Variable überlagert die Klassenvariable

        System.out.println(x); // gibt die lokale Variable aus
        System.out.println(ScopeTest.x); // gibt die Klassenvariable aus

        byte y = 10;
        System.out.println(y); // Lokale Variable überlagert die Instanzvariable
        System.out.println(this.x); // gibt die Instanzvariable aus

        {
            short z = 17;
            System.out.println(z); // Lokale Variable überlagert die Instanzvariable
        }
        System.out.println(z); // Zeigt die Instanzvariable, lokales z out-of-scope ist

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        // System.out.println(i); // i ist out-of-scope

        /*
        // ERROR
        do {
            boolean next = true;
        }
        while(next); // Next ist out-of-scope
        */

        // OK
        boolean next = false;
        do {
            next = true;
        }
        while(next);

        int erg = 10 % 5; // 0
        erg = 10 % 3; // 1
        erg = 3 % 10; // 3

        erg++; // erhöht den Wert um 1
        erg--; // reduziert den Wert um 1
        ++erg; // erhöht den Wert um 1
        --erg; // reduziert den Wert um 1

        erg = 1;
        erg = erg++ + ++erg; // 1 + 3

        // 2++; // 2 = 2 + 1;
        erg++; // erg = erg + 1;

        // Hier ist ein Überlauf/Unterlauf möglich
        byte b = 10;
        b++; // b = (byte)(b + 1);
        b += 20; // b = (byte)(b + 20);


    }
}

package de.lubowiecki.playground;

import java.util.Objects;

public class KomplexTest {

    // muss sofort oder im static-Initializer zugeweisen werden
    private static final int zahl;

    static {
        if(System.currentTimeMillis() > 0) {
            zahl = 10;
        }
        else {
            zahl = 20;
        }
    }

    // Wert muss spätestens im Konstruktor zugewiesen werden
    private final int andereZahl;

    public KomplexTest() {
        this.andereZahl = 100;
    }

    public static void main(String[] args) {

        String s = "Hallo";
        s = new String("Hallo");

        // Immutable = nicht änderbar!
        // String ist immutable
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s);

        s += " Welt";
        System.out.println(s);
        System.out.println("Das " + "ist " + "ein " + "Haus von Nikigraus");

        int i = 100;
        Integer j = i; // Autoboxing
        System.out.println(j);
        System.out.println(j + 10); // j wird ausgepackt und wie ein primitiver Wert behandelt
        System.out.println(1000);
        System.out.println(Integer.toHexString(1000));
        System.out.println(Integer.toOctalString(1000));
        System.out.println(Integer.toBinaryString(1000));

        i = 200;
        int x = 500;

        System.out.println(i == x); // Wertevergleich

        String s1 = "Moin";
        String s2 = new String("Moin"); // Erzwingt die Erzeugung eines neuen Objekts
        System.out.println(s1 == s2); // Referenzvergleich: Zeigt s1 und s2 auf das gleiche Objekt auf dem Heap?
        System.out.println(s1.equals(s2)); // Wertevergleich

        System.out.println();

        // Box b1 ist die Referenz auf dem Stack
        // new Box("Holz") ist das Objekt auf dem Heap
        Box b1 = new Box("Holz");
        Box b2 = new Box("Steine");
        Box b3 = new Box("Holz");
        System.out.println(b1 == b2);
        System.out.println(b1 == b3);

        // Damit ein Wertevergleich richtig erfolgt, muss bei eigenen Klassen
        // die equals-Methode richtig eingebaut werden
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));

        System.out.println();

        s1 = "Hi";
        s2 = "Hi";
        System.out.println(s1.equals(s2)); // Wertevergleich

        // String-Literal-Pool
        System.out.println(s1 == s2); // Referenzvergleich

        System.out.println();

        // Byte-Pool (Alle werte im Umfang des Bytes (-128 bis 127) liegen bereits im Pool)
        Integer i1 = 120;
        Integer i2 = 120;
        System.out.println(i1.equals(i2));
        System.out.println(i1 == i2);

        machWas(10);

        // Komplexe-Konstenten bedeuten, dass die Referenz nicht geändert werden kann
        // Zustand des Objekts kann sich verändern
        final int[] arr = {5,7,9,22,18};
        arr[3] = 100; // Zustandsveränderung
        //arr = new int[]{7,15}; // Änderung der Referenz - bei Konstanten nicht erlaubt
        // System.out.println(arr[100]); // Index wird erst zur Laufzeit geprüft
        // System.out.println(arr[-100]);


        final String s3 = "Hallo";
        //s3 += " Welt"; // Referenz müsste auf das neue Objekt zeigen - nicht erlaubt, da Konstante


        final int x2 = 100; // Kompiletime-Konstente
        System.out.println(x2);

        final int x3;
        x3 = 200; // Runtime-Konstente
        System.out.println(x3);

        final boolean show;
        show = false;

        while(show) {
            System.out.println("Hi");
            return;
        }

        System.out.println("Das ist das Haus von Nikigraus");

        System.out.println(200); // 200 ist ein Literal
        System.out.println("Hi"); // Hi ist ein String-Literal

    }

    static void machWas(final int x) {
        // x++; // x kann nicht mehr verändert werden. ist final
    }
}

class Box {

    private String content;

    public Box(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(content, box.content);
    }

    @Override
    public int hashCode() {
        // Zwei als gleich gletende Objekte sollen den gleichen HashCode ergeben!
        return Objects.hash(content);
    }
}
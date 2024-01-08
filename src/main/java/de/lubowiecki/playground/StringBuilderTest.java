package de.lubowiecki.playground;

public class StringBuilderTest {

    public static void main(String[] args) {

        // Standard Capacity = 16
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length()); // Anzahl der Zeichen im SB
        System.out.println(sb1.capacity()); // Länge des internen Zeichen-Arrays
        sb1.append("Peter"); // Ans Ende der Zeichenkette hinzufügen
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("Bruce");
        sb1.append("Carol");
        sb1.append("Steve");
        sb1.append("Scott");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity()); // alte Größe * 2 + 2

        sb1.trimToSize(); // schneidet die Capacity auf die benötigte Größe zu
        System.out.println(sb1.capacity());

        sb1.insert(10, "...");
        System.out.println(sb1);

        // Capacity = 100
        sb1 = new StringBuilder(100);

        // Capacity = Anzahl Zeichen + 16 = 49
        sb1 = new StringBuilder("Das ist das Haus von Nikigraus...");
        System.out.println(sb1);
        sb1.replace(10, 20, "###"); // Position von bis wird ersetzt
        System.out.println(sb1);
        // sb1.replace(20, 10, "###"); // Exception: start ist größer als end

        sb1.reverse(); // Reihenfolge der Zeichen wird umgedreht
        System.out.println(sb1);

        sb1.setLength(10); // scheidet den Inhalt auf die passende größe zu, die Capacity wird nicht gekürzt
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        System.out.println();

        // der Inhalt wird auf 100 Zeichen erweitert.
        // Capacity wird auch auf die passende Größe erweitert
        sb1.setLength(120);
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        System.out.println();

        // Die Interne Capacity wird so erweitert, dass mind 100 Elemente reinpassen
        // Alte Größe * 2 + 2 wird verwendet
        sb1 = new StringBuilder(); // Default Capacity 16
        sb1.ensureCapacity(60);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

    }
}

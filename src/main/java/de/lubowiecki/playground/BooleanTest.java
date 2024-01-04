package de.lubowiecki.playground;

public class BooleanTest {
    public static void main(String[] args) {

        // AND, &, &&
        // OR, |, ||
        // NOT, !
        // XOR, ^, Nur true wenn nur einer der Operanden true ist

        boolean a = false;
        boolean b = true;
        int x = 5;
        int y = 7;

        System.out.println(a & (x++ < y)); // true wenn a und b true sind
        System.out.println(a && (x++ < y)); // wenn a false, wird der zweite Teil gar nicht mehr ausgeführt

        String s = null;
        if(s != null && s.length() > 0) {
            System.out.println(s);
        }

        // 5 : 00000110
        // 7 : 00000111
        // 6 : 00000110
        System.out.println(x & y);

        // 5 : 00000110
        // 7 : 00000111
        // 7 : 00000111
        System.out.println(x | y);

        // 5 : 00000110
        // 7 : 00000111
        // 1 : 00000001
        System.out.println(x ^ y);

        byte b1 = 100; // Zuweisung möglich, wenn der Wert im passenden Wertebereich liegt
        short s1 = 100; // Zuweisung möglich, wenn der Wert im passenden Wertebereich liegt

        long l = 1_000_000_000; // int, primitive widening zu long
        l = 1_000_000_000_000l; // direkt ein long

        int zahl = 16;
        zahl = 020; // oktal
        zahl = 0b10000; // binär
        zahl = 0x10; // hex
        System.out.println(zahl);

        // Bei Ganzzahlen: ArithmeticException
        System.out.println(zahl / 0);

        double d = 10.5;
        // Bei float und double: Infinity
        System.out.println(d / 0);


    }
}

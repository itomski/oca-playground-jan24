package de.lubowiecki.playground;

public class InstanzOfTest {

    public static void main(String[] args) {

        Object o1 = "Hallo";
        o1 = new String("Hallo"); // new ist ein Operator
        Object o2 = 123; // Autoboxing int zu Integer, komplex Widening von Integer zu Object

        if(o2 instanceof String) // Prüft den Verwandschaftsgrad
            System.out.println(((String) o2).toUpperCase());

        if(o1 instanceof CharSequence)
            System.out.println(((String) o1).toUpperCase());

        Integer i = 100;
        double d1 = 10.5;
        Double d2 = 7.5;
        Double d3 = 10.5;

        System.out.println(i + d1); // Wrappertypen werden zum Rechnen ausgepackt
        System.out.println(d1 == 10);
        System.out.println(d2 == 10); // Wrappertypen werden bei Vergleich mit primitiven ausgepackt
        System.out.println(d2 == d3); // d2 und d3 sind komplex, daher Referenzvergleich
        // System.out.println(d2 == i); // Error: Bei einem Referenzvergleich muss der Datentyp gleich sein


        double b4 = 100; // primitiv Widening
        // Double b5 = 100; // Error: int Autoboxing zu Integer, Integer und Double sind nicht kompatibel
        // Long l = 100; // Error: int Autoboxing zu Integer, Integer und Long sind nicht kompatibel

        String s = new String("ABC");
        s = null; // Das String-Objekt isdt für GC verfügbar

        {
            String x = new String("ABC");
        } // Das String-Objekt isdt für GC verfügbar

    }
}

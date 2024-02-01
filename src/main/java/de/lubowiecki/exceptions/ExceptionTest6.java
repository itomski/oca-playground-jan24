package de.lubowiecki.exceptions;

public class ExceptionTest6 {

    final int x;

    public ExceptionTest6() {
        // finale Klassen- und Instanzvariablen müssen spätestens im Konstruktor initialisiert werden
        x = 100;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(machWas("ABC"));

        final String FMT = "%010d";
        //final String FMT = "%-6s"; // Wert auf der linken, Leerstellen auf der rechten
        //final String FMT = "%6s"; // Wert auf der rechten, Leerstellen auf der linken
        String str = String.format(FMT, 808); // Liefert einen formatierten String zurück
        System.out.println(str);

        System.out.printf(FMT, 809); // Sofortige Ausgabe

    }

    public static String machWas(String s) throws Exception {

        try {
            System.out.println("TRY");
            if (s == null)
                throw new Exception();

            return "Alles ok";
        }
        catch(Exception e) {
            System.out.println("CATCH");
            throw e; // Exception wird neu geworfen
        }
        finally {
            System.out.println("FIN");
        }
    }
}

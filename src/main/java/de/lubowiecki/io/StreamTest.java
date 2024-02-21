package de.lubowiecki.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StreamTest {

    public static void main(String[] args) {

        Path path = Paths.get("data.txt");

        try {
            // Erzeugt einen Stream von Zeilen
            Files.lines(path)
                    .map(line -> line.length()) // Function<Eingangstyp, Rückgabetyp>
                    .filter(i -> i > 300) // Selektiert Werte nach Vorgabe
                    .forEach(i -> System.out.println(i));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

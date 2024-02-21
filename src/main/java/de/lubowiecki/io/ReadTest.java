package de.lubowiecki.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadTest {

    public static void main(String[] args) {

        Path path = Paths.get("data.txt");

        try {
            // Datei wird in den Speicher eingelesen
            List<String> lines = Files.readAllLines(path);
            //System.out.println(lines.size());

            lines.stream() // Wechsel von List auf Stream
                    .skip(1) // Zeilen überspringen
                    .map(line -> line.replace("Wasser", "..."))
                    .map(line -> line.toUpperCase()) // Manipulation / Transformation
                    //.filter(...) // Auswahl
                    .limit(10) // Anzahl des Ausführungen limitieren
                    .forEach(line -> System.out.println(line)); // Verbraucher

            // Jeder Stream kann nur 1x verarbeitet werden
            // Für die nächste Verarbeitung muss ein neuer erzeugt werden

            /*
            for (String line: lines) {
                System.out.println(line);
            }
            */
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

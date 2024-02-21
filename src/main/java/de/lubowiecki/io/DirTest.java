package de.lubowiecki.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.zip.ZipOutputStream;

public class DirTest {

    public static void main(String[] args) {

        Path path = Paths.get("");

        try {
            /*
            Files.list(path) // Liest Ordner und Dateien am aktuellen Path
                    .forEach(p -> System.out.println(p));
             */

            LocalDateTime ldt = LocalDateTime.now().minusDays(10);

            Files.walk(path)
                    .filter(p -> p.startsWith("src"))
                    .filter(p -> p.toString().endsWith(".java"))
                    .filter(p -> {
                        try {
                            return Files.getLastModifiedTime(p).toInstant().isBefore(ldt.toInstant(ZoneOffset.UTC));
                        }
                        catch(Exception e) {
                            return false;
                        }
                    })
                    .forEach(p -> System.out.println(p));

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}

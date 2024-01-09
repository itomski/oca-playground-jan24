package de.lubowiecki.collections;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializeTest {

    public static void main(String[] args) {

        final String FILE_NAME = "werte.txt";

        final Scanner scanner = new Scanner(System.in);

        /*
        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Carol");
        namen.add("Natasha");
        */

        //saveInFile(namen, "werte.txt");

        List<String> werte = readFromFile(FILE_NAME);
        System.out.println(werte);

        while(true) {
            System.out.print("Eingabe:");
            String name = scanner.nextLine();

            if(name.equalsIgnoreCase("exit"))
                break;

            werte.add(name);
            System.out.println("Gespeichert.");
        }

        saveInFile(werte, FILE_NAME);

    }

    private static void saveInFile(List<String> werte, String dateiName) {

        // Speichern

        // Führe diesen Sourcecode aus
        // FileOutputStream ermöglich das Schreiben in eine Datei
        // ObjectOutputStream übersetzt Objekte in Zeichenketten
        try(FileOutputStream fos = new FileOutputStream(dateiName);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(werte);
            // Die Resource wird automatisch geschlossen
        }
        catch(IOException e) {
            // Sollte ein Problem auftreten, dann kümmere dich hier darum
            System.out.println(e.getMessage());
        }
    }

    private static List<String> readFromFile(String dateiName) {

        // Lesen

        List<String> list = new ArrayList<>();

        // FileInputStream ermöglich das Lesen aus einer Datei
        // ObjectInputStream übersetzt Zeichenketten in Objekte
        try(FileInputStream fis = new FileInputStream(dateiName);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            list = (List<String>)ois.readObject();
            // Die Resource wird automatisch geschlossen
        }
        catch(Exception e) {
            // Sollte ein Problem auftreten, dann kümmere dich hier darum
            System.out.println(e.getMessage());
        }

        return list;
    }


}

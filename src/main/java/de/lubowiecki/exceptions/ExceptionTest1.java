package de.lubowiecki.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionTest1 {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        try {
            System.out.println(arr[2]); // 30
            System.out.println(arr[6]); // Unchecked: ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Das Array hat nicht genug Inhalt");
        }

        arr = null;
        try {
            System.out.println(arr[2]); // Unchecked: NullPointerException
        }
        catch(NullPointerException e) {
            System.out.println("Das Array ist nicht verfügbar.");
        }

        // Behandeln
        try {
            System.out.println("START TRY");
            //FileOutputStream out = new FileOutputStream("file.txt"); // Checked: FileNotFoundException
            FileInputStream in = new FileInputStream("file.txt"); // Checked: FileNotFoundException

            // Taucht eine Exception auf, wird der Try-Block sofort unterbrochen und der passende Catch-Block ausgeführt

            System.out.println("END TRY");
        }
        catch(FileNotFoundException e) { // Beschreibung der Exceptionbehandlung
            System.out.println("Datei nicht verfügbar");
            //System.out.println(e.getMessage());
            // Nach dem Abarbeiten des Catch-Blocks ist die Exception behandelt und das Programm kann fortgesetzt werden
        }


    }
}

package de.lubowiecki.exceptions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest2 {

    public static void main(String[] args) {

        // Unchecked

        try {
            int[] arr = new int[-10];
            //int[] arr = new int[10];
            System.out.println(arr[10]);

            //arr = null;
            //System.out.println(arr[10]);
        }
        catch (NullPointerException e) {
            System.out.println("Objekt nicht vorhanden");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Position im Array nicht verfügbar.");
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Array-Größe darf nicht negativ sein.");
        }
        catch (RuntimeException e) { // Sammelt den Rest ein
            System.out.println("Problem.");
        }


        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht da!");
        }
    }

   // throws FileNotFoundException heißt, dass der Aufrufer der readFile sich um die Behandlung der Exception kümmern muss
   public static String readFile() throws FileNotFoundException {
       // Checked
       // catch or declare
       FileInputStream in = new FileInputStream("file.txt");
       BufferedInputStream buffer = new BufferedInputStream(in);
       return buffer.toString();
   }
}

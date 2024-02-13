package de.lubowiecki.arrays;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest1 {

    //public static void main(String[] args) {
    //public static final void main(String args[]) { // main-Methode kann final sein
    public static void main(String... args) { // kann String-Array oder String-VarArgs nutzen

        String[] arr = new String[10];
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, "...");
        System.out.println(Arrays.toString(arr));


        List<Object> objects = new ArrayList<>();
        String s = "Hallo";
        objects.add(s);
        s = null;
        objects.add(0, null);

        try {

        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            // e = new NullPointerException("...."); // Bei einem Multi-Catch ist e final
        }

        try {
            //...
        }
        catch(NullPointerException e) { // Unchecked. Kann IMMER gefangen werden

        }

        try {
            //...
        }
        catch(RuntimeException e) { // Zuerst die Kindklasse

        }
        // Dann die Elternklasse
        catch(Exception e) { // Exception ist Checked. Kann aber IMMER gefangen werden

        }

        /*
        try {
            //...
        }
        catch(SQLException e) { // Andere Checked Ecxeption brauchen einen Grund
            //...
        }
        */


    }
}

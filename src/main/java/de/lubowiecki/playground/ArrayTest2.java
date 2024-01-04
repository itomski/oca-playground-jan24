package de.lubowiecki.playground;

import java.util.Arrays;

public class ArrayTest2 {

    public static void main(String[] args) {

        // Arrays sind Objekte

        int[] a1 = new int[100]; // "Leeres" Array mit 100 Positionen, Positionen werden mit Standardwerten gefüllt
        double[] a2 = new double[100];
        String[] a3 = new String[10]; // mit 10 x null gefüllt
        String[] a4 = {"A", "ZZ", "H", "ABC"}; // Array mit 4 vorgegebenen Werten

        a4 = new String[]{"XYZ"}; // Ist die Variable bereits deklariert muss man new benutzen
        a4[0] = "Hallo Array";
        // a4[1] = "Hallo Array"; // ArrayIndexOutOfBounds

        //a4 = new String[2]{"XYZ", "ABC"}; // Nicht möglich
        //a4 = new String[2]; // erlaubt
        //a4 = new String[]{"XYZ", "ABC"}; // erlaubt
        a4 = new String[0]; // Leeres Array mit 0 Positionen
        a4 = new String[]{}; // Leeres Array mit 0 Positionen

        int a, b, c; // 3 Variablen gleichen Typs
        int b1, c1 = 10; // 2 Variablen gleichen Typs, eine wird initialisiert

        int a5[], a6; // a5 ist intArray, a6 int
        int[] a7, a8; // a7 und a8 sind intArrays

        int[][] arr2d;
        int[][][] arr3d;

        int i = a1[10]; // an Index 10 lesen
        a1[10] = 200; // an Index 10 schreiben

        Arrays.fill(a1, 17); // Jede position von a1 wird mit 17 gefüllt
        a1 = new int[]{7,22,9,1,18,200,105,19,22};
        Arrays.sort(a1);
        // Vor binarySearch sollte das Array sortiert werden
        System.out.println(Arrays.toString(a1));
        int erg = Arrays.binarySearch(a1, 22);
        // Wird ein passendes Element gefunden, bekommen wir den index zuück
        // Wird es nicht gefunden, bekommen wir den index, an dem es stehen würde als Minuswert -1
        System.out.println(erg);
    }
}

package de.lubowiecki.playground;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        // Array ist ein Objekt
        int[] arr = {2,7,9,22}; // Array mit 4 Elementen
        System.out.println(arr[3]);
        arr[2] = 100;

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        // Schleifen

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();

        for (int e : arr) {
            System.out.println(e);
        }
    }
}

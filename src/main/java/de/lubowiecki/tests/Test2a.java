package de.lubowiecki.tests;

import java.util.Arrays;

/**
 * @author Tomasz Lubowiecki
 * @since 1.8
 */
public class Test2a {

    public static void main(String[] args) {

        final int arr1[] = new int[4];
        arr1[1]++; // Änderung des Inhalts erlaubt
        System.out.println(Arrays.toString(arr1));
        //arr1 = new int[10]; // Änderung der Referenz nicht erlaubt, da final

        Integer arr2[] = new Integer[4];
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[3];
        //arr3 = {1,2,3,4}; // Geht nur bei gleichzeitiger Deklaration und Initialisierung
        arr3 = new int[]{1,2,3,4}; // OK

        int[] arr4 = {1,2,3,4}; // OK

        System.out.println();

        int[][] arr5 = new int[2][];
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = null;
        //System.out.println(arr6[4]); // NullPointerException

        //int arr7[] = new int[-5]; // NegativeArraySizeException

        int arr8[] = new int[5];
        //System.out.println(arr8[-1]); // ArrayIndexOutOfBoundsException


        //while(true) {
        //}
        //System.out.println("Hi"); // Error

        int j = 10;
        System.out.println(j--); // print und danach verkleinern
        System.out.println(--j); // zuerst verkleinern und dann print
        System.out.println(j--);
        System.out.println(j--);

        if(j > 5)
            System.out.println("A");
            //System.out.println("B");
        else
            System.out.println("C");

        String s = (j > 5) ? "A" : "B";
        System.out.println(s);

        for(int i = 0; i < 100; System.out.println(i)) i++;


    }

}

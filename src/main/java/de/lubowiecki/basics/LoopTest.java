package de.lubowiecki.basics;

import java.util.Arrays;

public class LoopTest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        for (int i : arr) {
            i = 10;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println();

        String[] arrStr = {"A","B","C","D"};

        // KANN NICHT beim durchlaufen die Referenzen des Arrays neu belegen
        for (String s : arrStr) {
            s = s.concat("...");
        }

        // KANN beim durchlaufen die Referenzen des Arrays neu belegen
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = arrStr[i].concat("...");
        }

        System.out.println(Arrays.toString(arrStr));


    }
}

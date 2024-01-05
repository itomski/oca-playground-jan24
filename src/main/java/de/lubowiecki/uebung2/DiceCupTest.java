package de.lubowiecki.uebung2;

import java.util.Arrays;

public class DiceCupTest {

    public static void main(String[] args) {

        DiceCup cup = new DiceCup(100);

        //cup.setFaces(6);

        System.out.println(cup.roll());

        int[] zahlen = cup.roll(100);
        System.out.println(Arrays.toString(zahlen));

        cup.stats(zahlen);
    }
}

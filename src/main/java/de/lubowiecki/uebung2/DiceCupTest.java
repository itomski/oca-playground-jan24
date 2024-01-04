package de.lubowiecki.uebung2;

import java.util.Arrays;

public class DiceCupTest {

    public static void main(String[] args) {

        DiceCup cup = new DiceCup();

        System.out.println(cup.roll());

        int[] zahlen = cup.roll(10);
        System.out.println(Arrays.toString(zahlen));
    }
}

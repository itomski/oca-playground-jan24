package de.lubowiecki.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest1 {

    public static void main(String[] args) {

        Rechner<Integer> rechner1 = new Rechner<>();
        System.out.println(rechner1.add(10, 15));

        //Rechner<String> rechner2 = new Rechner<>();
        //System.out.println(rechner2.add("A", "B"));

        Rechner<Double> rechner3 = new Rechner<>();
        System.out.println(rechner3.add(10.0, 15.0));

        System.out.println();

        machWas("Moin Moin"); // String ist eine CharSequence
        // machWas(123); // Ist keine CharSequence
        StringBuilder sb = new StringBuilder("ABC");
        machWas(sb); // Ist CharSequence

        // super ist Number oder eine Elternklasse davon
        List<? super Number> zahlen1 = new ArrayList<Object>();

        // extends ist Number oder eine Kindklasse davon
        List<? extends Number> zahlen2 = new ArrayList<Integer>();

        int[][] arr = new int[2][]; // {null, null}

    }

    public static <T extends CharSequence> void machWas(T val) {
        System.out.println(val);
    }
}

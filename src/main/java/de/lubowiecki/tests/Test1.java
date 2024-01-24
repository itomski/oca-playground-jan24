package de.lubowiecki.tests;

import java.io.IOException;
import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {

        int[] arr1 = {3,4,5};
        int[][] arr2 = {{1,2,3}, {3,4,5}};
        int[][][] arr3 = {
                {
                    {1,2,3}, {1,2,3}
                },
                {
                    {3,4,5}, {3,4,5}
                }
        };

        System.out.println(arr2[1]);
        System.out.println(arr2[1][1]);

        // arr2[1][1] = new int[10]; // Error Auf der Position [1][1] liegen int Werte nicht Arrays


        String[] sArr1 = {"A", "B", "C"};
        String[] sArr2 = {"A", "B", "c"};
        System.out.println(Arrays.equals(sArr1, sArr2));
        System.out.println(Arrays.deepEquals(sArr1, sArr2));

        int[] iArr1 = {1, 2, 3};
        int[] iArr2 = {1, 2, 3};
        System.out.println(Arrays.equals(iArr1, iArr2));
        //System.out.println(Arrays.deepEquals(iArr1, iArr2)); // Ihnalt sind keine Objekte

        System.out.println();

        String[][] sArr3 = {{"A", "B", "C"}, {"D", "E", "F"}};
        String[][] sArr4 = {{"a", "b", "c"}, {"d", "e", "f"}};

        System.out.println(Arrays.equals(sArr3, sArr4));
        System.out.println(Arrays.deepEquals(sArr3, sArr4));

        System.out.println();

        /*
        // Checked-Exception dürfen nur gefangen werden, wenn sie entstehen könnten
        try {

        }
        catch(IOException e) { // Da im try-Block keine IOException entsteht, kann diese auch NICHT gefangen werden

        }
        */

        // Ausnahme
        try {

        }
        catch(Exception e) { // Exception ist checked - kann aber IMMER gefangen werden

        }

        try {

        }
        catch(RuntimeException e) { // RuntimeException können IMMER gefangen werden

        }

        //size(null); // NullPointerException
        size(new int[]{1,2,3}); // Ok
        //size(new long[]{1l,2l,3l}); // ClassCastException
        //size(new String[]{"A", "B"}); // ClassCastException

        String s = "Hallo";
        Object o = s;
        //Integer i = (Integer)o; // ClassCastException
        String s2 = (String)o; // Ok, hinter dem o liegt ein String auf dem Heap

        //parse("100.10");
        // int j = "100"; // String kann nicht automatisch in int/Integer umgewandelt werden
        // String s3 = 100; // zahlen können nicht automatisch in String umgewandelt werden
        String s4 = "" + 100; // das geht


    }

    public static void machWas() throws IOException { // Erlaubt auch wenn keine Exception entstehen kann

    }

    public static void size(Object o){
        System.out.println(((int[])o).length);
    }

    public static void parse(String s){
        System.out.println(Integer.parseInt(s));
    }
}

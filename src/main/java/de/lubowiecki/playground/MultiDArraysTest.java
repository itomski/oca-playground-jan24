package de.lubowiecki.playground;

import java.util.Arrays;

public class MultiDArraysTest {

    public static void main(String[] args) {

        int[][] arr = {{1,2},{3,4},{},{5,6,7}};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        for (int[] sub : arr) {
            for(int i : sub) {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println(arr[3][0]);
        System.out.println(arr[1][0]);

        arr[0][1] = 7;
        arr[2] = new int[]{8,9,15,22};
        arr[2] = new int[15];

        System.out.println();

        double[] arr2[] = new double[2][]; // Die Größe der ersten Ebene MUSS vorgegeben werden
        System.out.println(Arrays.toString(arr2));

    }
}

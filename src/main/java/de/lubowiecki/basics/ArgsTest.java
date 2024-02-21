package de.lubowiecki.basics;

public class ArgsTest {

    public static void main(String[] args) {

        for (String a : args) {
            System.out.println(a);
        }

        int[] arr = new int[]{5,8,22,15};
        System.out.println(arr[3]);

        int i = new int[]{5,8,22,15}[3];
        System.out.println(i);

        System.out.println();

        String[] arr1 = {null}; // Gültiges Array mit Länge 1, gefüllt mit null
        String[] arr2 = null; // NullPoinerReferenz
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);

    }
}

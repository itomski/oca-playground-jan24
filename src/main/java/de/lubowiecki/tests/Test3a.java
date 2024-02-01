package de.lubowiecki.tests;

public class Test3a {

    public static void main(String[] args) {

        int i = 0;
        for (; i < 100;) {
            System.out.println(i++);
        }

        System.out.println(i);

        int arr[] = {1,2,3,4,5,6,8};

        for (int j : arr) {
            System.out.println(j);
        }
    }
}

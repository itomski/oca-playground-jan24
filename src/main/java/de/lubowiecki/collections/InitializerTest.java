package de.lubowiecki.collections;

public class InitializerTest {

    {
        // Instanz-Initializer
        int[] arr = new int[5];
        System.out.println(arr[5]); // ExceptionInInitializerError
    }

    static {
        // Klassen-Initializer
        int[] arr = new int[5];
        System.out.println(arr[5]); // ExceptionInInitializerError
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
    }
}

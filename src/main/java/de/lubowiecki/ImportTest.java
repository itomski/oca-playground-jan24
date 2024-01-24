package de.lubowiecki;

public class ImportTest {

    final int x = 0; // Instanzvariable

    /*
    public static void main(String[] args) {

    }
    */

    public static final void main(String... args) {

        int x = 10;

        x++;
        System.out.println(x);

        int[] arr1 = new int[-1]; // NegativeArraySizeException
        int[] arr2 = new int[10];
        System.out.println(arr2[10]); // ArrayIndexOutOfBoundsException
        System.out.println(arr2[-10]); // ArrayIndexOutOfBoundsException

        // +=, -=, *=, /=, !=, >=, <=

        System.out.println("" + 10 * 2);

        int i = 10, j = 15;

    }
}

package de.lubowiecki.playground;

public class SchleifenTest2 {

    public static void main(String[] args) {


        for(int i = 0; i < 100; System.out.println(++i));

        System.out.println();

        // i++ ist i = (int)(i + 1)
        for(int i = 2_120_000_000;; i++, System.out.println(++i)); // Endlosschleife

        //for(int i = 0; i < 100;);

    }
}

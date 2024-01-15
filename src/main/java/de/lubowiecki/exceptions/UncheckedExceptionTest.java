package de.lubowiecki.exceptions;

public class UncheckedExceptionTest {

    public static void main(String[] args) {

        System.out.println("START MAIN");
        new UncheckedExceptionTest().machWasA();
        System.out.println("END MAIN");

    }

    void machWasA() {
        System.out.println("START A");
        try {
            machWasB();
        }
        catch(RuntimeException e) {
            System.out.println("Problem behandelt in A");
        }
        // Erst wenn die Exception gefangen wurde, können die Methoden weiter abgearbeitet werden
        System.out.println("END A");
    }

    void machWasB() {
        System.out.println("START B");
        machWasC();
        System.out.println("END B");
    }

    void machWasC() {
        System.out.println("START C");
        machWasD();
        System.out.println("END C");
    }

    void machWasD() {
        System.out.println("START D");
        String s = null;
        //try {
            s.toLowerCase(); // NullPointerException
        //}
        //catch(RuntimeException e) {
        //    System.out.println("Problem behandelt");
        //}
        System.out.println("END D");
    }
}

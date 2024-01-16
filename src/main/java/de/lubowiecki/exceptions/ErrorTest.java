package de.lubowiecki.exceptions;

public class ErrorTest {

    public static void main(String[] args) {

        // e(fx)clipse
        // SceneBuilder

        try {
            otherMethod(); // Error ist unchecked
        }
        catch(StackOverflowError e) {
            // Error wird nicht behandelt, sondern das Programm beendet.
            System.out.println("Problem");
        }
        System.out.println("Programm wird beendet.");
    }

    static void otherMethod() {
        otherMethod(); // ruft sich selbst rekursiv auf
    }
}

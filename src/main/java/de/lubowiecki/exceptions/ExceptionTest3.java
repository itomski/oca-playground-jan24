package de.lubowiecki.exceptions;

public class ExceptionTest3 {

    public static void main(String[] args) {

        String s = null;

        // NullPointerException < RuntimeException < Exception

        try {
            s.toLowerCase();
        }
        /*
        catch(NullPointerException e) {
            System.out.println("Problem 1");
        } */
        catch(ArrayIndexOutOfBoundsException | NullPointerException e) { // Multicatch
            // e ist im Multicatch final
            System.out.println("Problem 1");
        }
        catch(Exception e) { // NullPointerException IS-A Exception
            // e ist im normalen catch NICHT final
            System.out.println("Problem 2");
        }
        finally {
            // wird IMMER ausgeführt
        }

        try {
            // darf nicht ohne catch oder finally benutzt werden
        }
        finally {

        }

        try {
            // ...
        }
        catch (RuntimeException e) {

        }
        finally {

        }

        try {
            // ...
        }
        catch (RuntimeException e) {

        }
    }
}

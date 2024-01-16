package de.lubowiecki.exceptions;

public class ExceptionTest5 {

    public static void main(String[] args) {

        int i = 10000;

        try {
            check(i);
        }
        catch (ZuKleinException e) {
            System.out.println("Die Zahl " + i + " ist zu klein");
        }
        catch (ZuGrossException e) {
            System.out.println("Die Zahl " + i + " ist zu groß");
        }
    }

    private static void check(int i) {

        if(i < 100) {
            //throw new RuntimeException("zu klein");
            throw new ZuKleinException();
        }
        else if(i > 1000) {
            //throw new RuntimeException("zu groß");
            throw new ZuGrossException();
        }
        else {
            System.out.println("Die Zahl " + i + " passt!");
        }
    }
}

class ZuKleinException extends RuntimeException {

    public ZuKleinException() {
        super("zu klein");
    }
}

class ZuGrossException extends RuntimeException {

    public ZuGrossException() {
        super("zu groß");
    }
}

package de.lubowiecki.threads;

public class ThreadTest1 {

    public static void main(String[] args) {

        Runnable aufgabe = () -> {

            String name = Thread.currentThread().getName();

            for (int i = 0; i < 10_000; i++) {
                System.out.println(name  + ":" + i);
            }
        };

        new Thread(aufgabe).start();
        new Thread(aufgabe).start();
        new Thread(aufgabe).start();
        new Thread(aufgabe).start();
        aufgabe.run();

        byte b = 10; // 10 wird, da es im Wertebereich von byte liegt, zugewiesen
        // machWas(10); // Error: 10 wird als int behandelt
        // machWas((byte)10); // Ok: mit einem Cast erlaubt
        // machWas(b); // Ok: b ist vom Typ byte

        int i = 0xABC;
    }

    static void machWas(byte b) {
        System.out.println(b);
    }
}

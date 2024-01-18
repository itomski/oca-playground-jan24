package de.lubowiecki.lambda;

public class LambdaTest2 {

    private static int zahlA = 100; // Klassenvariable
    private int zahlB = 200; // Instanzvariable


    public static void main(String[] args) {
        new LambdaTest2().start(); // Wechsel von static auf Instanz
    }

    private void start() {

        int zahlC = 300; // Lokale Variable

        // In einem Labda können Paramter, Klassenvariablen, Instanzvariablen und lokale Varablen
        // der umgebenden Methode verwendet werden

        // Bei der Verwendung lokaler Variablen in Lambdas muss darauf geachtet werden,
        // dass diese final oder effektiv final sind!
        // effektiv final = Variable ist nicht final, aber sie wird NICHT geändert

        // int changeNr(int nr)
        Changer c1 = x -> {
            // wird hier this verwendet ist dies eine Refernz auf das aktuelle Objekt der umgebenden Klasse(LambdaTest2)
            return x + zahlA + zahlB + zahlC;
        };

        /* // vor Java 1.8
        Changer c2 = new Changer() {
            @Override
            public int changeNr(int x) {
                return x + zahlA + zahlB + zahlC;
            }
        };
        */

        // zahlC = 400;
        zahlA = 200;
        zahlB = 2000;
        System.out.println(c1.changeNr(1000));

    }
}

@FunctionalInterface
interface Changer {
    int changeNr(int nr);

    //double changeNr(double nr); // Durch eine zweite abstrakte Methode ist es kein SAM mehr

    // Abstrakte varianten der Object-Methoden werden nicht beachtet
    @Override
    boolean equals(Object o);
}

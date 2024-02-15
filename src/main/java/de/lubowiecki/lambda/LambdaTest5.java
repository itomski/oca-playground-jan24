package de.lubowiecki.lambda;

public class LambdaTest5 {

    public static void main(String[] args) {

        CheckKleiner10 c1 = new CheckKleiner10();
        if(c1.runCheck(100)) {
            System.out.println("WAHR: ist keiner 10");
        }

        // Implementierung des Interfaces
        // boolean runCheck(int v);
        CheckValue c2 = (i) -> i > 200;

        if(c2.runCheck(300)) {
            System.out.println("WAHR: ist gößer 200");
        }

        c2 = (i) -> i == 1000;

        if(c2.runCheck(50)) {
            System.out.println("WAHR: ist gleich 1000");
        }
    }
}

@FunctionalInterface // Darf nur einer einzige abstrakte Methode haben
interface CheckValue {

    // Kann noch weitere statische und default Methoden enthalten

    boolean runCheck(int v);

}

class CheckKleiner10 implements CheckValue {

    @Override
    public boolean runCheck(int v) {
        return v < 10;
    }
}

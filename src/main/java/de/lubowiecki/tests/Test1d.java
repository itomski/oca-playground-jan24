package de.lubowiecki.tests;

public class Test1d {

    static int x;

    public static void main(String[] args) {

        Test1d d1 = new Test1d();
        Test1d d2 = new Test1d();
        Test1d d3 = new Test1d();

        System.out.println(x);
        d1.method();
        System.out.println(x);
        d2.method();
        System.out.println(x);
        d3.method();
        System.out.println(x);

        String s = "moin";
        s = s.toUpperCase();
        System.out.println(s);

    }

    void method() {
        // x = 0; // Klassenvariable wird auf 0 zurückgesetzt
        while(++x < 3) {
            System.out.println("A");
        }
    }
}

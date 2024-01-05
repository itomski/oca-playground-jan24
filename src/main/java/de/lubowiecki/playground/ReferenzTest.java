package de.lubowiecki.playground;

public class ReferenzTest {

    public static void main(String[] args) {

        int a = 100;

        // Referenztyp  // Objekttyp
        String s    =   "Hallo";

        Object o = "Hallo";

        // Referenztyp
        CharSequence cs = "Hallo String";
        cs = new StringBuilder();

        print("Das ist das Haus von Nikigraus");

        StringBuilder sb = new StringBuilder();
        sb.append("Hallo ").append("Welt");
        print(sb);

        genericAdd(10, 10);
        genericAdd(10.0, 10l);

    }

    static void print(CharSequence cs) {
        System.out.println(cs.toString().toUpperCase());
    }

    static void genericAdd(Number a, Number b) {
        System.out.println(a.doubleValue() + b.doubleValue());
    }

}

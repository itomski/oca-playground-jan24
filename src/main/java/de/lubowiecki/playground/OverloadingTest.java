package de.lubowiecki.playground;

public class OverloadingTest {

    public static void main(String[] args) {
        //machWas((short)100); // cast
        //byte b = 100;
        //machWas(b); // b ist byte

        machWas(100);

        // 1: passende Methode, wenn nicht da
        // 2: primitive widening, wenn nicht da
        // 3: autoboxing, wenn nicht da
        // 4: Komplex Widening, wenn nicht da
        // 5: VarArg, wenn nicht da
        // 6: Compiler-Error!
    }

    static void machWas(byte v) {
        System.out.println("byte");
    }

    static void machWas(short v) {
        System.out.println("short");
    }

    /*
    static void machWas(int v) {
        System.out.println("int");
    }

    static void machWas(long v) {
        System.out.println("long");
    }

    static void machWas(float v) {
        System.out.println("float");
    }

    static void machWas(double v) {
        System.out.println("double");
    }

    static void machWas(Integer v) {
        System.out.println("Integer");
    } */

    static void machWas(Long v) {
        System.out.println("Long");
    }

    static void machWas(Float v) {
        System.out.println("Float");
    }

    static void machWas(Double v) {
        System.out.println("Double");
    }

    /*
    static void machWas(Number v) {
        System.out.println("Number");
    }

    static void machWas(Object v) {
        System.out.println("Object");
    }
    */

    static void machWas(int... v) {
        System.out.println("VarArg");
    }
}

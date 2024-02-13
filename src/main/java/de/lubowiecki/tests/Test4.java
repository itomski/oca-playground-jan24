package de.lubowiecki.tests;

public class Test4 {

    public static void main(String[] args) {

        int x = -10;
        int y = 10;
        System.out.println(x%-3);
        System.out.println(x%3);
        System.out.println();
        System.out.println(y%-3);
        System.out.println(y%3);

        if(x > 10)
            System.out.println("A");
        else
            System.out.println("B");


        boolean a = true;
        String s;

        if(a) {
            s = "Hallo";
        }

        // System.out.println(s); // Es besteht die Möglichkeit dass s keinen Wert hat

        Boolean b1 = Boolean.getBoolean("FaLSE"); //getBoolean liefert ein primitiv boolean, danach Autoboxing
        Boolean b2 = Boolean.valueOf(true); //valueOf liefert ein komplex Boolean
        Boolean b3 = true; // direktes Autoboxing
    }
}

class Abc {

    public Abc(String text) {
        super(); // Ruft den parameterlosen Konstruktor von Object auf
    }
}

class Cde extends Abc {

    public Cde(String s) {
        super(s); // ist per default drin
    }
}
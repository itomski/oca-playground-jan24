package de.lubowiecki.playground;

import java.util.*;

public class SchleifenTest {

    public static void main(String[] args) {

        // int i = 0; Wird vor dem ersten Durchlauf ausgeführt
        // i < 100; Wird vor jeder Ausführung getestet
        // i++ Wird nach der verarbeitung des Bodys ({...}) ausgeführt
        for (int i = 0; i < 100; i++) {

        }

        /*
        // Endlos-Schleife
        for (;;) {
            // Aktion
        }
        */

        // Endlos-Schleife
        //for(int i = 0;; System.out.println(++i));

        for(int i = 0, j = 20; i != j; ++i, --j) {
            System.out.println(i + " " + j);
        }

        System.out.println();

        int i = 0;
        for(; i < 10;) {
            System.out.println(++i);
        }

        System.out.println();

        int[] arr = {5,10,15,20,25,30};

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        System.out.println();

        List<Integer> arrList = List.of(5,10,15,20,25,30, 35, 40); // Ab java 1.9
        // List<Integer> arrList = Arrays.asList(5,10,15,20,25,30);

        // fori für Collections ist nur bei Listen einsetzbar
        for (int j = 0; j < arrList.size(); j++) {
            if(j == 3)  continue; // continue spring zum nächsten Schleifendurchlauf
            if(j == 6)  break; // break bricht die Ausführung der Schleife ab
            System.out.println(arrList.get(j));
        }

        System.out.println();

        //arr = {5,10,15,20,25,30}; // Nur bei gleichzeitiger Variablen-Deklaration erlaubt
        arr = new int[]{30, 25, 20, 15, 10, 5};

        System.out.println();

        arrList = new ArrayList<>(List.of(30, 25, 20, 15, 10, 5));

        for (int zahl : arr) {
            System.out.println(zahl);
        }
        //System.out.println(zahl); // ist out-of-scope

        System.out.println();

        for (int zahl : arrList) {
            System.out.println(zahl);
        }

        System.out.println();

        Set<String> namen = new HashSet<>(Set.of("A", "B", "C", "D", "1", "2", "a", "b"));
        for (String n : namen) {
            System.out.println(n);
        }

        System.out.println();

        arrList.forEach(e -> System.out.println(e)); // Lambda

        System.out.println();
        arrList.forEach(System.out::println); // Methoden-Referenz

        System.out.println();
        Iterator<Integer> itr = arrList.iterator(); // Iterator
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("WHILE");

        /*
        while(true) { // Endlosschleife
            System.out.println("Hi");
        }
        */


        int j = 0;
        while(j < 100) {
            System.out.println(++j);
        }

        System.out.println();

        final Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Eingabe: ");
                double input = Double.parseDouble(scanner.nextLine());
                System.out.println("Deine Eingabe: " + input);
                break;
            } catch (Exception e) {
                System.out.println("Falsche Eingabe");
            }
        }

        String name = null;

        // Wird mind. 1 x ausgeführt
        do {
            name += "A";
        } while(name == null || name.length() < 10);

        System.out.println(name);
    }
}

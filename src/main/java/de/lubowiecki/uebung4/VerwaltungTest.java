package de.lubowiecki.uebung4;

import java.util.Scanner;

public class VerwaltungTest {

    private static Scanner scanner = new Scanner(System.in);
    private static final String OUTPUT = "Eingabe: ";


    public static void main(String[] args) {

        //System.err.println("Moin"); // Ausgabe von Exceptions oder Errors

        String input = "";

        System.out.print(OUTPUT);
        //input = scanner.next(); // Inhalt bis zum nächsten Leerzeichen wird eingelesen
        input = scanner.nextLine(); // Kompletter Inhalt inkl. Leerzeichen wird eingelesen

        System.out.println(input);

        System.out.print(OUTPUT);
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.print(OUTPUT);
        double j = scanner.nextDouble(); // Eingabe wird lokalisiert
        System.out.println(j);

        scanner.nextLine(); // fix

        System.out.print(OUTPUT);
        input = scanner.nextLine();
        System.out.println(input);


        boolean exit = false;

        // app ist ein Label
        //while(!exit) {
        app: while(true) {
            System.out.print(OUTPUT);
            input = scanner.nextLine().trim(); // trim entfernt Leerzeichen und Tabs am Anfang und Ende

            /*
            if(input.equalsIgnoreCase("exit"))
                break; // break bricht die while-schleife ab

            System.out.println(input);
            */

            switch(input.toLowerCase()) {
                case "new":
                    System.out.println("NEW");
                    break;

                case "old":
                    System.out.println("OLD");
                    break;

                case "exit":
                    System.out.println("EXIT");
                    //exit = true;
                    //System.exit(0); // Programm wird sofort verlassen!
                    break app; // break gilt für die Struktur mit dem Label app

                default:
                    System.out.println("Falsche Eingabe!");
            }
        }

        System.out.println("Programmende");
        scanner.close();
    }
}

package de.lubowiecki.playground;

public class KontrollstrukturenTest {

    public static void main(String[] args) {

        int i = 10;

        if(i <= 20) {
            System.out.println("IF 1");
        }

        if(i <= 10) {
            System.out.println("IF 2");
        }
        else {
            System.out.println("ELSE 2");
        }

        if(i <= 10) {
            System.out.println("IF 3");
        }
        else if(i > 10 && i < 20) {
            System.out.println("ELSE IF 3A");
        }
        else if(i > 20 && i < 30) {
            System.out.println("ELSE IF 3B");
        }
        else {
            System.out.println("ELSE 3");
        }

        if(i < 40) System.out.println("IF 4");

        System.out.println("OUTER");

        if(i < 40); // ; Beendet die IF-Anweisung
        System.out.println("OUTER"); // gehört nicht zu der IF-Anweisung

        int j = 100;

        if(j > 10)
            if(j > 50)
                if(j > 100)
                    System.out.println("Mehr als 100");
                else System.out.println("A");
            else System.out.println("B");


        int a = 0;
        int b = 10;
        if(b > 5)
            a = 5;
        else
            a = 10;

        a = (b > 5) ? 5 : 10;
        a = (b > 5) ? 5 : (b < 10) ? 7 : 10;

        System.out.println();

        int wert = -5;

        // Ganzzahlenwerte (ohne long), char, String, ENUM
        switch(wert) {

            default: // Optional
                System.out.println("PASST NICHT");
                break;

            case 5: {
                    int x = 10;
                    System.out.println("A");
                }
                break;

            case 7: {
                    int x = 20;
                    System.out.println("B");
                }
                break;

            case 10:
                System.out.println("C");
                break;

            case 15:
                System.out.println("D");
                break;

        }

        System.out.println();

        Wochentag tag = Wochentag.SO;
        //Wochentag tag = null;
        System.out.println(tag.ordinal());

        switch(tag) {
            case MO -> System.out.println("Montag"); // Automatisch mit break
            case DI -> System.out.println("Dienstag");
            case MI -> System.out.println("Mittwoch");
            case DO -> System.out.println("Donnerstag");
            case FR -> System.out.println("Freitag");
            default -> System.out.println("Wochenende");
            /*
            case SA -> System.out.println("Samstag");
            case SO -> System.out.println("Sonntag");
            */
        }

        System.out.println();

        // Werden Variablen für case verwendet, MÜSSEN es Compiletime-Konstanten sein!

        String input = "PetEr  ";
        final String part1 = "p"; // Compiletime-Konstante

        final String part2;
        part2 = "p"; // Runtime-Konstante - im case nicht erlaubt!!!

        switch(input.trim().toLowerCase()) {

            case part1 + "eter":
                System.out.println("Moin Peter");
                break;

            /* case part2 + "arol":
                System.out.println("Hi Carol");
                break; */

            default:
                System.out.println("Tach auch!");
                break;
        }

        System.out.println();

        byte b1 = 100;

        switch(b1) { // Werte im case müssen Bytes sein

            case 10:
                System.out.println("A");
                break;

            case 20:
            case 30:
                System.out.println("B");
                break;

            case 127:
                System.out.println("C");
                break;

            case -128:
                System.out.println("D");
                break;

            default:
                System.out.println("PASST NICHT!");
                break;
        }
    }
}

package de.lubowiecki.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionTest {

        public static void main(String[] args) {

            System.out.println("START MAIN");
            try {
                new CheckedExceptionTest().machWasA();
            } catch (FileNotFoundException e) {
                System.out.println("Problem in main behandelt");
            }
            System.out.println("END MAIN");

        }

        void machWasA() throws FileNotFoundException {
            System.out.println("START A");
            machWasB();
            System.out.println("END A");
        }

        void machWasB() throws FileNotFoundException {
            System.out.println("START B");
            machWasC();
            System.out.println("END B");
        }

        void machWasC() throws FileNotFoundException {
            System.out.println("START C");
            machWasD();
            System.out.println("END C");
        }

        void machWasD() throws FileNotFoundException {
            System.out.println("START D");
            //try {
                FileInputStream in = new FileInputStream("data.txt");
            //} catch (FileNotFoundException e) {
            //    System.out.println("Datei nicht gefunden!");
            //}
            System.out.println("END D");
        }
    }


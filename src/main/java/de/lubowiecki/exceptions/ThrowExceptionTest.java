package de.lubowiecki.exceptions;

import java.io.FileInputStream;
import java.sql.SQLException;
import java.time.LocalDate;

public class ThrowExceptionTest {

    public static void main(String[] args) {

        doSomething(10);

        LocalDate.of(2000, 15, 32);

        /*
        try {
            String s = null;
            s.toLowerCase();
        }
        catch (SQLException e) { // Ich kann keine Checked-Exception fangen, die im try nie autauchen kann
            e.printStackTrace();
        }
        */

        try {
            String s = null;
            s.toLowerCase();
        }
        catch (ArrayIndexOutOfBoundsException e) { // Unchecked-Exceptions können immer gefangen werden
            e.printStackTrace();
        }

        try {
            String s = null;
            s.toLowerCase();
        }
        catch (Exception e) { // Exception kann immer gefangen werden (weil Elternklasse von RuntimeException)
            e.printStackTrace();
        }

    }

    static void doSomething(int wert) {

        if(wert > 100 && wert < 120)
            throw new IllegalArgumentException("Der wert ist ungültig!");

        System.out.println(wert * 2);
    }
}

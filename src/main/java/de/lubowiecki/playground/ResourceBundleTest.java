package de.lubowiecki.playground;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ResourceBundleTest {

    private static final Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter DATE_FMT;

    public static void main(String[] args) {

        DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(Locale.getDefault());
        //Locale.setDefault(Locale.CHINA);
        //System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("de.lubowiecki.lang.ui");

        //bundle.getKeys(); // Liefert alle Schlüsseln


        System.out.println(bundle.getString("welcome"));
        System.out.print(bundle.getString("user.name") + ": ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.print(bundle.getString("user.birthdate") + ": ");

        String birthdate = scanner.nextLine();
        System.out.println(LocalDate.parse(birthdate, DATE_FMT));

        System.out.println(bundle.getString("thanks"));

        System.out.println();

        final NumberFormat NFMT = NumberFormat.getInstance(); // Verwendet das Default-Locale
        System.out.println(NFMT.format(99.15));
        System.out.printf("%.2f", 99.1567); // Verwendet das Default-Locale

    }
}

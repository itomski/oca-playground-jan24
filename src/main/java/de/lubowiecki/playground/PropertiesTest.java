package de.lubowiecki.playground;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {

        // Properties in Datei schreiben
        Properties props = new Properties();
        props.setProperty("db.user", "root");
        props.setProperty("db.password", "geheim");
        props.setProperty("db.url", "localhost");

        /*
        try(OutputStream out = new FileOutputStream("config.properties")) {
            props.store(out, null);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        */

        try(OutputStream out = new FileOutputStream("config.xml")) {
            props.storeToXML(out, null);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        // Properties einlesen
        /*
        Properties props = new Properties();
        try(InputStream in = new FileInputStream("config.properties")) {
            props.load(in);
            System.out.println(props.getProperty("db.user", "nicht definiert"));
            System.out.println(props.getProperty("db.password", "nicht definiert"));
            System.out.println(props.getProperty("db.url", "nicht definiert"));
            System.out.println(props.getProperty("db.location", "nicht definiert"));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        */

    }
}

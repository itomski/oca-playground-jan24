package de.lubowiecki.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseTest {

    public static final String USER_HOME = System.getProperty("user.home");
    public static final String DB_URL = "jdbc:sqlite:" + USER_HOME + "/data.db";

    public static void main(String[] args) {

        //System.out.println(System.getProperties());
        //System.out.println(USER_HOME);

        /*
        try(Connection con = DriverManager.getConnection(DB_URL)) {
            System.out.println("Verbindung aufgebaut.");
        }
        catch (SQLException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
        */

        try {
            createTable();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Vorname: ");
            String firstname = scanner.nextLine();
            System.out.print("Nachname: ");
            String lastname = scanner.nextLine();

            save(new User(firstname, lastname));

            List<User> data = getData();
            System.out.println(data);
        }
        catch(SQLException e) {
            e.printStackTrace();
        }

    }

    // throws heißt, dass der Aufrufer dieser Methode sich um die Exception kümmern muss
    private static void createTable() throws SQLException {

        final String sql  = "CREATE TABLE IF NOT EXISTS users (" +
                            "id INTEGER," +
                            "firstname TEXT NOT NULL, " +
                            "lastname TEXT NOT NULL, " +
                            "PRIMARY KEY (id AUTOINCREMENT)" +
                            ")";

        runStatement(sql);
    }

    private static List<User> getData() throws SQLException {

        final String sql  = "SELECT * FROM users";

        try(Connection con = DriverManager.getConnection(DB_URL);
            Statement stmt = con.createStatement()) {
            //stmt.execute(sql);
            //return mapToUser(stmt.getResultSet());
            return mapToUser(stmt.executeQuery(sql)); // executeQuery liefert ein ResultSet zurück

            // stmt.close();
            // con.close();
        }
    }

    private static boolean save(User user) throws SQLException {

        final String sql  = "INSERT INTO users (id, firstname, lastname) " +
                                "VALUES(NULL, '" + user.getFirstname() + "', '" + user.getLastname() + "')";

        try(Connection con = DriverManager.getConnection(DB_URL);
            Statement stmt = con.createStatement()) {
            //stmt.execute(sql);
            //return stmt.getUpdateCount() > 0;
            return stmt.executeUpdate(sql) > 0; // executeUpdate liefert ein Zahl zurück
        }
    }

    // ORM - Objekt-Relationales-Mapping
    private static List<User> mapToUser(ResultSet rs) throws SQLException {

        List<User> users = new ArrayList<>();
        while(rs.next()) {
            User user = new User(
                rs.getInt("id"),
                rs.getString("firstname"),
                rs.getString("lastname")
            );
            users.add(user);
        }
        return users;
    }

    private static void runStatement(final String sql) throws SQLException {

        try(Connection con = DriverManager.getConnection(DB_URL);
            Statement stmt = con.createStatement()) {
            stmt.execute(sql);
        }
    }
}

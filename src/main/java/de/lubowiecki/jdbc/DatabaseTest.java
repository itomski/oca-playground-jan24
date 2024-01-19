package de.lubowiecki.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
            List<String> data = getData();
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

    private static List<String> getData() throws SQLException {

        final String sql  = "SELECT * FROM users";

        try(Connection con = DriverManager.getConnection(DB_URL);
            Statement stmt = con.createStatement()) {
            stmt.execute(sql);
            return mapToUser(stmt.getResultSet());
        }
    }

    private static List<String> mapToUser(ResultSet rs) throws SQLException {

        List<String> vornamen = new ArrayList<>();
        while(rs.next()) {
            vornamen.add(rs.getString("firstname"));
        }
        return vornamen;
    }

    private static void runStatement(final String sql) throws SQLException {

        try(Connection con = DriverManager.getConnection(DB_URL);
            Statement stmt = con.createStatement()) {
            stmt.execute(sql);
        }
    }
}

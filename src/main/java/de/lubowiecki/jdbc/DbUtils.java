package de.lubowiecki.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbUtils {

    public static final String USER_HOME = System.getProperty("user.home");

    public static final String DB_TYPE = "SQLITE";
    public static final String DB_URL = "jdbc:sqlite:" + USER_HOME + "/data.db";

    private DbUtils() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }
}

package de.lubowiecki.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements Repository<User, Integer> {

    public static final String TABLE = "users";

    public UserRepository() throws SQLException {
        createTable();
    }

    @Override
    public List<User> find() throws SQLException {

        final String sql  = "SELECT * FROM " + TABLE;

        try(Connection con = DbUtils.getConnection();
            Statement stmt = con.createStatement()) {

            List<User> users = new ArrayList<>();
            ResultSet results = stmt.executeQuery(sql);

            while(results.next()) {
                users.add(mapToObject(results));
            }
            return users;
        }
    }

    @Override
    public Optional<User> find(Integer id) throws SQLException {

        final String sql  = "SELECT * FROM " + TABLE + " WHERE id = " + id;

        try(Connection con = DbUtils.getConnection();
            Statement stmt = con.createStatement()) {

            ResultSet results = stmt.executeQuery(sql);

            if(results.next()) {
                return Optional.of(mapToObject(results));
            }
            return Optional.empty();
        }
    }

    @Override
    public boolean insert(User user) throws SQLException {

        final String sql = "INSERT INTO " + TABLE + " (id, firstname, lastname) VALUES(null, ?, ?)";

        try(Connection con = DbUtils.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, user.getFirstname());
            stmt.setString(2, user.getLastname());
            stmt.execute();

            ResultSet keys = null;

            if(DbUtils.DB_TYPE.equalsIgnoreCase("sqlite")) {
                // Für SQLite
                Statement keyStmt = con.createStatement();
                keys = keyStmt.executeQuery("SELECT last_insert_rowid()");
            }
            else {
                //Für MySQL, MsSQL, Oracle & Co
                keys = stmt.getGeneratedKeys(); // Liefert die vergebene ID zurück
            }

            if(keys.next()) {
                user.setId(keys.getInt(1));
                return true;
            }
            return false;
        }
    }

    /*
    @Override
    public boolean update(User user) throws SQLException {

        final String sql = "UPDATE " + TABLE + " SET firstname = ?, lastname = ? WHERE id = ?";

        try(Connection con = DbUtils.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, user.getFirstname());
            stmt.setString(2, user.getLastname());
            stmt.setInt(3, user.getId());
            return stmt.executeUpdate() > 0;
        }
        return false;
    }
    */

    public boolean update(User user) throws SQLException {

        final String sql = "UPDATE " + TABLE + " SET firstname = ?, lastname = ? WHERE id = ?";
        List<Object> values = new ArrayList<>();
        values.add(user.getFirstname());
        values.add(user.getLastname());
        values.add(user.getId());
        return runPreparedStatement(sql, values);
    }

    public boolean updateFirstname(User user) throws SQLException {

        final String sql = "UPDATE " + TABLE + " SET firstname = ? WHERE id = ?";
        List<Object> values = new ArrayList<>();
        values.add(user.getFirstname());
        values.add(user.getId());
        return runPreparedStatement(sql, values);
    }

    public boolean updateFirstname(int id, String firstname) throws SQLException {

        final String sql = "UPDATE " + TABLE + " SET firstname = ? WHERE id = ?";
        List<Object> values = new ArrayList<>();
        values.add(firstname);
        values.add(id);
        return runPreparedStatement(sql, values);
    }

    private boolean runPreparedStatement(final String sql, List<Object> values) throws SQLException {

        try(Connection con = DbUtils.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql)) {

            int i = 1;
            for(Object v : values) {
                stmt.setObject(i++, v);
            }

            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(User user) throws SQLException {
        return deleteById(user.getId());
    }

    @Override
    public boolean deleteById(Integer id) throws SQLException {

        final String sql = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection con = DbUtils.getConnection();
            Statement stmt = con.createStatement()) {
            return stmt.executeUpdate(sql) > 0;
        }
    }

    @Override
    public void createTable() throws SQLException {

        final String sql  = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                "id INTEGER," +
                "firstname TEXT NOT NULL, " +
                "lastname TEXT NOT NULL, " +
                "PRIMARY KEY (id AUTOINCREMENT)" +
                ")";

        try(Connection con = DbUtils.getConnection();
            Statement stmt = con.createStatement()) {
            stmt.execute(sql);
        }
    }

    @Override
    public User mapToObject(ResultSet result) throws SQLException {
        return new User(
                result.getInt("id"),
                result.getString("firstname"),
                result.getString("lastname")
        );
    }
}

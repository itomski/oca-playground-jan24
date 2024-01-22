package de.lubowiecki.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface Repository<T, U> {

    public List<T> find() throws SQLException;

    public Optional<T> find(U id) throws SQLException;

    public boolean insert(T t) throws SQLException;

    public boolean update(T t) throws SQLException;

    public boolean delete(T t) throws SQLException;

    public boolean deleteById(U id) throws SQLException;

    public void createTable() throws SQLException;

    public T mapToObject(ResultSet result) throws SQLException;
}

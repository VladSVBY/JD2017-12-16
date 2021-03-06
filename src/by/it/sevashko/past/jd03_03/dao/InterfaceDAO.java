package by.it.sevashko.jd03_03.dao;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceDAO<T> {

    boolean create(T bean) throws SQLException;
    T read(int id) throws SQLException;
    boolean update(T bean) throws SQLException;
    boolean delete(T bean) throws SQLException;
    List<T> getALL(String where) throws SQLException;
}

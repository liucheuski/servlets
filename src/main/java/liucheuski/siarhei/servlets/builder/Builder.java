package liucheuski.siarhei.servlets.builder;

import liucheuski.siarhei.servlets.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}

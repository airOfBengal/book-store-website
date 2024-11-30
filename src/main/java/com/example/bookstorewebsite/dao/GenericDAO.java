package com.example.bookstorewebsite.dao;

import java.util.List;

public interface GenericDAO<T> {
    public T create(T entity);
    public T update(T entity);
    public T get(Object id);
    public void delete(Object id);
    public List<T> listAll();
    public long count();
}

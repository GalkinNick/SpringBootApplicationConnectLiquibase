package com.example.springbootapplication.services;

import java.util.Collection;

public interface CRUDServise<T> {

    T getById(Integer id);
    Collection<T> getAll();
    void create(T item);
    void update(T item);
    void delete(Integer id);
}

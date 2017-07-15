/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.advisitantes.business.repository;

import java.util.List;

/**
 *
 * @author Brayan Kelly
 * @param <T>
 * @param <ID>
 */
public interface Repository<T,ID> {
    void save(T entity);
    void update(T entity);
    T findById(ID id);
    List<T> findAll();
}

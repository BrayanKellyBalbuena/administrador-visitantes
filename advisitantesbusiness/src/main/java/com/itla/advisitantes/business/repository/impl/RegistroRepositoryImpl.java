/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.advisitantes.business.repository.impl;

import com.itla.advisitantes.business.entity.Registro;
import com.itla.advisitantes.business.repository.RegistroRepository;
import java.util.List;


public class RegistroRepositoryImpl implements RegistroRepository {

    @Override
    public void save(Registro entity) {
        System.out.println(entity);
    }

    @Override
    public void update(Registro entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registro findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Registro> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

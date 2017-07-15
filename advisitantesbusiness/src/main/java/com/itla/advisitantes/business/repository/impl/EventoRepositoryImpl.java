/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.advisitantes.business.repository.impl;

import com.itla.advisitantes.business.entity.Evento;
import com.itla.advisitantes.business.repository.EventoRepository;
import java.util.List;


public class EventoRepositoryImpl implements EventoRepository {

    @Override
    public void save(Evento entity) {
        System.out.println(entity);
    }

    @Override
    public void update(Evento entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento findById(Long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.advisitantes.business.repository.impl;

import com.itla.advisitantes.business.entity.Invitado;
import com.itla.advisitantes.business.repository.InvitadoRepository;
import java.util.List;


public class InvitadoRepositoryImpl implements InvitadoRepository {

    @Override
    public void save(Invitado entity) {
        System.out.println(entity);
    }

    @Override
    public void update(Invitado entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Invitado findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Invitado> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.advisitantes.business.repository.impl;

import com.itla.advisitantes.business.entity.Invitacion;
import com.itla.advisitantes.business.repository.InvitacionRepository;
import java.util.List;


public class InvitacionRepositoryImpl implements InvitacionRepository {

    @Override
    public void save(Invitacion entity) {
        System.out.println(entity);
    }

    @Override
    public void update(Invitacion entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Invitacion findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Invitacion> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

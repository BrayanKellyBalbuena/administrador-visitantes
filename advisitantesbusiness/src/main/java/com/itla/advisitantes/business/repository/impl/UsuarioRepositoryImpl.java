/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.advisitantes.business.repository.impl;

import com.itla.advisitantes.business.entity.Usuario;
import com.itla.advisitantes.business.repository.UsuarioRepository;
import java.util.List;


public class UsuarioRepositoryImpl implements UsuarioRepository {

    @Override
    public void save(Usuario entity) {
        System.out.println(entity);
    }

    @Override
    public void update(Usuario entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

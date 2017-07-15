/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.advisitantes.business.repository.factory;

import com.itla.advisitantes.business.enums.RepositoryEnum;
import com.itla.advisitantes.business.repository.Repository;
import com.itla.advisitantes.business.repository.impl.EventoRepositoryImpl;
import com.itla.advisitantes.business.repository.impl.InvitacionRepositoryImpl;
import com.itla.advisitantes.business.repository.impl.InvitadoRepositoryImpl;
import com.itla.advisitantes.business.repository.impl.RegistroRepositoryImpl;
import com.itla.advisitantes.business.repository.impl.UsuarioRepositoryImpl;

/**
 *
 * @author Esmaily Kelly
 */
public class RepositoryFactory {
    
    public static Repository getRepository(RepositoryEnum repo){
        
        switch (repo){
            case EVENTO_REPOSITORY :
                return new EventoRepositoryImpl();
            case INVITACION_REPOSITORY :
                return new InvitacionRepositoryImpl();
            case INVITADO_REPOSITORY :
                return new InvitadoRepositoryImpl();
            case USUARIO_REPOSITORY :
                return new UsuarioRepositoryImpl();
            case REGISTRO_REPOSITORY:
               return new RegistroRepositoryImpl();
            default:
                return null;
        }
    }

   
}

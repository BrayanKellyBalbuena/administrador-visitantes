/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.advisitantesgui;

import com.itla.advisitantes.business.entity.Evento;
import com.itla.advisitantes.business.entity.Invitacion;
import com.itla.advisitantes.business.entity.Invitado;
import com.itla.advisitantes.business.entity.Registro;
import com.itla.advisitantes.business.entity.Usuario;
import com.itla.advisitantes.business.enums.RepositoryEnum;
import com.itla.advisitantes.business.repository.EventoRepository;
import com.itla.advisitantes.business.repository.InvitacionRepository;
import com.itla.advisitantes.business.repository.InvitadoRepository;
import com.itla.advisitantes.business.repository.RegistroRepository;
import com.itla.advisitantes.business.repository.UsuarioRepository;
import com.itla.advisitantes.business.repository.factory.RepositoryFactory;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author Esmaily Kelly
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Evento ev = new Evento();
        ev.setNombre("evento");
        ev.setFecha(Date.valueOf(LocalDate.now()));
        ev.setIdEvento(0);
        ev.setUbicacion("ubicacion calle");
        ((EventoRepository)RepositoryFactory.getRepository(RepositoryEnum.EVENTO_REPOSITORY)).save(ev);
        
        Invitacion inv = new Invitacion();
        inv.setEvento(ev);
        inv.setId(0);
        inv.setImprevisto("Sin inprevisto");
        ((InvitacionRepository)RepositoryFactory.getRepository(RepositoryEnum.INVITACION_REPOSITORY)).save(inv);
        
        Invitado invitado = new Invitado();
        invitado.setNombre("Brayan");
        invitado.setApellido("kelly");
        invitado.setSexo("M");
        invitado.setTelefono("8097776661");
        
        ((InvitadoRepository)RepositoryFactory.getRepository(RepositoryEnum.INVITADO_REPOSITORY)).save(invitado);
        
        Registro reg = new Registro();
        reg.setEvento(ev);
        reg.setId(0);
        reg.setInvitado(invitado);
        ((RegistroRepository)RepositoryFactory.getRepository(RepositoryEnum.REGISTRO_REPOSITORY)).save(reg);
        
        Usuario usuario = new Usuario();
        usuario.setId(10);
        usuario.setNombre("Bkelly");
        usuario.setPerfilUsuario("Admin");
         ((UsuarioRepository)RepositoryFactory.getRepository(RepositoryEnum.USUARIO_REPOSITORY)).save(usuario);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.advisitantes.business.entity;

/**
 *
 * @author Esmaily Kelly
 */
public class Registro {
    
    long id;
    Invitado invitado;
    Evento evento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Invitado getInvitado() {
        return invitado;
    }

    public void setInvitado(Invitado invitado) {
        this.invitado = invitado;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    
    
    @Override
    public String toString() {
        return "Registro{" + "id=" + id + ", invitado=" + invitado + ", evento=" + evento + '}';
    }
    
    
}

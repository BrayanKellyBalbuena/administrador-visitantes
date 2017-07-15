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
public class Invitacion {
    
    private long id; 
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    private Evento evento;
	private Invitado invitado;
	private String registro;
	private String imprevisto;
       
	
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Invitado getInvitado() {
		return invitado;
	}
	public void setInvitado(Invitado invitado) {
		this.invitado = invitado;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getImprevisto() {
		return imprevisto;
	}
	public void setImprevisto(String imprevisto) {
		this.imprevisto = imprevisto;
	}

    @Override
    public String toString() {
        return "Invitacion{" + "id=" + id + ", evento=" + evento + ", invitado=" + invitado + ", registro=" + registro + ", imprevisto=" + imprevisto + '}';
    }
        
        
}

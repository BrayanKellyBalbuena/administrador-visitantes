/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.advisitantes.business.entity;

import java.util.Date;

/**
 *
 * @author Esmaily Kelly
 */
public class Evento {
    
    private long id;
	private String nombre = null;
	private Date fecha = null;
	private String ubicacion = null;
	

	public long getIdEvento() {
		return id;
	}

	public void setIdEvento(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", ubicacion=" + ubicacion + '}';
    }
        
        
}

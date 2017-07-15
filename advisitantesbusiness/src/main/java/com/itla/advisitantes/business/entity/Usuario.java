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
public class Usuario {
    
    private long id;
	private String nombre;
	private String apellido;
	private String usuario;
	private String clave;
	private String perfilUsuario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
        
        
        
    public long getIdUsuario() {
		return id;
	}
	public void setIdUsuario(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getPerfilUsuario() {
		return perfilUsuario;
	}
	public void setPerfilUsuario(String perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}  

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", clave=" + clave + ", perfilUsuario=" + perfilUsuario + '}';
    }
        
        
}

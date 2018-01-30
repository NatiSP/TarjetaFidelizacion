package com.curso.spring.persistencia.entity;

import javax.persistence.Entity;

@Entity
public class Cliente extends Usuario{

	private int puntos;
	private String apellidos;
	
	public Cliente(){
		super();
		this.puntos = 0;
		this.apellidos = "Unez Unez";
	}
	
	public Cliente(String id) {
		super(id);
	}

	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}

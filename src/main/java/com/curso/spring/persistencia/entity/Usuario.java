package com.curso.spring.persistencia.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	private String id;
	private String nombre;
	
	public Usuario(){
		this.id="1";
		this.nombre="Usuario 1";
	}
	
	public Usuario(String id) {
		this.id=id;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

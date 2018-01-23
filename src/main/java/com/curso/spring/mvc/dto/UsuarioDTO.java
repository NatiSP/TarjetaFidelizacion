package com.curso.spring.mvc.dto;

public class UsuarioDTO {

	private int id;
	private String nombre;
	
	public UsuarioDTO(){
		this.id=1;
		this.nombre="Usuario 1";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

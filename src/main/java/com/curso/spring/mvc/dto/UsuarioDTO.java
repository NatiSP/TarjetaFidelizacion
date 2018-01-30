package com.curso.spring.mvc.dto;

public class UsuarioDTO {

	private String id;
	private String nombre;
	private String usuario;
	private String password;

	public UsuarioDTO(){
		this.id="1";
		this.nombre="Usuario 1";
	}
	
	public UsuarioDTO(String id) {
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
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

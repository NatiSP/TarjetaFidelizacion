package com.curso.spring.mvc.dto;

public class LoginData {

	private String usuario;
	private String password;
	
	public LoginData(String user, String pwd) {
		usuario = user;
		password = pwd;
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

package com.curso.spring.mvc.entity;

public class Tarjeta {

	private String id;
	private String numeroTarjeta;
	private Cliente cliente;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}

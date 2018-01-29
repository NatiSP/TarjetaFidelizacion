package com.curso.spring.persistencia.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tarjeta {

	@Id
	private int id;
	private String numeroTarjeta;
	private Cliente cliente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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

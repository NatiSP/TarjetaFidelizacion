package com.curso.spring.persistencia.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movimiento {

	@Id
	private int idMovimiento;
	private Tarjeta tarjeta;
	private Date fechaOperacion;
	private int cantidadPuntos;
	private String descripcion;
	private Operador operador;
	
	public int getIdMovimiento() {
		return idMovimiento;
	}
	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public Date getFechaOperacion() {
		return fechaOperacion;
	}
	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}
	public int getCantidadPuntos() {
		return cantidadPuntos;
	}
	public void setCantidadPuntos(int cantidadPuntos) {
		this.cantidadPuntos = cantidadPuntos;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Operador getOperador() {
		return operador;
	}
	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	
	
}

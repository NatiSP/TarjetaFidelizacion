package com.curso.spring.mvc.dto;

import java.util.Date;

public class MovimientoDTO {

	private int idMovimiento;
	private TarjetaDTO tarjeta;
	private Date fechaOperacion;
	private int cantidadPuntos;
	private String descripcion;
	private OperadorDTO operador;
	
	public int getIdMovimiento() {
		return idMovimiento;
	}
	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	public TarjetaDTO getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(TarjetaDTO tarjeta) {
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
	public OperadorDTO getOperador() {
		return operador;
	}
	public void setOperador(OperadorDTO operador) {
		this.operador = operador;
	}
	
	
}

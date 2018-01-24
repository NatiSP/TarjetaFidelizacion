package com.curso.spring.mvc.dto;

import java.util.Date;

public class OfertaDTO {

	private int idOferta;
	private String descripcion;
	private OperadorDTO operador;
	private Date fechaInicio;
	private Date fechaFin;
	private Double coste;
	public int getIdOferta() {
		return idOferta;
	}
	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
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
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Double getCoste() {
		return coste;
	}
	public void setCoste(Double coste) {
		this.coste = coste;
	}
	
}

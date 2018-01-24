package com.curso.spring.mvc.dto;

import java.util.Date;

public class ReservaDTO {

	private int idReserva;
	private MovimientoDTO movimientoAsociado;
	private Date fechaReserva;
	
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public MovimientoDTO getMovimientoAsociado() {
		return movimientoAsociado;
	}
	public void setMovimientoAsociado(MovimientoDTO movimientoAsociado) {
		this.movimientoAsociado = movimientoAsociado;
	}
	public Date getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	
}

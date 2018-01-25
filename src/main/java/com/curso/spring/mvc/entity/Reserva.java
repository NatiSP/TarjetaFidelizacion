package com.curso.spring.mvc.entity;

import java.util.Date;

public class Reserva {

	private int idReserva;
	private Movimiento movimientoAsociado;
	private Date fechaReserva;
	
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public Movimiento getMovimientoAsociado() {
		return movimientoAsociado;
	}
	public void setMovimientoAsociado(Movimiento movimientoAsociado) {
		this.movimientoAsociado = movimientoAsociado;
	}
	public Date getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	
}

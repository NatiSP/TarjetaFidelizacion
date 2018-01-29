package com.curso.spring.persistencia.dao;

import java.util.List;

import com.curso.spring.persistencia.entity.Reserva;

public interface ReservaDAO {

	public Long insertarReserva(Reserva Reserva);
	
	public List<Reserva> buscarReservas(Reserva Reserva);
}

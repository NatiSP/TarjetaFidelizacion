package com.curso.spring.persistencia.dao;

import java.util.List;

import com.curso.spring.persistencia.entity.Reserva;

public interface ReservaDAO {

	public void insertarReserva(Reserva reserva);
	
	public List<Reserva> buscarReservas(Reserva reserva);
}

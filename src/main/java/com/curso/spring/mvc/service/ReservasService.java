package com.curso.spring.mvc.service;

import java.util.List;

import com.curso.spring.mvc.dto.OfertaDTO;
import com.curso.spring.mvc.dto.ReservaDTO;
import com.curso.spring.mvc.dto.TarjetaDTO;

public interface ReservasService {

	public ReservaDTO verReserva(ReservaDTO reservaCriteria);
	
	public List<ReservaDTO> verListaReservas(ReservaDTO reservaCriteria);
	
	// Duda tecnica: Si hago la logica de realizar reserva aqui estará muy acoplado a los DTO de oferta y tarjeta
	// Si lo hago en el controller, tendria logica de negocio en el controller
	public void realizarReserva(OfertaDTO oferta, TarjetaDTO tarjeta);
}

package com.curso.spring.mvc.service;

import java.util.List;

import com.curso.spring.mvc.dto.OfertaDTO;

public interface OfertasService {

	public OfertaDTO verDetalleOferta(OfertaDTO oferta);
	
	public List<OfertaDTO> verOfertas();
}

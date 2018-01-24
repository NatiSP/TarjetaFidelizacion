package com.curso.spring.mvc.service.interfaz;

import java.util.List;

import com.curso.spring.mvc.dto.OfertaDTO;

public interface IOfertasService {

	public OfertaDTO verDetalleOferta(OfertaDTO oferta);
	
	public List<OfertaDTO> verOfertas();
}

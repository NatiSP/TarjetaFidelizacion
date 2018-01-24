package com.curso.spring.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.OfertaDTO;
import com.curso.spring.mvc.service.interfaz.IOfertasService;

@Service
public class OfertasService implements IOfertasService{

	@Override
	public OfertaDTO verDetalleOferta(OfertaDTO oferta) {
		return new OfertaDTO();
	}

	@Override
	public List<OfertaDTO> verOfertas() {
		List<OfertaDTO> listaOfertas = new ArrayList<OfertaDTO>();
		listaOfertas.add(new OfertaDTO());
		return null;
	}

}

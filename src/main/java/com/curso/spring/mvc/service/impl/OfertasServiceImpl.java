package com.curso.spring.mvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.spring.mvc.dto.OfertaDTO;
import com.curso.spring.mvc.service.OfertasService;

@Service
public class OfertasServiceImpl implements OfertasService{

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

package com.curso.spring.mvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;

import com.curso.spring.mvc.dto.OfertaDTO;
import com.curso.spring.mvc.dto.UsuarioDTO;
import com.curso.spring.mvc.service.interfaz.IOfertasService;
import com.curso.spring.mvc.service.interfaz.IUsuarioService;

@Controller
@RequestMapping("/ofertas")
public class OfertasController {

	
	@Autowired
	private IOfertasService ofertasService;
	
	@RequestMapping(path = "/verDetalleOferta", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public OfertaDTO obtenerOfertaJSON(Map<String, Object> model, @PathVariable int id) {
		OfertaDTO ofertaCriteria = new OfertaDTO();
		ofertaCriteria.setIdOferta(id);
		return ofertasService.verDetalleOferta(ofertaCriteria);
	}
	
	@RequestMapping(path = "/verOfertasREST", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<OfertaDTO> obtenerListaOfertasJSON(Map<String, Object> model, @PathVariable int id) {
		return ofertasService.verOfertas();
	}
	
	@RequestMapping(path = "/verOfertas", method = RequestMethod.GET)
	public String obtenerListaOfertas(Map<String, Object> model, @PathVariable int id) {
		model.put("listaOfertas", ofertasService.verOfertas());
		return "listaOfertas";
	}
}

package com.curso.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.spring.mvc.dto.MovimientoDTO;
import com.curso.spring.mvc.dto.UsuarioDTO;
import com.curso.spring.mvc.service.MovimientosService;

@Controller
@RequestMapping("/movimientos")
public class MovimientosController {

	private static final String DETALLE_MOVIMIENTOS_VIEW = "detalleMovimientos";
	private static final String LISTA_MOVIMIENTOS_VIEW = "listaMovimientos";
	
	@Autowired
	private MovimientosService movimientosService;
	
	@RequestMapping(path = "/verMovimientos", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	private MovimientoDTO[] verMovimientosUsuarioJSON(@RequestParam int idUsuario) {
		return null;
	}
	
	@RequestMapping(path = "/verMovimientos", method = RequestMethod.GET)
	private String verMovimientosUsuarioJSP(@RequestParam int idUsuario) {
		UsuarioDTO usuarioCriteria = new UsuarioDTO();
		usuarioCriteria.setId(idUsuario);
		movimientosService.verMovimientos(usuarioCriteria);
		return LISTA_MOVIMIENTOS_VIEW;
	}
	
	@RequestMapping(path = "/detalleMovimiento", method = RequestMethod.GET)
	private String verDetalleMovimiento(@RequestParam int idMovimiento) {
		MovimientoDTO movimientoCriteria = new MovimientoDTO();
		movimientoCriteria.setIdMovimiento(idMovimiento);
		movimientosService.detalleMovimiento(movimientoCriteria);
		return DETALLE_MOVIMIENTOS_VIEW;
	}
}

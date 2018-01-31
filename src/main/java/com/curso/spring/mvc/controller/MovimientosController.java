package com.curso.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.spring.mvc.dto.ClienteDTO;
import com.curso.spring.mvc.dto.MovimientoDTO;
import com.curso.spring.mvc.dto.TarjetaDTO;
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
	private String verMovimientosUsuarioJSP(@RequestParam String idUsuario) {
		MovimientoDTO movimientoCriteria = new MovimientoDTO();
		ClienteDTO cliente = new ClienteDTO();
		TarjetaDTO tarjeta = new TarjetaDTO();
		tarjeta.setCliente(cliente);
		cliente.setId(idUsuario);
		movimientoCriteria.setTarjeta(tarjeta);;
		movimientosService.verMovimientos(movimientoCriteria);
		return LISTA_MOVIMIENTOS_VIEW;
	}
	
	@RequestMapping(path = "/detalleMovimiento", method = RequestMethod.GET)
	private String verDetalleMovimiento(@RequestParam int idMovimiento) {
		MovimientoDTO movimientoCriteria = new MovimientoDTO();
		movimientoCriteria.setIdMovimiento(idMovimiento);
		movimientosService.detalleMovimiento(movimientoCriteria);
		return DETALLE_MOVIMIENTOS_VIEW;
	}
	
	@RequestMapping(path="/realizarMovimiento", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<MovimientoDTO> realizarMovimiento (@RequestBody MovimientoDTO movimiento) {
		movimientosService.realizarMovimiento(movimiento);
		ResponseEntity<MovimientoDTO> response = new ResponseEntity<MovimientoDTO>(movimiento, HttpStatus.OK);
		return response;
	}
}

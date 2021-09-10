package com.apirest.confrariaws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.confrariaws.services.EventoUsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.EventoUsuario;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/confrariaws")
@Api(value="API REST Eventos por Usuarios")
public class EventoUsuarioController {
	
	@Autowired
	EventoUsuarioService service;
	
	@ApiOperation(value="Retorna lista de Eventos por Usuarios")
	@GetMapping(value="/eventoUsuario")
	public Flux<EventoUsuario> getEventoUsuario(){
		return service.findAll();
	}
	
	@ApiOperation(value="Retorna um Evento e Usuario")
	@GetMapping(value="/eventoUsuario/{id}")
	public Mono<EventoUsuario> getEventoUsuarioId(@PathVariable String id){
		return service.findById(id);
	}

	@ApiOperation(value="Salva um novo Evento por Usuario")
	@PostMapping(value="/eventoUsuario")
	public Mono<EventoUsuario> save(@RequestBody EventoUsuario eventoUsuario){
		return service.save(eventoUsuario);
	}
	
	@ApiOperation(value="Altera um Evento por Usuario")
	@PutMapping(value="/eventoUsuario")
	public Mono<EventoUsuario> update(@RequestBody EventoUsuario eventoUsuario){
		return service.save(eventoUsuario);
	}
	

}

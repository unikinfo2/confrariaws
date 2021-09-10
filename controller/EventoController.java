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

import com.apirest.confrariaws.services.EventoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.Evento;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/confrariaws")
@Api(value="API REST Eventos")
public class EventoController {
	
	@Autowired
	EventoService service;
	
	@ApiOperation(value="Retorna a lista de Eventos", notes="Lista de Eventos")
	@GetMapping(value="/evento")
	public Flux<Evento> getEvento(){
		return service.findAll();
	}
	
	@ApiOperation(value="Retorna um Evento")
	@GetMapping(value="/evento/{id}")
	public Mono<Evento> getEventoId(@PathVariable String id){
		return service.findById(id);
	}

	@ApiOperation(value="Salva um novo Evento")
	@PostMapping(value="/evento")
	public Mono<Evento> save(@RequestBody Evento evento){
		return service.save(evento);
	}
	
	@ApiOperation(value="Altera um Evento")
	@PutMapping(value="/evento")
	public Mono<Evento> update(@RequestBody Evento evento){
		return service.save(evento);
	}
}

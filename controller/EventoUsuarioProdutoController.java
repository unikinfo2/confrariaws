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

import com.apirest.confrariaws.services.EventoUsuarioProdutoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.EventoUsuarioProduto;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/confrariaws")
@Api(value="API REST de Eventos de Produtos por Usuarios")
public class EventoUsuarioProdutoController {
	
	@Autowired
	EventoUsuarioProdutoService service;
	
	@ApiOperation(value="Retorna lista dos Produtos que o Usuario Levou a um Evento")
	@GetMapping(value="/eventoUsuarioProduto")
	public Flux<EventoUsuarioProduto> getEventoUsuarioProduto(){
		return service.findAll();
	}
	
	@ApiOperation(value="Retorna um Produto que o Usuario Levou a um Evento")
	@GetMapping(value="/eventoUsuarioProduto/{id}")
	public Mono<EventoUsuarioProduto> getEventoUsuarioProdutoId(@PathVariable String id){
		return service.findById(id);
	}

	@ApiOperation(value="Salva novo Produto que o Usuario Levou a um Evento")
	@PostMapping(value="/eventoUsuarioProduto")
	public Mono<EventoUsuarioProduto> save(@RequestBody EventoUsuarioProduto eventoUsuarioProduto){
		return service.save(eventoUsuarioProduto);
	}
	
	@ApiOperation(value="Altera um Produto que o Usuario Levou a um Evento")
	@PutMapping(value="/eventoUsuarioProduto")
	public Mono<EventoUsuarioProduto> update(@RequestBody EventoUsuarioProduto eventoUsuarioProduto){
		return service.save(eventoUsuarioProduto);
	}
}

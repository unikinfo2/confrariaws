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

import com.apirest.confrariaws.services.EventoProdutoSolicitadoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.EventoProdutoSolicitado;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/confrariaws")
@Api(value="API REST Produtos solicitados por Evento")
public class EventoProdutoSolicitadoController {
	
	@Autowired
	EventoProdutoSolicitadoService service;
	
	@ApiOperation(value="Retorna lista de Produtos solicitados por Evento")
	@GetMapping(value="/eventoProdutoSolicitado")
	public Flux<EventoProdutoSolicitado> getEventoProdutoSolicitado(){
		return service.findAll();
	}
	
	@ApiOperation(value="Retorna um Produto solicitado por Evento")
	@GetMapping(value="/eventoProdutoSolicitado/{id}")
	public Mono<EventoProdutoSolicitado> getEventoProdutoSolicitadoId(@PathVariable String id){
		return service.findById(id);
	}

	@ApiOperation(value="Salva um novo Produto solicitado por Evento")
	@PostMapping(value="/eventoProdutoSolicitado")
	public Mono<EventoProdutoSolicitado> save(@RequestBody EventoProdutoSolicitado eventoProdutoSolicitado){
		return service.save(eventoProdutoSolicitado);
	}
	
	@ApiOperation(value="Altera um Produto solicitado por Evento")
	@PutMapping(value="/eventoProdutoSolicitado")
	public Mono<EventoProdutoSolicitado> update(@RequestBody EventoProdutoSolicitado eventoProdutoSolicitado){
		return service.save(eventoProdutoSolicitado);
	}
}

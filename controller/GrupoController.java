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

import com.apirest.confrariaws.services.GrupoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.Grupo;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/confrariaws")
@Api(value="API REST Grupos")
public class GrupoController {
	
	@Autowired
	GrupoService service;
	
	@ApiOperation(value="Retorna uma lista de Grupos")
	@GetMapping(value="/grupo")
	public Flux<Grupo> getGrupo(){
		return service.findAll();
	}
	
	@ApiOperation(value="Retorna um Grupo pelo id")
	@GetMapping(value="/grupo/{id}")
	public Mono<Grupo> getGrupoId(@PathVariable String id){
		return service.findById(id);
	}

	@ApiOperation(value="Salva um novo Grupo")
	@PostMapping(value="/grupo")
	public Mono<Grupo> save(@RequestBody Grupo grupo){
		return service.save(grupo);
	}
	
	@ApiOperation(value="Altera um Grupo")
	@PutMapping(value="/grupo")
	public Mono<Grupo> update(@RequestBody Grupo grupo){
		return service.save(grupo);
	}
	

}

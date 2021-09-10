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

import com.apirest.confrariaws.services.PaisService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.Pais;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/confrariaws")
@Api(value="API REST Paises IBGE")
public class PaisController {
	
	@Autowired
	PaisService service;
	
	@ApiOperation(value="Retorna a lista de Paises")
	@GetMapping(value="/pais")
	public Flux<Pais> getPais(){
		return service.findAll();
	}
	
	@ApiOperation(value="Retorna um Pais")
	@GetMapping(value="/pais/{id}")
	public Mono<Pais> getPaisId(@PathVariable String id){
		return service.findById(id);
	}

	@ApiOperation(value="Salva um novo Pais")
	@PostMapping(value="/confrariaws/pais")
	public Mono<Pais> save(@RequestBody Pais pais){
		return service.save(pais);
	}
	
	@ApiOperation(value="Altera um Pais")
	@PutMapping(value="/confrariaws/pais")
	public Mono<Pais> update(@RequestBody Pais pais){
		return service.save(pais);
	}
}

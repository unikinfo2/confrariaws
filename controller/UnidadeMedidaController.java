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

import com.apirest.confrariaws.services.UnidadeMedidaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.UnidadeMedida;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/confrariaws")
@Api(value="API REST Unidades de Medidas")
public class UnidadeMedidaController {
	
	@Autowired
	UnidadeMedidaService service;
	
	@ApiOperation(value="Retorna uma lista de Unidades de Medidas")
	@GetMapping(value="/unidadeMedida")
	public Flux<UnidadeMedida> getUnidadeMedida(){
		return service.findAll();
	}
	
	@ApiOperation(value="Retorna uma Unidade de Medida")
	@GetMapping(value="/unidadeMedida/{id}")
	public Mono<UnidadeMedida> getUnidadeMedidaId(@PathVariable String id){
		return service.findById(id);
	}

	@ApiOperation(value="Salva uma nova Unidade de Medida")
	@PostMapping(value="/unidadeMedida")
	public Mono<UnidadeMedida> save(@RequestBody UnidadeMedida unidadeMedida){
		return service.save(unidadeMedida);
	}
	
	@ApiOperation(value="Altera uma Unidade de Medida")
	@PutMapping(value="/unidadeMedida")
	public Mono<UnidadeMedida> update(@RequestBody UnidadeMedida unidadeMedida){
		return service.save(unidadeMedida);
	}
}

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

import com.apirest.confrariaws.services.TipoProdutoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.TipoProduto;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/confrariaws")
@Api(value="API REST Tipos de Produtos")
public class TipoProdutoController {
	
	@Autowired
	TipoProdutoService service;
	
	@ApiOperation(value="Retorna uma lista de Tipos de Produtos")
	@GetMapping(value="/tipoProduto")
	public Flux<TipoProduto> getTipoProduto(){
		return service.findAll();
	}
	
	@ApiOperation(value="Retorna um Tipo de Produto")
	@GetMapping(value="/tipoProduto/{id}")
	public Mono<TipoProduto> getTipoProdutoId(@PathVariable String id){
		return service.findById(id);
	}

	@ApiOperation(value="Salva um novo Tipo de Produto")
	@PostMapping(value="/tipoProduto")
	public Mono<TipoProduto> save(@RequestBody TipoProduto tipoProduto){
		return service.save(tipoProduto);
	}
	
	@ApiOperation(value="Altera um Tipo de Produto")
	@PutMapping(value="/tipoProduto")
	public Mono<TipoProduto> update(@RequestBody TipoProduto tipoProduto){
		return service.save(tipoProduto);
	}
}

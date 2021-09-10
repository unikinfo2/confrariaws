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

import com.apirest.confrariaws.services.ProdutoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.Produto;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/confrariaws")
@Api(value="API REST Produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoService service;
	
	@ApiOperation(value="Retorna uma lista de Produtos")
	@GetMapping(value="/produto")
	public Flux<Produto> getProduto(){
		return service.findAll();
	}
	
	@ApiOperation(value="Retorna um Produto")
	@GetMapping(value="/produto/{id}")
	public Mono<Produto> getProdutoId(@PathVariable String id){
		return service.findById(id);
	}

	@ApiOperation(value="Salva novo Produto")
	@PostMapping(value="/produto")
	public Mono<Produto> save(@RequestBody Produto produto){
		return service.save(produto);
	}
	
	@ApiOperation(value="Altera um Produto")
	@PutMapping(value="/produto")
	public Mono<Produto> update(@RequestBody Produto produto){
		return service.save(produto);
	}
}

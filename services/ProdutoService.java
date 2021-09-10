package com.apirest.confrariaws.services;

import com.apirest.confrariaws.document.Produto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProdutoService {
	
	Flux<Produto> findAll();
	Mono<Produto> findById(String id);
	Mono<Produto> save(Produto produto);
	

}

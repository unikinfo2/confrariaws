package com.apirest.confrariaws.services;

import com.apirest.confrariaws.document.TipoProduto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipoProdutoService {

	Flux<TipoProduto> findAll();
	Mono<TipoProduto> findById(String id);
	Mono<TipoProduto> save(TipoProduto tipoProduto);

}

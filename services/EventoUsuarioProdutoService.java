package com.apirest.confrariaws.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.EventoUsuarioProduto;

public interface EventoUsuarioProdutoService {

	Flux<EventoUsuarioProduto> findAll();
	Mono<EventoUsuarioProduto> findById(String id);
	Mono<EventoUsuarioProduto> save(EventoUsuarioProduto eventoUsuarioProduto);

}

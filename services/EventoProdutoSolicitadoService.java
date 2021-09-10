package com.apirest.confrariaws.services;

import com.apirest.confrariaws.document.EventoProdutoSolicitado;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EventoProdutoSolicitadoService {

	Flux<EventoProdutoSolicitado> findAll();
	Mono<EventoProdutoSolicitado> findById(String id);
	Mono<EventoProdutoSolicitado> save(EventoProdutoSolicitado eventoProdutoSolicitado);

}

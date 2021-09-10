package com.apirest.confrariaws.services;

import com.apirest.confrariaws.document.UnidadeMedida;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UnidadeMedidaService {

	Flux<UnidadeMedida> findAll();
	Mono<UnidadeMedida> findById(String id);
	Mono<UnidadeMedida> save(UnidadeMedida unidadeMedida);

}

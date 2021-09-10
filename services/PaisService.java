package com.apirest.confrariaws.services;

import com.apirest.confrariaws.document.Pais;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PaisService {

	Flux<Pais> findAll();
	Mono<Pais> findById(String id);
	Mono<Pais> save(Pais pais);

}

package com.apirest.confrariaws.services;

import com.apirest.confrariaws.document.Grupo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GrupoService {

	Flux<Grupo> findAll();
	Mono<Grupo> findById(String id);
	Mono<Grupo> save(Grupo grupo);

}

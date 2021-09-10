package com.apirest.confrariaws.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.Evento;

public interface EventoService {

	Flux<Evento> findAll();
	Mono<Evento> findById(String id);
	Mono<Evento> save(Evento evento);

}

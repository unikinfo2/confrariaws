package com.apirest.confrariaws.services;

import com.apirest.confrariaws.document.EventoUsuario;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface EventoUsuarioService {

	Flux<EventoUsuario> findAll();
	Mono<EventoUsuario> findById(String id);
	Mono<EventoUsuario> save(EventoUsuario eventoUsuario);

}

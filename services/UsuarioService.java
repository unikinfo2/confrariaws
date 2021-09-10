package com.apirest.confrariaws.services;

import com.apirest.confrariaws.document.Usuario;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsuarioService {

	Flux<Usuario> findAll();
	Mono<Usuario> findById(String id);
	Mono<Usuario> findByEmail(String email);
	Mono<Usuario> save(Usuario usuario);

}

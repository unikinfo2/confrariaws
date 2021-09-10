package com.apirest.confrariaws.services;

import com.apirest.confrariaws.document.UsuarioGrupo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsuarioGrupoService {

	Flux<UsuarioGrupo> findAll();
	Mono<UsuarioGrupo> findById(String id);
	Mono<UsuarioGrupo> save(UsuarioGrupo usuarioGrupo);

}

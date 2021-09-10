package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.UsuarioGrupo;
import com.apirest.confrariaws.repository.UsuarioGrupoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsuarioGrupoServiceImpl implements UsuarioGrupoService {
	
	@Autowired
	UsuarioGrupoRepository repo;

	@Override
	public Flux<UsuarioGrupo> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<UsuarioGrupo> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<UsuarioGrupo> save(UsuarioGrupo usuarioGrupo) {
		return repo.save(usuarioGrupo);
	}

}

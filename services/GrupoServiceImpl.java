package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.Grupo;
import com.apirest.confrariaws.repository.GrupoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GrupoServiceImpl implements GrupoService {
	
	@Autowired
	GrupoRepository repo;

	@Override
	public Flux<Grupo> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Grupo> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Grupo> save(Grupo grupo) {
		return repo.save(grupo);
	}

}

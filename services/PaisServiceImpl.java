package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.Pais;
import com.apirest.confrariaws.repository.PaisRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PaisServiceImpl implements PaisService {
	
	@Autowired
	PaisRepository repo;

	@Override
	public Flux<Pais> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Pais> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Pais> save(Pais pais) {
		return repo.save(pais);
	}

}

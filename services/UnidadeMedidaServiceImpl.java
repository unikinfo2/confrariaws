package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.UnidadeMedida;
import com.apirest.confrariaws.repository.UnidadeMedidaRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UnidadeMedidaServiceImpl implements UnidadeMedidaService {
	
	@Autowired
	UnidadeMedidaRepository repo;

	@Override
	public Flux<UnidadeMedida> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<UnidadeMedida> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<UnidadeMedida> save(UnidadeMedida unidadeMedida) {
		return repo.save(unidadeMedida);
	}

}

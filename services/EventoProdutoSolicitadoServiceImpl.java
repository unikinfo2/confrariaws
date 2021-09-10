package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.EventoProdutoSolicitado;
import com.apirest.confrariaws.repository.EventoProdutoSolicitadoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EventoProdutoSolicitadoServiceImpl implements EventoProdutoSolicitadoService {
	
	@Autowired
	EventoProdutoSolicitadoRepository repo;

	@Override
	public Flux<EventoProdutoSolicitado> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<EventoProdutoSolicitado> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<EventoProdutoSolicitado> save(EventoProdutoSolicitado eventoProdutoSolicitado) {
		return repo.save(eventoProdutoSolicitado);
	}

}

package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.EventoUsuarioProduto;
import com.apirest.confrariaws.repository.EventoUsuarioProdutoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EventoUsuarioProdutoServiceImpl implements EventoUsuarioProdutoService {
	
	@Autowired
	EventoUsuarioProdutoRepository repo;

	@Override
	public Flux<EventoUsuarioProduto> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<EventoUsuarioProduto> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<EventoUsuarioProduto> save(EventoUsuarioProduto eventoUsuarioProduto) {
		return repo.save(eventoUsuarioProduto);
	}

}

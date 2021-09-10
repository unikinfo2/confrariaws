package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.Evento;
import com.apirest.confrariaws.repository.EventoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EventoServiceImpl implements EventoService {
	
	@Autowired
	EventoRepository repo;

	@Override
	public Flux<Evento> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Evento> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Evento> save(Evento evento) {
		return repo.save(evento);
	}

}

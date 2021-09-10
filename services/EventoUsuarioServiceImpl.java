package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.EventoUsuario;
import com.apirest.confrariaws.repository.EventoUsuarioRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EventoUsuarioServiceImpl implements EventoUsuarioService {
	
	@Autowired
	EventoUsuarioRepository repo;

	@Override
	public Flux<EventoUsuario> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<EventoUsuario> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<EventoUsuario> save(EventoUsuario eventoUsuario) {
		return repo.save(eventoUsuario);
	}

}

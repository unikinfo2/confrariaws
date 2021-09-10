package com.apirest.confrariaws.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.confrariaws.document.Evento;

public interface EventoRepository extends ReactiveMongoRepository<Evento, String> {

}

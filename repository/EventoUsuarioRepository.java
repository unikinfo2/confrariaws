package com.apirest.confrariaws.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.confrariaws.document.EventoUsuario;

public interface EventoUsuarioRepository extends ReactiveMongoRepository<EventoUsuario, String>   {

}

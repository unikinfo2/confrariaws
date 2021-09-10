package com.apirest.confrariaws.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.confrariaws.document.Grupo;

public interface GrupoRepository extends ReactiveMongoRepository<Grupo, String>   {

}

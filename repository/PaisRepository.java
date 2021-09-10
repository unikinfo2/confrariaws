package com.apirest.confrariaws.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.confrariaws.document.Pais;

public interface PaisRepository extends ReactiveMongoRepository<Pais, String>   {

}

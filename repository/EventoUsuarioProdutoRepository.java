package com.apirest.confrariaws.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.confrariaws.document.EventoUsuarioProduto;

public interface EventoUsuarioProdutoRepository extends ReactiveMongoRepository<EventoUsuarioProduto, String>   {

}

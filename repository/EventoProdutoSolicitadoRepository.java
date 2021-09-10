package com.apirest.confrariaws.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.confrariaws.document.EventoProdutoSolicitado;

public interface EventoProdutoSolicitadoRepository extends ReactiveMongoRepository<EventoProdutoSolicitado, String>  {

}

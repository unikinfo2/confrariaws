package com.apirest.confrariaws.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.confrariaws.document.UnidadeMedida;

public interface UnidadeMedidaRepository extends ReactiveMongoRepository<UnidadeMedida, String>  {

}

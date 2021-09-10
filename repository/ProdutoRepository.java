package com.apirest.confrariaws.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.confrariaws.document.Produto;

public interface ProdutoRepository extends ReactiveMongoRepository<Produto, String> {

}

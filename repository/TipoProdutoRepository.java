package com.apirest.confrariaws.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.confrariaws.document.TipoProduto;

public interface TipoProdutoRepository extends ReactiveMongoRepository<TipoProduto, String>  {

}

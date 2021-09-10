package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.TipoProduto;
import com.apirest.confrariaws.repository.TipoProdutoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TipoProdutoServiceImpl implements TipoProdutoService {
	
	@Autowired
	TipoProdutoRepository repo;

	@Override
	public Flux<TipoProduto> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<TipoProduto> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<TipoProduto> save(TipoProduto tipoProduto) {
		return repo.save(tipoProduto);
	}

}

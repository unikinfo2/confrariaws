package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.Produto;
import com.apirest.confrariaws.repository.ProdutoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	ProdutoRepository pr;

	@Override
	public Flux<Produto> findAll() {
		return pr.findAll();
	}

	@Override
	public Mono<Produto> findById(String id) {
		return pr.findById(id);
	}

	@Override
	public Mono<Produto> save(Produto produto) {
		return pr.save(produto);
	}

}

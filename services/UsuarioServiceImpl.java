package com.apirest.confrariaws.services;

import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import org.springframework.stereotype.Service;

import com.apirest.confrariaws.document.Usuario;
import com.apirest.confrariaws.repository.UsuarioRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository repo;

	@Override
	public Flux<Usuario> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Usuario> findById(String id) {
		return repo.findById(id);
	}

	@Override
	public Mono<Usuario> findByEmail(String email) {
		Usuario usu = new Usuario();
		usu.setEmailUsuario(email);
		//ExampleMatcher matcher = ExampleMatcher.matching().withIgnorePaths("emailUsuario");
		Example<Usuario> usuExample = Example.of(usu);
		return repo.findOne(usuExample);
	}

	@Override
	public Mono<Usuario> save(Usuario usuario) {
		return repo.save(usuario);
	}

}

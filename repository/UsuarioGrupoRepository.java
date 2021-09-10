package com.apirest.confrariaws.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.confrariaws.document.UsuarioGrupo;

public interface UsuarioGrupoRepository extends ReactiveMongoRepository<UsuarioGrupo, String>  {

}

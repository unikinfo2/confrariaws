package com.apirest.confrariaws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.confrariaws.services.UsuarioGrupoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.apirest.confrariaws.document.UsuarioGrupo;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/confrariaws")
@Api(value="API REST Usuarios dos Grupos")
public class UsuarioGrupoController {
	
	@Autowired
	UsuarioGrupoService service;
	
	@ApiOperation(value="Retorna a lista de Usuarios dos Grupos")
	@GetMapping(value="/usuarioGrupo")
	public Flux<UsuarioGrupo> getUsuarioGrupo(){
		return service.findAll();
	}
	
	@ApiOperation(value="Retorna um Usuario e Grupo")
	@GetMapping(value="/usuarioGrupo/{id}")
	public Mono<UsuarioGrupo> getUsuarioGrupoId(@PathVariable String id){
		return service.findById(id);
	}

	@ApiOperation(value="Salva um novo Usuario para o Grupo")
	@PostMapping(value="/usuarioGrupo")
	public Mono<UsuarioGrupo> save(@RequestBody UsuarioGrupo usuarioGrupo){
		return service.save(usuarioGrupo);
	}
	
	@ApiOperation(value="Altera um Usuario ou Grupo")
	@PutMapping(value="/usuarioGrupo")
	public Mono<UsuarioGrupo> update(@RequestBody UsuarioGrupo usuarioGrupo){
		return service.save(usuarioGrupo);
	}
}

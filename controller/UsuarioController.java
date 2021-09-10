package com.apirest.confrariaws.controller;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.confrariaws.document.Usuario;
import com.apirest.confrariaws.services.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/confrariaws")
@Api(value = "API REST Usuarios do Sistema")
public class UsuarioController {

	@Autowired
	UsuarioService service;

	@ApiOperation(value = "Retorna uma lista de Usuarios do Sistema")
	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public Flux<Usuario> getUsuario() {
		return service.findAll();
	}

	@ApiOperation(value = "Retorna um Usuario")
	@RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET)
	public Mono<Usuario> getUsuarioId(@PathVariable String id) {
		return service.findById(id);
	}

	@ApiOperation(value = "Salva um Novo Usuario")
	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public Mono<Usuario> save(@RequestBody Usuario usuario) {
		return service.save(usuario);
	}

	@ApiOperation(value = "Altera uma usuario")
	@RequestMapping(value = "/usuario", method = RequestMethod.PUT)
	public Mono<Usuario> update(@RequestBody Usuario usuario) {
		return service.save(usuario);
	}

	@ApiOperation(value="Validar Usuario")
	@RequestMapping(value="/usuario/validar", method = RequestMethod.POST)
	public Mono<Usuario> validarUsuario(@RequestBody Usuario usuario){
		return service.findByEmail(usuario.getEmailUsuario());
	}

}

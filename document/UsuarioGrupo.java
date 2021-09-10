package com.apirest.confrariaws.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document
public class UsuarioGrupo {

	@Id
	private String idUsuarioGrupo;
	private Grupo grupo;
	private Usuario usuario;
	private Boolean administradorGrupo;
	public String getIdUsuarioGrupo() {
		return idUsuarioGrupo;
	}
	public void setIdUsuarioGrupo(String idUsuarioGrupo) {
		this.idUsuarioGrupo = idUsuarioGrupo;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Boolean getAdministradorGrupo() {
		return administradorGrupo;
	}
	public void setAdministradorGrupo(Boolean administradorGrupo) {
		this.administradorGrupo = administradorGrupo;
	}

	
}

package com.apirest.confrariaws.document;

import java.util.Date;

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
public class Grupo {

	@Id
	private String idGrupo;
	private String nomeGrupo;
	private Date dataCriaçãoGrupo;
	public String getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}
	public String getNomeGrupo() {
		return nomeGrupo;
	}
	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}
	public Date getDataCriaçãoGrupo() {
		return dataCriaçãoGrupo;
	}
	public void setDataCriaçãoGrupo(Date dataCriaçãoGrupo) {
		this.dataCriaçãoGrupo = dataCriaçãoGrupo;
	}

	
}

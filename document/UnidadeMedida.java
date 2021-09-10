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
public class UnidadeMedida {

	@Id
	private String idUnidadeMedida;
	private String codUnidadeMedida;
	private String descricaoUnidadeMedida;
	public String getIdUnidadeMedida() {
		return idUnidadeMedida;
	}
	public void setIdUnidadeMedida(String idUnidadeMedida) {
		this.idUnidadeMedida = idUnidadeMedida;
	}
	public String getCodUnidadeMedida() {
		return codUnidadeMedida;
	}
	public void setCodUnidadeMedida(String codUnidadeMedida) {
		this.codUnidadeMedida = codUnidadeMedida;
	}
	public String getDescricaoUnidadeMedida() {
		return descricaoUnidadeMedida;
	}
	public void setDescricaoUnidadeMedida(String descricaoUnidadeMedida) {
		this.descricaoUnidadeMedida = descricaoUnidadeMedida;
	}
	
}

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
public class TipoProduto {

	@Id
	private String idTipoProduto;
	private String descricaoTipo;
	public String getIdTipoProduto() {
		return idTipoProduto;
	}
	public void setIdTipoProduto(String idTipoProduto) {
		this.idTipoProduto = idTipoProduto;
	}
	public String getDescricaoTipo() {
		return descricaoTipo;
	}
	public void setDescricaoTipo(String descricaoTipo) {
		this.descricaoTipo = descricaoTipo;
	}

}

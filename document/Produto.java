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
public class Produto {

	@Id
	private String id;
	private String descricao;
	private String produtoDetalhe;
	private TipoProduto produtoTipo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getProdutoDetalhe() {
		return produtoDetalhe;
	}
	public void setProdutoDetalhe(String produtoDetalhe) {
		this.produtoDetalhe = produtoDetalhe;
	}
	public TipoProduto getProdutoTipo() {
		return produtoTipo;
	}
	public void setProdutoTipo(TipoProduto produtoTipo) {
		this.produtoTipo = produtoTipo;
	}
	
}

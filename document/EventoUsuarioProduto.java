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
public class EventoUsuarioProduto {

	@Id
	private String idEventoProduto;
	private EventoUsuario eventoUsuario;
	private Produto produtoTrazido;
	private float quantidadeTrazida;
	private float precoUnidade;
	public String getIdEventoProduto() {
		return idEventoProduto;
	}
	public void setIdEventoProduto(String idEventoProduto) {
		this.idEventoProduto = idEventoProduto;
	}
	public EventoUsuario getEventoUsuario() {
		return eventoUsuario;
	}
	public void setEventoUsuario(EventoUsuario eventoUsuario) {
		this.eventoUsuario = eventoUsuario;
	}
	public Produto getProdutoTrazido() {
		return produtoTrazido;
	}
	public void setProdutoTrazido(Produto produtoTrazido) {
		this.produtoTrazido = produtoTrazido;
	}
	public float getQuantidadeTrazida() {
		return quantidadeTrazida;
	}
	public void setQuantidadeTrazida(float quantidadeTrazida) {
		this.quantidadeTrazida = quantidadeTrazida;
	}
	public float getPrecoUnidade() {
		return precoUnidade;
	}
	public void setPrecoUnidade(float precoUnidade) {
		this.precoUnidade = precoUnidade;
	}
	
	
}

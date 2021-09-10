package com.apirest.confrariaws.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document
public class EventoProdutoSolicitado {

	@Id
	private String idEventoProdutoSolicitado;
	private Produto produto;
	private EventoUsuario eventoUsuario;
	private float quantidadeSolicitada;
	public String getIdEventoProdutoSolicitado() {
		return idEventoProdutoSolicitado;
	}
	public void setIdEventoProdutoSolicitado(String idEventoProdutoSolicitado) {
		this.idEventoProdutoSolicitado = idEventoProdutoSolicitado;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public EventoUsuario getEventoUsuario() {
		return eventoUsuario;
	}
	public void setEventoUsuario(EventoUsuario eventoUsuario) {
		this.eventoUsuario = eventoUsuario;
	}
	public float getQuantidadeSolicitada() {
		return quantidadeSolicitada;
	}
	public void setQuantidadeSolicitada(float quantidadeSolicitada) {
		this.quantidadeSolicitada = quantidadeSolicitada;
	}

}

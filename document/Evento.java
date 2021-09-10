package com.apirest.confrariaws.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Evento {

	@Id
	private String idEvento;
	private String nomeEvento;
	private String enderecoEvento;
	private String cidadeEvento;
	private String estadoEvento;
	private String bairroEvento;
	private Date dataInicioEvento;
	private Date dataPrevTerminoEvento;
	private Pais paisEvento;
	
	
	public String getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
	}
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getEnderecoEvento() {
		return enderecoEvento;
	}
	public void setEnderecoEvento(String enderecoEvento) {
		this.enderecoEvento = enderecoEvento;
	}
	public String getCidadeEvento() {
		return cidadeEvento;
	}
	public void setCidadeEvento(String cidadeEvento) {
		this.cidadeEvento = cidadeEvento;
	}
	public String getEstadoEvento() {
		return estadoEvento;
	}
	public void setEstadoEvento(String estadoEvento) {
		this.estadoEvento = estadoEvento;
	}
	public String getBairroEvento() {
		return bairroEvento;
	}
	public void setBairroEvento(String bairroEvento) {
		this.bairroEvento = bairroEvento;
	}
	public Date getDataInicioEvento() {
		return dataInicioEvento;
	}
	public void setDataInicioEvento(Date dataInicioEvento) {
		this.dataInicioEvento = dataInicioEvento;
	}
	public Date getDataPrevTerminoEvento() {
		return dataPrevTerminoEvento;
	}
	public void setDataPrevTerminoEvento(Date dataPrevTerminoEvento) {
		this.dataPrevTerminoEvento = dataPrevTerminoEvento;
	}
	public Pais getPaisEvento() {
		return paisEvento;
	}
	public void setPaisEvento(Pais paisEvento) {
		this.paisEvento = paisEvento;
	}

	
}

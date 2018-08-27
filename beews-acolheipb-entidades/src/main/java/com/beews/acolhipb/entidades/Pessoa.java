package com.beews.acolhipb.entidades;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.beews.util.json.JsonLocalDateSerializer;
import com.beews.util.json.LocalDateAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Pessoa extends EntidadePersistente {

	private static final long serialVersionUID = 947326511561357454L;

	private String nome;
//	@JsonSerialize(using = JsonLocalDateSerializer.class)
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate dataDeNascimento;
	private String email;
	private String tel;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}

package com.beews.acolhipb.entidades;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Mantenedor extends Pessoa {

	private static final long serialVersionUID = 2581674765855340261L;

	private String igreja;
	private Endereco endereco;
	private String cpf;
	private List<Colaboracao> colaboracoes;

	public String getIgreja() {
		return igreja;
	}

	public void setIgreja(String igreja) {
		this.igreja = igreja;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Colaboracao> getColaboracoes() {
		return colaboracoes;
	}

	public void setColaboracoes(List<Colaboracao> colaboracoes) {
		this.colaboracoes = colaboracoes;
	}

	
	

}

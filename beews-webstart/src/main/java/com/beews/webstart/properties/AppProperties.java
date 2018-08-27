package com.beews.webstart.properties;


import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.maven.model.Model;

import com.beews.util.json.JsonLocalDateTimeDeserializer;
import com.beews.util.json.JsonLocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AppProperties {

	private String api;
	private String versao;
	private String grupo;
	private String descricao;
	
	@JsonSerialize(using = JsonLocalDateTimeSerializer.class)
	@JsonDeserialize(using = JsonLocalDateTimeDeserializer.class)
	private LocalDateTime iniciada;
	
	public AppProperties(Model model) {

		this.api = model.getArtifactId();
		this.versao = model.getVersion();
		this.grupo = model.getGroupId();
		this.iniciada = LocalDateTime.now();
		this.descricao = model.getDescription();
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	public LocalDateTime getIniciada() {
		return iniciada;
	}

	public void setIniciada(LocalDateTime iniciada) {
		this.iniciada = iniciada;
	}
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "api=" + api + ", versao=" + versao + ", grupo=" + grupo;
	}

	


}

package com.beews.acolhipb.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.beews.acolhipb.enums.StatusDB;
import com.beews.util.json.JsonLocalDateTimeDeserializer;
import com.beews.util.json.JsonLocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@SuppressWarnings("serial")
public abstract class EntidadePersistente implements Serializable {

	private String id;

//	@JsonSerialize(using = JsonLocalDateTimeSerializer.class)
	private final LocalDateTime dataDeCriacao = LocalDateTime.now();

	private StatusDB status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDateTime getDataDeCriacao() {
		return dataDeCriacao;
	}

	public StatusDB getStatus() {
		return status;
	}

	public void setStatus(StatusDB status) {
		this.status = status;
	}
	
	

}

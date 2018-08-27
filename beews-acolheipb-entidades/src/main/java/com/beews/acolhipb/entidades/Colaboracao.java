package com.beews.acolhipb.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.beews.acolhipb.enums.MetodoDePagamento;
import com.beews.util.json.LocalDateAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Colaboracao extends EntidadePersistente {

	private static final long serialVersionUID = 4720113693492301161L;

	private BigDecimal valor;
	private MetodoDePagamento metodDePagamento;
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate dataDeConfirmacao;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public MetodoDePagamento getMetodDePagamento() {
		return metodDePagamento;
	}

	public void setMetodDePagamento(MetodoDePagamento metodDePagamento) {
		this.metodDePagamento = metodDePagamento;
	}

	public LocalDate getDataDeConfirmacao() {
		return dataDeConfirmacao;
	}

	public void setDataDeConfirmacao(LocalDate dataDeConfirmacao) {
		this.dataDeConfirmacao = dataDeConfirmacao;
	}

}

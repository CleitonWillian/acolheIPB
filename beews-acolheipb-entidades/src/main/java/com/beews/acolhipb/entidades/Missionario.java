package com.beews.acolhipb.entidades;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Missionario extends Pessoa {

	private static final long serialVersionUID = 5906422775232257895L;
	private Igreja igreja;
	private List<Mantenedor> mantenedores;

	public Igreja getIgreja() {
		return igreja;
	}

	public void setIgreja(Igreja igreja) {
		this.igreja = igreja;
	}

	public List<Mantenedor> getMantenedores() {
		return mantenedores;
	}

	public void setMantenedores(List<Mantenedor> mantenedores) {
		this.mantenedores = mantenedores;
	}

}

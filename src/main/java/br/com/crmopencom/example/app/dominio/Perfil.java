package br.com.crmopencom.example.app.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil implements Serializable{

	private static final long serialVersionUID = 6592757828874007645L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "perfil_seq")
	private Long id;

	public Perfil() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}

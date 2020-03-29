package br.com.crmopencom.example.app.dominio;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 238527166271460030L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
	private Long id;
	private String login;
	private String senha;

	@OneToOne(optional = true, cascade = CascadeType.PERSIST)
	private Pessoa correspondente;
	private Boolean ativo;

	public Usuario() {
	}

	public Usuario(String login, String senha, Pessoa correspondente, Boolean ativo) {
		super();
		this.login = login;
		this.senha = senha;
		this.correspondente = correspondente;
		this.ativo = ativo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getCorrespondente() {
		return correspondente;
	}

	public void setCorrespondente(Pessoa correspondente) {
		this.correspondente = correspondente;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

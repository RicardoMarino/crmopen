package br.com.crmopencom.example.app.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
public class Contato implements Serializable{

	private static final long serialVersionUID = -3555026210987508215L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contato_seq")
	private Long id;	
	private String telefoneFixo;
	private String telefoneCelular;
	private String email;
	private String site;
	private String facebook;
	private String linkdin;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Pessoa pessoa;
	
	public Contato() {
	}

	public Contato(String telefoneFixo, String telefoneCelular, String email, String site, String facebook,
			String linkdin) {
		this.telefoneFixo = telefoneFixo;
		this.telefoneCelular = telefoneCelular;
		this.email = email;
		this.site = site;
		this.facebook = facebook;
		this.linkdin = linkdin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getLinkdin() {
		return linkdin;
	}

	public void setLinkdin(String linkdin) {
		this.linkdin = linkdin;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
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

package br.com.crmopencom.example.app.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
public class Parecer implements Serializable {

	private static final long serialVersionUID = 7507058617723526364L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pareer_seq")

	private Long id;
	private String texto;

	@OneToOne(fetch = FetchType.LAZY)
	private Usuario usuario;

	@OneToOne(fetch = FetchType.LAZY)
	private Usuario proximoUsuario;

	@ManyToOne(fetch = FetchType.LAZY)
	private Atendimento atendimento;

	private Date criandoEm;

	public Parecer() {
	}

	public Parecer(String texto, Usuario usuario, Usuario proximoUsuario, Date criandoEm) {
		super();
		this.texto = texto;
		this.usuario = usuario;
		this.proximoUsuario = proximoUsuario;
		this.criandoEm = criandoEm;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getProximoUsuario() {
		return proximoUsuario;
	}

	public void setProximoUsuario(Usuario proximoUsuario) {
		this.proximoUsuario = proximoUsuario;
	}

	public Date getCriandoEm() {
		return criandoEm;
	}

	public void setCriandoEm(Date criandoEm) {
		this.criandoEm = criandoEm;
	}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
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

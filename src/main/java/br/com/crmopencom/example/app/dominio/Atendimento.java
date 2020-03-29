package br.com.crmopencom.example.app.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
public class Atendimento implements Serializable {

	private static final long serialVersionUID = 4968630859084651223L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "atendimento_seq")
	private Long id;
	private String descricao;

	@OneToOne
	private Usuario criador;

	@OneToOne
	private Usuario responsavel;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Pessoa pessoa;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private TipoAtendimento tipo;
	private Boolean disparaEmailCliente;
	private Boolean encerrado;
	private Date proximoContato;
	private Date criandoEm;
	private Date atualizadoEm;

	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "atendimento")
	private List<Parecer> parecers;

	public Atendimento() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public TipoAtendimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoAtendimento tipo) {
		this.tipo = tipo;
	}

	public Boolean getDisparaEmailCliente() {
		return disparaEmailCliente;
	}

	public void setDisparaEmailCliente(Boolean disparaEmailCliente) {
		this.disparaEmailCliente = disparaEmailCliente;
	}

	public Boolean getEncerrado() {
		return encerrado;
	}

	public void setEncerrado(Boolean encerrado) {
		this.encerrado = encerrado;
	}

	public Date getProximoContato() {
		return proximoContato;
	}

	public void setProximoContato(Date proximoContato) {
		this.proximoContato = proximoContato;
	}

	public Date getCriandoEm() {
		return criandoEm;
	}

	public void setCriandoEm(Date criandoEm) {
		this.criandoEm = criandoEm;
	}

	public Date getAtualizadoEm() {
		return atualizadoEm;
	}

	public void setAtualizadoEm(Date atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}

	public Usuario getCriador() {
		return criador;
	}

	public void setCriador(Usuario criador) {
		this.criador = criador;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public List<Parecer> getParecers() {
		return parecers;
	}

	public void setParecers(List<Parecer> parecers) {
		this.parecers = parecers;
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

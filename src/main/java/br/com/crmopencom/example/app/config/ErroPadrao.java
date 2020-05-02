package br.com.crmopencom.example.app.config;

import java.io.Serializable;

public class ErroPadrao  implements Serializable{

	private static final long serialVersionUID = -3094488455724989639L;

	private Integer status;
	private String mesangem;
	private Long timestamp;

	public ErroPadrao() {
	}

	public ErroPadrao(Integer status, String mesangem, Long timestamp) {
		super();
		this.status = status;
		this.mesangem = mesangem;
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMesangem() {
		return mesangem;
	}

	public void setMesangem(String mesangem) {
		this.mesangem = mesangem;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

}

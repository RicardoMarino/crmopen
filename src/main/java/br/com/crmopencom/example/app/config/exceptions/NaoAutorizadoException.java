package br.com.crmopencom.example.app.config.exceptions;

public class NaoAutorizadoException extends Exception{

	private static final long serialVersionUID = -3115264769122399055L;

	public NaoAutorizadoException(String mensagem) {
		super(mensagem);
	}
	
	public NaoAutorizadoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}

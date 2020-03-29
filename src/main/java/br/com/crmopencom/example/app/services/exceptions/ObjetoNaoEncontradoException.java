package br.com.crmopencom.example.app.services.exceptions;

public class ObjetoNaoEncontradoException extends RuntimeException{

	private static final long serialVersionUID = -4219878438293461848L;

	public ObjetoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public ObjetoNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}	
}

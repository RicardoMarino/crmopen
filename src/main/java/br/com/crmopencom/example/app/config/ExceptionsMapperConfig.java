package br.com.crmopencom.example.app.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.crmopencom.example.app.config.exceptions.NaoAutorizadoException;
import br.com.crmopencom.example.app.services.exceptions.ObjetoNaoEncontradoException;

@ControllerAdvice
public class ExceptionsMapperConfig {
	/*
	 * Exceptions de resource 
	 */
	
	/**
	 * Exception de Objeto não encontrado.
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(ObjetoNaoEncontradoException.class)
	public ResponseEntity<ErroPadrao> objetoNaoEncontrato(ObjetoNaoEncontradoException e, HttpServletRequest request){
		ErroPadrao erro = new ErroPadrao(HttpStatus.NOT_FOUND.value(), e.getMessage().toString(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	/*
	 * Exceptions de Config 
	 **/
	
	
	/**
	 * Exception de Falta de acesso
	 * @param e
	 * @param request
	 * @return
	 */
	@ExceptionHandler(NaoAutorizadoException.class)
	public ResponseEntity<ErroPadrao> naoAutorizado(NaoAutorizadoException e, HttpServletRequest request){
		ErroPadrao erro = new ErroPadrao(HttpStatus.UNAUTHORIZED.value(), e.getMessage().toString(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(erro);
	}
}

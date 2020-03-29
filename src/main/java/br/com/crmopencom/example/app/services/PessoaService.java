package br.com.crmopencom.example.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.crmopencom.example.app.dominio.Pessoa;
import br.com.crmopencom.example.app.repositories.PessoaRepository;
import br.com.crmopencom.example.app.services.exceptions.ObjetoNaoEncontradoException;

@Service
public class PessoaService {

	private PessoaRepository repository;

	public Pessoa obterPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new ObjetoNaoEncontradoException("Não existe resultado com os dados informados."));
	}

	public List<Pessoa> obterPessoas() {
		return repository.findAll();
	}
}

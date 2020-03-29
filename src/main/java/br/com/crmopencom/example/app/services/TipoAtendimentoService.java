package br.com.crmopencom.example.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crmopencom.example.app.dominio.TipoAtendimento;
import br.com.crmopencom.example.app.repositories.TipoAtendimentoRepository;
import br.com.crmopencom.example.app.services.exceptions.ObjetoNaoEncontradoException;

@Service
public class TipoAtendimentoService {

	@Autowired
	private TipoAtendimentoRepository repository;

	public TipoAtendimento obterAtendimentoPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new ObjetoNaoEncontradoException("Não existe resultado com os dados informados."));
	}

	public List<TipoAtendimento> obterAtendimentos() {
		return repository.findAll();
	}

}

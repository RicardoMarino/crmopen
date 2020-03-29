package br.com.crmopencom.example.app.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.crmopencom.example.app.dominio.TipoAtendimento;
import br.com.crmopencom.example.app.services.TipoAtendimentoService;

/**
 * Resource que representa os enpoints referente ao tipo do atendimento
 * @author ricardomarino@live.com
 *
 */
@RestController
@RequestMapping(value = "/tipos-atendimento")
public class TipoAtendimentoResource {

	@Autowired
	private TipoAtendimentoService service;
	
	@RequestMapping(method = RequestMethod.GET)
	private List<TipoAtendimento> listar(){
		return service.obterAtendimentos();
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	private TipoAtendimento buscar(@PathVariable Long id){		
		return service.obterAtendimentoPorId(id);
	}
	
}

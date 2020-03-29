package br.com.crmopencom.example.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import br.com.crmopencom.example.app.dominio.Contato;
import br.com.crmopencom.example.app.dominio.Pessoa;
import br.com.crmopencom.example.app.dominio.TipoAtendimento;
import br.com.crmopencom.example.app.repositories.PessoaRepository;
import br.com.crmopencom.example.app.repositories.TipoAtendimentoRepository;

@SpringBootApplication
@EnableJpaAuditing
public class CrmOpenApplication implements CommandLineRunner{

	@Autowired
	private TipoAtendimentoRepository tipoAtendimentoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrmOpenApplication.class, args);
	}

	public void run(String...  args) throws Exception{
		/*
		 * Tipo atendimento 
		 */
		
		List<TipoAtendimento> tipoAtendimentos = new ArrayList<>();
		tipoAtendimentos.add(new TipoAtendimento("Lançamento de contrato", true));
		tipoAtendimentos.add(new TipoAtendimento("Lançamento de mapeamentos", true));
		tipoAtendimentos.add(new TipoAtendimento("Lançamento de issue", true));
		tipoAtendimentos.add(new TipoAtendimento("Lançamento de teste manual", true));
		tipoAtendimentos.add(new TipoAtendimento("Lançamento de automação", true));
		tipoAtendimentos.add(new TipoAtendimento("Lançamento de home office", true));
		tipoAtendimentos.add(new TipoAtendimento("Lançamento de aux. suporte", true));
		tipoAtendimentos.add(new TipoAtendimento("Lançamento de aux. vendas", true));
		tipoAtendimentos.add(new TipoAtendimento("Lançamento de gerência", false));
		/*
		 * Contato 
		 */
		Contato contatoVazio = new Contato();
		Contato contatoFace = new Contato("", "", "", "", "facebook", "");
		Contato contatoLinkdin = new Contato("", "", "", "", "", "Linkdin");
		Contato contatoTelefone= new Contato("(21) 3641-3456", "", "", "", "", "Linkdin");
		
		/*
		 * Pessoa
		 */
		Pessoa pessoa1 = new Pessoa("Ricardo");
		pessoa1.setContatos(Arrays.asList(contatoFace, contatoVazio));
		
		Pessoa pessoa2 = new Pessoa("Ricardo cliente");
		pessoa2.setContatos(Arrays.asList(contatoLinkdin));
		
		Pessoa pessoa3 = new Pessoa("Ricardo admin");
		pessoa3.setContatos(Arrays.asList(contatoTelefone));
		
		contatoVazio.setPessoa(pessoa1);
		contatoFace.setPessoa(pessoa1);
		contatoTelefone.setPessoa(pessoa3);
		
		
		/*
		 * 
		 */
		
		/*
		 *  Persistência
		 */
		tipoAtendimentoRepository.saveAll(tipoAtendimentos);		
		pessoaRepository.saveAll(Arrays.asList(pessoa1, pessoa2, pessoa3));
	}
}

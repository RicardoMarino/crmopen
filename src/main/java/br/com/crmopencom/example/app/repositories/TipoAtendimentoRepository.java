package br.com.crmopencom.example.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crmopencom.example.app.dominio.TipoAtendimento;

@Repository
public interface TipoAtendimentoRepository extends JpaRepository<TipoAtendimento, Long>{

}

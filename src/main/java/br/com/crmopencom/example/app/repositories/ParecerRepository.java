package br.com.crmopencom.example.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crmopencom.example.app.dominio.Atendimento;

@Repository
public interface ParecerRepository extends JpaRepository<Atendimento, Long>{

}

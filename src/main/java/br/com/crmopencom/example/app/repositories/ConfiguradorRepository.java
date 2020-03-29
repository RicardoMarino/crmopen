package br.com.crmopencom.example.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crmopencom.example.app.dominio.Configurador;

@Repository
public interface ConfiguradorRepository extends JpaRepository<Configurador, Long>{

}

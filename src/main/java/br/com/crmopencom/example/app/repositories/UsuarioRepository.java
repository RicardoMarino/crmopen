package br.com.crmopencom.example.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crmopencom.example.app.dominio.Pessoa;

@Repository
public interface UsuarioRepository extends JpaRepository<Pessoa, Long>{

}

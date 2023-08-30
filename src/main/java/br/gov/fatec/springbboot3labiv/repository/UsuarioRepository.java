package br.gov.fatec.springbboot3labiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.fatec.springbboot3labiv.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    
    
}

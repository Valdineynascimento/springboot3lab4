package br.gov.fatec.springbboot3labiv.service;

import java.util.List;

import br.gov.fatec.springbboot3labiv.entity.Usuario;

public interface UsuarioService {

    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> buscarTodosUsuarios();

    public Usuario buscarUsuarioPorId(Long id);
        
}

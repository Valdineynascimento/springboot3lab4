package br.gov.fatec.springbboot3labiv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.fatec.springbboot3labiv.entity.Usuario;
import br.gov.fatec.springbboot3labiv.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario novoUsuario(Usuario usuario){
        if(usuario == null || 
            usuario.getNome() == null ||
            usuario.getNome().isBlank() || 
            usuario.getSenha() == null || 
            usuario.getSenha().isBlank()) {
            throw new IllegalArgumentException("Usuário com atributo invalidos!");
        }
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> buscarTodosUsuarios(){
        return usuarioRepo.findAll();
    }

    public Usuario buscarUsuarioPorId(Long id){
        Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
        if(usuarioOp.isEmpty()){
            throw new IllegalArgumentException("Usuario não encontrado!");
        }
        return usuarioOp.get();
    }
    
}

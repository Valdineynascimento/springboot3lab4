package br.gov.fatec.springbboot3labiv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.fatec.springbboot3labiv.entity.Usuario;
import br.gov.fatec.springbboot3labiv.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> buscarTodosUsuarios(){
        return service.buscarTodosUsuarios();
    }

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return service.novoUsuario(usuario);
    }

    @GetMapping
    public Usuario buscarUsuarioPorId(@PathVariable("id") Long id) {
        return service.buscarUsuarioPorId(id);
    }
}
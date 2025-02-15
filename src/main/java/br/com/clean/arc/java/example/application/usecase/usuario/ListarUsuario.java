package br.com.clean.arc.java.example.application.usecase.usuario;

import br.com.clean.arc.java.example.application.gateway.UsuarioRepositorio;
import br.com.clean.arc.java.example.domain.entitie.usuario.Usuario;

import java.util.List;

public class ListarUsuario {

    private final UsuarioRepositorio repositorio;

    public ListarUsuario(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Usuario> obterTodosUsuario(){
        return this.repositorio.listarTodos();
    }
}

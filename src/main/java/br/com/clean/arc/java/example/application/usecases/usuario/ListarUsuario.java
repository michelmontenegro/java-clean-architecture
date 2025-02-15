package br.com.clean.arc.java.example.application.usecases.usuario;

import br.com.clean.arc.java.example.application.gateways.UsuarioRepositorio;
import br.com.clean.arc.java.example.domain.entities.usuario.Usuario;

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

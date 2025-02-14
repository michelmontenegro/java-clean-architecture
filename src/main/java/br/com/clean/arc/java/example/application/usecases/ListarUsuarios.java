package br.com.clean.arc.java.example.application.usecases;

import br.com.clean.arc.java.example.application.gateways.RepositorioDeUsuario;
import br.com.clean.arc.java.example.domain.entities.usuario.Usuario;

import java.util.List;

public class ListarUsuarios {

    private final RepositorioDeUsuario repositorio;

    public ListarUsuarios(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public List<Usuario> obterTodosUsuario(){
        return this.repositorio.listarTodos();
    }
}

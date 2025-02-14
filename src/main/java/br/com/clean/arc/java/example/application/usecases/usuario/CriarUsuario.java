package br.com.clean.arc.java.example.application.usecases.usuario;

import br.com.clean.arc.java.example.application.gateways.RepositorioDeUsuario;
import br.com.clean.arc.java.example.domain.entities.usuario.Usuario;

public class CriarUsuario {
    private final RepositorioDeUsuario repositorio;

    public CriarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastrarUsuario(usuario);
    }
}

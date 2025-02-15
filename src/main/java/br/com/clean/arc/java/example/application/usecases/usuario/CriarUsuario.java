package br.com.clean.arc.java.example.application.usecases.usuario;

import br.com.clean.arc.java.example.application.gateways.UsuarioRepositorio;
import br.com.clean.arc.java.example.domain.entities.usuario.Usuario;

public class CriarUsuario {

    private final UsuarioRepositorio repositorio;

    public CriarUsuario(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastrarUsuario(usuario);
    }
}

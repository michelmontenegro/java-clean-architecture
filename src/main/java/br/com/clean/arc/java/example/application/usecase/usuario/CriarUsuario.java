package br.com.clean.arc.java.example.application.usecase.usuario;

import br.com.clean.arc.java.example.application.gateway.UsuarioRepositorio;
import br.com.clean.arc.java.example.domain.entitie.usuario.Usuario;

public class CriarUsuario {

    private final UsuarioRepositorio repositorio;

    public CriarUsuario(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastrarUsuario(usuario);
    }
}

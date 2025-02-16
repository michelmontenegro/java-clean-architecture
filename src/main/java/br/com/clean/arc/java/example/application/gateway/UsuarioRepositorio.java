package br.com.clean.arc.java.example.application.gateway;

import br.com.clean.arc.java.example.domain.entity.usuario.Usuario;

import java.util.List;

public interface UsuarioRepositorio {

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();

}

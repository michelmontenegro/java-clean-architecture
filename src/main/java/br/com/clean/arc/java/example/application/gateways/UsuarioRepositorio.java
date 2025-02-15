package br.com.clean.arc.java.example.application.gateways;

import br.com.clean.arc.java.example.domain.entities.usuario.Usuario;

import java.util.List;

public interface UsuarioRepositorio {

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();

}

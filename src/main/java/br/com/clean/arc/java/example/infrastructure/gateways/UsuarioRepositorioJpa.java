package br.com.clean.arc.java.example.infrastructure.gateways;

import br.com.clean.arc.java.example.application.gateways.UsuarioRepositorio;
import br.com.clean.arc.java.example.domain.entities.usuario.Usuario;
import br.com.clean.arc.java.example.infrastructure.persistence.UsuarioEntity;
import br.com.clean.arc.java.example.infrastructure.persistence.UsuarioRepository;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioRepositorioJpa implements UsuarioRepositorio {
    private final UsuarioRepository repositorio;
    private final UsuarioEntityMapper mapper;

    public UsuarioRepositorioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = mapper.toEntity(usuario);
        repositorio.save(entity);
        return mapper.toDomain(entity);
    }

    @Override
    public List<Usuario> listarTodos() {
        return repositorio.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}

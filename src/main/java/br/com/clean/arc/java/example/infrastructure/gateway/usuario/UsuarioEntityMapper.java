package br.com.clean.arc.java.example.infrastructure.gateway.usuario;

import br.com.clean.arc.java.example.domain.entity.usuario.Usuario;
import br.com.clean.arc.java.example.infrastructure.controller.usuario.UsuarioDTO;
import br.com.clean.arc.java.example.infrastructure.persistence.UsuarioJPA;

public class UsuarioEntityMapper {

    public UsuarioJPA toEntity(Usuario usuario){
        return new UsuarioJPA.Builder(usuario.getCpf())
                .nome(usuario.getNome())
                .nascimento(usuario.getNascimento())
                .email(usuario.getEmail())
                .build();
    }

    public Usuario toDomain(UsuarioJPA entity){
        return new Usuario.Builder(entity.getCpf())
                .nome(entity.getNome())
                .nascimento(entity.getNascimento())
                .email(entity.getEmail())
                .build();
    }

    public UsuarioDTO toDTO(Usuario usuario){
        return new UsuarioDTO(
                usuario.getCpf(),
                usuario.getNome(),
                usuario.getNascimento(),
                usuario.getEmail());
    }
}

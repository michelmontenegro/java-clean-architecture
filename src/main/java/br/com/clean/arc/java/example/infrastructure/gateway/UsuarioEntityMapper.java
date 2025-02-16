package br.com.clean.arc.java.example.infrastructure.gateway;

import br.com.clean.arc.java.example.domain.entity.usuario.Usuario;
import br.com.clean.arc.java.example.infrastructure.persistence.UsuarioJPA;

public class UsuarioEntityMapper {

    public UsuarioJPA toEntity(Usuario usuario){
        return new UsuarioJPA(usuario.getCpf(), usuario.getNome(),
                usuario.getNascimento(), usuario.getEmail());
    }

    public Usuario toDomain(UsuarioJPA entity){
        return new Usuario(entity.getCpf(), entity.getNome(), entity.getNascimento(),
                entity.getEmail());
    }
}

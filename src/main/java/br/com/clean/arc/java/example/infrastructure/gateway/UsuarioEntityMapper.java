package br.com.clean.arc.java.example.infrastructure.gateway;

import br.com.clean.arc.java.example.domain.entitie.usuario.Usuario;
import br.com.clean.arc.java.example.infrastructure.persistence.UsuarioEntity;

public class UsuarioEntityMapper {

    public UsuarioEntity toEntity(Usuario usuario){
        return new UsuarioEntity(usuario.getCpf(), usuario.getNome(),
                usuario.getNascimento(), usuario.getEmail());
    }

    public Usuario toDomain(UsuarioEntity entity){
        return new Usuario(entity.getCpf(), entity.getNome(), entity.getNascimento(),
                entity.getEmail());
    }
}

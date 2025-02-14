package br.com.clean.arc.java.example.config;

import br.com.clean.arc.java.example.application.gateways.RepositorioDeUsuario;
import br.com.clean.arc.java.example.application.usecases.CriarUsuario;
import br.com.clean.arc.java.example.application.usecases.ListarUsuarios;
import br.com.clean.arc.java.example.infra.gateways.RepositorioDeUsuarioJpa;
import br.com.clean.arc.java.example.infra.gateways.UsuarioEntityMapper;
import br.com.clean.arc.java.example.infra.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario(RepositorioDeUsuario repositorioDeUsuario){
        return new CriarUsuario(repositorioDeUsuario);
    }

    @Bean
    ListarUsuarios listarUsuarios(RepositorioDeUsuario repositorioDeUsuario){
        return new ListarUsuarios(repositorioDeUsuario);
    }

    @Bean
    RepositorioDeUsuarioJpa criarRepositorioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper){
        return new RepositorioDeUsuarioJpa(repositorio, mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper(){
        return new UsuarioEntityMapper();
    }
}

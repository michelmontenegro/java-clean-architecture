package br.com.clean.arc.java.example.config;

import br.com.clean.arc.java.example.application.gateways.UsuarioRepositorio;
import br.com.clean.arc.java.example.application.usecases.usuario.CriarUsuario;
import br.com.clean.arc.java.example.application.usecases.usuario.ListarUsuario;
import br.com.clean.arc.java.example.infrastructure.gateways.UsuarioRepositorioJpa;
import br.com.clean.arc.java.example.infrastructure.gateways.UsuarioEntityMapper;
import br.com.clean.arc.java.example.infrastructure.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Classe de configuração para o módulo de usuário
 *
 * No contexto do Spring Framework, um bean é um objeto que é instanciado, montado e gerenciado por um Spring IoC (Inversion of Control) container. Esses beans são criados com as configurações de configuração fornecidas ao container, normalmente na forma de arquivos XML ou anotações.
 * A injeção de dependência é o principal princípio por trás do Spring Framework. A ideia é que você não cria objetos, mas descreve como eles devem ser criados. O container Spring IoC cuida de instanciar e configurar os objetos para você e também gerencia todo o ciclo de vida desses objetos.
 * 
 */
@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario(UsuarioRepositorio usuarioRepositorio){
        return new CriarUsuario(usuarioRepositorio);
    }

    @Bean
    ListarUsuario listarUsuarios(UsuarioRepositorio usuarioRepositorio){
        return new ListarUsuario(usuarioRepositorio);
    }

    @Bean
    UsuarioRepositorioJpa criarRepositorioJpa(UsuarioRepository repositorio, UsuarioEntityMapper mapper){
        return new UsuarioRepositorioJpa(repositorio, mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper(){
        return new UsuarioEntityMapper();
    }
}

package br.com.clean.arc.java.example;

import br.com.clean.arc.java.example.domain.entitie.usuario.Usuario;
import br.com.clean.arc.java.example.infrastructure.gateway.UsuarioRepositorioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuarioComArquivos {
    public static void main(String[] args) {
        UsuarioRepositorioEmArquivo repositorioDeUsuarioEmArquivo = new UsuarioRepositorioEmArquivo();

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("456.789.888-88", "João",
                LocalDate.parse("2000-10-15"), "joao@email.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("456.789.888-88", "Maria",
                LocalDate.parse("2000-10-15"), "maria@email.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("456.789.888-88", "Vinicios",
                LocalDate.parse("2000-10-15"), "vinicios@email.com"));
        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("456.789.888-88", "Raphael",
                LocalDate.parse("2000-10-15"), "raphael@email.com"));

        //System.out.println(repositorioDeUsuarioEmArquivo.listarTodos());
        repositorioDeUsuarioEmArquivo.gravaEmArquivo("usuarios.txt");
    }
}

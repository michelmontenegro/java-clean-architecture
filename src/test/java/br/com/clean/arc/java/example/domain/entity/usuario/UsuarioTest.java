package br.com.clean.arc.java.example.domain.entity.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123456.789-99", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("12345678999", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));


        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("", "Jacque", LocalDate.parse("1990-09-08"), "email@email.com"));

    }

    @Test
    void deveCriarUsuarioUsandoFabricaDeUsuario(){

        Usuario usuario = new Usuario.Builder("654.123.897-88")
                .nome("Emily")
                .nascimento(LocalDate.parse("2000-10-01"))
                .email("email@email.com")
                .cep("email@email.com")
                .numero(40)
                .complemento("apto 201")
                .build();

        Assertions.assertEquals("Emily", usuario.getNome());
        Assertions.assertEquals("apto 201", usuario.getEndereco().getComplemento());

//        UsuarioBuilder fabrica = new UsuarioBuilder();
//        Usuario usuario = fabrica.comNomeCpfNascimento("Emily", "654.123.897-88",
//                LocalDate.parse("2000-10-01"));
//        Assertions.assertEquals("Emily", usuario.getNome());
//        usuario = fabrica.incluiEndereco("12345-999", 40, "apto 201");
//        Assertions.assertEquals("apto 201", usuario.getEndereco().getComplemento());

    }
}

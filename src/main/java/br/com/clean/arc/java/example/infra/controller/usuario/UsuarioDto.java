package br.com.clean.arc.java.example.infra.controller.usuario;

import java.time.LocalDate;

public record UsuarioDto(
        String cpf,
        String nome,
        LocalDate nascimento,
        String email
) {
}

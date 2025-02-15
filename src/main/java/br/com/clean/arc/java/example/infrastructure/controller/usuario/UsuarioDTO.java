package br.com.clean.arc.java.example.infrastructure.controller.usuario;

import java.time.LocalDate;

public record UsuarioDTO(
        String cpf,
        String nome,
        LocalDate nascimento,
        String email
) {
}

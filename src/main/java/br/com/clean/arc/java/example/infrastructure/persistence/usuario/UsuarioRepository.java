package br.com.clean.arc.java.example.infrastructure.persistence.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioJPA, Long> {
}

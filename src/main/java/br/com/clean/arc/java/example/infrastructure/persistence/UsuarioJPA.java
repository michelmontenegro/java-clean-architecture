package br.com.clean.arc.java.example.infrastructure.persistence;

import br.com.clean.arc.java.example.domain.entity.usuario.Usuario;
import br.com.clean.arc.java.example.domain.vo.EnderecoVO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
public class UsuarioJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;

    public UsuarioJPA() {}

    public UsuarioJPA(String cpf, String nome, LocalDate nascimento, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }

    public UsuarioJPA(Builder builder){
        this.cpf = builder.cpf;
        this.nome = builder.nome;
        this.nascimento = builder.nascimento;
        this.email = builder.email;
    }

    /**
     * Design Pattern Builder
     * Classe Builder (Estatica e Internar) para criar instâncias de Usuario.
     * Permite a construção passo a passo de objetos Usuario com atributos opcionais.
     *
     * Neste padrão os atributos da Classe Usuario deveriam ser FINAL, para a garantia de imutabilidade. Quando precisar
     */
    public static class Builder {
        private String cpf;
        private String nome;
        private LocalDate nascimento;
        private String email;

        public Builder(String cpf) {
            this.cpf = cpf;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder nascimento(LocalDate nascimento) {
            this.nascimento = nascimento;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public UsuarioJPA build() {
            return new UsuarioJPA(this);
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
